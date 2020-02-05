package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Lineas;
import modelo.Parada;
import modelo.ParadaBD;
import vista.Billete;
import vista.Fechas;
import vista.Inicio;
import vista.Pagar;
import vista.Trayecto;

public class ControladorFechas implements ActionListener{
	
	private Fechas ventanFechas;


	
	public ControladorFechas(Fechas pFechas) {
		
		this.ventanFechas=pFechas;
	
	
	
		
		inicializarControlador();
		
		
	}
	
	public void inicializarControlador() {
		
		
		this.ventanFechas.getBtnContinuar().addActionListener(this);
		this.ventanFechas.getBtnContinuar().setActionCommand("btnContinuar");
		
		this.ventanFechas.getBtnSalir().addActionListener(this);
		this.ventanFechas.getBtnSalir().setActionCommand("btnSalir");
		
		this.ventanFechas.getBtnRegresar().addActionListener(this);
		this.ventanFechas.getBtnRegresar().setActionCommand("BtnRegresar");
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
		case "btnContinuar":
			
			Pagar ventanaPagar = new Pagar();
			ventanaPagar.setVisible(true);
			
			ventanFechas.dispose();
			
			break;

		case "btnSalir":
			
			Inicio ventanaInicio = new Inicio();
			ventanaInicio.setVisible(true);
			
			ControladorInicio controladorInicio = new ControladorInicio(ventanaInicio);
			
			ventanFechas.dispose();
			
			break;
			
		case "BtnRegresar":
			
			Billete ventanaBillete=null;
			try {
				ventanaBillete = new Billete();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			ventanaBillete.setVisible(true);
			
			ControladorBillete controladorBillete = new ControladorBillete(ventanaBillete);

			ventanFechas.dispose();

			break;
			
		}

	}


}