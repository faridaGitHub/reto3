package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import com.toedter.calendar.JDateChooser;


import datos.DatosTicket;
import modelo.Hora;
import modelo.HoraBD;
import modelo.Lineas;
import modelo.Precio;
import modelo.PrecioBD;
import vista.Billete;
import vista.Fechas;
import vista.Inicio;
import vista.Pagar;
import vista.Trayecto;

public class ControladorFechas implements ActionListener {

	private Fechas ventanFechas;
	private Billete ventanaBillete;

	public ControladorFechas(Fechas pFechas, Billete pVentanBillete) throws SQLException {

		this.ventanFechas = pFechas;
		this.ventanaBillete = pVentanBillete;
		inicializarControlador();
		rellenarComboHora();
		tipoBillete();
		deshabilitarFechhas();

		obtenerFecha();

		pagar();
		

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

			Billete ventanaBillete = null;

			try {

				ventanaBillete = new Billete();

			} catch (SQLException e1) {

				e1.printStackTrace();
			}

			ventanaBillete.setVisible(true);

			ControladorBillete controladorBillete = new ControladorBillete(ventanaBillete);

			ventanFechas.dispose();

			break;

		}

	}

	private void rellenarComboHora() {

		ArrayList<Hora> Hora = new ArrayList<Hora>();

		Lineas miLinea = (Lineas) this.ventanaBillete.getcomboBoxLinea().getSelectedItem();

		try {

			Hora = HoraBD.obtenerHora(miLinea.getCodlinea());

			for (int i = 0; i < Hora.size(); i++) {

				this.ventanFechas.getComboBoxHoraIda().addItem(Hora.get(i));

				this.ventanFechas.getComboBoxHoraVuelta().addItem(Hora.get(i));

			}

			DatosTicket.hora = ventanFechas.getComboBoxHoraIda().getSelectedItem().toString();

		} catch (SQLException e) {

			System.out.println("error metodo comboHora");
			e.printStackTrace();

		}

	}



	public void tipoBillete() throws SQLException {

		String tipo = this.ventanaBillete.getComboBoxTipo().getSelectedItem().toString();

		if (tipo.equalsIgnoreCase("Ida")) {

			ventanFechas.getDateChooserVuelta().setVisible(false);
			ventanFechas.getComboBoxHoraVuelta().setVisible(false);
			ventanFechas.getLblFechaVuelta().setVisible(false);
			ventanFechas.getLblHoraVuelta().setVisible(false);

		} else {

			ventanFechas.getDateChooserVuelta().setEnabled(true);
			ventanFechas.getComboBoxHoraVuelta().setEnabled(true);
		}

	}

	public void deshabilitarFechhas() {

		this.ventanFechas.getDateChooserIda().setMinSelectableDate(new Date());
		this.ventanFechas.getDateChooserVuelta().setMinSelectableDate(new Date());
	}


	public String obtenerFecha() {

		int dia = ventanFechas.getDateChooserIda().getCalendar().get(Calendar.DAY_OF_MONTH);
		int mes = ventanFechas.getDateChooserIda().getCalendar().get(Calendar.MONTH);
		int anio = ventanFechas.getDateChooserIda().getCalendar().get(Calendar.YEAR);

		DatosTicket.fecha = (anio + "-" + mes + "-" + dia);

		return DatosTicket.fecha;

	}


	private void pagar() throws SQLException {
		
		String origen = Trayecto.getComboBoxOrigen().getSelectedItem().toString();
		String destino = Trayecto.getComboBoxDestino().getSelectedItem().toString();
		PrecioBD.obtenerLatLongOrigen(origen);
		PrecioBD.obtenerLatLongDestino(destino);
	}
}