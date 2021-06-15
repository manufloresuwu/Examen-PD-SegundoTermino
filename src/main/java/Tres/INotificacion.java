package Tres;

public interface INotificacion {

    void attach(IUsuario observer);
    void deattach(IUsuario observer);
    void notifyObserver(Notificacion notificacion);
}
