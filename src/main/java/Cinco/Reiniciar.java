package Cinco;

public class Reiniciar implements IStateComputadora{
    @Override
    public void handler(Computadora computadora) {
        System.out.println("*************************");
        System.out.println("Estado: Reiniciando");
        System.out.println("RAM antes:"+computadora.getRam()+" %");
        System.out.println("CPU antes:"+computadora.getCpu()+" %");
        computadora.setRam(0);
        computadora.setCpu(0);
        computadora.setProgramasAbiertos(new String[20]);
        System.out.println("RAM actual:"+computadora.getRam()+" %");
        System.out.println("CPU actual:"+computadora.getCpu()+" %");
        System.out.println("Programas cerrados");

    }
}
