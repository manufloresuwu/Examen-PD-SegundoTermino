package Dos;

public class Cliente {

    public static void main(String[] args) {
        ChatEducativo chat = new ChatEducativo();

        Administrativo a =  new Administrativo("Contador", "Kaleb", chat);
        Estudiante e = new Estudiante("Luciano", 34543, chat);
        Docente d = new Docente(3467896, "Eynar", chat);

        chat.addPersonasAlChat(e);
        chat.addPersonasAlChat(d);
        chat.addPersonasAlChat(a);

        e.enviarMensajeATodos("De estudiante para todos");
        e.enviarMensajeADocentes("De estudiante para docentes");
        e.enviarMensajeAAdministrativos("De estudiante para admins");
        d.enviarMensajeAEstudiantes("De docente para estudiantes");
        d.enviarMensajeADocentes("De docente para docentes");
        a.enviarMensajeATodos("De admin para todos");

    }

}
