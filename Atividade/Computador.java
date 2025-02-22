public abstract class Computador {
    protected String Marca;
    protected String Modelo;
    
    public Computador() {
    }

    public Computador(String marca, String modelo) {
        Marca = marca;
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    @Override
    public String toString() {
        return "Computador [Marca=" + Marca + ", Modelo=" + Modelo + "]";
    }

    
}
