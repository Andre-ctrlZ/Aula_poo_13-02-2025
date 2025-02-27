public class Placa_mae extends Computador{
    private String Soquete;

    public Placa_mae(String marca, String modelo, String soquete) {
        super(marca, modelo);
        Soquete = soquete;
    }

    public String getSoquete() {
        return Soquete;
    }

    public void setSoquete(String soquete) {
        Soquete = soquete;
    }

    @Override
    public String toString() {
        return "Placa_mae [Soquete=" + Soquete + "]" + super.toStringMarcaModelo();
    }

}
