package controlador;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControladorConexion {

	public static ArrayList<String> datos = new ArrayList<String>();

	public ArrayList<String> getLibros() {
		return datos;
	}

	public void setLibros(ArrayList<String> libros) {
		this.datos = datos;
	}

	public ControladorConexion() {
		super();
		this.datos = datos;
	}

	public static void consultarDatos() {

		try {
			File fich = new File("C:\\Users\\admin1\\Desktop\\Conex.txt");
			Scanner leer = new Scanner(fich);
			while (leer.hasNextLine()) {
				String datoLeido = leer.nextLine();
				datos.add(datoLeido);
			}

		} catch (Exception e) {
			System.out.println("Error.");
		}

	}

	public static String obtenerRuta() {
		consultarDatos();
		String ruta = datos.get(0);

		return ruta;
	}

	public static String obtenerUsuario() {
		consultarDatos();
		String usuario = datos.get(1);

		return usuario;
	}

	public static String obtenerContraseña() {
		consultarDatos();
		String contraseña = datos.get(2);

		return contraseña;
	}

}