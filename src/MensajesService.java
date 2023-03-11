import java.util.Scanner;

public class MensajesService {
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu mensaje:");
        String mensaje = sc.nextLine();

        System.out.println("Escribe el nombre del autor:");
        String autor = sc.nextLine();

        Mensajes myNewMessage = new Mensajes();
        myNewMessage.setMensaje(mensaje);
        myNewMessage.setAutor_mensaje(autor);

        MensajesDAO.crearMensajeDB(myNewMessage);
    }

    public static void listarMensajes(){
        MensajesDAO.leerMensajesDB();
    }

    public static void borrarMensaje(){

    }

    public static void editarMensaje(){

    }
}
