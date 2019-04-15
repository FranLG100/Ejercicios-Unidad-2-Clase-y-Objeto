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
		//Establecemos el tamaño de la ventana
		setSize(500,300);
		//Establecemos que, al cerrar, salgamos del programa
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//No deja redimensionar el marco
		//setResizable(false);
		
		//Establece la posición inicial de la ventana
		//setLocation()
		
		setLocationRelativeTo(null);
		
		//Establece posición y tamaño de la ventana, a la vez
		//setBounds()
		
		//Abrimos el marco en pantalla completa
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//Establecemos el título de la ventana
		setTitle("Título de prueba");
	}
	
	
	
}
