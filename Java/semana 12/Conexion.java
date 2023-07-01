package utn.estudiante.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.forName;

public class Conexion {

    public static Connection getConnection(){
      Connection  conexion= null;
      //variables para conectar a la base de datos
        var baseDeDatos= "estudiantes";
        var url="jdbc:mysql://localhost:3306/"+baseDeDatos;
        var usuario= "root";
        var password="";

        //cargamos la clase del drive.
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion= DriverManager.getConnection(url,usuario,password);
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Ocurrio un error en la conexion: "+ e.getMessage());
        }//fin catch
        return conexion;



    } //fin metodo
}
