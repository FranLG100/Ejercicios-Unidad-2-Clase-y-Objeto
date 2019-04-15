package graficos;
import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {
	
	public static void main(String[] args) {
		
		miMarco m1=new miMarco();
		
		//Hacemos visible la ventana
		m1.setVisible(true);
	}

}

class miMarco extends JFrame {
	
	
	public miMarco() {
		//Establecemos el tama�o de la ventana
		setSize(500,300);
		//Establecemos que, al cerrar, salgamos del programa
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//No deja redimensionar el marco
		//setResizable(false);
		
		//Establece la posici�n inicial de la ventana
		//setLocation()
		
		setLocationRelativeTo(null);
		
		//Establece posici�n y tama�o de la ventana, a la vez
		//setBounds()
		
		//Abrimos el marco en pantalla completa
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//Establecemos el t�tulo de la ventana
		setTitle("T�tulo de prueba");
	}
	
	
	
}
