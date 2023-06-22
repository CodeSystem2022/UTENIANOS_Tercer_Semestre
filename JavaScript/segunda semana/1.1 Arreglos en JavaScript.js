//Creacion de array o arreglos
//Un arreglo nos deja almacenar varios valores

// let autos = new Array('Ferrari','Renault','BMW','Toyota','Ford'); //forma antigua, sintaxis no usada.

const autos = ['Ferrari','Renault','BMW','Toyota','Ford'];
//L. memoria    {0}        {1}      {2}     {3}      {4} 
console.log(autos);

//Recorremos los elementos de un arreglo.
console.log(autos[0]) //Ferrari
console.log(autos[1]) //Renault
console.log(autos[2]) //BMW
console.log(autos[3]) //Toyota
console.log(autos[4]) //Ford


for(let i =0; i < autos.length; i++) {
    console.log(autos[i])
}
//imprimimos su posicion 
for(let i =0; i < autos.length; i++) {
    console.log(i+' :'+autos[i])
}

//Modificamos los elementos del arreglo
autos[1] = 'Volvo';
console.log(autos);

//Agregamos nuevos valores al arreglo
autos.push('Mercedes-Benz'); //Agregamos el elemnto final del arreglo
console.log(autos);

//Forma numero 2 para agregar elemento al arreglo
autos[autos.length] = 'Audi';
console.log(autos);

//Fomra numero 3 para agregar elemntos al arreglo, Tener CUIDADO si nos equivocamos queda un lugar vacio
autos[7] = 'Renault'
console.log(autos);

//Como preguntar si lo que tenemos adelante es un Array o arreglo
console.log(Array.isArray(autos)); //true

//Forma numero dos para comprobar si es un Array
console.log(autos instanceof Array); //true //Preguntamos si la variable es una instancia de la clase Array



