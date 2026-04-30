package ar.edu.unahur.obj2.w2j.planes;

import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
import ar.edu.unahur.obj2.w2j.usuarios.Usuario;

public class PlanBasico extends PlanConLimite {

    public PlanBasico(Integer limite) {
        super(limite);
    }

    @Override
    protected Double aplicarAjuste(Double total) {
        return total;
    }

}
