package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import modelo.Cliente;
import modelo.ClienteBD;
import vista.Billete;
import vista.Entrar;
import vista.Inicio;
import vista.Registro;

public class ControladorRegistro implements ActionListener {

	private Registro ventanaRegistro;

	public ControladorRegistro(Registro pRegistro) {

		this.ventanaRegistro = pRegistro;

		inicializarControlador();

	}

	public void inicializarControlador() {

		this.ventanaRegistro.getBtnContinuar().addActionListener(this);
		this.ventanaRegistro.getBtnContinuar().setActionCommand("btnContinuar");

		this.ventanaRegistro.getBtnSalir().addActionListener(this);
		this.ventanaRegistro.getBtnSalir().setActionCommand("btnSalir");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		case "btnContinuar":

			try {

				if (registarUsuario() == true) {

					Billete ventanaBillete = new Billete();
					ventanaBillete.setVisible(true);

					ControladorBillete controladorBillete = new ControladorBillete(ventanaBillete);

					ventanaRegistro.dispose();

				} else if (registarUsuario() == false) {

					JOptionPane.showMessageDialog(null, "Complete los datos");

				}

			} catch (Exception a) {

				JOptionPane.showMessageDialog(null, "error al resgistrar");
				a.printStackTrace();

			}

			break;

		case "btnSalir":

			Inicio ventanaInicio = new Inicio();
			ventanaInicio.setVisible(true);

			ControladorInicio controladorInicio = new ControladorInicio(ventanaInicio);

			ventanaRegistro.dispose();

			break;

		}

	}

	private void validarUsuario() {

		String dni = this.ventanaRegistro.getTextFieDni().getText();
		String contrasena = this.ventanaRegistro.getTextFieContraseña().getText();

		ClienteBD clienteBD = new ClienteBD();

		if (clienteBD.mBuscarContacto(dni, contrasena) == true) {

			Billete ventanaBillete = new Billete();
			ventanaBillete.setVisible(true);

			ControladorBillete controladorBillete = new ControladorBillete(ventanaBillete);

			ventanaRegistro.dispose();
		} else

			JOptionPane.showMessageDialog(null, "no se puede registrar");

	}

	private boolean registarUsuario() throws ParseException {

		Cliente cliente = new Cliente();
		
		boolean aux=true;

		if (ventanaRegistro.getTextFieDni().getText().equals("")
				|| ventanaRegistro.getTextFieNombre().getText().equals("")
				|| ventanaRegistro.getTextFielApellido().getText().equals("")
				|| ventanaRegistro.getTextFieContraseña().getText().equals("")) {

			 aux=false;

		}

		cliente.setDni(ventanaRegistro.getTextFieDni().getText());

		cliente.setNombre(ventanaRegistro.getTextFieNombre().getText());

		cliente.setApellidos(ventanaRegistro.getTextFielApellido().getText());
		

		if (ventanaRegistro.getTextFecNac().getText().equals("yyyy-dd-mm")) {
			
			cliente.setFechaNaci(ventanaRegistro.getTextFecNac().getText()); 
			
			
		}else{
			
			JOptionPane.showMessageDialog(null, "la fecha se introduce año-mes-dia");
			
			aux=false;
			
		}
		

		if (ventanaRegistro.getComboBoxSexo().getSelectedItem().equals("HOMBRE")) {

			cliente.setSexo("H");

		} else {

			cliente.setSexo("M");
		}

		cliente.setContraseña(ventanaRegistro.getTextFieContraseña().getText());

		ClienteBD clienteBD = new ClienteBD();
		clienteBD.mInsetarContacto(cliente);

		return aux;
		
	}
	

}