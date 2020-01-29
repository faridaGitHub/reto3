package vista;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorComprobante;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;


public class Comprobante extends JFrame {

	private JPanel contentPane;
	private JButton btnSi;
	private JButton btnNo;
	
	//get-set
	public JButton getBtnSi() {
		return btnSi;
	}

	public void setBtnSi(JButton btnSi) {
		this.btnSi = btnSi;
	}

	public JButton getBtnNo() {
		return btnNo;
	}

	public void setBtnNo(JButton btnNo) {
		this.btnNo = btnNo;
	}

	
	//otros metodos
	public static void mInicioComprobante() {

		try {
			
			Comprobante VentanaComprobante = new Comprobante();
			VentanaComprobante.setVisible(true);
			
			ControladorComprobante controladorComprobante = new ControladorComprobante(VentanaComprobante);
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Comprobante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 228);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblComprobante = new JLabel("COMPROBANTE");
		lblComprobante.setFont(new Font("Arial", Font.BOLD, 30));
		lblComprobante.setBounds(96, 11, 259, 54);
		panel.add(lblComprobante);

		JLabel lbldPreguntaFactura = new JLabel("\u00BFDesea guardar el ticket de la factura?");
		lbldPreguntaFactura.setFont(new Font("Arial", Font.BOLD, 20));
		lbldPreguntaFactura.setBounds(37, 84, 387, 24);
		panel.add(lbldPreguntaFactura);

		btnSi = new JButton("SI");
		btnSi.setFont(new Font("Arial", Font.BOLD, 15));
		btnSi.setBounds(37, 170, 89, 37);
		panel.add(btnSi);

		btnNo = new JButton("NO");
		btnNo.setFont(new Font("Arial", Font.BOLD, 15));
		btnNo.setBounds(321, 170, 89, 37);
		panel.add(btnNo);
	}


	
	

}