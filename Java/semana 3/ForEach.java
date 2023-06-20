
package domain;

/**
 *
 * @author CELINA
 */
public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }

    
    
    
    
}


package test;

import domain.Persona;

/**
 *
 * @author CELINA
 */
public class TestForEach {

    public static void main(String[] args) {

        int edades[] = {5, 6, 8, 9};//sintaxis resumida

        for (int edad : edades) {
            System.out.println("Edades: " + edad);    //sintaxis del for each
        }
        
        
        Persona personas[]= {new Persona("Juan"), new Persona("María"), new Persona ("Caro")};
        // no se utiliza var en los arreglos, no se puede inferir 
        
        for(Persona persona: personas){
            System.out.println("persona:" + persona);
        }
        

    }//cierre main
}//cierre class
