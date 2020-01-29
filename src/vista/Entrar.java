package vista;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import controlador.ControladorEntrar;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;


public class Entrar extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDni;
	private JTextField textFieldContraseña;
	private JButton btnContinuar;
	private JButton btnSalir;
	
	
	//get-set
	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JTextField getTextFieldDni() {
		return textFieldDni;
	}

	public void setTextFieldDni(JTextField textFieldDni) {
		this.textFieldDni = textFieldDni;
	}

	public JTextField getTextFieldContraseña() {
		return textFieldContraseña;
	}

	public void setTextFieldContraseña(JTextField textFieldContraseña) {
		this.textFieldContraseña = textFieldContraseña;
	}

	public JButton getBtnContinuar() {
		return btnContinuar;
	}

	public void setBtnContinuar(JButton btnContinuar) {
		this.btnContinuar = btnContinuar;
	}


	//otros metodos
	public void mControlador(){
		
		try {
			Entrar ventanaEntrar = new Entrar();
			ventanaEntrar.setVisible(true);
			
			
			ControladorEntrar controladorEntrar = new ControladorEntrar(ventanaEntrar);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * Create the frame.
	 */
	public Entrar() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 366);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(Color.WHITE);
		panel.setBackground(UIManager.getColor("ToggleButton.background"));
		panel.setBounds(41, 27, 506, 269);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("ENTRAR");
		lblTitulo.setFont(new Font("Lucida Sans", Font.BOLD, 35));
		lblTitulo.setBounds(167, 11, 159, 36);
		panel.add(lblTitulo);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Lucida Sans", Font.BOLD, 25));
		lblDni.setBounds(26, 91, 91, 27);
		panel.add(lblDni);
		
		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
		lblContrasea.setFont(new Font("Lucida Sans", Font.BOLD, 25));
		lblContrasea.setBounds(26, 140, 213, 36);
		panel.add(lblContrasea);
		
		textFieldDni = new JTextField();
		textFieldDni.setBounds(236, 91, 188, 27);
		panel.add(textFieldDni);
		textFieldDni.setColumns(10);
		
		textFieldContraseña = new JTextField();
		textFieldContraseña.setColumns(10);
		textFieldContraseña.setBounds(236, 140, 188, 27);
		panel.add(textFieldContraseña);
		
		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBackground(UIManager.getColor("ToggleButton.light"));
		btnContinuar.setFont(new Font("Arial", Font.BOLD, 12));
		btnContinuar.setBounds(46, 197, 162, 48);
		panel.add(btnContinuar);
		
		btnSalir = new JButton("SALIR");
		btnSalir.setBackground(UIManager.getColor("ToggleButton.light"));
		btnSalir.setFont(new Font("Arial", Font.BOLD, 12));
		btnSalir.setBounds(300, 197, 141, 48);
		panel.add(btnSalir);
	}

	

}
