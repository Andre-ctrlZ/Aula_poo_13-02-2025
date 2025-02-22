public class Memoria extends Computador{
    private String  Capacidade_armazenamento;

    public Memoria(String marca, String modelo, String capacidade_armazenamento) {
        super(marca, modelo);
        Capacidade_armazenamento = capacidade_armazenamento;
    }

    public String getCapacidade_armazenamento() {
        return Capacidade_armazenamento;
    }

    public void setCapacidade_armazenamento(String capacidade_armazenamento) {
        Capacidade_armazenamento = capacidade_armazenamento;
    }

    @Override
    public String toString() {
        return "Memoria [Marca=" + Marca + ", Capacidade_armazenamento=" + Capacidade_armazenamento + ", Modelo="
                + Modelo + "]";
    }

    
}
