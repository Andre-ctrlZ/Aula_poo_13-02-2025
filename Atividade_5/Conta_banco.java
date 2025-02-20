package Atividade_5;

public class Conta_banco {
    private String Banco;
    private String Agencia;
    private String Nmr_conta;
    private String Tipo_conta;
    private double saldo_atl;
    private double limite_disp;
    
    public Conta_banco() {
    }

    public Conta_banco(String banco, String agencia, String nmr_conta, String tipo_conta, double saldo_atl,
            double limite_disp) {
        Banco = banco;
        Agencia = agencia;
        Nmr_conta = nmr_conta;
        Tipo_conta = tipo_conta;
        this.saldo_atl = saldo_atl;
        this.limite_disp = limite_disp;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String banco) {
        Banco = banco;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getNmr_conta() {
        return Nmr_conta;
    }

    public void setNmr_conta(String nmr_conta) {
        Nmr_conta = nmr_conta;
    }

    public String getTipo_conta() {
        return Tipo_conta;
    }

    public void setTipo_conta(String tipo_conta) {
        Tipo_conta = tipo_conta;
    }

    public double getSaldo_atl() {
        return saldo_atl;
    }

    public void setSaldo_atl(double saldo_atl) {
        this.saldo_atl = saldo_atl;
    }

    public double getLimite_disp() {
        return limite_disp;
    }

    public void setLimite_disp(double limite_disp) {
        this.limite_disp = limite_disp;
    }

    @Override
    public String toString() {
        return "Conta_banco [Banco=" + Banco + ", Agencia=" + Agencia + ", Nmr_conta=" + Nmr_conta + ", Tipo_conta="
                + Tipo_conta + ", saldo_atl=" + saldo_atl + ", limite_disp=" + limite_disp + "]";
    }

}
