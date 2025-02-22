package exemplo;

public class MainExemplo {
    public static void main(String[] args) {
        Cliente client1 = new Cliente("Marta", "33", "12/12/2000", "PIX");
        Funcionario funcionario = new Funcionario("José", "40", "321654987", "Programador", 4000);

        System.out.println(client1.toString());
        System.out.println();
        System.out.println(funcionario.toString());
    }
}
