/*
File -> Project Structure -> Libraries, hacer click al (+), y luego seleccionan la opcion 2 (descargar del repositorio de Maven).
Alli buscan poniendo ‘mysql-connector-java’ y les arroja las opciones.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection get_connection(){
        Connection conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10604881","sql10604881","kcN11tenqz");
            if(conection != null){
                System.out.println("¡Conexión exitosa!");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return conection;
    }
}
