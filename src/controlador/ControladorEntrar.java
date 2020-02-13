package controlador;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.Cliente;
import modelo.ClienteBD;
import vista.Billete;
import vista.Entrar;
import vista.Inicio;
import vista.Registro;

public class ControladorEntrar implements ActionListener {

	public static String dni;
	public static String contrasena;

	private Entrar ventanaEntrar;

	public ControladorEntrar(Entrar pEntrar) {

		this.ventanaEntrar = pEntrar;

		inicializarControlador();
	}

	public void inicializarControlador() {

		this.ventanaEntrar.getBtnContinuar().addActionListener(this);
		this.ventanaEntrar.getBtnContinuar().setActionCommand("btnContinuar");

		this.ventanaEntrar.getBtnSalir().addActionListener(this);
		this.ventanaEntrar.getBtnSalir().setActionCommand("btnSalir");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		case "btnContinuar":

			try {

				validarUsuario();

			} catch (HeadlessException | SQLException e1) {

				e1.printStackTrace();
			}
			
			break;

		case "btnSalir":

			Inicio ventanaInicio = new Inicio();
			ventanaInicio.setVisible(true);

			ControladorInicio controladorInicio = new ControladorInicio(ventanaInicio);

			ventanaEntrar.dispose();

			break;

		}

	}

	private void validarUsuario() throws HeadlessException, SQLException {

		String dni = this.ventanaEntrar.getTextFieldDni().getText();
		String contrasena = this.ventanaEntrar.getPasswordField().getText();

		ControladorEntrar.dni = this.ventanaEntrar.getTextFieldDni().getText();
		ControladorEntrar.contrasena = this.ventanaEntrar.getPasswordField().getText();

		ClienteBD clienteBD = new ClienteBD();

		if (clienteBD.mBuscarContacto(dni, contrasena) == true) {

			Billete ventanaBillete = new Billete();
			ventanaBillete.setVisible(true);

			ControladorBillete controladorBillete = new ControladorBillete(ventanaBillete);

			ventanaEntrar.dispose();

		} else

			JOptionPane.showMessageDialog(null, "usuario o contraseña incorrecto");

	}

}
