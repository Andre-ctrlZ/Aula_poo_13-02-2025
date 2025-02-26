public abstract class Computador {
    protected String Marca;
    protected String Modelo;
    protected String Capacidade_armazenamento;
    protected String Frequencia;
    
    public Computador() {
    }

    public Computador(String marca, String modelo) {
        Marca = marca;
        Modelo = modelo;
    }

    public Computador(String marca, String modelo, String capacidade_armazenamento) {
        Marca = marca;
        Modelo = modelo;
        Capacidade_armazenamento = capacidade_armazenamento;
    }

    public Computador(String marca, String modelo, String capacidade_armazenamento, String frequencia) {
        Marca = marca;
        Modelo = modelo;
        Capacidade_armazenamento = capacidade_armazenamento;
        Frequencia = frequencia;
    }

    
    public String toStringMarcaModeloCapacidadeFrequencia() {
        return "Computador [Marca=" + Marca + ", Modelo=" + Modelo + ", Capacidade_armazenamento="
                + Capacidade_armazenamento + ", Frequencia=" + Frequencia + "]";
    }

    public String toStringMarcaModelo() {
        return "Computador [Marca=" + Marca + ", Modelo=" + Modelo + "]";
    }

    public String toStringMarcaModeloFrequencia(){
        return "Computador [Marca=" + Marca + ", Modelo=" + Modelo + " Frequencia=" + Frequencia + "]";
    }
    
}
