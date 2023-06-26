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
}

// Creación de objetos y pruebas
let persona1 = new Persona('Juan', 'Pérez');
console.log(persona1.nombre);
persona1.nombre = 'Pedro';
console.log(persona1.nombre);

let persona2 = new Persona('María', 'López');
console.log(persona2.nombre);
persona2.nombre = 'Ana';
console.log(persona2.nombre);

console.log(persona1.apellido);
persona1.apellido = 'González';
console.log(persona1.apellido);

console.log(persona2.apellido);
persona2.apellido = 'Sánchez';
console.log(persona2.apellido);

let empleado1 = new Empleado('Luis', 'Gómez', 'Recursos Humanos');
console.log(empleado1);
console.log(empleado1.nombre);
