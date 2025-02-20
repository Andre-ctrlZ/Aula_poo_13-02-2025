public class Funcionario {
    private String id;
    private String nome;
    private String idade;
    private double salario;
    private Sexo sexo;
    private Setor setor;
    private Estado estado;
    
    public Funcionario() {
    }

    public Funcionario(String id, String nome, String idade, double salario, Sexo sexo, Setor setor, Estado estado) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.sexo = sexo;
        this.setor = setor;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getIdade() {
        return idade;
    }



    public void setIdade(String idade) {
        this.idade = idade;
    }



    public double getSalario() {
        return salario;
    }



    public void setSalario(double salario) {
        this.salario = salario;
    }



    public Sexo getSexo() {
        return sexo;
    }



    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }



    public Setor getSetor() {
        return setor;
    }



    public void setSetor(Setor setor) {
        this.setor = setor;
    }



    public Estado getEstado() {
        return estado;
    }



    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", nome=" + nome + ", idade=" + idade + ", salario=" + salario + ", sexo="
                + sexo.getTexto() + ", setor=" + setor + ", estado=" + estado.getSigla() + "]";
    }

}
