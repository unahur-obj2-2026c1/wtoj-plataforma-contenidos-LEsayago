package ar.edu.unahur.obj2.w2j.usuarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.w2j.contenidos.Pelicula;

public class UsuarioTest {
    @Test
    void dadoUnUsuarioConElPlanBasico_SECalculaCorrectamenteSuCostoMensual() {
        Usuario usuario = new Usuario();
         assertEquals(5.0, usuario.costoMensual());
    }

    @Test
    void dadoUnUsuarioConElPlanBasicoYExcedentes_SECalculaCorrectamenteSuCostoMensual() {
        Usuario usuarioVicioso = new Usuario();
        usuarioVicioso.verConteniido(new Pelicula("lo que el viento", 10.0));
        usuarioVicioso.verConteniido(new Pelicula("lo que el viento", 10.0));
        usuarioVicioso.verConteniido(new Pelicula("lo que el viento", 10.0));
        usuarioVicioso.verConteniido(new Pelicula("lo que el viento", 10.0));
        usuarioVicioso.verConteniido(new Pelicula("lo que el viento", 10.0));
        usuarioVicioso.verConteniido(new Pelicula("lo que el viento", 10.0));
        usuarioVicioso.verConteniido(new Pelicula("lo que el viento", 10.0));
        usuarioVicioso.verConteniido(new Pelicula("lo que el viento", 10.0));
        usuarioVicioso.verConteniido(new Pelicula("lo que el viento", 10.0));
        usuarioVicioso.verConteniido(new Pelicula("lo que el viento", 10.0));
        usuarioVicioso.verConteniido(new Pelicula("lo que el viento", 10.0));
         assertEquals(15.0, usuarioVicioso.costoMensual());
    }

    @Test
    void testGetContenidos() {

    }

    @Test
    void testGetPlan() {

    }

    @Test
    void testSetPlan() {

    }

    @Test
    void testVerConteniido() {

    }
}
