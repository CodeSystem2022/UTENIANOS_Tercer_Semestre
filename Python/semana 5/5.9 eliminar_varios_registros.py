import psycopg2

# Establecer la conexión con la base de datos
conexion = psycopg2.connect(user='postgres', password='Admin', host='127.0.0.1', port='5432', database='test_bd')

try:
    with conexion:
        with conexion.cursor() as cursor:
            # Definir la sentencia SQL para eliminar los registros
            sentencia = 'DELETE FROM persona WHERE id_persona IN %s'
            entrada = input('Digite los números de registros a eliminar (separados por coma): ')
            valores = (tuple(entrada.split(',')),)  # Tupla de tuplas

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
