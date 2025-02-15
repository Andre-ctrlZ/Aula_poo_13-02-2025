package Atividade_2;

public class Livro {
    private String titulo;
    private String autor;
    private String ISBN;
    private String num_paginas;
    private double preço;

    public Livro(String titulo, String autor, String iSBN, String num_paginas, double preço) {
        this.titulo = titulo;
        this.autor = autor;
        ISBN = iSBN;
        this.num_paginas = num_paginas;
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
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public String getNum_paginas() {
        return num_paginas;
    }
    public void setNum_paginas(String num_paginas) {
        this.num_paginas = num_paginas;
    }
    public double getPreço() {
        return preço;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }

    
}
