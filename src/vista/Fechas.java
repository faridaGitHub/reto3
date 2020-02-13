package vista;

import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

import controlador.ControladorFechas;
import datos.DatosTicket;

public class Fechas extends JFrame {

	private JPanel contentPane;
	private JButton btnContinuar;
	private JButton btnSalir;
	private JButton btnRegresar;

	private static JComboBox comboBoxHoraIda;
	private JComboBox comboBoxHoraVuelta;
	private static JComboBox comboBoxCantidad;


	
	private static JDateChooser dateChooserIda;

	private JDateChooser dateChooserVuelta;

	private JLabel lblFechaVuelta;
	private JLabel lblHoraVuelta;

	// get-set

	public JButton getBtnContinuar() {
		return btnContinuar;
	}

	public static JComboBox getComboBoxCantidad() {
		return comboBoxCantidad;
	}

	public void setComboBoxCantidad(JComboBox comboBoxCantidad) {
		this.comboBoxCantidad = comboBoxCantidad;
	}

	public JLabel getLblFechaVuelta() {
		return lblFechaVuelta;
	}

	public void setLblFechaVuelta(JLabel lblFechaVuelta) {
		this.lblFechaVuelta = lblFechaVuelta;
	}

	public JLabel getLblHoraVuelta() {
		return lblHoraVuelta;
	}

	public void setLblHoraVuelta(JLabel lblHoraVuelta) {
		this.lblHoraVuelta = lblHoraVuelta;
	}

	public static JDateChooser getDateChooserIda() {
		return dateChooserIda;
	}

	public void setDateChooserIda(JDateChooser dateChooserIda) {
		this.dateChooserIda = dateChooserIda;
	}

	public JDateChooser getDateChooserVuelta() {
		return dateChooserVuelta;
	}

	public void setDateChooserVuelta(JDateChooser dateChooserVuelta) {
		this.dateChooserVuelta = dateChooserVuelta;
	}

	public static JComboBox getComboBoxHoraIda() {
		return comboBoxHoraIda;
	}

	public void setComboBoxHoraIda(JComboBox comboBoxHoraIda) {
		this.comboBoxHoraIda = comboBoxHoraIda;
	}

	public JComboBox getComboBoxHoraVuelta() {
		return comboBoxHoraVuelta;
	}

	public void setComboBoxHoraVuelta(JComboBox comboBoxHoraVuelta) {
		this.comboBoxHoraVuelta = comboBoxHoraVuelta;
	}

	public JButton getBtnRegresar() {
		return btnRegresar;
	}

	public void setBtnRegresar(JButton btnRegresar) {
		this.btnRegresar = btnRegresar;
	}

	public void setBtnContinuar(JButton btnContinuar) {
		this.btnContinuar = btnContinuar;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	@Override
	public String toString() {
		return "Fechas [dateChooserIda=" + dateChooserIda + "]";
	}

	// otros metodos
	public static void mInicioFechas() {

		try {

			Fechas ventanaFechas = new Fechas();
			ventanaFechas.setVisible(true);

			Billete ventanaBillete = new Billete();

			ControladorFechas ControladorFechas = new ControladorFechas(ventanaFechas, ventanaBillete);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Fechas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 317);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 684, 257);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblFechasHorarios = new JLabel("FECHAS / HORARIOS");
		lblFechasHorarios.setBounds(218, 11, 258, 30);
		lblFechasHorarios.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblFechasHorarios);

		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBounds(13, 203, 119, 34);
		panel.add(btnContinuar);

		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(545, 203, 119, 34);
		panel.add(btnSalir);

		JLabel lblFecha = new JLabel("FECHA IDA:");
		lblFecha.setBounds(13, 124, 83, 14);
		panel.add(lblFecha);

		JLabel lblHora = new JLabel("HORA IDA:");
		lblHora.setBounds(252, 124, 74, 14);
		panel.add(lblHora);

		comboBoxHoraIda = new JComboBox();
		comboBoxHoraIda.setToolTipText("");
		comboBoxHoraIda.setMaximumRowCount(2);
		comboBoxHoraIda.setBounds(349, 118, 127, 22);
		panel.add(comboBoxHoraIda);

		lblFechaVuelta = new JLabel("FECHA VUELTA:");

		lblFechaVuelta.setBounds(13, 146, 99, 20);

		lblFechaVuelta.setBounds(13, 187, 99, 20);

		panel.add(lblFechaVuelta);

		lblHoraVuelta = new JLabel("HORA VUELTA:");

		lblHoraVuelta.setBounds(257, 149, 122, 14);

		lblHoraVuelta.setBounds(252, 190, 122, 14);

		panel.add(lblHoraVuelta);

		comboBoxHoraVuelta = new JComboBox();
		comboBoxHoraVuelta.setToolTipText("");
		comboBoxHoraVuelta.setMaximumRowCount(2);
		comboBoxHoraVuelta.setBounds(378, 145, 127, 22);

		comboBoxHoraVuelta.setBounds(349, 186, 127, 22);

		panel.add(comboBoxHoraVuelta);

		btnRegresar = new JButton("REGRESAR");
		btnRegresar.setBounds(265, 203, 148, 34);
		panel.add(btnRegresar);

		dateChooserIda = new JDateChooser();
		dateChooserIda.setBounds(106, 118, 117, 20);
		panel.add(dateChooserIda);
		dateChooserIda.setDateFormatString("yyyy-MM-dd");


		dateChooserIda.setDate(new Date());

		dateChooserVuelta = new JDateChooser();
		dateChooserVuelta.setBounds(119, 146, 117, 20);
		dateChooserVuelta.setBounds(106, 187, 117, 20);
		panel.add(dateChooserVuelta);

		dateChooserVuelta.setDate(new Date());

		JLabel lblCantidad = new JLabel("CANTIDAD");

		lblCantidad.setBounds(578, 97, 74, 18);

		lblCantidad.setBounds(574, 122, 74, 18);

		panel.add(lblCantidad);

		comboBoxCantidad = new JComboBox();

		comboBoxCantidad.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
		comboBoxCantidad.setBounds(578, 124, 63, 22);

		comboBoxCantidad.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBoxCantidad.setBounds(573, 147, 63, 22);

		panel.add(comboBoxCantidad);

		JLabel lblX = new JLabel("X");

		lblX.setBounds(567, 128, 48, 14);

		lblX.setBounds(562, 151, 48, 14);

		panel.add(lblX);

	}

}