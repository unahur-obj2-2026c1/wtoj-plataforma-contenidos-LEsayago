package ar.edu.unahur.obj2.w2j.contenidos;

public abstract class Contenido {

    private String titulo;
    protected Double costoBase;

    public Contenido(String titulo, Double costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    public Contenido(String titulo) {
        this.titulo = titulo;
        this.costoBase = 0.0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getcostoBase() {
        return costoBase;
    }
    
    public void setcostoBase(Double costoBase) {
        this.costoBase = costoBase;
    }

    //Template method
    public Double costo() {
        return costoBase + doCosto();
    }

    //metodo abstracto doCosto()
    public abstract Double doCosto();

}
