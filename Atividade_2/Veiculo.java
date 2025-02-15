package Atividade_2;

public class Veiculo {
    private String placa;
    private String cor;
    private int num_passageiro;
    private double capacidade_tanque;
    private double velocidade_max;
    private double consumo_médio;

    public Veiculo(String placa, String cor, int num_passageiro, double capacidade_tanque, double velocidade_max,
            double consumo_médio) {
        this.placa = placa;
        this.cor = cor;
        this.num_passageiro = num_passageiro;
        this.capacidade_tanque = capacidade_tanque;
        this.velocidade_max = velocidade_max;
        this.consumo_médio = consumo_médio;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getNum_passageiro() {
        return num_passageiro;
    }
    public void setNum_passageiro(int num_passageiro) {
        this.num_passageiro = num_passageiro;
    }
    public double getCapacidade_tanque() {
        return capacidade_tanque;
    }
    public void setCapacidade_tanque(double capacidade_tanque) {
        this.capacidade_tanque = capacidade_tanque;
    }
    public double getVelocidade_max() {
        return velocidade_max;
    }
    public void setVelocidade_max(double velocidade_max) {
        this.velocidade_max = velocidade_max;
    }
    public double getConsumo_médio() {
        return consumo_médio;
    }
    public void setConsumo_médio(double consumo_médio) {
        this.consumo_médio = consumo_médio;
    }

    
}
