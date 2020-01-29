package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Fechas;
import vista.Inicio;
import vista.Pagar;

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
			
		}
		
	}
	

}