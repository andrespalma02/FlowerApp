package ec.edu.epn.FlowerApp;

import javax.swing.JOptionPane;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//ingreso de datos
		Cama cama = new Cama();
		RosaExportaccion exportacion = new RosaExportaccion("Naomi", 20, new Fecha("10/10/2020"), 10.0);
		cama.registrarRosa(exportacion);
		RosaRechazo rechazo = new RosaRechazo("Naomi", 20, new Fecha("10/10/2020"), 10.0, "Petalo Rechazado");
		cama.registrarRosa(rechazo);
		//leer datos
		Reporte rep = new Reporte();
		rep.generarReporte("Todos");


	}

}