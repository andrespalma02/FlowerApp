package ec.edu.epn.FlowerApp;

import javax.swing.JOptionPane;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
	    FormularioRegistro formReg=new FormularioRegistro();
		formReg.ingresarDatos("Naomi","20","20/10/2020","10","");
		formReg.ingresarDatos("Naomi","20","20/10/2020","10","Petalo Rechazado");
		//leer datos
		Reporte rep = new Reporte();
		rep.generarReporte("Todos");


	}

}