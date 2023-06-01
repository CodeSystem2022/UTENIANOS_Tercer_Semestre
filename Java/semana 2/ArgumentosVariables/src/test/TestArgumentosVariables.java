package test;


public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2 );
        VariosParámetros("Jose","Hola ", 7, 9,10);
    }

    public static void VariosParámetros(String nombre, String apellido, int ...numeros) {
        System.out.println("Nombre: "+nombre+", \nApellido: "+apellido);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int ...numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: "+numeros[i]);
        }
    }
    

}
