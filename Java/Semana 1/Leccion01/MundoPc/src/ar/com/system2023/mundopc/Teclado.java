/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.system2023.mundopc;

/**
 *
 * @author agustinsaba
 */
//LA CLASE TECLADO EXTIENDE DE DISPOSITIVOENTRADA
public class Teclado extends DispositivoEntrada {
    //ATRIBUTOS
    private final int idTeclado;
    private static int contadorTeclados;
    
    //CONSTRUCTOR
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", " + super.toString()+'}';
    }
    
    
}
