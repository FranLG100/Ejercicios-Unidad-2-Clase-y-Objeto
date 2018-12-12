package unidad2.ejercicio16;

import java.io.IOException;

import utilesFran.Amadeus;

public class Personajes {
	
	protected Amadeus amadeus=new Amadeus();
	protected String nombre;
	protected int energia;
	protected int maxEnergia;
	
	/**
	 * Constructor vacío de Personajes.
	 * */
	public Personajes() {
	}
	
	/**Constructor de Personajes, con dos parámetros de entrada
	 * @param nombre Nombre del personaje
	 * @param maxEnergia Energía máxima del personaje. Al menos, debe ser 1
	 * @throws IOException 
	 * */
	public Personajes(String nombre, int maxEnergia) throws IOException {
		this.nombre=nombre;
		while(maxEnergia<=0) {
			System.out.println("¡Eh, eh, eh!¡Espera! La energía máxima debe ser al menos 1. Vuelva a introducir dato");
			maxEnergia=amadeus.controlaIntPositivo();
		}
		this.maxEnergia=maxEnergia;
		this.energia=maxEnergia;
	}
	
	/**
	 * Método que permite al personaje recuperar energía
	 * @param alimento Cantidad de energía que recupera el jugador. No puede sobrepasar su energía máxima
	 * */
	public void alimentarse(int alimento) {
		energia+=alimento;
		if(energia>maxEnergia) {
			System.out.println(nombre+ " ahora está a tope de energía, ya no puede alimentarse más.");
			energia=maxEnergia;
		}else
			System.out.println(nombre+" se ha alimentado y ha recuperado "+alimento+"ptos de energía.");
	}
	
	/**
	 * Método que permite consultar la energía del personaje 
	 * */
	public void consultarEnergia() {
		System.out.println("A "+nombre+" todavía le quedan "+getEnergia()+"ptos de energía");
	}
	
	public int getEnergia() {
		return energia;
	}

	public void setMaxEnergia(int maxEnergia) throws IOException {
		while(maxEnergia<=0) {
			System.out.println("¡Eh, eh, eh!¡Espera! La energía máxima debe ser al menos 1. Vuelva a introducir dato");
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
			System.out.println("No es posible tener una energía negativa. Introduzca otro valor");
			maxEnergia=amadeus.controlaIntPositivo();
		}
		this.energia = maxEnergia;
	}
	
	

}
