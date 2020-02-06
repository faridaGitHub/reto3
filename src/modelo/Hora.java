package modelo;

public class Hora {
	
	private String Hora;
	
	
	public Hora() {
		
	}
	//get-set
	public Hora( String pHora) {
		
		this.Hora= pHora;
	}
	
	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}
	
	//otros
	public String toString() {
		
		return this.Hora;
	}

}
