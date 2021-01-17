package ec.edu.epn.FlowerApp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Reporte {
    private String fecha;
    private Conexion con;
    private String cuerpoReporte= "";
    private IAnalitica analisis;

    public void setAnalisis(IAnalitica analisis) {
        this.analisis = analisis;
    }

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

    public boolean generarReporte(String tipo) throws IOException {
        if (validarTipo(tipo) == 0) {
            ArrayList<String> resultado = con.leerDatos(tipo);
            for (int i = 0; i < resultado.size(); i++) {
                cuerpoReporte +=resultado.get(i) + "\n";
            }
        } else {
            cuerpoReporte = "";
        }
        if (cuerpoReporte!=""){
            imprimirProduccion(cuerpoReporte);
            return true;
        }
        else return false;


    }


    public void imprimirProduccion(String reporte) {
        System.out.println(this.getReporte());
    }


    public String getReporte() {
        return "Reporte #1" +
                "\n" + "10/01/2020" +
                "\n" + this.cuerpoReporte;
    }

    public boolean validarTipoAnalisis(String tipo){
        String[] valid = {"Calidad", "Tendencias", "Ingresos"};
        if(Arrays.stream(valid).anyMatch(tipo::equals)){
           return true;
        }
        else{
            return false;
        }
    }

    public String analizarReporte(String tipo){
        if (validarTipoAnalisis(tipo)) {
            return "Tipo de analisis no valido";
        }
        else {
            System.out.println("Analisis de " + tipo + ": ");
            System.out.println("Iniciando Analisis...");
            System.out.println("Analizando reporte...");
            System.out.println("Analisis terminado!");
            return analisis.analizarDatos(this, tipo);
        }
    }


}



