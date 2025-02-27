package Exemplo_2;

public class Pato implements Animal{

    @Override
    public String emitirSom() {
        return "Quack-quack";
    }

    @Override
    public String comer() {
        return "O pato come insetos.";
    }

}
