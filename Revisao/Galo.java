package Revisao;

public class Galo implements Animal{
    @Override
    public String emitirSom(){
        return "Có-có!";
    }

    @Override
    public String Comer(){
        return "O galo se alimenta de minhocas inocentes.";
    }

    
    @Override
    public void acao(){
        System.out.println("O galo cisca o chão, sem piedade para as minhocas");
    }
}
