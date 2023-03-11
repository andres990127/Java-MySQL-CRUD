import java.sql.Connection;
import java.sql.PreparedStatement;
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

    }

    public static void borrarMensajeDB(int id_mensaje){

    }

    public static void actualizarMensajeDB(Mensajes mensaje){

    }

}
