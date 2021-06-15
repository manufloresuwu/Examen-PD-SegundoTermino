package Cinco;

public class Apagado implements IStateComputadora{
    @Override
    public void handler(Computadora computadora) {
        System.out.println("*************************");
        System.out.println("Estado: Apagado");
        computadora.setRam(0);
        computadora.setCpu(0);
        computadora.setProgramasAbiertos(new String[20]);
        System.out.println("RAM:"+computadora.getRam()+" %");
        System.out.println("CPU:"+computadora.getCpu()+" %");
        System.out.println("N/PA");
        System.out.println("*************************");

    }
}
