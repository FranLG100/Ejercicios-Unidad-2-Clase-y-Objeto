package ejercicio02;

public class Vehiculo {

	private String modelo;
	private double potencia;
	private boolean cRuedas;
	private String confirmacion;

	/**
	 * Constructor con un parámetros. Crea un objeto vehículo con la marca del mismo establecida.
	 * @param modelo Modelo del vehículo creado
	 */
	public Vehiculo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Método que devuelve el modelo de Vehículo
	 * @return Modelo del vehículo creado
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Método que establece el modelo de Vehículo
	 * @param modelo Modelo del vehículo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Método que devuelve la potencia de Vehículo
	 * @return Potencia del vehículo
	 */
	public double getPotencia() {
		return potencia;
	}

	/**
	 * Método que establece la potencia del Vehículo
	 * @param potencia Potencia del vehículo
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	/**
	 * Método que devuelve si el vehículo tiene o no tracción a las cuatro ruedas
	 * @return  <ul>
	 * 			<li>true: El Vehículo tiene tracción a las cuatro ruedas
	 * 			<li>false: El Vehículo no tiene tracción a las cuatro ruedas
	 * 			</ul>
	 */
	public boolean iscRuedas() {
		return cRuedas;
	}

	/**
	 * Método que establece si el vehículo tiene o no tracción a las cuatro ruedas
	 * @param cRuedas Booleano que indica si el vehículo tiene tracción o no a las cuatro ruedas
	 */
	public void setcRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
	}

	/**
	 * Método que devuelve los datos del vehículo
	 * @return Ficha completa del vehículo
	 */
	public String imprimirVehiculo() {
		if (cRuedas)
			confirmacion = "Sí";
		else
			confirmacion = "No";
		return "Modelo: " + modelo + "\nPotencia:" + potencia + "\nTracción a las cuatro ruedas: " + confirmacion;
	}
	
	/**
	 * Método que devuelve si el vehículo tiene o no tracción a las cuatro ruedas
	 * @return  <ul>
	 * 			<li>true: El Vehículo tiene tracción a las cuatro ruedas
	 * 			<li>false: El Vehículo no tiene tracción a las cuatro ruedas
	 * 			</ul>
	 */
	public boolean tieneTraccion() {
		return cRuedas;
	}

}
