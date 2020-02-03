package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Lineas;
import modelo.LineasBD;
import vista.Billete;
import vista.Inicio;
import vista.Trayecto;

public class ControladorBillete implements ActionListener {

	private Billete ventanaBillete;

	public ControladorBillete(Billete pBillete) {

		this.ventanaBillete = pBillete;

		inicializarControlador();

	}

	public void inicializarControlador() {

		this.ventanaBillete.getBtnContinuar().addActionListener(this);
		this.ventanaBillete.getBtnContinuar().setActionCommand("btnContinuar");

		this.ventanaBillete.getBtnSalir().addActionListener(this);
		this.ventanaBillete.getBtnSalir().setActionCommand("btnSalir");

		this.rellenarComboLineas();

	}

	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		case "btnContinuar":

			Trayecto ventanaTrayecto = null;

			try {

				ventanaTrayecto = new Trayecto();

			} catch (SQLException e1) {

				e1.printStackTrace();
			}

			ventanaTrayecto.setVisible(true);

			ControladorTrayecto controladorTrayecto = new ControladorTrayecto(ventanaTrayecto, this.ventanaBillete);

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

	private void rellenarComboLineas() {

		ArrayList<Lineas> lineas = new ArrayList<Lineas>();

		try {
			lineas = LineasBD.obtenerLineas();

			for (int i = 0; i < lineas.size(); i++) {

				this.ventanaBillete.getcomboBoxLinea().addItem(lineas.get(i));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
