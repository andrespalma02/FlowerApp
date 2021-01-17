package ec.edu.epn.FlowerApp;

import static org.junit.Assert.*;

import jdk.nashorn.internal.runtime.regexp.joni.constants.AsmConstants;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ConexionTest {
    private Conexion con;
    String basePath = new File("").getAbsolutePath();
    String path = new File("src/main/java/ec/edu/epn/FlowerApp/")
            .getAbsolutePath();
    private final File archivoValido = new File(path+"/Archivo.txt");
    private final File archivoNoValido = new File(path+"/ArchivoNoValido.txt");

    @Before
    public void setUp() {
        con = new Conexion();
    }

    @Test
    public void getGiven_filename_when_comprobarArchivo_is_true() {

        assertTrue(con.comprobarArchivo(archivoValido));

    }

    @Test
    public void given_filename_when_comprobarArchivo_is_false() {
        assertFalse(con.comprobarArchivo(archivoNoValido));
    }



    @Test
    public void given_total_when_leerDatos_is_ok() throws IOException {
        String[] expected = new String[2];
        expected[0] = "1,Naomi,20,20/10/2020,Produccion,10.0,120.0";
        expected[1] = "2,Naomi,20,10/10/2020,Rechazo,10.0,120.0";
        assertArrayEquals(expected, con.leerDatos("Total").toArray(new String[2]));
    }

    @Test
    public void given_filename_when_comprobarArchivo_returns_false() {
        assertThat(con.comprobarArchivo(archivoNoValido), is(false));
    }

    @Test(timeout = 1)
    public void given_filename_when_comprobarArchivo_then_timeout() {
        assertTrue(con.comprobarArchivo(archivoValido));

    }


    @After
    public void tearDown() {
        System.out.println("tearDown()");
        ArrayList<String> resultado = new ArrayList<>();
        con.setResultado(resultado);
    }
}