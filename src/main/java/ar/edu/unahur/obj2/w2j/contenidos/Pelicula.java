package ar.edu.unahur.obj2.w2j.contenidos;

public class Pelicula extends Conteniido {
    public Pelicula(String titulo, Double costoBase) {
        super(titulo, costoBase);
    }

@Override
public Double doCosto() {
    return 0.0;
}

}
