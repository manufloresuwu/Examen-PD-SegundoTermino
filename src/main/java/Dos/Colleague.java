package Dos;

public abstract class Colleague {
    protected ICanalDeComunicacion canalDeComunicacion;

    public Colleague(ICanalDeComunicacion canalDeComunicacion){
        this.canalDeComunicacion =canalDeComunicacion;
    }

    protected abstract void enviar(Mensaje mensaje);
    protected abstract void recibirMensaje(String message);
}