package modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.toedter.calendar.JDateChooser;

import conexion.Conexion;


public class PrecioBD {



	public static void obtenerLatLongOrigen(String origen) throws SQLException{
	
		Connection con= Conexion.conectar();
	
		String sql="select Latitud,Longitud from Parada where Nombre='"+origen+"';";
	
		PreparedStatement ps=con.prepareStatement(sql);
	
		ResultSet rs=ps.executeQuery();
		
		try {
		
			ps=con.prepareStatement(sql);

			while (rs.next()) {

				Precio p1 = new Precio();
			
				p1.setLat1(rs.getFloat("Latitud"));
				p1.setLng1(rs.getFloat("Longitud"));
			}

			ps.close();
			rs.close();
			con.close();
		
		
		} catch (Exception e) {
		
			System.out.println("Error: Clase Contacto, método obtener paradas");
		
		}
	
	}
	
	public static void obtenerLatLongDestino(String destino) throws SQLException{
		
		Connection con= Conexion.conectar();
	
		String sql="select Latitud,Longitud from Parada where Nombre='"+destino+"';";
	
		PreparedStatement ps=con.prepareStatement(sql);
	
		ResultSet rs=ps.executeQuery();
	

		ArrayList<Parada> paradas= new ArrayList<Parada>();
	
		try {
		
			ps=con.prepareStatement(sql);
			
			
			while (rs.next()) {

				Precio p1 = new Precio();
			
				p1.setLat2(rs.getFloat("Latitud"));
				p1.setLgn2(rs.getFloat("Longitud"));

			}
			
			ps.close();
			rs.close();
			con.close();
		
		
		} catch (Exception e) {
		
			System.out.println("Error: Clase Contacto, método obtener paradas");
		
		}
	
	}
	
public static int obtenerAutobus(String cod_Linea,String fecha, String Hora) throws SQLException{
		
		Connection con= Conexion.conectar();
		
		String sql="select Cod_bus from linea_autobus where Cod_Linea=(SELECT Cod_Linea from Linea where Nombre='"+cod_Linea+"') and Fecha='"+fecha+"' and Hora='"+Hora+"'";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ResultSet rs=ps.executeQuery();
			
		ps=con.prepareStatement(sql);
		int autobus= 0;
		if (rs.next()) {

		autobus= rs.getInt("Cod_bus");
		
		ps.close();
		rs.close();
		con.close();
		return autobus;
		}
				
		ps.close();
		rs.close();
		con.close();
		
		return autobus;
		
	}


public static void obtenerConsumoPlazas(double cod_bus) throws SQLException{
	
	Connection con= Conexion.conectar();
	
	String sql="select N_plazas,Consumo_km from Autobus where cod_bus='"+cod_bus+"';";
	
	PreparedStatement ps=con.prepareStatement(sql);
	
	ResultSet rs=ps.executeQuery();
	
	try {
		
		ps=con.prepareStatement(sql);

		while (rs.next()) {

			Precio p1 = new Precio();
			
			p1.setNum_plazas(rs.getDouble("N_plazas"));
			p1.setConsumo_km(rs.getDouble("Consumo_km"));
		
		}

		ps.close();
		rs.close();
		con.close();
		
		
	} catch (Exception e) {
		
		System.out.println("Error: Clase Contacto, método obtener paradas");
		
	}
	
	
}
}
