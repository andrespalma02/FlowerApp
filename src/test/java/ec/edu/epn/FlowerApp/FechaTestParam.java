package ec.edu.epn.FlowerApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class FechaTestParam {
    private final Fecha fecha;
    private final String result;

    public FechaTestParam(Fecha fecha, String result) {
        this.fecha = fecha;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> datos = new ArrayList<Object[]>();
        datos.add(new Object[]{new Fecha("10/06/2019"), "10/06/2019"});
        datos.add(new Object[]{new Fecha("11/05/2009"), "11/05/2009"});
        datos.add(new Object[]{new Fecha("20/12/2010"), "20/12/2010"});
        datos.add(new Object[]{new Fecha("15/01/2021"), "15/01/2021"});
        return datos;
    }
    @Test
    public void given_newFecha_then_returns_fechaToString() {
        String act = fecha.toString();
        assertEquals(result,act);

    }
}