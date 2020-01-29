package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import modelo.Paradas;
import modelo.ParadasBD;
import vista.Billete;
import vista.Inicio;
import vista.Trayecto;

public class ControladorBillete implements ActionListener{
	
	
	private Billete ventanaBillete;
	
	
	public ControladorBillete(Billete pBillete) {
		
		this.ventanaBillete=pBillete;
		
		
		inicializarControlador();
		mLlenarComboOrigen();
		mLlenarComboDestino();

		
		
		
	}
	
	public void inicializarControlador() {
		
		this.ventanaBillete.getBtnContinuar().addActionListener(this);
		this.ventanaBillete.getBtnContinuar().setActionCommand("btnContinuar");
		
		this.ventanaBillete.getBtnSalir().addActionListener(this);
		this.ventanaBillete.getBtnSalir().setActionCommand("btnSalir");


	}

	
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
			
			case "btnContinuar":
				
				Trayecto ventanaTrayecto = new Trayecto();
				ventanaTrayecto.setVisible(true);
				
				ControladorTrayecto controladorTrayecto = new ControladorTrayecto(ventanaTrayecto);
				
				ventanaBillete.dispose();
				
				break;
				
			case "btnSalir":
				
				Inicio ventanaInicio = new Inicio();
				ventanaInicio.setVisible(true);
				
				ControladorInicio controladorInicio = new ControladorInicio(ventanaInicio);
				
				ventanaBillete.dispose();
				
				break;
			
			}
			
		}

	

	public void mLlenarComboOrigen() {
		
		ArrayList<Paradas> paradas;
		
		ParadasBD paradasBD = new ParadasBD();
		paradas = paradasBD.getParadas();
		
		for (Paradas parada : paradas) 
			
			ventanaBillete.getComboBoxOrigen().addItem(parada);
		} 
		
		

	public void mLlenarComboDestino() {
		
		ArrayList<Paradas> paradas;
		
		ParadasBD paradasBD = new ParadasBD();
		paradas = paradasBD.getParadas();
		
		
		for (int i = 0; i < paradas.size(); i++) {
			
			ParadasBD nombre = paradasBD.get(i);
			
			ventanaBillete.getComboBoxDestino().addItem(nombre);
		
		}
	}
}
