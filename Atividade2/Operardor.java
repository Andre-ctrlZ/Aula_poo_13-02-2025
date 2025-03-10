package Atividade2;

public class Operardor extends Funcionario2 {

    public Operardor(String nome, String DataNascimento, Double SalarioBase) {
        super(nome, DataNascimento, SalarioBase);  // Não precisamos de `bonificados` no caso do Operário
    }

    @Override
    public Double getSalarioFinal() {
        return SalarioBase;  // O salário do operário é 10% maior que o salário base
    }
}