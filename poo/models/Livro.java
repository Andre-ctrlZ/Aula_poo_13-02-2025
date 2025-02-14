package poo.models;

public class Livro {
    private String titulo;
    private String autor;
    private int numero_pag;
    private double preço = 0.0;

    public Livro(String titulo, String autor, int numero_pag, double preço) {
        this.titulo = titulo;
        this.autor = autor;
        this.numero_pag = numero_pag;
        this.preço = preço;

    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumero_pag() {
        return numero_pag;
    }
    public void setNumero_pag(int numero_pag) {
        this.numero_pag = numero_pag;
    }
    public double getPreço() {
        return preço;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }

    
}
