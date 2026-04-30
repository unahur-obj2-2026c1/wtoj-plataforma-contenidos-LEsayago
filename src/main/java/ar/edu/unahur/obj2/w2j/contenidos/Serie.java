package ar.edu.unahur.obj2.w2j.contenidos;

import java.util.ArrayList;

public class Serie extends Contenido {

    private ArrayList<Temporada> temporadas;

    public Serie(String titulo, Double costoBase) {
        super(titulo, costoBase);
        this.temporadas = new ArrayList<>();
    }

     public ArrayList<Temporada> gettemporadas() {
        return temporadas;
    }

     public void settemporadas( Temporada temporada) {
        temporadas.add(temporada);
    }

     public int getCantidadDeTemporadas() {
        return temporadas.size();

}

public ArrayList<Temporada> getTemporadas() {
    return temporadas;
}

@Override
public Double doCosto() {;
    /* 
  Double costoPromedioTotal=0.0;
    for (Temporada temporada : temporadas) {
        costoPromedioTotal += temporada.costoPromedioDeEpisodio();

    }

    return costoPromedioTotal == 0 ? 0 : costoPromedioTotal / getCantidadDeTemporadas();
} */

    return temporadas.stream()
    .flatMap(t -> t.getEpisodios().stream())
    .mapToDouble(Episodio :: getCosto)
    .average()
    .orElse(0.0);


}
