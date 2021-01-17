package ec.edu.epn.FlowerApp;

import java.io.*;
import java.util.*;

public class Conexion {

	private ArrayList<String> resultado ;


	public Conexion() {
		super();

	}

	public void setResultado(ArrayList<String> resultado) {
		this.resultado = resultado;
	}

	public boolean comprobarArchivo(File archivo) {
		return archivo.exists();
	}
	public ArrayList<String> getResultado(){
		return this.resultado;
	}
/*
	public ArrayList<String> leerDatos(String tipo) throws IOException {
		String basePath = new File("").getAbsolutePath();
		String path = new File("src/main/java/ec/edu/epn/FlowerApp/Archivo.txt")
				.getAbsolutePath();
		File archivo=new File(path);
		System.out.println(this.comprobarArchivo(archivo));
		if (this.comprobarArchivo(archivo)) {
			resultado = new ArrayList();
			String cadena;
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			while ((cadena = br.readLine()) != null) {
					resultado.add(cadena);
				}

			br.close();
		}
		return this.getResultado();

	}

 */
	public ArrayList<String> leerDatos(String tipo) throws IOException {
		return BaseDatos.datos;
	}
	public boolean registrarDatos(String consulta){
		if (!consulta.equals("")) {
			BaseDatos.datos.add(consulta);
			return true;
		}
		else {
			return false;
		}
	}

}


