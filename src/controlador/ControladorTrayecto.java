package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Billete;
import vista.Fechas;
import vista.Inicio;
import vista.Trayecto;

public class ControladorTrayecto implements ActionListener{

	private Trayecto ventanaTrayecto;
	
	public ControladorTrayecto(Trayecto pTrayecto) {
		
		this.ventanaTrayecto=pTrayecto;
		
		inicializarControlador();
		
	}
	
	public void inicializarControlador() {
		
		this.ventanaTrayecto.getBtnContinuar().addActionListener(this);
		this.ventanaTrayecto.getBtnContinuar().setActionCommand("btnContinuar");
		
		this.ventanaTrayecto.getBtnSalir().addActionListener(this);
		this.ventanaTrayecto.getBtnSalir().setActionCommand("btnSalir");

		this.ventanaTrayecto.getBtnRegresar().addActionListener(this);
		this.ventanaTrayecto.getBtnRegresar().setActionCommand("BtnRegresar");
		
	}

	
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
			
			case "btnContinuar":
				

				Fechas ventanaFechas = new Fechas();
				ventanaFechas.setVisible(true);
				
				ControladorFechas controladorFechas = new ControladorFechas(ventanaFechas);
				
				ventanaTrayecto.dispose();
				
				break;
				
			case "btnSalir":
				
				Inicio ventanaInicio = new Inicio();
				ventanaInicio.setVisible(true);
				
				ControladorInicio controladorInicio = new ControladorInicio(ventanaInicio);
				
				ventanaTrayecto.dispose();
				
				break;
				
			case "BtnRegresar":
				
				Billete ventanaBillete = new Billete();
				ventanaBillete.setVisible(true);
				
				ControladorBillete controladorBillete = new ControladorBillete(ventanaBillete);

				ventanaTrayecto.dispose();

				break;
			
			}
			
		}

}