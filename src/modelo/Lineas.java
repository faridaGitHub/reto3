package modelo;

public class Lineas {
	
	private int cod_linea;
	private String autobuses;
	private String municipios;
	
	public Lineas() {
		
	}

	public Lineas(int codlinea, String autobuses, String municipios) {
		super();
		this.cod_linea = codlinea;
		this.autobuses = autobuses;
		this.municipios = municipios;
	}

	public int getCodlinea() {
		return cod_linea;
	}

	public void setCodlinea(int codlinea) {
		this.cod_linea = codlinea;
	}

	public String getAutobuses() {
		return autobuses;
	}

	public void setAutobuses(String autobuses) {
		this.autobuses = autobuses;
	}

	public String getMunicipios() {
		return municipios;
	}

	public void setMunicipios(String municipios) {
		this.municipios = municipios;
	}
	
	
	
	

}
