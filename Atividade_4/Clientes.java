package Atividade_4;



public class Clientes {
    private String nome;
    private String idade;
    private Pet pet;
    
    public Clientes() {
    }

    public Clientes(String nome, String idade, Pet pet) {
        this.nome = nome;
        this.idade = idade;
        this.pet = pet;
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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Clientes [nome=" + nome + ", idade=" + idade + ", pet=" + pet + "]";
    }

    
}
