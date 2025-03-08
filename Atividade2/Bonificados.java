package Atividade2;

public enum Bonificados {
    GERENTE(1.3),
    DIRETOR(1.4);
    private final double value;

    Bonificados(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
