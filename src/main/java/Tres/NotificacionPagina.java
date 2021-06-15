package Tres;

import java.util.*;

public class NotificacionPagina implements INotificacion {

    private List<IUsuario> observerList= new ArrayList<>();

    private List<Notificacion> notificacionList = new ArrayList<>();

    public void uploadNewNotificacion(Notificacion notificacion){
        notificacionList.add(notificacion);
        this.notifyObserver(notificacion);
    }

    @Override
    public void attach(IUsuario observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(IUsuario observer) {
        observerList.remove(observer);
    }


    @Override
    public void notifyObserver(Notificacion notificacion) {
        for (IUsuario userPagina:observerList) {
            if (userPagina.getCategoria().equals(notificacion.getCategoria()) || userPagina.getCategoria().equals("Todos")){
                // notificacion
                userPagina.update("Se subio el siguiente contenido: " + notificacion.getContenido(),notificacion);
            }

        }
    }
}
