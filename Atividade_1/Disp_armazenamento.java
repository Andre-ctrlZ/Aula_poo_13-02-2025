public class Disp_armazenamento extends Computador{
    private String Tipo_conexao;

    public Disp_armazenamento(String marca, String modelo, String capacidade_armazenamento, String tipo_conexao) {
        super(marca, modelo, capacidade_armazenamento);
        this.Tipo_conexao = tipo_conexao;
    }

    public String getTipo_conexao() {
        return Tipo_conexao;
    }

    public void setTipo_conexao(String tipo_conexao) {
        Tipo_conexao = tipo_conexao;
    }

    @Override
    public String toString() {
        return "Disp_armazenamento [Tipo_conexao=" + Tipo_conexao + "]" + super.toStringMarcaModeloCapacidade();
    }
    
}
