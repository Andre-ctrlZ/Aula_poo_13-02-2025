package Atividade2;

public abstract class CargoDeConfianca extends Funcionario2 implements Contratacao{
    protected Double bonificacao;
    protected Bonificados bonificados;

    // Construtor agora recebe os parâmetros necessários para a classe Funcionario2
    public CargoDeConfianca(String nome, String DataNascimento, Double SalarioBase, Bonificados bonificados) {
        super(nome, DataNascimento, SalarioBase);  // Passando os parâmetros para o construtor de Funcionario2
        this.bonificados = bonificados;  // O cargo é atribuído
        this.bonificacao = bonificados.getValue();  // A bonificação é atribuída com base no valor do cargo
    }

    @Override
    public void Admitir(Funcionario2 funcionario) {
        funcionario.setStatus(true); // Admite o funcionário
        System.out.println("O funcionário " + funcionario.getNome() + " foi admitido!");
    }

    @Override
    public void Demitir(Funcionario2 funcionario) {
        funcionario.setStatus(false); // Demite o funcionário
        System.out.println("O funcionário " + funcionario.getNome() + " foi demitido!");
    }


    public Double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public Bonificados getBonificados() {
        return bonificados;
    }

    public void setBonificados(Bonificados bonificados) {
        this.bonificados = bonificados;
        this.bonificacao = bonificados.getValue();  // Atualiza a bonificação com base no novo cargo
    }

    @Override
    public String toString() {
        return "Cargo=" + bonificados + "]" + super.toString();
    }

    // Implementação do método abstrato 'getSalarioFinal'
    @Override
    public abstract Double getSalarioFinal();
}
