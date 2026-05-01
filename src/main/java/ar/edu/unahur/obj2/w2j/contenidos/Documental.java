package ar.edu.unahur.obj2.w2j.contenidos;

public class Documental extends Contenido {
    //variable de clase, no es necesario crear un getter, ya que el valor es fijo para todos los documentales
    private static Double canonIDRA = 0.5;
   
    public Documental(String titulo, Double costoBase) {
        super(titulo, costoBase);
    }
// podriamos definir directamente una variable de clase
    @Override
    public Double doCosto() {
        return canonIDRA;
    }

}


