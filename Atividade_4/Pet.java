package Atividade_4;

public class Pet {

    private String nome;
    private String idade;
    private String raça;
    
    public Pet() {
    }

    public Pet(String nome, String idade, String raça) {
        this.nome = nome;
        this.idade = idade;
        this.raça = raça;
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

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    @Override
    public String toString() {
        return "Pet [nome=" + nome + ", idade=" + idade + ", raça=" + raça + "]";
    }

}
