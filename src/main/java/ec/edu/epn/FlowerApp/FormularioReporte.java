package ec.edu.epn.FlowerApp;


import java.util.ArrayList;

public class FormularioReporte {
    IExternal external;
    IImpresion imp;
    public FormularioReporte() {
    }

    public void setExternal(IExternal external) {
        this.external = external;
    }

    public void setImp(IImpresion imp) {
        this.imp = imp;
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

