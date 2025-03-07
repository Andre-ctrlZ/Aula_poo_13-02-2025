public class Diretor extends Funcionario{
    public double Premio = 0.2;

    public Diretor(String Nome, String DataNascimento, Sexo Sexo, Setor Setor, Double SalarioBase){
        super(Nome, DataNascimento, Sexo, Setor, SalarioBase);
    }

    public double getPremio(){
        return Premio;
    }

    @Override
    public Double getSalarioFinal(){
        return super.SalarioBase + (SalarioBase * Premio);
    }

    @Override
    public String toString(){
        return "Diretor - nome: " + nome + "Data de Nascimento: " + DataNascimento + "Sexo: " + Sexo + "Setor: " + Setor + "Salario: " + SalarioBase;
    }
}
