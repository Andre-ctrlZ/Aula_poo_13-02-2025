

public abstract class Funcionario {
    protected String nome;
    protected String DataNascimento;
    protected Sexo Sexo;
    protected Setor Setor;
    protected Double SalarioBase;

    public Funcionario(){}

    public Funcionario(String nome, String DataNascimento, Sexo Sexo, Setor Setor, Double SalarioBase){
        this.nome = nome;
        this.DataNascimento = DataNascimento;
        this.Sexo = Sexo;
        this.Setor = Setor;
        this.SalarioBase = SalarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public Sexo getSexo() {
        return Sexo;
    }

    public void setSexo(Sexo Sexo) {
        this.Sexo = Sexo;
    }

    public Setor getSetor() {
        return Setor;
    }

    public void setSetor(Setor Setor) {
        this.Setor = Setor;
    }

    public Double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(Double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "Data de nascimento: " + DataNascimento + "Sexo: " + Sexo + "Setor: " + Setor + "Salario: " + SalarioBase;
    }

    public abstract Double getSalarioFinal();
}
