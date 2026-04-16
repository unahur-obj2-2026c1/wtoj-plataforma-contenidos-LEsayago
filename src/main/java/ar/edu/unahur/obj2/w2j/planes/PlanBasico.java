package ar.edu.unahur.obj2.w2j.planes;

import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
import ar.edu.unahur.obj2.w2j.usuarios.Usuario;

public class PlanBasico implements IPlan {

    private Integer limite;
    public PlanBasico(Integer limite) {
        this.limite = limite;
    }

    @Override
    public Double costoDelplan(Usuario usuario) {
        Double costoBase = 5.0;
        List<Contenido> contenido = usuario.getContenidos();
         if(limite >= contenido.size()) {
          return costoBase;  
         }else {
             List<Contenido> contenidosExtra = contenido.subList(limite, contenido.size());
             return costoBase + (contenidosExtra.stream().mapToDouble(c -> c.getcostoBase()).sum());
         }
    
    }

}
