package ar.edu.unahur.obj2.w2j.planes;

import ar.edu.unahur.obj2.w2j.usuarios.Usuario;

public abstract class PlanConLimite implements PlanStrategy {
    protected Integer limite;
    protected static Double costoBase = 5.0;

    public PlanConLimite(Integer limite) {
        this.limite = limite;
    }

     @Override
    public Double costoDelplan(Usuario usuario) {
        return costoBase;
    }

}
