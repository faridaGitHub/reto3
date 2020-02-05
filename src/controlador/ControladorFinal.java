package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ClienteBD;
import vista.Entrar;
import vista.Final;

public class ControladorFinal implements ActionListener {

	private Final ventanFinal;
	private Entrar ventanaEntrar;

	public ControladorFinal(Final pFinal) {

		this.ventanFinal = pFinal;

		inicializarControlador();

	}

	private void inicializarControlador() {
		// TODO Auto-generated method stub

		String dni = ControladorEntrar.dni;
		String contrasena = ControladorEntrar.contrasena;

		ClienteBD clienteBD = new ClienteBD();
		clienteBD.mObtenerCliente(dni, contrasena);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}
