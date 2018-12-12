package unidad2.ejercicio16;

import java.io.IOException;

public class Guerreros extends Personajes{
	
	private String arma;

	/**
	 * Constructor con tres par�metros de entrada
	 * @param nombre Nombre del guerrero
	 * @param maxEnergia Energ�a m�xima del guerrero
	 * @param arma Nombre del arma del guerrero
	 * */
	public Guerreros(String nombre, int maxEnergia,String arma) throws IOException {
		super(nombre,maxEnergia);
		energia=maxEnergia;
		this.arma = amadeus.compruebaTexto(arma);
	}
	
	/**
	 * M�todo con un par�metro de entrada. El guerrero ataca con la energ�a introducida
	 * @param ataque Cantidad de da�o realizado y energ�a consumida
	 * */
	public void combatir(int ataque) {
		if(ataque>energia)
			System.out.println(nombre+" no tiene la energ�a suficiente para hacer eso.");
		else {
			energia-=ataque;
			System.out.println("�S�ii! �"+nombre+" ha atacado con gran venganza y furiosa c�lera con su fiel "+arma+", y todav�a le quedan "+energia+"ptos de energ�a!");
		}
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) throws IOException {
		this.arma = amadeus.compruebaTexto(arma);
	}
	
	

	
	
	

}
