package ejercicio16;

import java.io.IOException;

import utilesFran.Amadeus;

public class Personajes {
	
	protected Amadeus amadeus=new Amadeus();
	protected String nombre;
	protected int energia;
	protected int maxEnergia;
	
	/**
	 * Constructor vac�o de Personajes.
	 * */
	public Personajes() {
	}
	
	/**Constructor de Personajes, con dos par�metros de entrada
	 * @param nombre Nombre del personaje
	 * @param maxEnergia Energ�a m�xima del personaje. Al menos, debe ser 1
	 * @throws IOException 
	 * */
	public Personajes(String nombre, int maxEnergia) throws IOException {
		this.nombre=nombre;
		while(maxEnergia<=0) {
			System.out.println("�Eh, eh, eh!�Espera! La energ�a m�xima debe ser al menos 1. Vuelva a introducir dato");
			maxEnergia=amadeus.controlaIntPositivo();
		}
		this.maxEnergia=maxEnergia;
		this.energia=maxEnergia;
	}
	
	/**
	 * M�todo que permite al personaje recuperar energ�a
	 * @param alimento Cantidad de energ�a que recupera el jugador. No puede sobrepasar su energ�a m�xima
	 * */
	public void alimentarse(int alimento) {
		energia+=alimento;
		if(energia>maxEnergia) {
			System.out.println(nombre+ " ahora est� a tope de energ�a, ya no puede alimentarse m�s.");
			energia=maxEnergia;
		}else
			System.out.println(nombre+" se ha alimentado y ha recuperado "+alimento+"ptos de energ�a.");
	}
	
	/**
	 * M�todo que permite consultar la energ�a del personaje 
	 * */
	public void consultarEnergia() {
		System.out.println("A "+nombre+" todav�a le quedan "+getEnergia()+"ptos de energ�a");
	}
	
	public int getEnergia() {
		return energia;
	}

	public void setMaxEnergia(int maxEnergia) throws IOException {
		while(maxEnergia<=0) {
			System.out.println("�Eh, eh, eh!�Espera! La energ�a m�xima debe ser al menos 1. Vuelva a introducir dato");
			maxEnergia=amadeus.controlaIntPositivo();
		}
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) throws IOException {
		this.nombre = amadeus.compruebaTexto(nombre);
	}
	public int getMaxEnergia() {
		return maxEnergia;
	}
	public void setEnergia(int maxEnergia) throws IOException {
		while(maxEnergia<0) {
			System.out.println("No es posible tener una energ�a negativa. Introduzca otro valor");
			maxEnergia=amadeus.controlaIntPositivo();
		}
		this.energia = maxEnergia;
	}
	
	

}
