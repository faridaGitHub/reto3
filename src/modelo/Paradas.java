package modelo;

public class Paradas {
	
	private String cod_parada;
	private String calle;
	private String nombre;
	private String coordenadas;
	
	public Paradas() {
		super();
	}

	public Paradas(String cod_parada, String calle, String nombre, String coordenadas) {
		super();
		this.cod_parada = cod_parada;
		this.calle = calle;
		this.nombre = nombre;
		this.coordenadas = coordenadas;
	}

	public String getCodparada() {
		return cod_parada;
	}

	public void setCodparada(String cod_parada) {
		this.cod_parada = cod_parada;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}
	
	public String toString() {
		
		return this.nombre;
	}
	
}
