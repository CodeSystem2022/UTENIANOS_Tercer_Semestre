package test;

/**
 *
 * @author CELINA
 */
public class TestArgumentosVariables {

    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2);
        variosParametros("Juan",7,8,9);

    }

    private static void variosParametros(String nombre, int... numeros) { // siempre al ultimo
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);

    }

    private static void imprimirNumeros(int... numeros) { // definir tipo y la sintaxis de ... cuando se ejecuta el codigo se sabe
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: " + numeros[i]);
        }
    }
}
