package domain;

public abstract class FiguraGeometrica {
    protected String tipoFigura;

    //Constructor
    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    //Metodos abstractos que se implementaran en las clases hijas
    public abstract void dibujar();


    //Getters y Setters
    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "tipoFigura='" + tipoFigura + '\'' +
                '}';
    }
}
