package domain;

/**
 *
 * @author CELINA
 */
public enum TipoEscritura {
    
    
    CLASICO ("Escritura a mano"),
    MODERNO("Escritura digital");
    
    
    private final String descripcion;
    
    
    private TipoEscritura(String descripcion){
           // constructor
            this.descripcion= descripcion;
}
    
    
    // metodo get
    public String getTipoEscritura(){
        return this.descripcion;
    }
}

package domain;

/**
 *
 * @author CELINA
 */
public class Empleado {
    
    protected String nombre;
    protected double sueldo;
    
    public Empleado(String nombre, double sueldo){
        this.nombre=nombre;
        this.sueldo=sueldo;
    }
    
    // método para sobreescribir
    public String obtenerDetalles(){
        return "Nombre: "+ this.nombre + "\n Sueldo: "+ this.sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
    
    
}

package domain;

/**
 *
 * @author CELINA
 */
public class Escritor extends Empleado {
     final TipoEscritura tipoEscritura;
     
     public Escritor(String nombre, double sueldo,TipoEscritura tipoEscritura){
         super(nombre,sueldo);
         this.tipoEscritura=tipoEscritura;
     }
     
     //metodo para sobreescribir
     @Override
     public String obtenerDetalles(){
         return super.obtenerDetalles()+ ",Tipo de escritura: "+ tipoEscritura.getTipoEscritura();
     }
     
     @Override
     public String toString(){
         return "Escritor { " + "Tipo Escritura = "+ tipoEscritura + "} " + super.toString();
     }
     
     public TipoEscritura getTipoEscritura(){
         return this.tipoEscritura;
     }
    
    
}
package domain;

/**
 *
 * @author CELINA
 */
public class Gerente extends Empleado {
    
    
      private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;

    }
    
    @Override // sobreescribimos el metodo del padre en la clase Hija
    
    public String obtenerDetalles(){
        
        return  super.obtenerDetalles()+ " Departamento :"+ this.departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

package domain;

/**
 *
 * @author CELINA
 */
public enum TipoEscritura {
    
    
    CLASICO ("Escritura a mano"),
    MODERNO("Escritura digital");
    
    
    private final String descripcion;
    
    
    private TipoEscritura(String descripcion){
           // constructor
            this.descripcion= descripcion;
}
    
    
    // metodo get
    public String getTipoEscritura(){
        return this.descripcion;
    }
}
