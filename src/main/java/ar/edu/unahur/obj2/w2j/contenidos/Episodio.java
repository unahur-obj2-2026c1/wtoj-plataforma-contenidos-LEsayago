package ar.edu.unahur.obj2.w2j.contenidos;


public class Episodio {
    
    private String titulo;
    private int numero;

    public Episodio(String titulo, int numero) {
        this.titulo = titulo;
        this.numero = numero;
    }
    
    public String getTitulo() {
            return titulo;
    }
    
    public void setTitulo(String titulo) {
            this.titulo = titulo;
    }
    
    public int getNumero() {
            return numero;
    }
    
    public void setNumero(int numero) {
            this.numero = numero;
    }
}