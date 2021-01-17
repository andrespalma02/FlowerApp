package ec.edu.epn.FlowerApp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Cama {
	
	private ArrayList<Rosa>Lista;
	
	
	public Cama() {
		super();
		Lista = new ArrayList<Rosa>();
	}
	
	
	public void registrarRosa(Rosa rosa) {
		Lista.add(rosa);
		
	}


	@Override
	public String toString() {
		String salida="Produccion Agregada";  
		for(Rosa rosa: Lista)
			salida+="\n"+ rosa; 
		return salida;
	}
}
