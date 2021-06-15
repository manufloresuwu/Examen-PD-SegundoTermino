package Tres;

public class Cliente {

    public static void main (String []args){

        NotificacionPagina notificacionPagina1 = new NotificacionPagina();

        UsuarioRegistrado usuario1 =new UsuarioRegistrado(new Persona("Carla1"), "Imagen");
        UsuarioRegistrado usuario2 =new UsuarioRegistrado(new Persona( "Carla2"), "Video");
        UsuarioRegistrado usuario3 =new UsuarioRegistrado(new Persona("Carla3"), "Video");
        UsuarioRegistrado usuario4 =new UsuarioRegistrado(new Persona("Carla4"), "Imagen");
        UsuarioRegistrado usuario5 =new UsuarioRegistrado(new Persona("Carla5"), "Todos");

        notificacionPagina1.attach(usuario1);
        notificacionPagina1.attach(usuario2);
        notificacionPagina1.attach(usuario3);
        notificacionPagina1.attach(usuario4);
        notificacionPagina1.attach(usuario5);


        notificacionPagina1.uploadNewNotificacion(new Notificacion("Video", "Barbi.MOV"));
        notificacionPagina1.uploadNewNotificacion(new Notificacion("Imagen", "Perritosonriendo.jpg"));

    }

}
