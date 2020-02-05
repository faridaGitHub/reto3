package modelo;

public class Hora {
	
	private String Hora;
	
	
	public Hora() {
		
	}
	
	public Hora( String pHora) {
		
		this.Hora= pHora;
	}
	
	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}
	
	public String toString() {
		
		return this.Hora;
	}

}
