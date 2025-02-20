import javax.sound.sampled.SourceDataLine;

public class Endereco {
    private String Logradouro;
    private String Número;
    private String Cidade;
    
    public Endereco() {
    }

    public Endereco(String logradouro, String número, String cidade) {
        Logradouro = logradouro;
        Número = número;
        Cidade = cidade;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }

    public String getNúmero() {
        return Número;
    }

    public void setNúmero(String número) {
        Número = número;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco [Logradouro=" + Logradouro + ", Número=" + Número + ", Cidade=" + Cidade + "]";
    }
    
}
