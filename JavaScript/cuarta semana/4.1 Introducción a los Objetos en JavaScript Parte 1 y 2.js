let y = "Hola mundo"; //variable de tipo primitiva
console.log(y.length);
console.log('Tipos primitivos');

//Objeto
let libro = {
    titulo: 'El principito',
    autor: 'Antoine de Saint-Exupéry',
    editorial: 'Salamandra',
    paginas: 96,
    resumen: function(){ //método o función en JavaScript
        return "El libro " + this.titulo + " escrito por " + this.autor + " tiene " + this.paginas + " páginas.";
    }
}

console.log(libro.titulo);
console.log(libro.autor);
console.log(libro.editorial);
console.log(libro.paginas);
console.log(libro);
console.log(libro.resumen());
console.log('Ejecutando con un objeto');

let libro2 = new Object(); //Debe crear un nuevo objeto en memoria
libro2.titulo = 'Cien años de soledad';
libro2.autor = 'Gabriel García Márquez';
libro2.editorial = 'Debolsillo';
libro2.paginas = 432;
console.log(libro2.autor);
console.log('Creamos un nuevo objeto');

console.log(libro['editorial']); //Accedemos como si fuera un arreglo
console.log('Usamos el ciclo for in');

//for in y accedemos como si fuera un arreglo
for(propiedad in libro){
    console.log(propiedad);
    console.log(libro[propiedad])
}

console.log('cambiamos y eliminamos un error');
libro.editoria = 'Planeta'; //cambiamos dinamicamente un valor del objeto
delete libro.editoria;
console.log(libro);

//Distintas formas de imprimir un objeto
//Número 1: la más sencilla: concatenar cada valor de cada propiedad
console.log('Distintas formas de imprimir un objeto: forma 1');
console.log(libro.titulo + ', ' + libro.autor);

//Número 2: A través del ciclo for in
console.log('Distintas formas de imprimir un objeto: forma 2');
for(nombrePropiedad in libro){
    console.log(libro[nombrePropiedad]);
}

//Número 3: La Función Object.values()
let libroArray = Object.values(libro);
console.log('Distintas formas de imprimir un objeto: forma 3');
console.log(libroArray);

//Número 4: Utilizaremos el método JSON.Stringify
console.log('Distintas formas de imprimir un objeto: forma 4');
let libroString = JSON.stringify(libro);
console.log(libroString);
