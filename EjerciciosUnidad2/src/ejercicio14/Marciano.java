package ejercicio14;

import java.io.IOException;

import utilesFran.Amadeus;

public class Marciano {

	private Amadeus amadeus=new Amadeus();
	private static int numMarcianos=0; //Para llevar la cuenta de marcianos
	private boolean vivo; //Si el marciano est� vivo o no
	private String nombre; //Nombre del Marciano
	
	/**
	 * Constructor por defecto de la clase marciano. Requiere un par�metro de entrada.
	 * Al crearlo, llama al m�todo Nace();
	 * @param nombre Nombre del marciano
	 * */
	public Marciano(String nombre) throws IOException {
		this.nombre=amadeus.compruebaTexto(nombre);
		this.vivo=true;
		Nace();
	}
	
	/**
	 * El marciano saluda al nacer. Se incrementa el n�mero de marcianos vivos en 1
	 * */
	public void Nace() {
		numMarcianos++;
		System.out.println("Hola, he nacido y soy el marciano "+nombre);
	}
	
	/**
	 * El marciano muere, decrement�ndose el n�mero de marcianos vivos en 1. 
	 * Si ya est� muerto, no podr� volver a morir.
	 * */
	public void Muere() {
		if(vivo) {
			System.out.println("El marciano "+nombre+" ha muerto");
			vivo=false;
			numMarcianos--;
		}else {
			System.out.println(nombre +" ya est� muerto.");
		}
		
	}
	
	/**
	 * Comprueba si el marciano est� vivo o muerto, imprimiendo su estado por pantalla
	 * */
	public void estaVivo() {
		if(vivo)
			System.out.println(nombre+" est� vivo.");
		else
			System.out.println(nombre+" est� muerto.");
	}
	
	/**
	 * Imprime por pantalla la cantidad de marcianos vivos hasta el momento
	 * */
	public void cuentaMarcianos() {
		System.out.println("Hay "+numMarcianos+" marcianos con vida.");
	}
}
