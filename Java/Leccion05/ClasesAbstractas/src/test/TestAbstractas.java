package test;

import domain.*;

public class TestAbstractas {
    public static void main(String[] args) {
        //FiguraGeometrica figura = new FiguraGeometrica(); //No se puede instanciar una clase abstracta
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
}
