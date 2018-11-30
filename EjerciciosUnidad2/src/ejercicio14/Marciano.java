package ejercicio14;

import java.io.IOException;

import utilesFran.Amadeus;

public class Marciano {

	private Amadeus amadeus=new Amadeus();
	private static int numMarcianos=0;
	private boolean vivo;
	private String nombre;
	
	/**
	 * Constructor por defecto de la clase marciano. Requiere un parámetro de entrada.
	 * Al crearlo, llama al método Nace();
	 * @param nombre Nombre del marciano
	 * */
	public Marciano(String nombre) throws IOException {
		this.nombre=amadeus.compruebaTexto(nombre);
		this.vivo=true;
		Nace();
	}
	
	/**
	 * El marciano saluda al nacer. Se incrementa el número de marcianos vivos en 1
	 * */
	public void Nace() {
		numMarcianos++;
		System.out.println("Hola, he nacido y soy el marciano "+nombre);
	}
	
	/**
	 * El marciano muere, decrementándose el número de marcianos vivos en 1. 
	 * Si ya está muerto, no podrá volver a morir.
	 * */
	public void Muere() {
		if(vivo) {
			System.out.println("El marciano "+nombre+" ha muerto");
			vivo=false;
			numMarcianos--;
		}else {
			System.out.println(nombre +" ya está muerto.");
		}
		
	}
	
	/**
	 * Comprueba si el marciano está vivo o muerto, imprimiendo su estado por pantalla
	 * */
	public void estaVivo() {
		if(vivo)
			System.out.println(nombre+" está vivo.");
		else
			System.out.println(nombre+" está muerto.");
	}
	
	/**
	 * Imprime por pantalla la cantidad de marcianos vivos hasta el momento
	 * */
	public void cuentaMarcianos() {
		System.out.println("Hay "+numMarcianos+" marcianos con vida.");
	}
}
