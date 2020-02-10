package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Entrar;
import vista.Inicio;
import vista.Registro;

public class ControladorInicio implements ActionListener{
	
	
	private Inicio ventanaInico;
	

	
	public ControladorInicio(Inicio pInicio ) {
		
		this.ventanaInico = pInicio;
	
		
		inicializarControlador();

	}

	public void inicializarControlador() {
		
	
		this.ventanaInico.getBtnEntrar().addActionListener(this);
		this.ventanaInico.getBtnEntrar().setActionCommand("btnEntrar");
		
		this.ventanaInico.getBtnRegistro().addActionListener(this);
		this.ventanaInico.getBtnRegistro().setActionCommand("btnRegistro");

	}
	
	
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
		
		
		case "btnEntrar":
			
		
			Entrar ventanaEntrar = new Entrar();
			ventanaEntrar.setVisible(true);
			
			ControladorEntrar controladorEntrar = new ControladorEntrar(ventanaEntrar);
			
			ventanaInico.dispose();
			
			break;
			
		case "btnRegistro":
			
			Registro VentanaRegistro = new Registro();
			VentanaRegistro.setVisible(true);
			
			ControladorRegistro controlRegistro = new ControladorRegistro(VentanaRegistro);
			
			ventanaInico.dispose();
			
			break;
		
		}

	}


}