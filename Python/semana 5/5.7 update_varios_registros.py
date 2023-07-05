import psycopg2

# Establecer la conexión con la base de datos
conexion = psycopg2.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database='test_bd')

try:
    with conexion:
        with conexion.cursor() as cursor:
            # Definir la sentencia SQL para actualizar los registros
            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
            valores = [
                ('Juan', 'Pérez', 'jperez@mail.com', 4),
                ('Romina', 'Ayala', 'ayalar@mail.com', 5)
            ]  # Lista de tuplas con los nuevos valores

            # Ejecutar la sentencia SQL para cada conjunto de valores
            cursor.executemany(sentencia, valores)

            # Obtener la cantidad de registros actualizados
            registros_actualizados = cursor.rowcount
            print(f'Los registros actualizados son: {registros_actualizados}')

except Exception as e:
    print(f'Ocurrió un error: {e}')

finally:
    # Cerrar la conexión
    conexion.close()
