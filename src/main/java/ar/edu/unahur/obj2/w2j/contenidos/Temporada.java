package ar.edu.unahur.obj2.w2j.contenidos;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private final Integer numero;
    private List<Episodio> episodios = new ArrayList<>();

    public Temporada(Integer numero) {
        this.numero = numero;
    }

    public void agregarEpisodio(Episodio e) {
        episodios.add(e);
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public Double costo() {
        
        Double costoTotal = 0.0;
        /*
        for (Episodio episodio : episodios) {
            costoTotal += episodio.getCosto();
        }*/
        

        return costoTotal;
    }

    public int cantidadDeEpisodios() {
        return episodios.size();
    }

    public Double costoPromedioDeEpisodio() {
        if (episodios.isEmpty()) {
            return 0.0;
        }
        return costo() / cantidadDeEpisodios();
    }

}