package Atividade2;

public class Motoboy2 extends Funcionario2{
    public String CarteiraHabilitacao;
    
    public Motoboy2(String nome, String DataNascimento, Double SalarioBase, String CarteiraHabilitacao){
        super(nome, DataNascimento, SalarioBase);
        this.CarteiraHabilitacao = CarteiraHabilitacao;
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
    
    @Override
    public Double getSalarioFinal(){
        return super.SalarioBase;
    }
    
    public String getCarteiraHabilitacao() {
        return CarteiraHabilitacao;
    }

    public void setCarteiraHabilitacao(String CarteiraHabilitacao) {
        this.CarteiraHabilitacao = CarteiraHabilitacao;
    }

}
