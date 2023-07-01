package utn.estudiante;


import utn.estudiante.conexion.Conexion;

public class Main  {

    public static void main(String[] args) {
          var conexion = Conexion.getConnection();

          if (conexion != null){
              System.out.println("Conexión exitosa: "+ conexion);
          } else{
              System.out.println("Hubo en error al intentar conectarse..");
          }
    }//fin main
}// fin class
