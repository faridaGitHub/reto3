package modelo;

import java.util.ArrayList;

public class ParadasBD {
	
	private ArrayList<Paradas> paradas;
	
	

	public ArrayList<Paradas> getParadas() {
		
		this.paradas.add(new Paradas(1, "SanMames", "Bilbao", "0"));
		this.paradas.add(new Paradas(2, "Indautxu", "Bilbao", "1"));
		this.paradas.add(new Paradas(3, "Moya", "Bilbao", "2"));
		this.paradas.add(new Paradas(4, "Abando", "Bilbao", "3"));
		
		
		return paradas;
	}

	public void setParadas(ArrayList<Paradas> paradas) {
		this.paradas = paradas;
	}

	public ParadasBD get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	  
	
	

}
