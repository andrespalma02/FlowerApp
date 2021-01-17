package ec.edu.epn.FlowerApp;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class IAnaliticaTest {
    @Test
    public void given_analysis_when_report_and_type_isOk() {
        IAnalitica analitica = Mockito.mock(IAnalitica.class);
        Reporte reporte=new Reporte();
        reporte.setAnalisis(analitica);

        Mockito.when(analitica.analizarDatos(Mockito.any(),Mockito.any()))
                .thenReturn("Ingresos aumentando!");

        assertEquals(reporte.analizarReporte("Ingresos"),"Ingresos aumentando!");
    }

}