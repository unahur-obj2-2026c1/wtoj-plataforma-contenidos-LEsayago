package ar.edu.unahur.obj2.w2j.contenidos;

public class Documental extends Conteniido {
    
    
   
    public Documental(String titulo, Double costoBase) {
        super(titulo, costoBase);
    }

    @Override
    public Double doCosto() {
        return IDRA.getInstance().getValor();
    }
    
}


