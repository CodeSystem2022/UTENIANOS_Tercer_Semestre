
package accesodatos;

/**
 *
 * @author CELINA
 */
public interface IAccesoDatos {
    //el atributo siempre va con asignacion - interface no tiene constructor y tiene todos sus metodos abtract
    
    int MAX_REGISTRO=10; // PUBLICO, FINAL ,STATIC ( COSNTANTE) debe asignarle un valor;
    
    //metodo insertar es abtracto y sin cuerpo
    
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
    
}
package accesodatos;

/**
 *
 * @author CELINA
 */
public class ImplementacionOracle implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Oracle");
    }

    @Override
    public void eliminar() {
       System.out.println("Eliminar desde Oracle");
    }

}package accesodatos;

/**
 *
 * @author CELINA
 */
public class ImplemetancionMySql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde MySql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySql"); 
    }

    @Override
    public void eliminar() {
       System.out.println("Eliminar desde MySql");
    }
    
    
    
}
package test;

import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionOracle;
import accesodatos.ImplemetancionMySql;

/**
 *
 * @author CELINA
 */
public class TestInterfaces {

    public static void main(String[] args) {

        IAccesoDatos datos = new ImplemetancionMySql();
        
        //datos.listar();
        imprimir(datos);
        
        datos= new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);
        
        
        

    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }

}
