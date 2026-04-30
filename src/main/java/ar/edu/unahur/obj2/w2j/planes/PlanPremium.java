package ar.edu.unahur.obj2.w2j.planes;

import ar.edu.unahur.obj2.w2j.usuarios.Usuario;

public class PlanPremium implements IPlan {
    private Double costoPlan ;

    public PlanPremium(Double costoPlan) {
        this.costoPlan = costoPlan;
    }

    @Override
    public Double costoDelplan(Usuario usuario) {
        return costoPlan;
    }    

}
