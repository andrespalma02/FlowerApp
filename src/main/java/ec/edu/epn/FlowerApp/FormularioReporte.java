package ec.edu.epn.FlowerApp;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FormularioReporte {
    IExternal external;
    IImpresion imp;
    Reporte rep=new Reporte();
    public FormularioReporte() {
    }

    public void setExternal(IExternal external) {
        this.external = external;
    }

    public void setImp(IImpresion imp) {
        this.imp = imp;
    }

    public boolean SolicitarReporte(String tipo) throws IOException {


        if (!rep.generarReporte(tipo)){
            System.out.println("Error al crear Reporte");
            return false;
        }
        else
            return true;

    }

    public boolean solicitarCompartirCorreo(String correo){
        if(external.compartirCorreo(correo,new ArrayList<>())){
            System.out.println("Correo enviado existosamente");
            return true;
        }
        else{
            System.out.println("Error al compartir");
            return false;
        }
    }
    public void solicitarAnalisis(String tipo)
    {

            System.out.println(rep.analizarReporte(tipo));

    }
    public boolean solicitarImpresion(){
        if(imp.imprimir(new ArrayList<>())){
            System.out.println("Imprimiendo...");
            return true;
        }
        else{
            System.out.println("Error al imprimir");
            return false;
        }
    }
    }

