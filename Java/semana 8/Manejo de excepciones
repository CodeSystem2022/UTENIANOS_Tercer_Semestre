package aritmetica;

import excepciones.OperacionExcepcion;

/**
 *
 * @author CELINA
 */
public class Aritmetica {

    public static int division(int numerador, int denominador) throws OperacionExcepcion {
        if (denominador == 0) {
            throw new OperacionExcepcion("División por cero");
        }
        return numerador / denominador;

    }

}

package excepciones;

/**
 *
 * @author CELINA
 */
public class OperacionExcepcion extends Exception{

    public OperacionExcepcion(String mensaje) {
        super(mensaje);
    }
    
    
    
}
package test;

import aritmetica.Aritmetica;


/**
 *
 * @author CELINA
 */
public class TestExcepciones {


    public static void main(String[] args) {

        int resultado = 0;
        try {
          resultado= Aritmetica.division(10,0);
        } catch (Exception e) {
            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out);// se conoce como la pila de excepciones
            System.out.println(e.getMessage());
        }
        System.out.println("La variable tiene como valor :" + resultado);

    }

}

