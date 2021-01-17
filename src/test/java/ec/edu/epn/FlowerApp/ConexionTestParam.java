package ec.edu.epn.FlowerApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class ConexionTestParam {
    private File arch;
    private boolean result;

    public ConexionTestParam(File arch, boolean result) {
        this.arch = arch;
        this.result = result;
    }

    @Parameterized. Parameters
    public static Iterable<Object[]> parameters() {
        String basePath = new File("").getAbsolutePath();
        String path = new File("src/main/java/ec/edu/epn/FlowerApp/")
                .getAbsolutePath();
        List<Object[]> datos = new ArrayList<Object[]>();
        datos.add(new Object[]{new File(path+"/Archivo.txt"),true});
        datos.add(new Object[]{new File (path+"/Archivo2.txt"),true});
        datos.add(new Object[]{new File(path+"/Archivo3.txt"),false});
        datos.add(new Object[]{new File(path+"/Archivo4.txt"),false});
        return datos;
    }

    @Test
    public void given_filename_then_comprobarArchivo() throws IOException {
        Conexion con=new Conexion();
        boolean act=con.comprobarArchivo(arch);
        assertEquals(act,result);

    }}