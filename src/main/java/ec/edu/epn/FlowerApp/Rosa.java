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
		return "Rosa [Variedad =" + variedad + ", Longitud=" + longitud + ", fechaCosecha=" + fechaCosecha + "]";
	}
}
