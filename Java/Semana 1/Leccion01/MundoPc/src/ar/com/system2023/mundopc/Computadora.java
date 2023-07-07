/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.system2023.mundopc;

/**
 *
 * @author agustinsaba
 */
public class Computadora {
    //ATRIBUTOS
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;
    
    //CONSTRUCTOR VACIO
    public Computadora() {
        this.idComputadora = ++Computadora.contadorComputadoras;
    }
    
    
    //CONSTRUCTOR 2
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();//LLAMADO AL CONSTRUCTOR VACIO
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }
    
    //INGRESAMOS MANUALMENTE EL GETIDCOMPUTADORA. EL SET NO PORQUE EL ATRIBUTO ESTA DECLARADO COMO FINAL, NUNCA LO VAMOS A MODIFICAR
    public int getIdComputadora(){
        return idComputadora;
    }
    
    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }
    
    
    
    
}
