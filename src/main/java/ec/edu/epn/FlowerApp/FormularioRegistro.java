package ec.edu.epn.FlowerApp;

public class FormularioRegistro {

    public boolean ingresarDatos(String variedad, String longitud, String fecha, String produccion, String estado)
    {
        Rosa rosa;
        Cama cama1= new Cama();
        if (estado!=""){
            rosa=new RosaRechazo(variedad,Integer.parseInt(longitud),new Fecha(fecha),Double.parseDouble(produccion),estado);
        }
        else
        {
            rosa=new RosaExportaccion(variedad,Integer.parseInt(longitud),new Fecha(fecha),Double.parseDouble(produccion));
        }
        if (cama1.registrarRosa(rosa)){
            System.out.println("Rosa Registrada Existosamente");
            return true;
        }
        else{
            System.out.println("Error al ingresar la Rosa");
            return false;
        }
    }
}
