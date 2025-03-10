package Atividade2;

public class Gerente extends CargoDeConfianca {

    public Gerente(String nome, String DataNascimento, Double SalarioBase, Bonificados bonificados) {
        super(nome, DataNascimento, SalarioBase, bonificados);
    }

    @Override
    public Double getSalarioFinal() {
        return SalarioBase * bonificados.getValue(); // Multiplicamos o salário base pela bonificação
    }
}
