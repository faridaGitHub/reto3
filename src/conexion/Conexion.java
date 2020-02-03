package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import controlador.ControladorConexion;

public class Conexion {
	
	
	
	public static Connection conectar() {
		Connection con = null;
		String password = "";
		if (ControladorConexion.obtenerContraseña()!=null){
			password = ControladorConexion.obtenerContraseña();	
		}
		
		String usuario = ControladorConexion.obtenerUsuario(); //root@localhost
		String ruta = ControladorConexion.obtenerRuta();
		String url = ruta + "?user=" + usuario + "&password=" + password;
		try {
			con = DriverManager.getConnection(url);
			if (con != null) {
				System.out.println("Conectado");
			}
		} catch (SQLException e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.printStackTrace();
		}
		return con;
	}

}