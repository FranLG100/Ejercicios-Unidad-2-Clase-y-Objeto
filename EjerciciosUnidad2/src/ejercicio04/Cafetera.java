package ejercicio04;

public class Cafetera {

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
	 */
	public Cafetera(int maxCapacidad) {
		this.maxCapacidad=maxCapacidad;
		actCapacidad=maxCapacidad;
	}
	
	/**
	 * Constructor con dos par�metros.
	 * Crea un objeto cafetera con capacidad m�xima y con capacidad actual.
	 * @param actCapacidad Capacidad Actual de la cafetera
	 */
	public Cafetera(int maxCapacidad, int actCapacidad) {
		this.maxCapacidad=maxCapacidad;
		if(actCapacidad>maxCapacidad) {
			actCapacidad=maxCapacidad;
			System.out.println("La Cafetera ha rebosado, pero est� llena.");
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
	 */
	public void servirTaza(int servir) {
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
	 */
	public void agregarCafe(int cantidad) {
		actCapacidad+=cantidad;
		if(actCapacidad>maxCapacidad) {
			System.out.println("�La cafetera va a rebosar!�Est� completamente llena!");
			actCapacidad=maxCapacidad;
		}
	}
	
	
}
