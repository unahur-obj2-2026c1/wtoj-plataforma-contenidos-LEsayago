package ar.edu.unahur.obj2.w2j.planes;

public class PlanFamiliar extends PlanConLimite {

   public PlanFamiliar (Integer limite){
    super(limite);
   }
   
   @Override
   protected Double aplicarAjuste(Double total) {
       return total * 0.85;
   }
    

}
