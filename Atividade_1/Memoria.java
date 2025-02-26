public class Memoria extends Computador{

    public Memoria(String marca, String modelo, String capacidade_armazenamento, String frequencia) {
        super(marca, modelo, capacidade_armazenamento, frequencia);
    }

    @Override
    public String toString() {
        return "Memoria []" + super.toStringMarcaModeloCapacidadeFrequencia();
    }

    
}
