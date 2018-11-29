package ejercicio04;

import java.io.IOException;

import utilesFran.Amadeus;

public class Cafetera {

	private Amadeus amadeus=new Amadeus();
	/**
	 * Atributo Capacidad M�xima de la Cafetera
	 */
	private int maxCapacidad;
	/**
	 * Atributo Capacidad Actual de la Cafetera
	 */
	private int actCapacidad;
	
	/**
	 * Constructor por defecto.
	 * Crea un objeto cafetera con capacidad m�xima de 1000 y 0 de capacidad actual.
	 */
	public Cafetera() {
		maxCapacidad=1000;
		actCapacidad=0;
	}
	
	/**
	 * Constructor con un par�metro.
	 * Crea un objeto cafetera con capacidad m�xima y llena.
	 * @param maxCapacidad Capacidad M�xima de la cafetera
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
	 * Constructor con dos par�metros.
	 * Crea un objeto cafetera con capacidad m�xima y con capacidad actual.
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
			System.out.println("La cantidad de caf� no puede ser negativa. Introduzca otra");
			actCapacidad=amadeus.controlaIntPositivo();
		}
		if(actCapacidad>maxCapacidad) {
			actCapacidad=maxCapacidad;
			System.out.println("La Cafetera ha rebosado, pero est� llena.");
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
			System.out.println("La cantidad de caf� no puede ser negativa. Introduzca otra");
			actCapacidad=amadeus.controlaIntPositivo();
		}
		if(actCapacidad>this.maxCapacidad) {
			actCapacidad=this.maxCapacidad;
			System.out.println("La cafetera ha rebosado, pero est� llena.");
		}
		this.actCapacidad = actCapacidad;
	}
	
	/**
	 * M�todo para poner la capacidad actual de la cafetera al m�ximo.
	 */
	public void llenarCafetera() {
		System.out.println("Has llenado la cafetera");
		actCapacidad=maxCapacidad;
	}
	
	/**
	 * M�todo para retirar caf� de la cafetera.
	 * @param servir Cantidad de caf� que retiramos de la cafetera
	 * @throws IOException 
	 */
	public void servirTaza(int servir) throws IOException {
		if(servir<0) {
			System.out.println("No puede servirse una cantidad negativa. Introduzca otra");
			servir=amadeus.controlaInt();
		}
		if(actCapacidad==0)
			System.out.println("�Lo siento, no queda ni una gota!");
		else if(servir>actCapacidad) {
			System.out.println("Lamentablemente, solo has podido echarte "+actCapacidad+", ya no queda m�s");
			actCapacidad=0;
		}else
			actCapacidad-=servir;
	}
	
	/**
	 * M�todo para poner la cantidad de caf� actual a 0
	 */
	public void vaciarCafetera() {
		System.out.println("Ha vaciado la cafetera");
		actCapacidad=0;
	}
	
	/**
	 * M�todo para agregar caf� a la cafetera
	 * @param cantidad Cantidad de caf� que agregamos a la cafetera
	 * @throws IOException 
	 */
	public void agregarCafe(int cantidad) throws IOException {
		if(cantidad<0) {
			System.out.println("No puede a�adir una cantidad negativa. Introduzca otra");
			cantidad=amadeus.controlaInt();
		}
		actCapacidad+=cantidad;
		if(actCapacidad>maxCapacidad) {
			System.out.println("�La cafetera va a rebosar!�Est� completamente llena!");
			actCapacidad=maxCapacidad;
		}
	}
	
	
}
