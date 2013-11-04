package pkgSrc;

import javax.swing.SwingUtilities;

import GUI.MainWindow;

public class MainClass {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new MainWindow();
			}
		});
	}
}