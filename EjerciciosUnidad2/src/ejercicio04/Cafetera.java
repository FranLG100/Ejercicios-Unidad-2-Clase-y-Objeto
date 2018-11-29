package ejercicio04;

import java.io.IOException;

import utilesFran.Amadeus;

public class Cafetera {

	private Amadeus amadeus=new Amadeus();
	/**
	 * Atributo Capacidad Máxima de la Cafetera
	 */
	private int maxCapacidad;
	/**
	 * Atributo Capacidad Actual de la Cafetera
	 */
	private int actCapacidad;
	
	/**
	 * Constructor por defecto.
	 * Crea un objeto cafetera con capacidad máxima de 1000 y 0 de capacidad actual.
	 */
	public Cafetera() {
		maxCapacidad=1000;
		actCapacidad=0;
	}
	
	/**
	 * Constructor con un parámetro.
	 * Crea un objeto cafetera con capacidad máxima y llena.
	 * @param maxCapacidad Capacidad Máxima de la cafetera
	 * @throws IOException 
	 */
	public Cafetera(int maxCapacidad) throws IOException {
		if(maxCapacidad<0) {
			System.out.println("La capacidad de la cafetera no puede ser negativa. Introduzca otra");
			maxCapacidad=amadeus.controlaIntPositivo();
		}
		this.maxCapacidad=maxCapacidad;
		actCapacidad=maxCapacidad;
	}
	
	/**
	 * Constructor con dos parámetros.
	 * Crea un objeto cafetera con capacidad máxima y con capacidad actual.
	 * @param actCapacidad Capacidad Actual de la cafetera
	 * @throws IOException 
	 */
	public Cafetera(int maxCapacidad, int actCapacidad) throws IOException {
		if(maxCapacidad<0) {
			System.out.println("La capacidad de la cafetera no puede ser negativa. Introduzca otra");
			maxCapacidad=amadeus.controlaIntPositivo();
		}
		this.maxCapacidad=maxCapacidad;
		if(actCapacidad<0) {
			System.out.println("La cantidad de café no puede ser negativa. Introduzca otra");
			actCapacidad=amadeus.controlaIntPositivo();
		}
		if(actCapacidad>maxCapacidad) {
			actCapacidad=maxCapacidad;
			System.out.println("La Cafetera ha rebosado, pero está llena.");
		}
		this.actCapacidad=actCapacidad;
	}

	public double getMaxCapacidad() {
		return maxCapacidad;
	}

	public void setMaxCapacidad(int maxCapacidad) throws IOException {
		if(maxCapacidad<0) {
			System.out.println("La capacidad de la cafetera no puede ser negativa. Introduzca otra");
			maxCapacidad=amadeus.controlaIntPositivo();
		}
		this.maxCapacidad = maxCapacidad;
	}

	public double getActCapacidad() {
		return actCapacidad;
	}

	public void setActCapacidad(int actCapacidad) throws IOException {
		if(actCapacidad<0) {
			System.out.println("La cantidad de café no puede ser negativa. Introduzca otra");
			actCapacidad=amadeus.controlaIntPositivo();
		}
		if(actCapacidad>this.maxCapacidad) {
			actCapacidad=this.maxCapacidad;
			System.out.println("La cafetera ha rebosado, pero está llena.");
		}
		this.actCapacidad = actCapacidad;
	}
	
	/**
	 * Método para poner la capacidad actual de la cafetera al máximo.
	 */
	public void llenarCafetera() {
		System.out.println("Has llenado la cafetera");
		actCapacidad=maxCapacidad;
	}
	
	/**
	 * Método para retirar café de la cafetera.
	 * @param servir Cantidad de café que retiramos de la cafetera
	 * @throws IOException 
	 */
	public void servirTaza(int servir) throws IOException {
		if(servir<0) {
			System.out.println("No puede servirse una cantidad negativa. Introduzca otra");
			servir=amadeus.controlaInt();
		}
		if(actCapacidad==0)
			System.out.println("¡Lo siento, no queda ni una gota!");
		else if(servir>actCapacidad) {
			System.out.println("Lamentablemente, solo has podido echarte "+actCapacidad+", ya no queda más");
			actCapacidad=0;
		}else
			actCapacidad-=servir;
	}
	
	/**
	 * Método para poner la cantidad de café actual a 0
	 */
	public void vaciarCafetera() {
		System.out.println("Ha vaciado la cafetera");
		actCapacidad=0;
	}
	
	/**
	 * Método para agregar café a la cafetera
	 * @param cantidad Cantidad de café que agregamos a la cafetera
	 * @throws IOException 
	 */
	public void agregarCafe(int cantidad) throws IOException {
		if(cantidad<0) {
			System.out.println("No puede añadir una cantidad negativa. Introduzca otra");
			cantidad=amadeus.controlaInt();
		}
		actCapacidad+=cantidad;
		if(actCapacidad>maxCapacidad) {
			System.out.println("¡La cafetera va a rebosar!¡Está completamente llena!");
			actCapacidad=maxCapacidad;
		}
	}
	
	
}
