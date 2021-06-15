package Uno;

import java.util.*;

public class Versiones {

    private List<EstadoArchivo> versiones = new ArrayList<>();

    public void addArchivo(EstadoArchivo estadoArchivo) {
        if (estadoArchivo.getArchivo().getContenido().split(" ").length >= 5) {
            versiones.add(estadoArchivo);
        } else {
            System.out.println("Se necesitan mas palabras");
        }
    }

    public EstadoArchivo getArchivo(int statePosition) {
        return versiones.get(statePosition);
    }

}
