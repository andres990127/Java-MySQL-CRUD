import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {

    public static void crearMensajeDB(Mensajes mensaje){
        Conexion db_connect = new Conexion();
        try{
            Connection myConextion = db_connect.getConnection();
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO `mensajes` (`MENSAJE`, `AUTOR_MENSAJE`) VALUES (?,?);";
                ps = myConextion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println("El mensaje fue creado correctamente");
            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void leerMensajesDB(){
        Conexion db_connect = new Conexion();
        try{
            Connection myConextion = db_connect.getConnection();
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                String query = "SELECT * FROM mensajes";
                ps = myConextion.prepareStatement(query);
                rs = ps.executeQuery();

                while (rs.next()){
                    System.out.println("------------------------------------------");
                    System.out.println("ID: " + rs.getInt("ID_MENSAJE"));
                    System.out.println("Mensaje: " + rs.getString("MENSAJE"));
                    System.out.println("Autor: " + rs.getString("AUTOR_MENSAJE"));
                    System.out.println("Fecha: " + rs.getDate("FECHA_MENSAJE"));
                    System.out.println("------------------------------------------");
                }
            }catch (SQLException e){
                System.out.println("No se pudieron recuperar los mensajes");
                System.out.println(e);
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void borrarMensajeDB(int id_mensaje){

    }

    public static void actualizarMensajeDB(Mensajes mensaje){

    }

}
