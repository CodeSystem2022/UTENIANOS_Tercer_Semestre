//Función tipo expresión
let sumar = function(a = 4, b = 8){
    console.log(arguments[0]); //Muestra el parámetro de: a
    console.log(arguments[1]); //muestra el parámetro de: b
    return a + b + arguments[2];
}
resultado = sumar(3, 2, 9);
console.log(resultado);
