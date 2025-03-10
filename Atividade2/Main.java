package Atividade2;

public class Main {
    public static void main(String[] args) {
  
        // Criando um Gerente
        Gerente gerente = new Gerente("Carlos Silva", "1980-03-12", 6000.00, Bonificados.GERENTE);
        gerente.setStatus(true);  // Admitido

        // Exibindo as informações do Gerente
        System.out.println(gerente);
        System.out.println("Salário Final do Gerente: " + gerente.getSalarioFinal());

        // Criando um Operário
        Operardor operario = new Operardor("João Pereira", "1992-07-23", 3000.00);
        gerente.Admitir(operario);  // Admitido

        // Exibindo as informações do Operário
        System.out.println(operario);
        System.out.println(" Salário Final do Operário: " + operario.getSalarioFinal());

        // Admitindo o Operário
        gerente.Demitir(operario);
        System.out.println(operario);
    }
}

