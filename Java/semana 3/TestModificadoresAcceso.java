package test;

import paquete1.Clase1;
import paquete2.Clase3;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = "+clase1.atributoPublico);
        clase1.metodoPublico();
        
        Clase3 instancia = new Clase3();
        instancia.atributoPublic = "valor atributo público";
        System.out.println(instancia.atributoPublic);
      //System.out.println(instancia.atributoProtected);

    }
}
