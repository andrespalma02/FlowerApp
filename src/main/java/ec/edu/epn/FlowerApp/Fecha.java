package ec.edu.epn.FlowerApp;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Fecha {
	private int mes , año, dia;
	
	public Fecha(String fecha) {

		StringTokenizer tokens = new StringTokenizer(fecha,"/");
		this.dia = Integer.parseInt(tokens.nextToken());
		this.mes = Integer.parseInt(tokens.nextToken());
		this.año = Integer.parseInt(tokens.nextToken());

	}

	@Override
	public String toString() {

		return String.format("%02d", dia)+"/"+String.format("%02d", mes)+"/"+String.valueOf(año) ;

	}
}
