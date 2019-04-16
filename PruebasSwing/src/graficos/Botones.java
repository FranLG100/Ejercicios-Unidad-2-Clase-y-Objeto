package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Botones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoBotones m=new MarcoBotones();
		m.setVisible(true);
		
		
	}

}

class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
		setTitle("Prueba botón");
		setSize(700,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		LaminaBot l=new LaminaBot();
		add(l);
	}
	
}

class LaminaBot extends JPanel implements ActionListener{
	
	boolean pintado=false;
	JButton botonAzul=new JButton("Azul");
	JButton botonRojo=new JButton("Rojo");
	JButton botonAmarillo=new JButton("Amarillo");
	
	public LaminaBot() {
		add(botonAzul);
		add(botonRojo);
		add(botonAmarillo);
		botonAzul.addActionListener(this);
		botonRojo.addActionListener(this);
		botonAmarillo.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object botonPulsado=e.getSource();
		
		if(botonPulsado==botonAzul) {
			pintado=!pintado;
			if(!pintado) {
				setBackground(Color.WHITE);
			}else {
				setBackground(Color.BLUE);
			}
		}else if(botonPulsado==botonRojo) {
			setBackground(Color.RED);
			pintado=false;
		}else {
			setBackground(Color.YELLOW);
			pintado=false;
		}
		
	}
	
}
