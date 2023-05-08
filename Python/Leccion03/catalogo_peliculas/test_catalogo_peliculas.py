from dominio.Pelicula import Pelicula
from servicio.catalogo_peliculas import CatalogoPeliculas as cp

opcion = None

while opcion != "4":
    try:
        print("\nOpciones de menú: ")
        print("1. Agregar pelicula")
        print("2. Listar peliculas")
        print("3. Eliminar catalogo de peliculas")
        print("4. Salir")
        opcion = input("Ingrese una opcion: ")
        if opcion == "1":
            nombre_pelicula = input("Ingrese el nombre de la pelicula: ")
            pelicula = Pelicula(nombre_pelicula)
            cp.agregar_pelicula(pelicula)
            print("Pelicula agregada")
        elif opcion == "2":
            cp.listar_peliculas()
        elif opcion == "3":
            cp.eliminar_peliculas()
    except Exception as e:
        print("Ocurrio un error de tipo: ", type(e).__name__)
        opcion = None
    else:
        print("\nSalimos del programa")