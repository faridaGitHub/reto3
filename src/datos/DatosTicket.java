package datos;

import vista.Final;
import vista.Trayecto;

public class DatosTicket {
	
	public static String nombre;
	public static String origen;
	public static String destino;
	public static String fecha;
	public static String hora;
	public static String precio;
	
	private Trayecto ventanaTrayecto;
	private Final ventanaFinal;
	
	
	//set-get
	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		DatosTicket.nombre = nombre;
	}

	public static String getOrigen() {
		return origen;
	}

	public static void setOrigen(String origen) {
		DatosTicket.origen = origen;
	}

	public static String getDestino() {
		return destino;
	}

	public static void setDestino(String destino) {
		DatosTicket.destino = destino;
	}

	public static String getFecha() {
		return fecha;
	}

	public static void setFecha(String fecha) {
		DatosTicket.fecha = fecha;
	}

	public static String getHora() {
		return hora;
	}

	public static void setHora(String hora) {
		DatosTicket.hora = hora;
	}

	public static String getPrecio() {
		return precio;
	}

	public static void setPrecio(String precio) {
		DatosTicket.precio = precio;
	}



	//otros

	public void llenarComboBox() {
		
		
		
	
		
	}
	
	
	
	

}
