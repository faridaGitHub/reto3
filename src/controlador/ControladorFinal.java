package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import datos.DatosTicket;
import modelo.ClienteBD;
import vista.Billete;
import vista.Entrar;
import vista.Fechas;
import vista.Final;
import vista.Inicio;
import vista.Trayecto;

public class ControladorFinal implements ActionListener {

	private Final ventanaFinal;
	private Trayecto ventanaTrayecto;
	private ClienteBD cliente;
	private Fechas ventanFechas;

	public ControladorFinal(Final pFinal) {

		this.ventanaFinal = pFinal;
		
	
		inicializarControlador();
		llenarDatos();
	

	}
	

	private void inicializarControlador() {
		

		this.ventanaFinal.getBtnSi().addActionListener(this);
		this.ventanaFinal.getBtnSi().setActionCommand("btnSi");

		this.ventanaFinal.getBtnNo().addActionListener(this);
		this.ventanaFinal.getBtnNo().setActionCommand("btnNo");
	
		String dni = ControladorEntrar.dni;
		String contrasena = ControladorEntrar.contrasena;

		ClienteBD clienteBD = new ClienteBD();
		clienteBD.mObtenerCliente(dni, contrasena);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {

		case "btnSi":
			
			try {
				JOptionPane.showMessageDialog(null, "imprimiendo....");
				
				Thread.sleep(5000);
				
				Inicio ventanaInicio = new Inicio();
				ventanaInicio.setVisible(true);

				ControladorInicio controladorInicio = new ControladorInicio(ventanaInicio);
				
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();
			}
		
			ventanaFinal.dispose();
			
			break;
			
		case "btnNo":
			
			Billete ventanaBillete=null;
			
			try {
				ventanaBillete = new Billete();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			ventanaBillete.setVisible(true);

			ControladorBillete controladorBillete = new ControladorBillete(ventanaBillete);;

			ventanaFinal.dispose();


			break;

		}

	}

	public void llenarDatos() {
		
	
	String Nombre;
	Nombre = DatosTicket.nombre.toString();
	ventanaFinal.getTextFieldNombre().setText(DatosTicket.nombre);
	
	ventanaFinal.getTextFieldOrigen().setText(DatosTicket.origen);
	
	ventanaFinal.getTextFieldDestino().setText(DatosTicket.destino);
	
	ventanaFinal.getTextFieldHora().setText(DatosTicket.hora);
	
	ventanaFinal.getTextFieldFecha().setText(DatosTicket.fecha);
	

	
	

		
	}
	
	
	
}
