package Atividade_4;

public class MainClientPet {
 public static void main(String[] args) {
    Clientes cliente1 = new Clientes("Marta", "22", new Pet("Bilu", "12", "VIRALATA"));

    System.out.println(cliente1.toString());
 }
}
