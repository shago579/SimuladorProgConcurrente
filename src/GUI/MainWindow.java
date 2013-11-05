package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame{
	
	private Panel playerPanel;
	private Panel clientPanel;
	private Panel stadiumPanel;
	private Panel fieldPanel;
	
	private PanelPrueba panel;
	
	public MainWindow(){
		super("Simulador de Partido");
		setSize(800,600);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(0,2,15,10));
		
		playerPanel = new Panel("Jugador");
		clientPanel = new Panel("Cliente");
		stadiumPanel = new Panel("Estadio");
		fieldPanel = new Panel("Campo");
		
		panel = new PanelPrueba();
		
		panel.addTextModifier(new TextModifiers(){

			@Override
			public void modifyPlayerPanel(String text) {
				playerPanel.addText(text);
			}

			@Override
			public void modifyClientPanel(String text) {
				clientPanel.addText(text);
			}

			@Override
			public void modifyStadiumPanel(String text) {
				stadiumPanel.addText(text);
			}

			@Override
			public void modifyFieldPanel(String text) {
				fieldPanel.addText(text);
			}
		});
		
		add(panel);
		add(playerPanel);
		add(clientPanel);
		add(stadiumPanel);
		add(fieldPanel);
		setVisible(true);
	}
}
