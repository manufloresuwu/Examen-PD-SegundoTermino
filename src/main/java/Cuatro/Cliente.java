package Cuatro;

import java.util.*;

public class Cliente {

    public static void main(String[] args) {

        BaseDeDatos bd = new BaseDeDatos();
        CI CI = new CI();
        Nombre nombre = new Nombre();
        Profesion profesion = new Profesion();

        Usuario u1 = new Usuario(2347854, "Luciano", new Fecha(8,1, 1989), "Electrico");
        Usuario u2 = new Usuario(2445678, "Camilo", new Fecha(9, 2, 2001), "Cocinero");
        Usuario u3 = new Usuario(9785675, "Manuela", new Fecha(10, 10, 2000), "Mucama");
        Usuario u4 = new Usuario(2345677, "Alejandra", new Fecha(11, 11, 1998), "Ingeniera");
        Usuario u5 = new Usuario(7435435, "Ian", new Fecha(12, 05, 1994), "Boxeador");

        List<Usuario> usuarios = new LinkedList<Usuario>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);
        bd.setUsuarios(usuarios);

        bd.setOrdenamiento(CI);
        bd.ordenar();
        bd.setOrdenamiento(nombre);
        bd.ordenar();
        bd.setOrdenamiento(profesion);
        bd.ordenar();
    }

}
