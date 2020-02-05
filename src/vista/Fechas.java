package vista;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import controlador.ControladorFechas;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JDateChooser;

public class Fechas extends JFrame {

	private JPanel contentPane;
	
	private JTextField textFieldPrecio;
	
	private JButton btnContinuar;
	private JButton btnSalir;
	private JButton btnRegresar;
	
	private String fecha;
	private String Hora;
	
	private JComboBox comboBoxHoraIda;
	private JComboBox comboBoxHoraVuelta;
	
	private JDateChooser dateChooserIda;
	private JDateChooser dateChooserVuelta;

	//get-set
	
	public JButton getBtnContinuar() {
		return btnContinuar;
	}

	public JDateChooser getDateChooserIda() {
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

	public String getHora() {
		return Hora;
	}

	public void setfecha(String fecha) {
		Hora = fecha;
	}
	public String getfecha() {
		return fecha;
	}

	public void setHora(String hora) {
		Hora = hora;
	}

	public JComboBox getComboBoxHoraIda() {
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

	public JTextField getTextFieldPrecio() {
		return textFieldPrecio;
	}

	public void setTextFieldPrecio(JTextField textFieldPrecio) {
		this.textFieldPrecio = textFieldPrecio;
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
	public static void mInicioFechas() {
		
		try {
			
			Fechas ventanaFechas = new Fechas();
			ventanaFechas.setVisible(true);
			
			ControladorFechas ControladorFechas = new ControladorFechas(ventanaFechas);
					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public Fechas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 377);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 527, 318);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFechasHorarios = new JLabel("FECHAS / HORARIOS");
		lblFechasHorarios.setBounds(139, 11, 258, 30);
		lblFechasHorarios.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblFechasHorarios);
		
		JLabel lblPrecio = new JLabel("PRECIO");
		lblPrecio.setFont(new Font("Arial", Font.BOLD, 15));
		lblPrecio.setBounds(95, 196, 63, 14);
		panel.add(lblPrecio);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setEditable(false);
		textFieldPrecio.setBounds(208, 194, 96, 20);
		panel.add(textFieldPrecio);
		textFieldPrecio.setColumns(10);
		
		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBounds(13, 268, 119, 34);
		panel.add(btnContinuar);
		
		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(400, 268, 102, 34);
		panel.add(btnSalir);
		
		JLabel lblFecha = new JLabel("FECHA IDA:");
		lblFecha.setBounds(13, 91, 83, 14);
		panel.add(lblFecha);
		
		JLabel lblHora = new JLabel("HORA IDA:");
		lblHora.setBounds(265, 91, 74, 14);
		panel.add(lblHora);
		
		comboBoxHoraIda =  new JComboBox();
		comboBoxHoraIda.setToolTipText("");
		comboBoxHoraIda.setMaximumRowCount(2);
		comboBoxHoraIda.setBounds(349, 87, 127, 22);
		panel.add(comboBoxHoraIda);
		
		JLabel lblFechaVuelta = new JLabel("FECHA VUELTA:");
		lblFechaVuelta.setBounds(10, 133, 99, 20);
		panel.add(lblFechaVuelta);
		
		JLabel lblHoraVuelta = new JLabel("HORA VUELTA:");
		lblHoraVuelta.setBounds(254, 136, 85, 14);
		panel.add(lblHoraVuelta);
		
		comboBoxHoraVuelta = new JComboBox();
		comboBoxHoraVuelta.setToolTipText("");
		comboBoxHoraVuelta.setMaximumRowCount(2);
		comboBoxHoraVuelta.setBounds(349, 132, 127, 22);
		panel.add(comboBoxHoraVuelta);
		
		btnRegresar = new JButton("REGRESAR");
		btnRegresar.setBounds(208, 268, 117, 34);
		panel.add(btnRegresar);
		
		dateChooserIda = new JDateChooser();
		dateChooserIda.setBounds(95, 91, 117, 20);
		panel.add(dateChooserIda);
		
		dateChooserVuelta = new JDateChooser();
		dateChooserVuelta.setBounds(95, 133, 117, 20);
		panel.add(dateChooserVuelta);
	
		
	
	}
}