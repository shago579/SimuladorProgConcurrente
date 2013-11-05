package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelPrueba extends JPanel implements ActionListener{
	
	private JButton but1;
	private JButton but2;
	private JButton but3;
	private TextModifiers textMod;
	
	public PanelPrueba(){
		but1 = new JButton("PlayerB");
		but2 = new JButton("ClientB");
		but3 = new JButton("StadiumB");
		
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		
		
		add(but1);
		add(but2);
		add(but3);
	}
	
	public void addTextModifier(TextModifiers textMod){
        this.textMod = textMod;
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton butPress = (JButton) e.getSource();
		
		if(butPress == but1){
			System.out.println("Button 1 pressed");
			this.textMod.modifyPlayerPanel("ola jugador");
		}
		if(butPress == but2){
			System.out.println("Button 2 pressed");
			this.textMod.modifyClientPanel("ola Cliente");
		}
		if(butPress == but3){
			System.out.println("Button 3 pressed");
			this.textMod.modifyStadiumPanel("ola stadio");
		}
	}
}
