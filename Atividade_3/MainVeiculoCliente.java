package Atividade_3;
import java.util.Scanner;

public class MainVeiculoCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome= "";
        String idade= "";
        String cpf= "";
        String endereço= "";
        String telefone= "";
        String placa = "";
        String cor = "";
        int num_passageiro = 0;
        double capacidade_tanque = 0.0;
        double velocidade_max = 0.0;
        double consumo_médio = 0.0;

        Veiculo veiculo = new Veiculo(placa, cor, num_passageiro, capacidade_tanque, velocidade_max, consumo_médio);
        Cliente cliente = new Cliente(nome, idade, cpf, endereço, telefone);

        System.out.println("Bem vindo a loja De-Carros, informe o seu nome para o nosso cadastro: ");
        nome = sc.nextLine();
        System.out.println("Entendido, informe a sua idade: ");
        idade = sc.nextLine();
        System.out.println("Informe o seu CPF: ");
        cpf = sc.nextLine();
        System.out.println("Informe o seu endereço para o cadastro: ");
        endereço = sc.nextLine();
        System.out.println("Qual o seu telefone?");
        telefone = sc.nextLine();
        
        System.out.println("\nQual a placa do veículo que você deseja comprar: ");
        placa = sc.nextLine();
        System.out.println("Informe a cor que você deseja: ");
        cor = sc.nextLine();
        System.out.println("Qual o número de passageiros você deseja levar: ");
        num_passageiro = sc.nextInt();
        sc.nextLine();
        System.out.println("Qual a capacidade do tanque: ");
        capacidade_tanque = sc.nextDouble();
        System.out.println("Diga a velocidade máximado veiculo: ");
        velocidade_max = sc.nextDouble();
        System.out.println("Qual o consumo medio do veiculo: ");
        consumo_médio = sc.nextDouble();

        veiculo.setPlaca(placa);
        veiculo.setCor(cor);
        veiculo.setNum_passageiro(num_passageiro);
        veiculo.setCapacidade_tanque(capacidade_tanque);
        veiculo.setVelocidade_max(velocidade_max);
        veiculo.setConsumo_médio(consumo_médio);

        cliente.setNome(nome);
        cliente.setIdade(idade);
        cliente.setCpf(cpf);
        cliente.setEndereço(endereço);
        cliente.setTelefone(telefone);

        System.out.println("\nDados do Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Endereço: " + cliente.getEndereço());
        System.out.println("Telefone: " + cliente.getTelefone());

        System.out.println("\nDados do Veículo:");
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Cor: " + veiculo.getCor());
        System.out.println("Número de Passageiros: " + veiculo.getNum_passageiro());
        System.out.println("Capacidade do Tanque: " + veiculo.getCapacidade_tanque() + " litros");
        System.out.println("Velocidade Máxima: " + veiculo.getVelocidade_max() + " km/h");
        System.out.println("Consumo Médio: " + veiculo.getConsumo_médio() + " km/l");

        System.out.println("\nAgradecemos por escolher a De-Carros! Em breve entraremos em contato para finalizar a compra.");
    }
}
