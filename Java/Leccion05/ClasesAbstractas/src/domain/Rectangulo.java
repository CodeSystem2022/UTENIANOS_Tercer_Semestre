package domain;


public class Rectangulo extends FiguraGeometrica{
    //Constructor
    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    //Metodos abstractos que se implementaran en las clases hijas
    @Override
    public void dibujar() {
        //Comportamiento de la subclase
        System.out.println("Aqui deberia dibujar un: " + this.getClass().getSimpleName());
    }
    
}
