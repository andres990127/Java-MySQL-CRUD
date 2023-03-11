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
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el ID del mensaje a borrar:");
        int id_mensaje = sc.nextInt();

        MensajesDAO.borrarMensajeDB(id_mensaje);
    }

    public static void editarMensaje(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el ID del mensaje a editar:");
        int id_mensaje = Integer.parseInt(sc.nextLine());

        System.out.println("Escribe tu mensaje:");
        String mensaje = sc.next();

        Mensajes myEditedMessage = new Mensajes();
        myEditedMessage.setId_mensaje(id_mensaje);
        myEditedMessage.setMensaje(mensaje);

        MensajesDAO.actualizarMensajeDB(myEditedMessage);
    }
}
