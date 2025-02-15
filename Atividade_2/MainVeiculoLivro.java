package Atividade_2;
import java.util.Scanner;

public class MainVeiculoLivro {
    public static void main(String[] args){ 
    Scanner sc = new Scanner(System.in);

    String titulo = "";
    String autor = "";
    String ISBN = "";
    String num_paginas = "";
    double preço = 0.0;
    
    String placa = "";
    String cor = "";
    int num_passageiro = 0;
    double capacidade_tanque = 0.0;
    double velocidade_max = 0.0;
    double consumo_médio = 0.0;
    
    Veiculo veiculo = new Veiculo(placa, cor, num_passageiro, capacidade_tanque, velocidade_max, consumo_médio);
    Livro livro = new Livro(titulo, autor, ISBN, num_paginas, preço);

    System.out.println("Qual a placa do veículo que você deseja comprar: ");
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

    System.out.println("Estamos com uma promoção, compre um carro e leve um livro, qual titulo você deseja: ");
    titulo = sc.nextLine();
    System.out.println("Entendi, qual o autor desse livo: ");
    autor = sc.nextLine();
    System.out.println("Você sabe infomar o ISBN: ");
    ISBN = sc.nextLine();
    System.out.println("E o numero de páginas: ");
    num_paginas = sc.nextLine();
    System.out.println("Apesar de você não pagar, infome o preço: ");
    preço = sc.nextDouble();

    veiculo.setPlaca(placa);
    veiculo.setCor(cor);
    veiculo.setNum_passageiro(num_passageiro);
    veiculo.setCapacidade_tanque(capacidade_tanque);
    veiculo.setVelocidade_max(velocidade_max);
    veiculo.setConsumo_médio(consumo_médio);

    livro.setTitulo(titulo);
    livro.setAutor(autor);
    livro.setISBN(ISBN);
    livro.setNum_paginas(num_paginas);
    livro.setPreço(preço);

    System.out.println("Então você deseja um carro com a placa "+veiculo.getPlaca()+ " da cor " +veiculo.getCor());
    System.out.println("Boa escolha! Para confirma, ele precisa levar " +veiculo.getNum_passageiro()+ " passageiros, certo?");
    System.out.println("Com a capacidade no tanque de " +veiculo.getCapacidade_tanque()+" consumo medio de "+veiculo.getConsumo_médio());
    System.out.println("Sua velocidade máxima vai ser de: "+veiculo.getVelocidade_max());
    System.out.println("\nO livro que vai ir de brinde vai ser o "+livro.getTitulo()+" do autor "+livro.getAutor());
    System.out.println("O ISBN desse livro é: " +livro.getISBN()+ " e tem " +livro.getNum_paginas()+ " paginas.");
    System.out.println("O valor do livro é de: " +livro.getPreço());
}
}