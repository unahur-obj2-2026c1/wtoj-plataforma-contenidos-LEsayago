package ar.edu.unahur.obj2.w2j.contenidos;

public class Documental extends Contenido {
    
    
   
    public Documental(String titulo, Double costoBase) {
        super(titulo, costoBase);
    }
// podriamos definir directamente una variable de clase
    @Override
    public Double doCosto() {
        return IDRA.getInstance().getValor();
    }
    
}


