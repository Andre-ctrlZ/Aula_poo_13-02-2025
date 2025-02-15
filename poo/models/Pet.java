package poo.models;

public class Pet {
    String nome;
    String raça;
    String porte;
    String alimentação;
    int idade;
    

    public Pet(String nome, String raça, String porte, String alimentação, int idade) {
        this.nome = nome;
        this.raça = raça;
        this.porte = porte;
        this.alimentação = alimentação;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaça() {
        return raça;
    }
    public void setRaça(String raça) {
        this.raça = raça;
    }
    public String getPorte() {
        return porte;
    }
    public void setPorte(String porte) {
        this.porte = porte;
    }
    public String getAlimentação() {
        return alimentação;
    }
    public void setAlimentação(String alimentação) {
        this.alimentação = alimentação;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
   
}
