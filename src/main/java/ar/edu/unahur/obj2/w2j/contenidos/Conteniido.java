package ar.edu.unahur.obj2.w2j.contenidos;

public abstract class Conteniido {

    private String titulo;
    private Double costoBaseDeLicencia;

    public Conteniido(String titulo, Double costoBaseDeLicencia) {
        this.titulo = titulo;
        this.costoBaseDeLicencia = costoBaseDeLicencia;
    }

    public Conteniido(String titulo) {
        this.titulo = titulo;
        this.costoBaseDeLicencia = 0.0;
    }

    public String getTitulo() {
        return titulo;
    }
    public Double getCostoBaseDeLicencia() {
        return costoBaseDeLicencia;
    }
    
    public void setCostoBaseDeLicencia(Double costoBaseDeLicencia) {
        this.costoBaseDeLicencia = costoBaseDeLicencia;
    }

}
