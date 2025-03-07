public class Motoboy extends Funcionario{
    public String CarteiraHabilitacao;

    public Motoboy(String Nome, String DataNascimento, Sexo Sexo, Setor Setor, Double SalarioBase, String CarteiraHabilitacao){
        super(Nome, DataNascimento, Sexo, Setor, SalarioBase);
        this.CarteiraHabilitacao = CarteiraHabilitacao;
    }

    public String getCarteiraHabilitacao() {
        return CarteiraHabilitacao;
    }

    public void setCarteiraHabilitacao(String CarteiraHabilitacao) {
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
}
