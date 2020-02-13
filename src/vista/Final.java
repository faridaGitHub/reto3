package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorFinal;
import controlador.ControladorInicio;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Final extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldOrigen;
	private JTextField textFieldDestino;
	private JTextField textFieldFecha;
	private JTextField textFieldHora;
	private JButton btnSi;
	private JButton btnNo;
	private JPanel fondo;
	private JTextField textFieldPrecio;
	

	// set-get
	
	
	
	
	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public JTextField getTextFieldPrecio() {
		return textFieldPrecio;
	}

	public void setTextFieldPrecio(JTextField textFieldPrecio) {
		this.textFieldPrecio = textFieldPrecio;
	}

	public void setTextFieldDestino(JTextField textFieldDestino) {
		this.textFieldDestino = textFieldDestino;
	}

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

	public void setTextFieldNombre(JTextField textFieldNombre) {
		this.textFieldNombre = textFieldNombre;
	}

	public JTextField getTextFieldOrigen() {
		return textFieldOrigen;
	}

	public void setTextFieldOrigen(JTextField textFieldOrigen) {
		this.textFieldOrigen = textFieldOrigen;
	}

	public JTextField getTextFieldDestino() {
		return textFieldDestino;
	}

	public void setTextFieldDestino(Object object) {
		this.textFieldDestino = (JTextField) object;
	}

	public JTextField getTextFieldFecha() {
		return textFieldFecha;
	}

	public void setTextFieldFecha(JTextField textFieldFecha) {
		this.textFieldFecha = textFieldFecha;
	}

	public JTextField getTextFieldHora() {
		return textFieldHora;
	}

	public void setTextFieldHora(JTextField textFieldHora) {
		this.textFieldHora = textFieldHora;
	}


	// otros metodos
	
	public static void mIncioFinal() {

		try {

			Final ventanaFinal = new Final();
			ventanaFinal.setVisible(true);
			
			ControladorFinal controladorFinal = new ControladorFinal(ventanaFinal);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Final() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 493);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		fondo = new JPanel();
		fondo.setBackground(Color.WHITE);
		fondo.setBounds(10, 11, 604, 432);
		contentPane.add(fondo);
		fondo.setLayout(null);

		JLabel lblVuelvaPronto = new JLabel("Vuelva pronto");
		lblVuelvaPronto.setFont(new Font("Arial", Font.BOLD, 25));
		lblVuelvaPronto.setBounds(225, 50, 174, 32);
		fondo.add(lblVuelvaPronto);

		JLabel lblGraciasPorSu = new JLabel("Gracias por su compra");
		lblGraciasPorSu.setFont(new Font("Arial", Font.BOLD, 25));
		lblGraciasPorSu.setBounds(173, 11, 285, 32);
		fondo.add(lblGraciasPorSu);

		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 15));
		lblNombre.setBounds(85, 107, 74, 18);
		fondo.add(lblNombre);

		JLabel lblOrigen = new JLabel("ORIGEN");
		lblOrigen.setFont(new Font("Arial", Font.BOLD, 15));
		lblOrigen.setBounds(426, 107, 74, 18);
		fondo.add(lblOrigen);

		JLabel lblDestino = new JLabel("DESTINO");
		lblDestino.setFont(new Font("Arial", Font.BOLD, 15));
		lblDestino.setBounds(85, 179, 74, 18);
		fondo.add(lblDestino);

		JLabel lblFecha = new JLabel("FECHA");
		lblFecha.setFont(new Font("Arial", Font.BOLD, 15));
		lblFecha.setBounds(426, 179, 74, 18);
		fondo.add(lblFecha);

		JLabel lblHora = new JLabel("HORA");
		lblHora.setFont(new Font("Arial", Font.BOLD, 15));
		lblHora.setBounds(426, 272, 74, 18);
		fondo.add(lblHora);
		
		JLabel lblPrecio = new JLabel("PRECIO");
		lblPrecio.setFont(new Font("Arial", Font.BOLD, 15));
		lblPrecio.setBounds(85, 272, 74, 18);
		fondo.add(lblPrecio);

		textFieldNombre = new JTextField();
		textFieldNombre.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNombre.setEditable(false);
		textFieldNombre.setBounds(20, 136, 193, 32);
		fondo.add(textFieldNombre);
		textFieldNombre.setColumns(10);

		textFieldOrigen = new JTextField();
		textFieldOrigen.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOrigen.setEditable(false);
		textFieldOrigen.setColumns(10);
		textFieldOrigen.setBounds(363, 136, 193, 32);
		fondo.add(textFieldOrigen);

		textFieldDestino = new JTextField();
		textFieldDestino.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDestino.setEditable(false);
		textFieldDestino.setColumns(10);
		textFieldDestino.setBounds(20, 208, 193, 32);
		fondo.add(textFieldDestino);

		textFieldFecha = new JTextField();
		textFieldFecha.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFecha.setEditable(false);
		textFieldFecha.setColumns(10);
		textFieldFecha.setBounds(363, 208, 193, 32);
		fondo.add(textFieldFecha);

		textFieldHora = new JTextField();
		textFieldHora.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldHora.setEditable(false);
		textFieldHora.setColumns(10);
		textFieldHora.setBounds(363, 301, 193, 32);
		fondo.add(textFieldHora);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPrecio.setEditable(false);
		textFieldPrecio.setColumns(10);
		textFieldPrecio.setBounds(20, 301, 193, 32);
		fondo.add(textFieldPrecio);
		
		btnSi = new JButton("SI");
		btnSi.setFont(new Font("Arial", Font.BOLD, 15));
		btnSi.setBounds(10, 384, 89, 37);
		fondo.add(btnSi);
		
		btnNo = new JButton("NO");
		btnNo.setFont(new Font("Arial", Font.BOLD, 15));
		btnNo.setBounds(487, 384, 89, 37);
		fondo.add(btnNo);
		
		JLabel lblNewLabel = new JLabel("\u20AC");
		lblNewLabel.setBounds(218, 310, 48, 14);
		fondo.add(lblNewLabel);
		
		
	}
}