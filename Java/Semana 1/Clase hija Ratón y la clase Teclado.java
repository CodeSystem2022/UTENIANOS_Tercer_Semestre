
package ar.com.systems2023.mundopc;

/**
 * @author Semp = Caro Delgado
 */
public class Raton extends DispositivoEntrada{
   private final int idRaton;
   private static int contadorRatones;
   
   public Raton( String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
   }

@Override
public String toString() {
return "Raton{" + "idRaton=" + idRaton +", "+super.toString()+'}';
}

}

