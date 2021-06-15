package Dos;

public class Estudiante extends Colleague {
    private String nombre;
    private int matricula;

    public Estudiante(String nombre, int matricula, ICanalDeComunicacion canalDeComunicacion) {
        super(canalDeComunicacion);
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void enviarMensajeATodos(String mensaje) {
        this.enviar(new Mensaje(true, true, true, mensaje));
    }

    public void enviarMensajeADocentes(String mensaje) {
        this.enviar(new Mensaje(false, true, false, mensaje));
    }

    public void enviarMensajeAAdministrativos(String mensaje) {
        this.enviar(new Mensaje(false, false, true, mensaje));
    }

    @Override
    protected void enviar(Mensaje mensaje) {
        canalDeComunicacion.send(mensaje, this);

    }

    @Override
    protected void recibirMensaje(String message) {
        System.out.println("Estudiante " + nombre + " recibio el mensaje: ");
        System.out.println(message);
    }
}
