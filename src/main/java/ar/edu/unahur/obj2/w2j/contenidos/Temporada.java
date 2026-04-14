package ar.edu.unahur.obj2.w2j.contenidos;

import java.util.List;

public class Temporada {
 
    private int cantidadDeEpisodios;
    private List<Episodio> episodios;

     public Temporada(int cantidadDeEpisodios) {
        this.cantidadDeEpisodios = cantidadDeEpisodios;
    }

     public int getCantidadDeEpisodios() {
        return cantidadDeEpisodios;
    }

     public void setCantidadDeEpisodios(int cantidadDeEpisodios) {
         this.cantidadDeEpisodios = cantidadDeEpisodios;
     }
     
  }