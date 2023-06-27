from Persona import Persona
from logger_base import log
from conexion import Conexion


class PersonaDAO:
    """
    DAO significa: Data Access Object
    CRUD significa:
        Create -> Insertar
        Read -> Seleccionar
        Update -> Actualizar
        Delete -> Eliminar
    """

    _SELECCIONAR = 'SELECT * FROM persona ORDER BY id_persona'
    _INSERTAR = 'INSERT INTO persona(nombre,apellido,email) VALUES (%s,%s,%s)'
    _ACTUALIZAR = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    _ELIMINAR = 'DELETE FROM persona WHERE id_persona=%s'

    @classmethod
    def seleccionar(cls):
        """
        Selecciona todos los registros de la tabla persona y los devuelve como una lista de objetos Persona.
        :return: Lista de objetos Persona.
        """
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                cursor.execute(cls._SELECCIONAR)
                registros = cursor.fetchall()
                personas = []
                for registro in registros:
                    persona = Persona(registro[0], registro[1], registro[2], registro[3])
                    personas.append(persona)
                return personas

    @classmethod
    def insertar(cls, persona):
        """
        Inserta un nuevo registro de persona en la base de datos.
        :param persona: Objeto Persona a insertar.
        :return: Número de filas afectadas por la operación.
        """
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.nombre, persona.apellido, persona.email)
                cursor.execute(cls._INSERTAR, valores)
                log.debug(f'Persona Insertada: {persona}')
                return cursor.rowcount

    @classmethod
    def actualizar(cls, persona):
        """
        Actualiza un registro de persona en la base de datos.
        :param persona: Objeto Persona a actualizar.
        :return: Número de filas afectadas por la operación.
        """
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.nombre, persona.apellido, persona.email, persona.id_persona)
                cursor.execute(cls._ACTUALIZAR, valores)
                log.debug(f'Persona actualizada: {persona}')
                return cursor.rowcount

    @classmethod
    def eliminar(cls, persona):
        """
        Elimina un registro de persona de la base de datos.
        :param persona: Objeto Persona a eliminar.
        :return: Número de filas afectadas por la operación.
        """
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.id_persona,)
                cursor.execute(cls._ELIMINAR, valores)
                log.debug(f'Los objetos eliminados son: {persona}')
                return cursor.rowcount


if __name__ == '__main__':
    # Insertar un registro
    persona1 = Persona(nombre='Matias', apellido='Alvarez', email='malvarez@gmail.com')
    personas_insertadas = PersonaDAO.insertar(persona1)
    log.debug(f'Personas insertadas: {personas_insertadas}')

    # Seleccionar objetos
    personas = PersonaDAO.seleccionar()
    for persona in personas:
        log.debug(persona)
