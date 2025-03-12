package Atividade2;

public class Diretor extends CargoDeConfianca {
    public double Premio = 0.2;

    public Diretor(String nome, String DataNascimento, Double SalarioBase, Bonificados bonificados) {
        super(nome, DataNascimento, SalarioBase, bonificados);
    }

    @Override
    public Double getSalarioFinal() {
        return (SalarioBase+(SalarioBase * Premio)) * bonificados.getValue(); // Multiplicamos o salário base pela bonificação
    }

    public double getPremio(){
        return Premio;
    }
    
}
 