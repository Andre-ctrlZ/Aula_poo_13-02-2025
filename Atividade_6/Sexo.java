public enum Sexo {
    FEMININO("feminino"),
    MASCULINO("Masculino");

    private String texto;

    private Sexo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    
}
