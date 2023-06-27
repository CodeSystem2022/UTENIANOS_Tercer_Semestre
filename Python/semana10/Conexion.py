from psycopg2 import pool
from logger_base import log
import sys


class Conexion:


    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _MIN_CON = 1
    _MAX_CON = 5
    _pool = None

    @classmethod
    def obtenerConexion(cls):

        conexion = cls.obtenerPool().getconn()
        log.debug(f"Conexion obtenida del pool: {conexion}")
        return conexion

    @classmethod
    def obtenerCursor(cls):
        """
        Obtiene un cursor para ejecutar consultas en la base de datos.
        :return: Objeto de cursor.
        """
        pass

    @classmethod
    def obtenerPool(cls):
        """
        Obtiene la pool de conexiones.
        Si no existe, crea una nueva pool de conexiones.
        :return: Objeto de la pool de conexiones.
        """
        if cls._pool is None:
            try:
                cls._pool = pool.SimpleConnectionPool(cls._MIN_CON,
                                                      cls._MAX_CON,
                                                      host=cls._HOST,
                                                      user=cls._USERNAME,
                                                      password=cls._PASSWORD,
                                                      port=cls._DB_PORT,
                                                      database=cls._DATABASE)
                log.debug(f"Creacion del pool exitosa: {cls._pool}")
                return cls._pool
            except Exception as e:
                log.error(f"Ocurrio un error: {e}")
                sys.exit()
        else:
            return cls._pool


if __name__ == '__main__':
    # Ejemplo de uso
    conexion1 = Conexion.obtenerConexion()
    conexion2 = Conexion.obtenerConexion()
    conexion3 = Conexion.obtenerConexion()
    conexion4 = Conexion.obtenerConexion()
    conexion5 = Conexion.obtenerConexion()
    conexion6 = Conexion.obtenerConexion()
