package Atividade2;

public abstract class CargoDeConfianca{
    private Double bonificacao;
    private Bonificados bonificados;

    public CargoDeConfianca(Double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public Double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Double bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return "CargoDeConfianca [bonificacao=" + bonificacao + "]";
    }
}
