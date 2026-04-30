package ar.edu.unahur.obj2.w2j.usuarios;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
import ar.edu.unahur.obj2.w2j.planes.PlanStrategy;
import ar.edu.unahur.obj2.w2j.planes.PlanBasico;

public class Usuario {

    private PlanStrategy plan = new PlanBasico(10);
    private List<Contenido> contenidos = new ArrayList<>();
    
    public Usuario() {
    }

    public Usuario(PlanStrategy plan) {
        this.plan = plan;
    }


    public Usuario(List<Contenido> contenidos) {
        this.contenidos = contenidos;
    }


    public Usuario(PlanStrategy plan, List<Contenido> contenidos) {
        this.plan = plan;
        this.contenidos = contenidos;
    }


    public List<Contenido> getContenidos() {
        return contenidos;
    }

    public void verConteniido(Contenido contenido) {
        contenidos.add(contenido);
    }

    public void setPlan(PlanStrategy plan) {
        this.plan = plan;
    }

    public PlanStrategy getPlan() {
        return plan;
    }

    public Double costoMensual() {
        return plan.costoDelplan(this);
    }

    public void limpiarContenidos() {
        contenidos.clear();
    }

}
