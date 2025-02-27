public class Sapato extends Produto {
    public Sapato(String Marca, String Cor, String tamanho, double preço){
        super(Marca, Cor, tamanho, preço);
    }

    @Override
    public String toString() {
        return "Sapato [" + super.toString() + "]";
    }

    
}
