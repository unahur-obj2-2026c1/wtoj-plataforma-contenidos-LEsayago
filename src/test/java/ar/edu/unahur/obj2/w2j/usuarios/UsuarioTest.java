package ar.edu.unahur.obj2.w2j.usuarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UsuarioTest {
    @Test
    void dadoUnUsuarioConElPlanBasico_SECalculaCorrectamenteSuCostoMensual() {
        Usuario usuario = new Usuario();
         assertEquals(5.0, usuario.costoMensual());
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
