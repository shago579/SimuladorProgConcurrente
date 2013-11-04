package GUI;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class MainWindow extends JFrame{
	
	private Panel jugadorPanel;
	private Panel clientePanel;
	private Panel estadioPanel;
	private Panel campoPanel;
	
	public MainWindow(){
		super("Simulador de Partido");
		setSize(800,600);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(0,2,15,10));
		
		jugadorPanel = new Panel("Jugador");
		clientePanel = new Panel("Cliente");
		estadioPanel = new Panel("Estadio");
		campoPanel = new Panel("Campo");
		
		add(jugadorPanel);
		add(clientePanel);
		add(estadioPanel);
		add(campoPanel);
		setVisible(true);
	}
}
