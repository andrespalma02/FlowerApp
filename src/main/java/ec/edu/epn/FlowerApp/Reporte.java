package ec.edu.epn.FlowerApp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Reporte {
    private String fecha;
    private Conexion con;
    private String cuerpoReporte= "";


    public int validarTipo(String tipo) {
        String[] valid = {"Produccion", "Rechazo", "Todos"};
        if(Arrays.stream(valid).anyMatch(tipo::equals)){
            return 0;
        }
        return -1;
    }

    public Conexion getCon() {
        return con;
    }

    public void setCon(Conexion con) {
        this.con = con;
    }

    public Reporte() {
        con = new Conexion();
    }

    public void generarReporte(String tipo) throws IOException {
        if (validarTipo(tipo) == 0) {
            ArrayList<String> resultado = con.leerDatos(tipo);
            for (int i = 0; i < resultado.size(); i++) {
                cuerpoReporte +=resultado.get(i) + "\n";
            }
        } else {
            cuerpoReporte = "Error en el tipo";
        }

        imprimirProduccion(cuerpoReporte);

    }

    public void imprimirProduccion(String reporte) {
        System.out.println(this.getReporte());
    }


    public String getReporte() {
        return "Reporte #1" +
                "\n" + "10/01/2020" +
                "\n" + this.cuerpoReporte;
    }


}



