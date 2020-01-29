package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorInicio;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class Final extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldOrigen;
	private JTextField textFieldDestino;
	private JTextField textFieldFecha;
	private JTextField textFieldHora;
	private JPanel fondo;

	// set-get
	public JTextField getTextFieldNombre() {
		return textFieldNombre;
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

	public void setTextFieldDestino(JTextField textFieldDestino) {
		this.textFieldDestino = textFieldDestino;
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

	public JPanel getFondo() {
		return fondo;
	}

	public void setFondo(JPanel fondo) {
		this.fondo = fondo;
	}

	// otros metodos
	public static void mIncioFinal() {

		try {

			Final ventanaFinal = new Final();
			ventanaFinal.setVisible(true);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Final() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		fondo = new JPanel();
		fondo.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				try {

					Inicio ventanaInicio = new Inicio();
					ventanaInicio.setVisible(true);

					ControladorInicio controladorInicio = new ControladorInicio(ventanaInicio);

				} catch (Exception d) {
					d.printStackTrace();
				}
				dispose();
			}
		});
		fondo.setBackground(Color.WHITE);
		fondo.setBounds(0, 0, 434, 311);
		contentPane.add(fondo);
		fondo.setLayout(null);

		JLabel lblVuelvaPronto = new JLabel("Vuelva pronto");
		lblVuelvaPronto.setFont(new Font("Arial", Font.BOLD, 25));
		lblVuelvaPronto.setBounds(127, 54, 174, 32);
		fondo.add(lblVuelvaPronto);

		JLabel lblGraciasPorSu = new JLabel("Gracias por su compra");
		lblGraciasPorSu.setFont(new Font("Arial", Font.BOLD, 25));
		lblGraciasPorSu.setBounds(69, 11, 285, 32);
		fondo.add(lblGraciasPorSu);

		JLabel lblInformacionTicket = new JLabel("INFORMACION DEL TICKET");
		lblInformacionTicket.setFont(new Font("Arial", Font.BOLD, 15));
		lblInformacionTicket.setBounds(10, 115, 225, 32);
		fondo.add(lblInformacionTicket);

		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 15));
		lblNombre.setBounds(20, 163, 74, 18);
		fondo.add(lblNombre);

		JLabel lblOrigen = new JLabel("ORIGEN");
		lblOrigen.setFont(new Font("Arial", Font.BOLD, 15));
		lblOrigen.setBounds(20, 192, 74, 18);
		fondo.add(lblOrigen);

		JLabel lblDestino = new JLabel("DESTINO");
		lblDestino.setFont(new Font("Arial", Font.BOLD, 15));
		lblDestino.setBounds(20, 221, 74, 18);
		fondo.add(lblDestino);

		JLabel lblFecha = new JLabel("FECHA");
		lblFecha.setFont(new Font("Arial", Font.BOLD, 15));
		lblFecha.setBounds(20, 250, 74, 18);
		fondo.add(lblFecha);

		JLabel lblHora = new JLabel("HORA");
		lblHora.setFont(new Font("Arial", Font.BOLD, 15));
		lblHora.setBounds(20, 282, 74, 18);
		fondo.add(lblHora);

		textFieldNombre = new JTextField();
		textFieldNombre.setEditable(false);
		textFieldNombre.setBounds(127, 163, 193, 20);
		fondo.add(textFieldNombre);
		textFieldNombre.setColumns(10);

		textFieldOrigen = new JTextField();
		textFieldOrigen.setEditable(false);
		textFieldOrigen.setColumns(10);
		textFieldOrigen.setBounds(127, 192, 193, 20);
		fondo.add(textFieldOrigen);

		textFieldDestino = new JTextField();
		textFieldDestino.setEditable(false);
		textFieldDestino.setColumns(10);
		textFieldDestino.setBounds(127, 221, 193, 20);
		fondo.add(textFieldDestino);

		textFieldFecha = new JTextField();
		textFieldFecha.setEditable(false);
		textFieldFecha.setColumns(10);
		textFieldFecha.setBounds(127, 250, 193, 20);
		fondo.add(textFieldFecha);

		textFieldHora = new JTextField();
		textFieldHora.setEditable(false);
		textFieldHora.setColumns(10);
		textFieldHora.setBounds(127, 280, 193, 20);
		fondo.add(textFieldHora);
	}

}