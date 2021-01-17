package ec.edu.epn.FlowerApp;

public class FormularioRegistro {
    public void mostrarFormularioRegistro(){
        System.out.println("\n\n....Sistema de Produccion Floricola FlowerApp....".toUpperCase());
        System.out.println("Fecha: 17 de enero de 2021 11:31 am");
        System.out.println("Usuario: Luis Perez");
        System.out.println("Ingreso de datos\n\n".toUpperCase());
    }

    public boolean ingresarDatos(String variedad, String longitud, String fecha, String produccion, String estado)
    {
        Rosa rosa;
        Cama cama1= new Cama();
        if (!estado.equals("")){
            rosa=new RosaRechazo(variedad,Integer.parseInt(longitud),new Fecha(fecha),Double.parseDouble(produccion),estado);
        }
        else
        {
            rosa=new RosaExportaccion(variedad,Integer.parseInt(longitud),new Fecha(fecha),Double.parseDouble(produccion));
        }
        if (cama1.registrarRosa(rosa)){
            System.out.println("Rosa Registrada Existosamente\n");
            return true;
        }
        else{
            System.out.println("Error al ingresar la Rosa\n");
            return false;
        }
    }
}
