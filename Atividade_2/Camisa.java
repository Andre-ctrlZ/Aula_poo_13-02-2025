public class Camisa extends Produto {
    public Camisa(String Marca, String Cor, String tamanho, double preço){
        super(Marca, Cor, tamanho, preço);
    }

    @Override
    public String toString() {
        return "Camisa [" + super.toString() + "]";
    }

    
}
