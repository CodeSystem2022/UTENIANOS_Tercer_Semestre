
package test;

import domain.*;

public class TestConversionObjetos {
    public static void main (String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Roy", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);

        //empleado.getTipoEscritura(); ESTO NO ES POSIBLE, YA QUE EL TIPO DE DATO EMPLEADO NO TIENE EL METODO getTipoEscritura()
        
        
        Escritor escritor = (Escritor) empleado;
        System.out.println("escritor = " + escritor);
        
        //PRIMER FORMA DE HACERLO
        // Downcasting
        ((Escritor) empleado).getTipoEscritura();
        
        //SEGUNDA FORMA DE HACERLO
        Escritor escritor2 = (Escritor) empleado;
        escritor2.getTipoEscritura();
        

        // Upcasting
        Empleado empleado2 = escritor2;
        System.out.println(empleado2.obtenerDetalles());
        
        Escritor escritor3 = (Escritor) empleado2;
        System.out.println(escritor3.getTipoEscritura());
        
        Escritor escritor4 = (Escritor) empleado;
        System.out.println("escritor4 = " + escritor4);
    }
}
