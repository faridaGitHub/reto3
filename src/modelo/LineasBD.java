package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.Conexion;


public class LineasBD {
	
	private  ArrayList<Lineas> listaLineas;


	public LineasBD() {
		
	}
	
	//get-set
	
	public ArrayList<Lineas> getListaLineas() {
		return listaLineas;
	}

	public void setListaLineas(ArrayList<Lineas> listaLineas) {
		this.listaLineas = listaLineas;
	}
	
	
	public static ArrayList<Lineas> obtenerLineas() throws SQLException{
		
		Connection con= Conexion.conectar();
		
		
		String sql="SELECT * FROM Linea ";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ResultSet rs=ps.executeQuery();
		

		ArrayList<Lineas> lineas= new ArrayList<Lineas>();
		
		try {
			
			ps=con.prepareStatement(sql);
		
			while (rs.next()) {
				
				Lineas miLinea = new Lineas();
				
				miLinea.setCodlinea(rs.getString("Cod_Linea"));
				miLinea.setNombre(rs.getString("Nombre"));
				
				lineas.add(miLinea);
			

			}

			ps.close();
			rs.close();
			con.close();
			
		} catch (Exception e) {
			
			System.out.println("Error: Clase Contacto, método obtener linea");
			
		}
		
		return lineas ;
		
	}



}
