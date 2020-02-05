package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import conexion.Conexion;

public class HoraBD {
	
	private ArrayList<Hora> listaHoras;
	
	
	public HoraBD(){
		
	}
	
	//get-set
	public ArrayList<Hora> getListaHoras() {
		return listaHoras;
	}

	public void setListaHoras(ArrayList<Hora> listaHoras) {
		this.listaHoras = listaHoras;
	}



	public static ArrayList<Hora> obtenerHora(String cod_Linea) throws SQLException{
		
		Connection con= Conexion.conectar();
		
		String sql="SELECT DISTINCT Hora FROM linea_autobus WHERE Cod_Linea='"+cod_Linea+"'";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ResultSet rs=ps.executeQuery();
		

		ArrayList<Hora> Horas= new ArrayList<Hora>();
		
		try {
			
			ps=con.prepareStatement(sql);
		
			while (rs.next()) {
				
				Hora Hora = new Hora();
				
				Hora.setHora(rs.getString("Hora"));
				
				Horas.add(Hora);
			
			}

			ps.close();
			rs.close();
			con.close();
			
			
		} catch (Exception e) {
			
			System.out.println("Error: Clase Contacto, método obtener Hora");
			
		}
		
		return Horas ;
		
	}
	
	
}
