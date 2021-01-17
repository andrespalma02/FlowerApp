package ec.edu.epn.FlowerApp;

import org.junit.Test;

import static org.junit.Assert.*;

public class CamaTest {
    RosaExportaccion rosa = new RosaExportaccion("Naomi", 20, new Fecha("10/10/2020"), 10.0);
    RosaExportaccion rosaNull=null;
    Cama cama = new Cama();




    @Test
    public void given_rosa_when_comprobar_is_False(){
      assertFalse(cama.registrarRosa(rosaNull));

    }
    @Test
    public void given_rosa_when_comprobar_is_True(){
        assertTrue(cama.registrarRosa(rosa));

    }




}