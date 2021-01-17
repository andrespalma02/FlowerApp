package ec.edu.epn.FlowerApp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Cama {
	private ArrayList<Rosa>Lista;
	private Conexion con;
	
	public Cama() {
		super();
		con=new Conexion();
		Lista=new ArrayList<>();
	}

	public boolean registrarRosa(Rosa rosa) {
		if (rosa==null) {
			return false;
		}
		else {
			con.registrarDatos(rosa.toString());
			return true;
		}
	}
}
