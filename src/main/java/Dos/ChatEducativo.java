package Dos;

import java.util.*;

public class ChatEducativo implements ICanalDeComunicacion{
    private List<Colleague> personasChat= new ArrayList<>();

    public void addPersonasAlChat(Colleague colleague){
        personasChat.add(colleague);
    }
    @Override
    public void send(Mensaje mensaje, Colleague colleague) {
        for (Colleague p : personasChat) {
            if(p!= colleague) {
                if(p instanceof Estudiante && mensaje.isParaEstudiantes()) {
                    p.recibirMensaje(mensaje.getContenido());
                }
                if(p instanceof Docente && mensaje.isParaDocentes()) {
                    p.recibirMensaje(mensaje.getContenido());
                }
                if(p instanceof Administrativo && mensaje.isParaAdministrativos()) {
                    p.recibirMensaje(mensaje.getContenido());
                }
            }
        }

    }

}
