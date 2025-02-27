public abstract class Produto {
    protected String Marca;
    protected String Cor;
    protected String tamanho;
    protected double preço;
    
    public Produto() {
    }

    public Produto(String marca, String cor, String tamanho, double preço) {
        Marca = marca;
        Cor = cor;
        this.tamanho = tamanho;
        this.preço = preço;
    }

    @Override
    public String toString() {
        return "Marca=" + Marca + ", Cor=" + Cor + ", tamanho=" + tamanho + ", preço=" + preço;
    }

    
}
