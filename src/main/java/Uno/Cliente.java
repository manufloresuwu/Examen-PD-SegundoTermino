package Uno;

public class Cliente {

    public static void main(String[] args) {
        Version version = new Version();
        Versiones versiones = new Versiones();

        Archivo a = new Archivo("este documento es una prueba");

        version.setState(a);
        versiones.addArchivo(version.createVersion());

        a = new Archivo("el exito solo depende de tu esfuerzo");
        version.setState(a);
        versiones.addArchivo(version.createVersion());

        a = new Archivo("prologo");
        version.setState(a);
        versiones.addArchivo(version.createVersion());

        a = new Archivo("este documento fue actualizado satisfactoriamente");
        version.setState(a);
        versiones.addArchivo(version.createVersion());

        version.restoreVersion(versiones.getArchivo(0));
    }

}
