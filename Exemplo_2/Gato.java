package Exemplo_2;

public class Gato implements Animal{

    @Override
    public String emitirSom() {
        return "Miau!";
    }

    @Override
    public String comer() {
        return "O gato comeu o peixe.";
    }

}
