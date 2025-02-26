public class Processador extends Computador{
    
    public Processador(String marca, String modelo, String Frequencia) {
        super(marca, modelo, Frequencia);
    }

    @Override
    public String toString() {
        return "Processador [] " +  super.toStringMarcaModeloFrequencia();
    }

}
