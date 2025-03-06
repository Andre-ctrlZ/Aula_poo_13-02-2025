package Revisao;

public class Pato implements Animal{
    @Override
    public String emitirSom(){
        return "QUEM QUEM QUEM!";
    }

    @Override
    public String Comer(){
        return "O pato se alimenta de música";
    }

    
    @Override
    public void acao(){
        System.out.println("O pato vinha cantando alegremente.");
    }
}
