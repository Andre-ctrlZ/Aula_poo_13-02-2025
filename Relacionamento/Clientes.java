

public class Clientes {
    private String nome;
    private String idade;
    private Endereco endereco;
    
    public Clientes() {
    }

    public Clientes(String nome, String idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Clientes [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
    }

    
}
