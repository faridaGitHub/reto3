package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controlador.ControladorTrayecto;
import modelo.ClienteBD;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class Trayecto extends JFrame {

	private JPanel contentPane;
	private JButton btnContinuar;
	private JButton btnSalir;
	private JButton btnRegresar;
	private JComboBox comboBoxDestino;
	private JComboBox comboBoxOrigen;


	// get-set

	public JButton getBtnContinuar() {
		return btnContinuar;
	}

	public JComboBox getComboBoxDestino() {
		return comboBoxDestino;
	}
	
	public JComboBox getComboBoxOrigen() {
		return comboBoxOrigen;
	}

	public void setComboBoxOrigen(JComboBox comboBoxOrigen) {
		this.comboBoxOrigen = comboBoxOrigen;
	}

	public void setComboBoxDestino(JComboBox comboBoxDestino) {
		this.comboBoxDestino = comboBoxDestino;
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

	public JButton getBtnRegresar() {

		return btnRegresar;
	}

	public void setBtnRegresar(JButton btnRegresar) {
		this.btnRegresar = btnRegresar;
	}


	// otros metodos
	public static void mInicioTrayecto() {

		try {

			Trayecto ventanaTrayecto = new Trayecto();
			ventanaTrayecto.setVisible(true);

			ControladorTrayecto controladorTrayecto = new ControladorTrayecto(ventanaTrayecto);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	public Trayecto() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 351);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 485, 290);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblTrayexc = new JLabel("TRAYECTO");
		lblTrayexc.setBounds(143, 23, 172, 36);
		lblTrayexc.setFont(new Font("Arial", Font.BOLD, 30));
		panel.add(lblTrayexc);

		JLabel lblOrigen = new JLabel("ORIGEN");
		lblOrigen.setFont(new Font("Arial", Font.BOLD, 25));
		lblOrigen.setBounds(24, 84, 108, 31);
		panel.add(lblOrigen);

		JLabel lblDestino = new JLabel("DESTINO");
		lblDestino.setFont(new Font("Arial", Font.BOLD, 25));
		lblDestino.setBounds(329, 84, 125, 31);
		panel.add(lblDestino);

		comboBoxDestino = new JComboBox();

		comboBoxDestino.setBounds(301, 143, 153, 22);
		panel.add(comboBoxDestino);

		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBounds(10, 237, 108, 31);
		panel.add(btnContinuar);

		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(359, 237, 89, 31);
		panel.add(btnSalir);

		btnRegresar = new JButton("REGRESAR");
		btnRegresar.setBounds(181, 237, 134, 31);
		panel.add(btnRegresar);
		
		comboBoxOrigen = new JComboBox();
		comboBoxOrigen.setBounds(24, 143, 153, 22);
		panel.add(comboBoxOrigen);

	}
}