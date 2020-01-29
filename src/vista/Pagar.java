package vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorComprobante;
import controlador.ControladorInicio;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;



public  class Pagar extends JFrame {

	private JPanel contentPane;
	private JTextField tflApagar;
	private JTextField tflIntroducido;
	float total;
	float introducido;
	float restante;
	private JTextArea textCambio;
	float retroceder;
	int retro;
	String error = " ";

	/**
	 * ventana para pagar los productos
	 */
	public static void mInicioPagar() {
		
				try {
					Pagar ventanaPagar = new Pagar();
					ventanaPagar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}

	/**
	 * Create the frame.
	 */
	public Pagar() {
		setBackground(SystemColor.menu);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 656);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textCambio = new JTextArea();
		textCambio.setEditable(false);
		textCambio.setBounds(211, 53, 260, 142);
		textCambio.setBackground(SystemColor.text);
		contentPane.add(textCambio);
		textCambio.setColumns(10);

		JLabel lblAPagar = new JLabel("A pagar:");
		lblAPagar.setBounds(21, 30, 98, 14);
		lblAPagar.setForeground(new Color(0, 0, 0));
		contentPane.add(lblAPagar);

		tflApagar = new JTextField();
		tflApagar.setBounds(21, 55, 86, 20);
		tflApagar.setBackground(SystemColor.text);
		contentPane.add(tflApagar);
		tflApagar.setColumns(1);

		JLabel lblDineroIntroducido = new JLabel("Dinero introducido:");
		lblDineroIntroducido.setBounds(21, 95, 145, 14);
		lblDineroIntroducido.setForeground(new Color(0, 0, 0));
		contentPane.add(lblDineroIntroducido);

		tflIntroducido = new JTextField();
		tflIntroducido.setEditable(false);
		tflIntroducido.setBounds(21, 120, 86, 20);
		tflIntroducido.setBackground(SystemColor.text);
		contentPane.add(tflIntroducido);
		tflIntroducido.setColumns(1);

		JLabel lblSuCambio = new JLabel("Cambio:");
		lblSuCambio.setBounds(201, 21, 237, 14);
		lblSuCambio.setForeground(new Color(0, 0, 0));
		lblSuCambio.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblSuCambio);
		
		JButton btncoma = new JButton(".");
		btncoma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btncoma.isEnabled()) {
				tflIntroducido.setText(tflIntroducido.getText() + ".");
				}
				btncoma.setEnabled(false);
			}

		});
		
		btncoma.setBounds(273, 436, 75, 65);
		contentPane.add(btncoma);

		JButton btnRetroceder = new JButton("Borrar");
		btnRetroceder.setEnabled(false);
		btnRetroceder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String cadena = tflIntroducido.getText();
				tflIntroducido.setText(cadena.substring(0,cadena.length()-1));
				if((cadena.substring(cadena.length()-1)).equals(",")) {
					btncoma.setEnabled(true);
				}
				if(tflIntroducido.getText().equals("0")) {
					tflIntroducido.setText("");
				}
				if(tflIntroducido.getText().equals("")) {
					btnRetroceder.setEnabled(false);
				}
			}

		});
		btnRetroceder.setBounds(103, 436, 75, 65);
		contentPane.add(btnRetroceder);

		JButton btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tflIntroducido.setText(tflIntroducido.getText() + "7");
				btnRetroceder.setEnabled(true);
			}
			
		});
		btn7.setBounds(103, 242, 75, 65);
		contentPane.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tflIntroducido.setText(tflIntroducido.getText() + "8");
				btnRetroceder.setEnabled(true);
			}
		
		});
		btn8.setBounds(188, 242, 75, 65);
		contentPane.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				tflIntroducido.setText(tflIntroducido.getText() + "9");
				btnRetroceder.setEnabled(true);
			}
		
		});
		btn9.setBounds(273, 242, 75, 65);
		contentPane.add(btn9);

		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tflIntroducido.setText(tflIntroducido.getText() + "5");
				btnRetroceder.setEnabled(true);
			}
			
		});
		btn5.setBounds(188, 306, 75, 65);
		contentPane.add(btn5);

		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tflIntroducido.setText(tflIntroducido.getText() + "4");
				btnRetroceder.setEnabled(true);
			}

		});
		btn4.setBounds(103, 306, 75, 65);
		contentPane.add(btn4);

		JButton btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tflIntroducido.setText(tflIntroducido.getText() + "6");
				btnRetroceder.setEnabled(true);
			}

		});
		btn6.setBounds(273, 306, 75, 65);
		contentPane.add(btn6);

		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tflIntroducido.setText(tflIntroducido.getText() + "3");
				btnRetroceder.setEnabled(true);
			}

		});
		btn3.setBounds(273, 371, 75, 65);
		contentPane.add(btn3);

		JButton btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tflIntroducido.setText(tflIntroducido.getText() + "1");
				btnRetroceder.setEnabled(true);
			}

		});
		btn1.setBounds(103, 371, 75, 65);
		contentPane.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tflIntroducido.setText(tflIntroducido.getText() + "2");
				btnRetroceder.setEnabled(true);
			}

		});
		btn2.setBounds(188, 371, 75, 65);
		contentPane.add(btn2);

		JButton btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				tflIntroducido.setText(tflIntroducido.getText() + "0");
				btnRetroceder.setEnabled(true);
			}
		});
		btn0.setBounds(188, 436, 75, 65);
		contentPane.add(btn0);

		JButton btnpagar = new JButton("Pagar");
		btnpagar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textCambio.setText("");
				if (tflApagar.getText().length() > 0) {
					total = Float.valueOf(tflApagar.getText());
				}
				if (tflIntroducido.getText().length() > 0) {
					introducido = Float.valueOf(tflIntroducido.getText());

				}

				if (total > introducido) {
					restante = total - introducido;
					restante = (float) (Math.floor(restante * 100) / 100);
					tflApagar.setText(Float.toString(restante));
					tflIntroducido.setText("");
					introducido = 0;
				}

				if (total < introducido) {
					restante = introducido - total;
					textCambio.setText(textCambio.getText() + ADevolver.adevolver(restante));
					tflApagar.setText("0");
					tflIntroducido.setText("");
					introducido = 0;
				}

				if (total == introducido) {
					tflApagar.setText("0");
					textCambio.setText("Gracias por su compra \n retire sus productos \n pulse continuar");
					tflIntroducido.setText("");
					introducido = 0;
				}

			}
		});

		btnpagar.setBounds(385, 459, 91, 42);
		contentPane.add(btnpagar);

		

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		btnSalir.setBounds(11, 553, 108, 42);
		btnSalir.addMouseListener(new MouseAdapter() {

		});
		contentPane.add(btnSalir);

		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					Comprobante VentanaComprobante = new Comprobante();
					VentanaComprobante.setVisible(true);
		
					ControladorComprobante controladorComprobante = new ControladorComprobante(VentanaComprobante);
				} catch (Exception d) {
					
					d.printStackTrace();
				}
				dispose();
			}
		});
		btnContinuar.setBounds(368, 553, 106, 42);
		btnContinuar.addMouseListener(new MouseAdapter() {

		});
		contentPane.add(btnContinuar);

		JButton btnDevolver = new JButton("Devolver");
		btnDevolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textCambio.setText("");
				introducido = Float.valueOf(tflIntroducido.getText());
				textCambio.setText(textCambio.getText() + ADevolver.adevolver(introducido));
				tflIntroducido.setText("");
				introducido = 0;
			}
		});

		btnDevolver.setBounds(384, 242, 92, 42);
		contentPane.add(btnDevolver);

		JLabel label = new JLabel("\u20AC");
		label.setBounds(117, 58, 46, 14);
		contentPane.add(label);

		JLabel label_1 = new JLabel("\u20AC");
		label_1.setBounds(117, 123, 46, 14);
		contentPane.add(label_1);
	}
}