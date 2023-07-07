/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.system2023.mundopc;

/**
 *
 * @author agustinsaba
 */
public class Orden {
    private final int idOrden;
    private Computadora computadora[]; //ARREGLO DE OBJETOS DE TIPO COMPUTADORA
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadora;
    
    //CONSTRUCTOR VACIO
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    //MÉTODO PARA AGREGAR UNA NUEVA COMPUTADORA A NUESTRO ARREGLO
    public void agregarComputadora(Computadora computadora){
        
        //VERIFICAMOS QUE EL CONTADOR COMPUTADORA NO SUPERE EL MAXIMO QUE ES = 10
        if(this.contadorComputadora < Orden.MAX_COMPUTADORAS){
            this.computadora[this.contadorComputadora++] = computadora;
        }else{
            System.out.println("Superaste el límite: "+ Orden.MAX_COMPUTADORAS);
        }
    }
    
    //MÉTODO PARA MOSTRAR ORDEN
    public void mostrarOrden(){
        System.out.println("Orden #: "+this.idOrden);
        System.out.println("Computadoras de la orden: "+this.idOrden);
        
        for(int i = 0; i<this.contadorComputadora; i++){
            System.out.println(this.computadora[i]);
        }
    }
}
