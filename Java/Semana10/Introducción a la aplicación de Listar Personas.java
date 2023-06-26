public class Persona {

    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas=0;

    //contructor vacío

    public Persona (){
        this.id= ++Persona.numeroPersonas;
    }

    //constructor con parametros
    public Persona(String nombre, String tel, String email){
       this(); // llamamos al contructor vacio, pero lo hace por default
        this.nombre= nombre;
        this.tel= tel;
        this.email= email;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //DEFINIMOS LA LISTA FUERA DEL CICLO WHILE
        List<Persona> personas = new ArrayList<>(); // LISTA VACÍA

        //EMPEZAMOS CON EL MENÚ
        var salir = false;
        while (!salir) {
            mostrarMenu();
            try{
                salir= ejecutarOperacion(sc,personas);
            } catch (Exception e){
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
            System.out.println();
        }// fin del ciclo while
    } // fin del main


    private static void mostrarMenu(){
        //mostramos las opciones
        System.out.println("""
                ******* LISTADO DE PERSONAS ********
                1. AGREGAR
                2. LISTAR
                3. SALIR
                """);
        System.out.print("Digite una de las opciones:");
    }// fin metodo mostrat menu


    private static boolean ejecutarOperacion(Scanner sc, List<Persona> personas){
        var opcion = Integer.parseInt(sc.nextLine());
        var salir= false;
              // revisamos la opcion ingresada mediante un switch
         switch (opcion){
             case 1 -> {
                 System.out.print("Digite el nombre: ");
                 var nombre= sc.nextLine();
                 System.out.print("Digite el telefono: ");
                 var tel= sc.nextLine();
                 System.out.print("Digite el correo:");
                 var email= sc.nextLine();
                 //creamos el objeto persona
                 var persona= new Persona(nombre,tel,email);

                 //lo agregamos a la lista
                 personas.add(persona);
                 System.out.println("La lista tiene:"+ personas.size()+ " elementos");
             }//fin case 1
             case 2->{ // listar a las personas
                 System.out.println("Listado de personas: ");
                 //mejora con lambda  y el metodo de ref
                 //personas.forEach((persona -> System.out.print(persona));
                 personas.forEach(System.out::println); // metodo de referencia



             }//fin case 2

             case 3 ->{ // salir del ciclo
                 System.out.println("Hasta pronto...");
                 salir= true;


             }//  fin case 3
             default -> System.out.println("Opción incorrecta: " + opcion);

         }//fin del sw
        return salir;
    }//fin del metodo ejecutar


}//fin class
