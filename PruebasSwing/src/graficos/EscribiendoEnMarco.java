package graficos;
import java.awt.Graphics;

import javax.swing.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConTexto m=new MarcoConTexto();
		
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
	
	setVisible(true);
	setSize(600,450);
	setLocationRelativeTo(null);
	setTitle("Prueba");
	Lamina l=new Lamina();
	add(l);
	
	}
}

class Lamina extends JPanel{
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.drawString("Prueba de texto", 60, 60);
		
	}
	
}
