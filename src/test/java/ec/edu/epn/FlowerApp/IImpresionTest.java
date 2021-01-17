package ec.edu.epn.FlowerApp;


import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class IImpresionTest {
    @Test
    public void given_print_when_report_isOk() {
        IImpresion imp = Mockito.mock(IImpresion.class);
        FormularioReporte reporte=new FormularioReporte();
        reporte.setImp(imp);

        Mockito.when(imp.imprimir(Mockito.any()))
                .thenReturn(true);

        assertTrue(reporte.solicitarImpresion());
    }

}