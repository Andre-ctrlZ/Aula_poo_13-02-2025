package Exemplo_3;

public class MainOperacoes {
    public static void main(String[] args) {
        Somar somar = new Somar();
        Subtrair sub = new Subtrair();
        Dividir div = new Dividir();
        Multiplicar mult = new Multiplicar();

        System.out.println(somar.calcular(1.5, 1.5));
        System.out.println(sub.calcular(1.5, 1.5));
        System.out.println(div.calcular(1.5, 1.5));
        System.out.println(mult.calcular(1.5, 1.5));
    }
}
