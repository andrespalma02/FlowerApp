package ec.edu.epn.FlowerApp;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public  abstract class Rosa {
	private double produccion;
	private String variedad;
	private int longitud;
	private Fecha fechaCosecha;	
	
	
	public Rosa(String variedad, int  longitud, Fecha fechaCosecha, double produccion) {
		super();
		this.fechaCosecha = fechaCosecha;
		this.variedad=variedad;
		this.longitud=longitud;
		this.produccion=produccion;
		
	}
	public double getProduccion() {
		return this.produccion;
	}

	
	public abstract double calcularProduccion();

	@Override
	public String toString() {
		String variedad=this.variedad;
		String longitud=String.valueOf(this.longitud);
		String fecha = this.fechaCosecha.toString();
		String produccion=String.valueOf(this.produccion);
		return variedad+"\t\t"+longitud+"\t\t\t"+fecha+"\t"+produccion;
	}
}
