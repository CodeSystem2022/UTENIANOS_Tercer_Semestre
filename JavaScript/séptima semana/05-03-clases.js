// Clase Persona
class Persona {
  constructor(nombre, apellido) {
    this._nombre = nombre;
    this._apellido = apellido;
  }

  get nombre() {
    return this._nombre;
  }

  set nombre(nombre) {
    this._nombre = nombre;
  }

  get apellido() {
    return this._apellido;
  }

  set apellido(apellido) {
    this._apellido = apellido;
  }

  nombreCompleto() {
    return this._nombre + ' ' + this._apellido;
  }

  // Sobreescribiendo el método de la clase padre
  toString() {
    // Se aplica el polimorfismo que significa = multiples formas en tiempo de ejecucion
    // El método que se ejecuta depende si es una referencia de tipo padre o hija
    return this.nombreCompleto();
  }
}

// Clase Empleado que hereda de Persona
class Empleado extends Persona {
  constructor(nombre, apellido, departamento) {
    super(nombre, apellido);
    this._departamento = departamento;
  }

  get departamento() {
    return this._departamento;
  }

  set departamento(departamento) {
    this._departamento = departamento;
  }

  // Sobreescritura
  nombreCompleto() {
    return super.nombreCompleto() + ', ' + this._departamento;
  }
}

let persona1 = new Persona('Martín', 'Perez');
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);

let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2.nombre);
persona2.nombre = 'María Laura';
console.log(persona2.nombre);

console.log(persona1.apellido);
persona1.apellido = 'Gimenez';
console.log(persona1.apellido);

console.log(persona2.apellido);
persona2.apellido = 'Sanchez';
console.log(persona2.apellido);

let empleado1 = new Empleado('María', 'Gimenez', 'Sistema');
console.log(empleado1);
console.log(empleado1.nombreCompleto());

// Object.prototype.toString - Esta es la manera de acceder a atributos y métodos de manera dinámica
//let persona1 = new Persona('Martín', 'Perez');
//console.log(Object.prototype.toString.call(persona1)); // [object Object]

//let empleado1 = new Empleado('María', 'Gimenez', 'Sistema');
//console.log(Object.prototype.toString.call(empleado1)); // [object Object]

console.log(empleado1.toString());
console.log(persona1.toString());
