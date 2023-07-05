import psycopg2

# Establecer la conexión con la base de datos
conexion = psycopg2.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database='test_bd')

try:
    with conexion:
        with conexion.cursor() as cursor:
            # Definir la sentencia SQL para actualizar el registro
            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
            valores = ('German Gonzalo', 'perez', 'gcps@mail.com', 1)  # Valores para la actualización (ejemplo)

            # Ejecutar la sentencia SQL
            cursor.execute(sentencia, valores)

            # Obtener la cantidad de registros actualizados
            registros_actualizados = cursor.rowcount
            print(f'Los registros actualizados son: {registros_actualizados}')

except Exception as e:
    print(f'Ocurrió un error: {e}')

finally:
    # Cerrar la conexión
    conexion.close()
