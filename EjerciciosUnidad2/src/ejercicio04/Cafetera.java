package ejercicio04;

public class Cafetera {

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
	 */
	public Cafetera(int maxCapacidad) {
		this.maxCapacidad=maxCapacidad;
		actCapacidad=maxCapacidad;
	}
	
	/**
	 * Constructor con dos parámetros.
	 * Crea un objeto cafetera con capacidad máxima y con capacidad actual.
	 * @param actCapacidad Capacidad Actual de la cafetera
	 */
	public Cafetera(int maxCapacidad, int actCapacidad) {
		this.maxCapacidad=maxCapacidad;
		if(actCapacidad>maxCapacidad) {
			actCapacidad=maxCapacidad;
			System.out.println("La Cafetera ha rebosado, pero está llena.");
		}
		this.actCapacidad=actCapacidad;
	}

	public double getMaxCapacidad() {
		return maxCapacidad;
	}

	public void setMaxCapacidad(int maxCapacidad) {
		this.maxCapacidad = maxCapacidad;
	}

	public double getActCapacidad() {
		return actCapacidad;
	}

	public void setActCapacidad(int actCapacidad) {
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
	 */
	public void servirTaza(int servir) {
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
	 */
	public void agregarCafe(int cantidad) {
		actCapacidad+=cantidad;
		if(actCapacidad>maxCapacidad) {
			System.out.println("¡La cafetera va a rebosar!¡Está completamente llena!");
			actCapacidad=maxCapacidad;
		}
	}
	
	
}
