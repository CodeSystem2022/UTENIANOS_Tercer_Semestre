import psycopg2

# Establecer la conexión con la base de datos
conexion = psycopg2.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database='test_bd')

try:
    with conexion:
        with conexion.cursor() as cursor:
            # Definir la sentencia SQL para eliminar el registro
            sentencia = 'DELETE FROM persona WHERE id_persona=%s'
            entrada = input('Digite el número de registro a eliminar: ')
            valores = (entrada,)  # Es una tupla de valores

            # Ejecutar la sentencia SQL
            cursor.execute(sentencia, valores)

            # Obtener la cantidad de registros eliminados
            registros_eliminados = cursor.rowcount
            print(f'Los registros eliminados son: {registros_eliminados}')

except Exception as e:
    print(f'Ocurrió un error: {e}')

finally:
    # Cerrar la conexión
    conexion.close()
