/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.system2023.mundopc;

/**
 *
 * @author agustinsaba
 */

//LA CLASE RATON EXTIENDE DE LA CLASE DISPOSITIVO ENTRADA
public class Raton extends DispositivoEntrada {
    //ATRIBUTOS
    private final int idRaton;
    private static int contadorRatones;
    
    //CONSTRUCTOR
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", " + super.toString()+'}';
    }
    
    
}
