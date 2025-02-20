package Atividade_5;

public class Funcionario {
    private String Codigo_func;
    private String Nome;
    private String Endereco;
    private String Telefone;
    private String Email;
    private Conta_banco conta_banco;

    public Funcionario() {
    }

    public Funcionario(String codigo_func, String nome, String endereco, String telefone, String email,
            Conta_banco conta_banco) {
        Codigo_func = codigo_func;
        Nome = nome;
        Endereco = endereco;
        Telefone = telefone;
        Email = email;
        this.conta_banco = conta_banco;
    }

    public String getCodigo_func() {
        return Codigo_func;
    }

    public void setCodigo_func(String codigo_func) {
        Codigo_func = codigo_func;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Conta_banco getConta_banco() {
        return conta_banco;
    }

    public void setConta_banco(Conta_banco conta_banco) {
        this.conta_banco = conta_banco;
    }

    @Override
    public String toString() {
        return "Funcionario [Codigo_func=" + Codigo_func + ", Nome=" + Nome + ", Endereco=" + Endereco + ", Telefone="
                + Telefone + ", Email=" + Email + ", conta_banco=" + conta_banco + "]";
    }

    
}
