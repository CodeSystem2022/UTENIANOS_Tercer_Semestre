package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;
import static enumeraciones.Dias.LUNES;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 1: "+Dias.LUNES);
        indicarDiaSemana(Dias.MARTES);
        System.out.println("Continente N° 4:"+Continentes.AMERICA);
        System.out.println("N° de paises en el 4to continente: "
                +Continentes.AMERICA.getPaises());
        System.out.println("N° de habitantes en el 4to continente: "
                +Continentes.AMERICA.getHabitantes());
    }
 
private static void indicarDiaSemana(Dias dias){
    switch(dias){
        case LUNES:
            System.out.println("Primer día de la semana");
            break;
        case MARTES:
            System.out.println("Segundo día de la semana");
            break;
        case MIERCOLES:
            System.out.println("Tercer día de la semana");
            break;
        case JUEVES:
            System.out.println("Cuarto día de la semana");
            break;
        case VIERNES:
            System.out.println("Quinto día de la semana");
            break;
        case SABADO:
            System.out.println("Sexto día de la semana");
            break;
        case DOMINGO:
            System.out.println("Séptimo día de la semana");
            break;
        default:
            System.out.println("Día inválido");
            break;
    }
}

}
