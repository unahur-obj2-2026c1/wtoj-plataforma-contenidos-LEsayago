package ar.edu.unahur.obj2.w2j.planes;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
import ar.edu.unahur.obj2.w2j.usuarios.Usuario;

public abstract class PlanConLimite implements PlanStrategy {
    protected Integer limite;
    protected static Double costoBase = 5.0;

    public PlanConLimite(Integer limite) {
        this.limite = limite;
    }

     public static Double getCostoBase() {
         return costoBase;
     }

     
     @Override
    public Double costoDelplan(Usuario usuario) {
        Double costoExedentes = usuario.getContenidos().stream()
                .skip(limite)
                .mapToDouble(Contenido::getcostoBase)
                .sum();
        Double total = costoBase + costoExedentes;

        return aplicarAjuste(total);
    }


    // template method, que se implementa en las subclases para aplicar el ajuste correspondiente
     protected abstract Double aplicarAjuste(Double total);


     

}
