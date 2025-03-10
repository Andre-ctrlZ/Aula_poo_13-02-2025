package Atividade2;

public abstract class Funcionario2 implements SalarioFinal {
    protected String nome;
    protected String DataNascimento;
    protected Double SalarioBase;
    protected Setor setor;
    protected boolean status; // true = admitido, false = demitido
    //protected Bonificados bonificados;

    public Funcionario2(String nome, String DataNascimento, Double SalarioBase){
        this.nome = nome;
        this.DataNascimento = DataNascimento;
        this.SalarioBase = SalarioBase;
        this.status = false; // Por padrão, o funcionário está demitido
        //this.bonificados = bonificados;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
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

    public Double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(Double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Funcionario - nome: " + nome + " - Data de Nascimento: " + DataNascimento + " - Salario: " + SalarioBase + 
               " - Status: " + (status ? "Admitido" : "Demitido");
    }

    public abstract Double getSalarioFinal();
}
