public class MainEndCliente {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", "23", "Salvador");
        Clientes cliente1 = new Clientes("Marta", "33", endereco1);

        System.out.println(cliente1.toString());

        //Versão 2, reduzida.
        Clientes cliente2 = new Clientes("José", "55", 
        new Endereco("Rua B", "50", "Rio de Janeiro"));

        System.out.println(cliente2.toString());
    }
}
