public class Calca extends Produto {
    public Calca(String Marca, String Cor, String tamanho, double preço){
        super(Marca, Cor, tamanho, preço);
    }

    @Override
    public String toString() {
        return "Calça [" + super.toString() + "]";
    }

    
}
