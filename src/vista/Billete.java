package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import controlador.ControladorBillete;
import modelo.Paradas;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JMenuItem;
import java.awt.Choice;
import java.awt.Scrollbar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class Billete extends JFrame {

	private JPanel contentPane;
	private JButton btnContinuar;
	private JButton btnSalir;
	private JComboBox comboBoxOrigen;
	private JComboBox comboBoxDestino;
	public String comOrigen;

	// get-set
	public String getComOrigen() {
		return comOrigen;
	}

	public void setComOrigen(String comOrigen) {
		this.comOrigen = comOrigen;
	}

	public JComboBox getComboBoxOrigen() {
		return comboBoxOrigen;
	}

	public void setComboBoxOrigen(JComboBox comboBoxOrigen) {
		this.comboBoxOrigen = comboBoxOrigen;
	}

	public JComboBox getComboBoxDestino() {
		return comboBoxDestino;
	}

	public void setComboBoxDestino(JComboBox comboBoxDestino) {
		this.comboBoxDestino = comboBoxDestino;
	}

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

	// otros metodos
	
	public static void mInicioBillete() {
		
		try {

			Billete ventanaBillete = new Billete();
			ventanaBillete.setVisible(true);

			ControladorBillete controladorBillete = new ControladorBillete(ventanaBillete);

		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	public Billete() {
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

		JLabel lblComprarBillete = new JLabel("COMPRAR BILLETE");
		lblComprarBillete.setBounds(98, 11, 288, 36);
		lblComprarBillete.setFont(new Font("Lucida Sans", Font.BOLD, 30));
		panel.add(lblComprarBillete);

		JLabel lblOrigen = new JLabel("ORIGEN");
		lblOrigen.setFont(new Font("Lucida Sans", Font.BOLD, 20));
		lblOrigen.setBounds(40, 80, 79, 24);
		panel.add(lblOrigen);

		JLabel lblDestino = new JLabel("DESTINO");
		lblDestino.setFont(new Font("Lucida Sans", Font.BOLD, 20));
		lblDestino.setBounds(282, 80, 104, 24);
		panel.add(lblDestino);

		comboBoxOrigen = new JComboBox<>();
		
		comboBoxOrigen.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {

				if (e.getStateChange() == ItemEvent.SELECTED) {

					comOrigen = e.getItem().toString();
				}
			}
		});
		comboBoxOrigen.setModel(new DefaultComboBoxModel(new String[] {"Bilbao", "Plentzia", "Muskiz", "Balmaseda", "Durango"}));
		comboBoxOrigen.setBounds(40, 125, 79, 22);
		panel.add(comboBoxOrigen);

		this.comboBoxDestino = new JComboBox();
		comboBoxDestino.setModel(new DefaultComboBoxModel(new String[] {"Muskiz", "Balmaseda", "Plentzia", "Bilbao", "Durango"}));
		comboBoxDestino.setBounds(362, 125, 79, 22);
		panel.add(comboBoxDestino);

		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBackground(UIManager.getColor("ToggleButton.light"));
		btnContinuar.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		btnContinuar.setBounds(24, 197, 162, 48);
		panel.add(btnContinuar);

		btnSalir = new JButton("SALIR");
		btnSalir.setBackground(UIManager.getColor("ToggleButton.light"));
		btnSalir.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		btnSalir.setBounds(329, 197, 141, 48);
		panel.add(btnSalir);
	}
}
