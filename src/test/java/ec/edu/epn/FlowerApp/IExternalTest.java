package ec.edu.epn.FlowerApp;

import ec.edu.epn.tdd.flowerapp.FormularioReporte;
import ec.edu.epn.tdd.flowerapp.IExternal;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class IExternalTest {
    @Test
    public void given_share_when_email_isOk() {
        IExternal external = Mockito.mock(IExternal.class);
        FormularioReporte reporte=new FormularioReporte();
        reporte.setExternal(external);

        Mockito.when(external.compartirCorreo(Mockito.any(),Mockito.any()))
                .thenReturn(true);

        assertTrue(reporte.solicitarCompartirCorreo("CorreoValido"));
    }
}
