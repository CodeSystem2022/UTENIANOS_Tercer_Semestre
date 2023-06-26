class Persona {
    static contadorPersonas = 0;
    static MAX_OBJ = 5;

    /**
     * Constructor de la clase Persona
     * @param {string} nombre - El nombre de la persona
     * @param {string} apellido - El apellido de la persona
     */
    constructor(nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido;

        if (Persona.contadorPersonas < Persona.MAX_OBJ) {
            this.idPersona = ++Persona.contadorPersonas;
        } else {
            console.log('Se ha superado el máximo de objetos permitidos');
        }
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

    /**
     * Retorna el nombre completo de la persona
     * @returns {string} El nombre completo de la persona
     */
    nombreCompleto() {
        return this.idPersona + ' ' + this._nombre + ' ' + this._apellido;
    }

    toString() {
        return this.nombreCompleto();
    }

    static saludar() {
        console.log('Saludos desde este método static');
    }

    /**
     * Saluda a una persona específica
     * @param {Persona} persona - La persona a saludar
     */
    static saludar2(persona) {
        console.log(persona.nombre + ' ' + persona.apellido);
    }
}

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

    nombreCompleto() {
        return super.nombreCompleto() + ' ' + this._departamento;
    }
}

// Crear objetos y probar los métodos

let persona1 = new Persona('Alice', 'Johnson');
console.log(persona1.nombre);
persona1.nombre = 'John Doe';
console.log(persona1.nombre);

let persona2 = new Persona('Emily', 'Smith');
console.log(persona2.nombre);
persona2.nombre = 'Sarah Brown';
console.log(persona2.nombre);

let empleado1 = new Empleado('David', 'Miller', 'IT');
console.log(empleado1);
console.log(empleado1.nombreCompleto());

Persona.saludar();
Persona.saludar2(persona1);
Empleado.saludar();
Empleado.saludar2(empleado1);

console.log(Persona.contadorPersonas);

let persona3 = new Persona('Michael', 'Davis');
console.log(persona3.toString());
console.log(Persona.contadorPersonas);

console.log(Persona.MAX_OBJ);

let persona4 = new Persona('Emma', 'Wilson');
console.log(persona4.toString());
let persona5 = new Persona('Daniel', 'Taylor');
console.log(persona5.toString());
