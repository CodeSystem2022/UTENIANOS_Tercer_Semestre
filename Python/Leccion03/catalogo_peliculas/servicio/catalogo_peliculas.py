import os

class CatalogoPeliculas:
    
    ruta_archivo = "peliculas.txt"
    
    @classmethod
    def agregar_pelicula(cls, pelicula):
        with open(cls.ruta_archivo, "a", encoding="utf8") as archivo:
            archivo.write(f'{pelicula.nombre}\n')

    @classmethod
    def listar_peliculas(cls):
        with open(cls.ruta_archivo, "r", encoding="utf8") as archivo:
            print("Catalogo de peliculas:".center(50, "-"))
            for pelicula in archivo:
                print(pelicula.strip())
            print("-" * 50)

    @classmethod
    def eliminar_peliculas(cls):
        os.remove(cls.ruta_archivo)
        print("pelicula eliminada: {cls.ruta_archivo}")