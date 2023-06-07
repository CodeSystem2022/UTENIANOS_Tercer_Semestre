package mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPC {

    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        //Otros objetos de diferentes marcas
        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);

        Monitor monitorAsus = new Monitor("Asus", 27);
        Teclado tecladoAsus = new Teclado("USB", "Asus");
        Raton ratonAsus = new Raton("USB", "Asus");
        Computadora computadoraAsus = new Computadora("Computadora Asus", monitorAsus, tecladoAsus, ratonAsus);

        Monitor monitorMSI = new Monitor("MSI", 24);
        Teclado tecladoMSI = new Teclado("USB", "MSI");
        Raton ratonMSI = new Raton("USB", "MSI");
        Computadora computadoraMSI = new Computadora("Computadora MSI", monitorMSI, tecladoMSI, ratonMSI);

        Orden orden1 = new Orden();//Inicializacion del arreglo vacío
        Orden orden2 = new Orden();//Nueva lista para el objeto Orden2

        //Agregamos objetos a la orden 1
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);

        //Podemos variar los componentes de la siguiente manera
        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas: ", monitorHP, tecladoGamer, ratonMSI);
        orden2.agregarComputadora(computadorasVarias);

        orden1.mostrarOrden();
        orden2.mostrarOrden();

        ///////////////////////////////////////////
        /////////   TAREA PARA REALIZAR:///////////
        //Crear mas objetos de tipo computadora con todos sus elementos
        //completar una lista en el objeto ordenl que llegue a los 10 elementos
        //probar de esta manera los métodos al maximo rendimiento
        ///////////////////////////////////////////
        
        // Computadoras con componentes de diferentes marcas
        Monitor monitorVariado1 = new Monitor("Variado", 21);
        Teclado tecladoVariado1 = new Teclado("USB", "Variado");
        Raton ratonVariado1 = new Raton("USB", "Variado");
        Computadora computadoraVariada01 = new Computadora("Computadora Variada 01", monitorVariado1, tecladoVariado1, ratonVariado1);

        Monitor monitorVariado2 = new Monitor("Variado", 24);
        Teclado tecladoVariado2 = new Teclado("Bluetooth", "Variado");
        Raton ratonVariado2 = new Raton("Bluetooth", "Variado");
        Computadora computadoraVariada02 = new Computadora("Computadora Variada 02", monitorVariado2, tecladoVariado2, ratonVariado2);

        Monitor monitorVariado3 = new Monitor("Variado", 27);
        Teclado tecladoVariado3 = new Teclado("USB", "Variado");
        Raton ratonVariado3 = new Raton("Bluetooth", "Variado");
        Computadora computadoraVariada03 = new Computadora("Computadora Variada 03", monitorVariado3, tecladoVariado3, ratonVariado3);

        // Computadoras con componentes de marcas específicas
        Monitor monitorSamsung = new Monitor("Samsung", 23);
        Teclado tecladoSamsung = new Teclado("USB", "Samsung");
        Raton ratonSamsung = new Raton("USB", "Samsung");
        Computadora computadoraSamsung = new Computadora("Computadora Samsung", monitorSamsung, tecladoSamsung, ratonSamsung);

        Monitor monitorDell = new Monitor("Dell", 22);
        Teclado tecladoDell = new Teclado("Bluetooth", "Dell");
        Raton ratonDell = new Raton("Bluetooth", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        Monitor monitorLenovo = new Monitor("Lenovo", 18);
        Teclado tecladoLenovo = new Teclado("USB", "Lenovo");
        Raton ratonLenovo = new Raton("Bluetooth", "Lenovo");
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        
        
        Orden ordenMaxima = new Orden();
        
        ordenMaxima.agregarComputadora(computadoraHP);
        ordenMaxima.agregarComputadora(computadoraGamer);
        ordenMaxima.agregarComputadora(computadoraAsus);
        ordenMaxima.agregarComputadora(computadoraMSI);
        ordenMaxima.agregarComputadora(computadoraVariada01);
        ordenMaxima.agregarComputadora(computadoraVariada02);
        ordenMaxima.agregarComputadora(computadoraVariada03);
        ordenMaxima.agregarComputadora(computadoraSamsung);
        ordenMaxima.agregarComputadora(computadoraDell);
        ordenMaxima.agregarComputadora(computadoraLenovo);
        
        ordenMaxima.mostrarOrden();
    }
}
