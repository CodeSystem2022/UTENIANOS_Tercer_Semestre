/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundopc;

import ar.com.system2023.mundopc.*; //Al colocar el asterisco (*) al final, estamos importando todas las clases del paquete

/**
 *
 * @author agustinsaba
 */
public class MundoPc {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP",monitorHP, tecladoHP, ratonHP);
        
        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer",monitorGamer, tecladoGamer, ratonGamer);
        
        Monitor monitorSamsung = new Monitor("Samsung", 15);
        Teclado tecladoSamsung = new Teclado("Bluetooth", "Samsung");
        Raton ratonSamsung = new Raton("Bluetooth", "Samsung");
        Computadora computadoraSamsung = new Computadora("Computadora Samsung",monitorSamsung, tecladoSamsung, ratonSamsung);
        
        Monitor monitorBGH = new Monitor("BGH", 14);
        Teclado tecladoBGH = new Teclado("Bluetooth", "BGH");
        Raton ratonBGH = new Raton("Bluetooth", "BGH");
        Computadora computadoraBGH = new Computadora("Computadora BGH",monitorBGH, tecladoBGH, ratonBGH);
        
        Monitor monitorMAC  = new Monitor("MAC", 13);
        Teclado tecladoMAC = new Teclado("Bluetooth", "MAC");
        Raton ratonMAC = new Raton("Bluetooth", "MAC");
        Computadora computadoraMAC = new Computadora("Computadora MAC",monitorMAC, tecladoMAC, ratonMAC);
        
        Monitor monitorMSI = new Monitor("MSI", 16);
        Teclado tecladoMSI = new Teclado("Bluetooth", "MSI");
        Raton ratonMSI = new Raton("Bluetooth", "MSI");
        Computadora computadoraMSI = new Computadora("Computadora MSI",monitorMSI, tecladoMSI, ratonMSI);
        
        Monitor monitorSony = new Monitor("Sony", 15);
        Teclado tecladoSony = new Teclado("Bluetooth", "Sony");
        Raton ratonSony = new Raton("Bluetooth", "Sony");
        Computadora computadoraSony = new Computadora("Computadora Sony", monitorSony, tecladoSony, ratonSony);
        
        Monitor monitorLenovo = new Monitor("Lenovo", 15);
        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        Raton ratonLenovo = new Raton("Bluetooth", "Lenovo");
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo",monitorLenovo, tecladoLenovo, ratonLenovo);
        
        Monitor monitorAssus = new Monitor("Assus", 13);
        Teclado tecladoAssus = new Teclado("Bluetooth", "Assus");
        Raton ratonAssus = new Raton("Bluetooth", "Assus");
        Computadora computadoraAssus = new Computadora("Computadora Assus",monitorAssus, tecladoAssus, ratonAssus);
        
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("Bluetooth", "Dell");
        Raton ratonDell = new Raton("Bluetooth", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell",monitorDell, tecladoDell, ratonDell);
        
        Monitor monitorCompac = new Monitor("Compac", 14);
        Teclado tecladoCompac = new Teclado("Bluetooth", "Compac");
        Raton ratonCompac = new Raton("Bluetooth", "Compac");
        Computadora computadoraCompac = new Computadora("Computadora Compac",monitorCompac, tecladoCompac, ratonCompac);
        
        Orden orden1 = new Orden();
        
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraSamsung);
        orden1.agregarComputadora(computadoraBGH);
        orden1.agregarComputadora(computadoraMAC);
        orden1.agregarComputadora(computadoraMSI);
        orden1.agregarComputadora(computadoraSony);
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraAssus);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraCompac);
      
        
        orden1.mostrarOrden();
       
        
        Computadora computadoraMultimarca = new Computadora("Computadora Multimarca", monitorHP, tecladoGamer, ratonHP);
        Orden orden2 = new Orden();
        
        orden2.agregarComputadora(computadoraMultimarca);
        
        orden2.mostrarOrden();
       
    }
}
