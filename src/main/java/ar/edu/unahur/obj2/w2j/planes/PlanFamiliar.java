package ar.edu.unahur.obj2.w2j.planes;

import ar.edu.unahur.obj2.w2j.usuarios.Usuario;

public class PlanFamiliar extends PlanBasico {
    private Double costoPlan ;

   public PlanFamiliar (Integer limite){
    super(limite);
   }
   
   @Override
   public Double costoDelplan(Usuario usuario) {
    return super.costoDelplan(usuario) * 0.85;
   }
    

}
