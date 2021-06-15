package Cinco;

public class Cliente {

    public static void main(String []args){

        IStateComputadora state = new Apagado();
        Computadora computadora = new Computadora();
        computadora.setState(state);
        computadora.request();

        state = new Prendido();
        computadora.setState(state);
        computadora.request();

        state = new Reiniciar();
        computadora.setState(state);
        computadora.request();

    }

}
