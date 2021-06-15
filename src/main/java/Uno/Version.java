package Uno;

public class Version {

    private Archivo state;
    private int version=0;
    public void setState(Archivo state) {
        System.out.println("**** Set State *****");
        if(state.getContenido().split(" ").length>=5) {
            version++;
            state.setAlias("version"+version);
        }
        state.showInfo();
        this.state = state;
    }

    public EstadoArchivo createVersion() {
        System.out.println("**** Create State *****");
        state.showInfo();
        return new EstadoArchivo(this.state);
    }

    public void restoreVersion(EstadoArchivo estadoArchivo) {
        this.state = estadoArchivo.getArchivo();
        System.out.println("**** State Restored *****");
        state.showInfo();
    }

}
