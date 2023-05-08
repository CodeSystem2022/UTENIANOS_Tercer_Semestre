class Pelicula:
    def __init__(self, nombre):
        self.nombre = nombre
    
    def __str__(self):
        return f'Pelicula: {self.nombre}'
    
    @property
    def nombre(self):
        return self.__nombre
    
    @nombre.setter
    def nombre(self, nombre):
        self.__nombre = nombre