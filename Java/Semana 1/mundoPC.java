package mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);   // Importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        // Creamos otros objetos de diferente marca
        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Monitor monitorAcer = new Monitor("Acer", 32);
        Teclado tecladoAcer = new Teclado("Bluetooth", "Acer");
        Raton ratonAcer = new Raton("Bluetooth", "Acer");
        Computadora computadoraAcer = new Computadora("Computadora Acer", monitorAcer, tecladoAcer, ratonAcer);
        
        Monitor monitorLG = new Monitor("LG", 27);
        Teclado tecladoLG= new Teclado("Bluetooth", "LG");
        Raton ratonLG = new Raton("Bluetooth", "LG");
        Computadora computadoraLG = new Computadora("Computadora LG", monitorLG, tecladoLG, ratonLG);
        
        Monitor monitorAsus = new Monitor("Asus", 24);
        Teclado tecladoAsus = new Teclado("Bluetooth", "Asus");
        Raton ratonAsus = new Raton("Bluetooth", "Asus");
        Computadora computadoraAsus = new Computadora("Computadora Asus", monitorAsus, tecladoAsus, ratonAsus);
        
        Monitor monitorDell = new Monitor("Dell", 27);
        Teclado tecladoDell = new Teclado("Bluetooth", "Dell");
        Raton ratonDell = new Raton("Bluetooth", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);
        
        Monitor monitorSamsung = new Monitor("Samsung", 32);
        Teclado tecladoSamsung = new Teclado("Bluetooth", "Samsung");
        Raton ratonSamsung = new Raton("Bluetooth", "Samsung");
        Computadora computadoraSamsung= new Computadora("Computadora Samsung", monitorSamsung, tecladoSamsung, ratonSamsung);
        
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        Raton ratonLenovo = new Raton("Bluetooth", "Lenovo");
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        
        Monitor monitorSony = new Monitor("Sony", 40);
        Teclado tecladoSony = new Teclado("Bluetooth", "Sony");
        Raton ratonSony = new Raton("Bluetooth", "Sony");
        Computadora computadoraSony = new Computadora("Computadora Sony", monitorSony, tecladoSony, ratonSony);
        
        Monitor monitorMicrosoft = new Monitor("Microsoft", 27);
        Teclado tecladoMicrosoft = new Teclado("Bluetooth", "Microsoft");
        Raton ratonMicrosoft = new Raton("Bluetooth", "Microsoft");
        Computadora computadoraMicrosoft = new Computadora("Computadora Microsoft", monitorMicrosoft, tecladoMicrosoft, ratonMicrosoft);
        
        Monitor monitorViewSonic= new Monitor("ViewSonic", 24);
        Teclado tecladoViewSonic = new Teclado("Bluetooth", "ViewSonic");
        Raton ratonViewSonic = new Raton("Bluetooth", "ViewSonic");
        Computadora computadoraViewSonic = new Computadora("Computadora ViewSonic", monitorViewSonic, tecladoViewSonic, ratonViewSonic);
        
     
        Orden orden1 = new Orden();  // Inicializamos el arreglo vacío
        Orden orden2 = new Orden();   // Una nueva lista para el objeto orden2
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraAcer);
        orden1.agregarComputadora(computadoraLG);
        orden1.agregarComputadora(computadoraAsus);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraSamsung);
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraSony);
        orden1.agregarComputadora(computadoraMicrosoft);
        orden1.agregarComputadora(computadoraViewSonic);
        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
        orden2.agregarComputadora(computadorasVarias);
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        
        // Crear más objetos de tipo computadora con todos sus elementos
        // Completar una lista en el objeto orden1 que llegue a los diez elementos
        // Probar de esta manera los métodos al máximo rendimiento
       
    }
}