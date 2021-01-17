package ec.edu.epn.FlowerApp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ReporteTest {
    Reporte rep;
    @Before
    public void setUp() {
        rep = new Reporte();
    }
    @Test
    public void given_empty_connection_returnNull(){
        assertNull(rep.getCon());
    }

    @Test
    public void given_conection_returnConnection(){
        rep.setCon(new Conexion());
        assertNotNull(rep.getCon());
    }

    @Test
    public void given_bad_type_to_validarTipo_then_not_ok(){
        assertThat(rep.validarTipo("Error"),is(not(0)));
    }
    @Test
    public void given_correct_type_to_validarTipo_then_ok(){
        assertEquals(rep.validarTipo("Todos"),0);
    }

    @After
    public void tearDown() {
        System.out.println("tearDown()");
        rep=new Reporte();
    }



}