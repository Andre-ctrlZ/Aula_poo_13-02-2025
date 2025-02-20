package Atividade_5;

public class MainContaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("123456789", "Fulano", "Rua A", "7192929292", "fulano@gmail.com", 
        new Conta_banco("Caixa", "13", "123123", "Corrente", 1200.00, 300.00));
    
    System.out.println(funcionario1.toString());
    }
}
