/*
    File -> Project Structure -> Libraries, hacer click al (+), y luego seleccionan la opcion 2 (descargar del repositorio de Maven).
    Alli buscan poniendo ‘mysql-connector-java’ y les arroja las opciones.
*/
/*
    Se usa el patron de diseño SINGLETON para no crear más de un objeto de conexión verificando si ya existe uno
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static Connection myConnection;
    public static Connection getConnection(){
        if(myConnection == null) {
            try {
                myConnection = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10604881","sql10604881","kcN11tenqz");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return myConnection;
    }
}
