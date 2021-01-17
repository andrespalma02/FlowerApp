package ec.edu.epn.FlowerApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class ReporteTestParam {
    private String tipo;
    private int result;

    public ReporteTestParam(String tipo, int result) {
        this.tipo = tipo;
        this.result = result;
    }

    @Parameterized. Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> datos = new ArrayList<Object[]>();
        datos.add(new Object[]{"Rechazo",0});
        datos.add(new Object[]{"Todos",0});
        datos.add(new Object[]{"Produccion",0});
        datos.add(new Object[]{"Error",-1});
        return datos;
    }

    @Test
    public void given_parameters_then_validarTipo() {
        Reporte rep=new Reporte();
        int act=rep.validarTipo(tipo);
        assertEquals(act,result);

}}