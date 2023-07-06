package paquete1;

public class Clase1 {
    
    private String atributoPrivado = "Este es un atributo privado";
    String atributoPaquete = "Este es un atributo de paquete";
    protected String atributoProtegido = "Este es un atributo protegido";
    public String atributoPublico = "Este es un atributo público";
    
    // Constructor de la clase
    public Clase1() {
        System.out.println("Se ha creado una instancia de la clase Clase1");
    }
    
    // Métodos de la clase
    private void metodoPrivado() {
        System.out.println("Este es un método privado");
    }
    
    void metodoPaquete() {
        System.out.println("Este es un método de paquete");
    }
    
    protected void metodoProtegido() {
        System.out.println("Este es un método protegido");
    }
    
    public void metodoPublico() {
        System.out.println("Este es un método público");
    }
}

