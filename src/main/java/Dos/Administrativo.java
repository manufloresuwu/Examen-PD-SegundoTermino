package Dos;

public class Administrativo extends Colleague {
    private String cargo;
    private String nombre;

    public Administrativo(String cargo, String nombre, ICanalDeComunicacion canalDeComunicacion) {
        super(canalDeComunicacion);
        this.cargo = cargo;
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void enviarMensajeATodos(String mensaje) {
        this.enviar(new Mensaje(true, true, true, mensaje));
    }

    @Override
    protected void enviar(Mensaje mensaje) {
        canalDeComunicacion.send(mensaje, this);

    }

    @Override
    protected void recibirMensaje(String message) {
        System.out.println("Administrativo " + nombre + " recibio el mensaje: ");
        System.out.println(message);
    }

}
