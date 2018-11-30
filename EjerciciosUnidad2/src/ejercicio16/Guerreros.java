package ejercicio16;

import java.io.IOException;

public class Guerreros extends Personajes{
	
	private String arma;

	/**
	 * Constructor con tres parámetros de entrada
	 * @param nombre Nombre del guerrero
	 * @param maxEnergia Energía máxima del guerrero
	 * @param arma Nombre del arma del guerrero
	 * */
	public Guerreros(String nombre, int maxEnergia,String arma) throws IOException {
		super(nombre,maxEnergia);
		energia=maxEnergia;
		this.arma = amadeus.compruebaTexto(arma);
	}
	
	/**
	 * Método con un parámetro de entrada. El guerrero ataca con la energía introducida
	 * @param ataque Cantidad de daño realizado y energía consumida
	 * */
	public void combatir(int ataque) {
		if(ataque>energia)
			System.out.println(nombre+" no tiene la energía suficiente para hacer eso.");
		else {
			energia-=ataque;
			System.out.println("¡Síii! ¡"+nombre+" ha atacado con gran venganza y furiosa cólera con su fiel "+arma+", y todavía le quedan "+energia+"ptos de energía!");
		}
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) throws IOException {
		this.arma = amadeus.compruebaTexto(arma);
	}
	
	

	
	
	

}
