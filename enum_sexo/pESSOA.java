package enum_sexo;

public class pESSOA {
    private String nome;
    private Sexo sexo;
    
    public pESSOA() {
    }

    public pESSOA(String nome, Sexo sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "pESSOA [nome=" + nome + ", sexo=" + sexo + "]";
    }

}
