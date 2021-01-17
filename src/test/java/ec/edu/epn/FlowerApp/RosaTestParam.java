package ec.edu.epn.FlowerApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class RosaTestParam {
    private final Rosa rosa;
    private final double produccion;

    public RosaTestParam(Rosa rosa, int produccion) {
        this.rosa = rosa;
        this.produccion = produccion;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> datos = new ArrayList<Object[]>();
        datos.add(new Object[]{new RosaExportaccion("Naomi",20,new Fecha("20/10/2020"),10), 120});
        datos.add(new Object[]{new RosaRechazo("Naomi",20,new Fecha("20/10/2020"),30,"Petalo Dañado"), 210});
        datos.add(new Object[]{new RosaExportaccion("Naomi",20,new Fecha("20/10/2020"),20), 240});
        datos.add(new Object[]{new RosaRechazo("Naomi",20,new Fecha("20/10/2020"),10,"Petalo Dañado"), 70});
        return datos;
    }

    @Test
    public void given_parameters_then_returns_CalcularProduccion() {
        double act = rosa.calcularProduccion();
        assertEquals(produccion,act,0.0001);

    }
}