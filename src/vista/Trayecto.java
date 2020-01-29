package vista;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorTrayecto;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Trayecto extends JFrame {

	private JPanel contentPane;
	private JButton btnContinuar;
	private JButton btnSalir;
	
	//get-set
	public JButton getBtnContinuar() {
		return btnContinuar;
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
	
	//otros metodos
	public static void mInicioTrayecto() {
		
		try {
			Trayecto ventanaTrayecto = new Trayecto();
			ventanaTrayecto.setVisible(true);
			
			ControladorTrayecto controladorTrayecto = new ControladorTrayecto(ventanaTrayecto);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public Trayecto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTrayexc = new JLabel("TRAYECTO");
		lblTrayexc.setBounds(120, 11, 172, 36);
		lblTrayexc.setFont(new Font("Arial", Font.BOLD, 30));
		panel.add(lblTrayexc);
		
		JComboBox comboBoxOrigen = new JComboBox();
		comboBoxOrigen.setBounds(45, 137, 96, 22);
		panel.add(comboBoxOrigen);
		

		JLabel lblOrigen = new JLabel("ORIGEN");
		lblOrigen.setFont(new Font("Arial", Font.BOLD, 25));
		lblOrigen.setBounds(45, 83, 108, 31);
		panel.add(lblOrigen);
		
		JLabel lblDestino = new JLabel("DESTINO");
		lblDestino.setFont(new Font("Arial", Font.BOLD, 25));
		lblDestino.setBounds(288, 83, 125, 31);
		panel.add(lblDestino);
		
		JComboBox comboBoxDestino = new JComboBox();
		comboBoxDestino.setBounds(288, 137, 108, 22);
		panel.add(comboBoxDestino);
		
		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBounds(10, 219, 108, 31);
		panel.add(btnContinuar);
		
		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(324, 219, 89, 31);
		panel.add(btnSalir);
	}

}