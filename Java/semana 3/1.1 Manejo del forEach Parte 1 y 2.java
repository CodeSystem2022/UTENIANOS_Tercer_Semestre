/* For each semana 3
 @author Semp=Carolina Delgado*/
public class TestForEach {
    public static void main (String[] args){
         int edades[] ={5, 6, 8, 9 }; //Sintaxis resumida
         for (int edad: edades) { //Sintaxis de ForEach
              System.out.println ("edad = " + edad);
         } 
         Persona personas[] = {new Persona("Juan"), new Persona("Carla"), new Persona("Beatriz")};
        
         // ForEach
         for(Persona persona: personas){
             System.out.println("persona = " + persona);
    }
}
