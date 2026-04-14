package ar.edu.unahur.obj2.w2j.contenidos;


public class Episodio {
    
    private String titulo;
    private int numero;
    private Double costo;

    public Episodio(String titulo, int numero, Double costo) {
        this.titulo = titulo;
        this.numero = numero;
        this.costo = costo;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
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