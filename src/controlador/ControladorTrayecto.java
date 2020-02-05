package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Lineas;
import modelo.LineasBD;
import modelo.Paradas;
import modelo.ParadasBD;
import vista.Billete;
import vista.Fechas;
import vista.Inicio;
import vista.Trayecto;

public class ControladorTrayecto implements ActionListener{

	private Trayecto ventanaTrayecto;
	private Billete ventanaBillete;
	
	
	public ControladorTrayecto(Trayecto pTrayecto) {
		
		this.ventanaTrayecto=pTrayecto;
		
		inicializarControlador();
		
		
		
	}
	
	public ControladorTrayecto(Trayecto pTrayecto, Billete pVentanBillete) {
		
		this.ventanaTrayecto=pTrayecto;
		this.ventanaBillete = pVentanBillete;
		
		inicializarControlador();
		
		
		rellenarComboParadas();
		
		
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
				
				ControladorFechas controladorFechas = new ControladorFechas(ventanaFechas, ventanaBillete);
				
				ventanaTrayecto.dispose();
				
				break;
				
			case "btnSalir":
				
				Inicio ventanaInicio = new Inicio();
				ventanaInicio.setVisible(true);
				
				ControladorInicio controladorInicio = new ControladorInicio(ventanaInicio);
				
				ventanaTrayecto.dispose();
				
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

				ventanaTrayecto.dispose();

				break;
			
			}
			
		}



	
	private void rellenarComboParadas() {
		
	
		ArrayList<Paradas> paradas = new ArrayList<Paradas>();
		
		Lineas miLinea = (Lineas) this.ventanaBillete.getcomboBoxLinea().getSelectedItem();
		 

		try {
			
			paradas = ParadasBD.obtenerParadas(miLinea.getCodlinea());

			for (int i = 0; i < paradas.size(); i++) {

				this.ventanaTrayecto.getComboBoxDestino().addItem(paradas.get(i));
				
				this.ventanaTrayecto.getComboBoxOrigen().addItem(paradas.get(i));

			}

		} catch (SQLException e) {
			System.out.println("error metodo comoParada");
			e.printStackTrace();
		}

	}
	

}