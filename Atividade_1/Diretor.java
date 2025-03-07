public class Diretor extends Funcionario implements Contratacao{
    public double Premio = 0.2;

    public Diretor(String Nome, String DataNascimento, Sexo Sexo, Setor Setor, Double SalarioBase){
        super(Nome, DataNascimento, Sexo, Setor, SalarioBase);
    }

    @Override
    public void Admitir(Funcionario funcionario) {
        funcionario.setStatus(true); // Admite o funcionário
        System.out.println("O funcionário " + funcionario.getNome() + " foi admitido!");
    }

    @Override
    public void Demitir(Funcionario funcionario) {
        funcionario.setStatus(false); // Demite o funcionário
        System.out.println("O funcionário " + funcionario.getNome() + " foi demitido!");
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
