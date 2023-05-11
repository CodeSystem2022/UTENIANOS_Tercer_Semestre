package test;
import domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Juan", 5000);
        determinarTipo(empleado1);
        empleado1 = new Gerente("Karla", 10000, "Contabilidad");
        determinarTipo(empleado1);
    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");
            // Hacemos un cast para convertir la variable empleado a una variable de tipo Gerente
            Gerente gerente = (Gerente)empleado;
            gerente.getDepartamento();

        }
        else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
        }
        else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
}
