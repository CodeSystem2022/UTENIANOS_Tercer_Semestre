package domain;

public class Gerente extends Empleado {
    private String Departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.Departamento = departamento;
    }

    // Sobreescribimos el método toString
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", departamento: " + this.Departamento;
    }
}
