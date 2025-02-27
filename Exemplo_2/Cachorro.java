package Exemplo_2;

public class Cachorro implements Animal{

    @Override
    public String emitirSom() {
        return "Au au";
    }

    @Override
    public String comer() {
        return "O cachorro comeu o osso.";
    }

}
