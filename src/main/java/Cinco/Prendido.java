package Cinco;

import java.util.*;

public class Prendido implements IStateComputadora{
    private int numero;
    @Override
    public void handler(Computadora computadora) {
        System.out.println("*************************");
        System.out.println("Estado: Prendido");
        computadora.setProgramasAbiertos(abrir());
        computadora.setCpu(computadora.getProgramasAbiertos().length*5);
        computadora.setRam(computadora.getProgramasAbiertos().length*5);
        System.out.println("RAM:"+computadora.getRam()+" %");
        System.out.println("CPU:"+computadora.getCpu()+" %");
        System.out.println("Programas Abiertos:");
        for (int i = 0; i < computadora.getProgramasAbiertos().length; i++){
            System.out.println(" "+computadora.getProgramasAbiertos()[i]);

        }

    }

    private String[] abrir() {

        Random random=new Random();
        numero = random.nextInt(20)+1;
        String[] programa = new String[numero];

        for (int i = 0; i < numero; i++){
            programa[i]="Programa " + (i + 1);
        }

        return programa;
    }
}
