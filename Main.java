import java.util.Scanner;
import poo.models.Pessoa;
import poo.models.Livro;

public class Main{
    public static void main(String[] args) {
      // String Nome = "";
      // int Idade = 0;
      // String Email = "";
      String titulo = "";
      String autor = "";
      int numeroPaginas = 0;
      double preco = 0.0;

       Scanner sc = new Scanner(System.in);
        // Pessoa pessoa = new Pessoa(Nome, Idade, Email);

        // System.out.println("Informe o seu nome: ");
        // Nome = sc.nextLine();
        // System.out.println("\nInforme o seu email: ");
        // Email = sc.nextLine();
        // System.out.println("\nInforme sua idade: ");
        // Idade = sc.nextInt();

        // pessoa.setNome(Nome);
        // pessoa.setEmail(Email);
        // pessoa.setIdade(Idade);
        
        // System.out.println("Nome: " + pessoa.getNome());
        // System.out.println("Idade: " + pessoa.getIdade());
        // System.out.println("Email: " + pessoa.getEmail());

      Livro livro = new Livro(null, null, 0, 0);
      Livro livro2 = new Livro(null, null, 0, 0);

      System.out.println("Digite o título do livro: ");
      titulo = sc.nextLine();
      System.out.println("Digite o autor do livro: ");
      autor = sc.nextLine();
      System.out.println("Infome a quantidade das páginas: ");
      numeroPaginas = sc.nextInt();
      System.out.println("Informe o preco: ");
      preco = sc.nextDouble();
      sc.nextLine();

      livro.setTitulo(titulo);
      livro.setAutor(autor);
      livro.setNumero_pag(numeroPaginas);
      livro.setPreço(preco);

      System.out.println("\nDigite o título do outro livro: ");
      titulo = sc.nextLine();
      System.out.println("Digite o autor do livro: ");
      autor = sc.nextLine();
      System.out.println("Infome a quantidade das páginas: ");
      numeroPaginas = sc.nextInt();
      System.out.println("Informe o preco: ");
      preco = sc.nextDouble();
      
      livro2.setTitulo(titulo);
      livro2.setAutor(autor);
      livro2.setNumero_pag(numeroPaginas);
      livro2.setPreço(preco);
      
      System.out.println("Titulo: " + livro.getTitulo());
      System.out.println("Autor: " + livro.getAutor());
      System.out.println("Numero de páginas: " + livro.getNumero_pag());
      System.out.println("Preço: " + livro.getPreço());

      System.out.println("\nTitulo: " + livro2.getTitulo());
      System.out.println("Autor: " + livro2.getAutor());
      System.out.println("Numero de páginas: " + livro2.getNumero_pag());
      System.out.println("Preço: " + livro2.getPreço());
 
    }
}
