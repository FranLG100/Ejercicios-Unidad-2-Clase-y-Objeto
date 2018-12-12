package unidad2.ejercicio16;

import java.io.IOException;

public class Magos extends Personajes {

	private String poder;
	
	/**
	 * Constructor de mago con dos par�metros
	 * @param nombre Nombre del mago
	 * @param poder Nombre del poder que utilizar� el mago
	 * */
	public Magos (String nombre, String poder) throws IOException {
		this.nombre=nombre;
		this.maxEnergia=100;
		energia=this.maxEnergia;
		this.poder=amadeus.compruebaTexto(poder);
	}
	
	/**
	 * M�todo del mago para usar su poder. Consume dos de energ�a
	 * */
	public String encantar() {
		energia-=2;
		return  "El poderoso mago "+nombre+" ha usado su poder "+poder+" para acabar con sus enemigos. Le quedan "+energia+"ptos de energ�a.";
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) throws IOException {
		this.poder = amadeus.compruebaTexto(poder);
	}
	
	
}
