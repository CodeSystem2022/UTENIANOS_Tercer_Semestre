
package domain;

/**
 *
 * @author CELINA
 */
public class Persona {
    private final int  idPersona;
    private static int  contadorPersonas;
    
    static{//bloque de inicializacion estatico
        System.out.println("Ejecución del bloque estatico");
        ++Persona.contadorPersonas;
        //idPersona = no es un atributo estatico por eso tenemos un error
    }
    
    {// bloque de inicializacion no estatico: simplemente se abren llaves o contexto dinamico
        System.out.println("Ejecución del bloque no estático");
        this.idPersona=Persona.contadorPersonas++;//incrementamos el atributo
        
    }
    
    //Los bloques de inicializacion se ejecutan antes del constructor de nuestra clase
    
    
    
    public Persona(){
        System.out.println("Ejecución del constructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
    
}
----------------------------------------------------------------------------------------------------------------------------------------------
package test;

import domain.Persona;

/**
 *
 * @author CELINA
 */
public class TestBloqueInicializacion {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println("Persona 1: " + persona1);
        Persona persona2 = new Persona();
        System.out.println("Persona 2: " + persona2);

    }
}
