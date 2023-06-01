// While
let contador = 0;
while (contador < 3) {
    console.log(contador);
    contador++;
}
console.log('Fin del ciclo while');

// Do While
let conteo = 0;
do {
    console.log(conteo);
    conteo++;
} while (conteo < 3);
console.log('Fin del ciclo do while');

// For
for (let contado = 0; contado < 3; contado++) {
    console.log(contado);
}
console.log('Fin del ciclo for');

// Palabra reservada break
for (let contado = 0; contado < 3; contado++) {
    if (contado % 2 == 0) {
        console.log(contado);
        break;
    }
}
console.log("Termina el ciclo al encontrar un número par");

// Palabra reservada continue y etiquetas labels
inicio:
for (let contado = 0; contado <= 10; contado++) {
    if (contado % 2 !== 0) {
        break inicio;
        
    }else{
        continue inicio;
    }
    console.log(contado);
}
console.log("Termina el ciclo al encontrar un número par");

