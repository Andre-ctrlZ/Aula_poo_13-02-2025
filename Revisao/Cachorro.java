package Revisao;

public class Cachorro implements Animal{

    @Override
    public String emitirSom(){
        return "Au-au!";
    }

    @Override
    public String Comer(){
        return "Cachorro comeu criançinhas! YUMM~";
    }

    @Override
    public void acao(){
        System.out.println("O cachorro corre atrás do rabo! SPINNING!~");
    }
}
