public class Disp_armazenamento extends Computador{
    private String Capacidade_armazenamento;
    private String Tipo_conexao;
    
    public Disp_armazenamento(String marca, String modelo, String capacidade_armazenamento, String tipo_conexao) {
        super(marca, modelo);
        Capacidade_armazenamento = capacidade_armazenamento;
        Tipo_conexao = tipo_conexao;
    }

    public String getCapacidade_armazenamento() {
        return Capacidade_armazenamento;
    }

    public void setCapacidade_armazenamento(String capacidade_armazenamento) {
        Capacidade_armazenamento = capacidade_armazenamento;
    }

    public String getTipo_conexao() {
        return Tipo_conexao;
    }

    public void setTipo_conexao(String tipo_conexao) {
        Tipo_conexao = tipo_conexao;
    }

    @Override
    public String toString() {
        return "Disp_armazenamento [Marca=" + Marca + ", Capacidade_armazenamento=" + Capacidade_armazenamento
                + ", Modelo=" + Modelo + ", Tipo_conexao=" + Tipo_conexao + "]";
    }

    
}
