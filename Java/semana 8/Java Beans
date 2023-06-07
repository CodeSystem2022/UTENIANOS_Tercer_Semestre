package test;

import domain.Persona;

/**
 *
 * @author CELINA
 */
public class TestJavaBeans {

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setNombre("Juan");

        persona.setApellido("Perez");
        System.out.println("persona = " + persona);
        
        System.out.println("Persona nombre:"+ persona.getNombre());
        System.out.println("Persona Apellido:"+ persona.getApellido());
    }

}
package domain;

import java.io.Serializable;

/**
 *
 * @author CELINA
 */
public class Persona implements Serializable {

    private String nombre;
    private String apellido;

    public Persona() {

    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }

}
