package ec.edu.epn.FlowerApp;

import javax.swing.JOptionPane;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
	    FormularioRegistro formReg=new FormularioRegistro();
	    formReg.mostrarFormularioRegistro();
	    System.out.println("Variedad: Mondial"+
				"\nLongitud: 20" +
				"\nFecha: 17/01/2021" +
				"\nProduccion: 15" );
		formReg.ingresarDatos("Mondial","20","17/01/2021","15","");
		System.out.println("Variedad: Cherry"+
				"\nLongitud: 20" +
				"\nFecha: 17/01/2021" +
				"\nProduccion: 10" +
				"\nEstado: Petalo Dañado");
		formReg.ingresarDatos("Cherry","20","17/01/2021","10","Petalo Rechazado");

		FormularioReporte formRep=new FormularioReporte();
		formRep.mostrarFormularioReporte();
		System.out.println("Tipo de Reporte: Todos");
		formRep.SolicitarReporte("Todos");


	}

}