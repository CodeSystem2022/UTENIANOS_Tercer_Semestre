package test;

/**
 *
 * @author CELINA
 */
public class TestAutoboxingUnboxing {

    public static void main(String[] args) {

        // clases envolventes o wrappers:  clases envolventes de tipo primtiivo int= Integer
        
        
        int enteroPrimitivo=10;
        Integer enteroObjet= 5;  //pasa a swr un objeto de la clase Objet
       // enteros. // acceso a diferentes metodos y atributos, ya que son clases envolventes
        System.out.println("entero Primitivo: " + enteroPrimitivo);
        System.out.println("entero Objet: " + enteroObjet.doubleValue()); // conversiones - autoboxing ( lo convertimos l obj lo convierto en primitivo
        
        
        int entero2= enteroObjet; // se extrae la literal y se asigna a nuestra variable primitiva( unboxing)
    }
}
