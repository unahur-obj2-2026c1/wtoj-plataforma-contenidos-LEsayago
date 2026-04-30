package ar.edu.unahur.obj2.w2j.planes;

import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
import ar.edu.unahur.obj2.w2j.usuarios.Usuario;

public class PlanBasico implements IPlan {

    private Integer limite;
    private Double costoBase = 5.0;

    public PlanBasico(Integer limite) {
        this.limite = limite;
    }

    @Override
    public Double costoDelplan(Usuario usuario) {
        
        List<Contenido> contenido = usuario.getContenidos();
        if (limite >= contenido.size()) {
          return costoBase;  
         }else {
             List<Contenido> contenidosExtra = contenido.subList(limite, contenido.size());
             return costoBase + (contenidosExtra.stream().mapToDouble(c -> c.getcostoBase()).sum());
         }
    
    }

}
