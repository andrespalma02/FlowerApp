package ec.edu.epn.FlowerApp;

import java.io.*;
import java.util.*;

public class Conexion {

	ArrayList<String> resultado ;


	public Conexion() {
		super();

		//esribirDatos(archivo);
	}

	public void setResultado(ArrayList<String> resultado) {
		this.resultado = resultado;
	}

	public boolean comprobarArchivo(File archivo) {
		boolean flag=false;
		try {
			if (archivo.exists()) {
				System.out.println("Conexion Exitosa");
				flag= true;
			}

		} catch (Exception e) {

			flag= false;
		}
		return flag;
	}

	public ArrayList<String> getResultado(){
		return this.resultado;
	}

	public ArrayList<String> leerDatos(String tipo) throws IOException {
		String basePath = new File("").getAbsolutePath();
		System.out.println(basePath);

		String path = new File("src/main/java/ec/edu/epn/FlowerApp/Archivo.txt")
				.getAbsolutePath();
		System.out.println(path);
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
	public ArrayList<String> ingresarDatos(String tipo) throws IOException {
		String basePath = new File("").getAbsolutePath();
		System.out.println(basePath);

		String path = new File("src/main/java/ec/edu/epn/FlowerApp/Archivo.txt")
				.getAbsolutePath();
		System.out.println(path);
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
}


