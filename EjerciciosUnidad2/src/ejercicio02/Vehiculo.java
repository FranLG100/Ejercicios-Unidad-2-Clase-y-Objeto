package ejercicio02;

import java.io.IOException;

import utilesFran.Amadeus;

public class Vehiculo {

	private Amadeus amadeus=new Amadeus();
	private String modelo;
	private double potencia;
	private boolean cRuedas;
	private String confirmacion;

	/**
	 * Constructor con un par�metros. Crea un objeto veh�culo con la marca del mismo establecida.
	 * @param modelo Modelo del veh�culo creado
	 */
	public Vehiculo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * M�todo que devuelve el modelo de Veh�culo
	 * @return Modelo del veh�culo creado
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * M�todo que establece el modelo de Veh�culo
	 * @param modelo Modelo del veh�culo
	 * @throws IOException 
	 */
	public void setModelo(String modelo) throws IOException {
		this.modelo = amadeus.compruebaTexto(modelo);
	}

	/**
	 * M�todo que devuelve la potencia de Veh�culo
	 * @return Potencia del veh�culo
	 */
	public double getPotencia() {
		return potencia;
	}

	/**
	 * M�todo que establece la potencia del Veh�culo
	 * @param potencia Potencia del veh�culo
	 * @throws IOException 
	 */
	public void setPotencia(double potencia) throws IOException {
		if(potencia<0) {
			System.out.println("La potencia no puede ser menor a 0");
			potencia=amadeus.controlaDoublePositivo();
		}
		this.potencia = potencia;
	}

	/**
	 * M�todo que devuelve si el veh�culo tiene o no tracci�n a las cuatro ruedas
	 * @return  <ul>
	 * 			<li>true: El Veh�culo tiene tracci�n a las cuatro ruedas
	 * 			<li>false: El Veh�culo no tiene tracci�n a las cuatro ruedas
	 * 			</ul>
	 */
	public boolean iscRuedas() {
		return cRuedas;
	}

	/**
	 * M�todo que establece si el veh�culo tiene o no tracci�n a las cuatro ruedas
	 * @param cRuedas Booleano que indica si el veh�culo tiene tracci�n o no a las cuatro ruedas
	 */
	public void setcRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
	}

	/**
	 * M�todo que devuelve los datos del veh�culo
	 * @return Ficha completa del veh�culo
	 */
	public String imprimirVehiculo() {
		if (cRuedas)
			confirmacion = "S�";
		else
			confirmacion = "No";
		return "Modelo: " + modelo + "\nPotencia:" + potencia + "\nTracci�n a las cuatro ruedas: " + confirmacion;
	}
	
	/**
	 * M�todo que devuelve si el veh�culo tiene o no tracci�n a las cuatro ruedas
	 * @return  <ul>
	 * 			<li>true: El Veh�culo tiene tracci�n a las cuatro ruedas
	 * 			<li>false: El Veh�culo no tiene tracci�n a las cuatro ruedas
	 * 			</ul>
	 */
	public boolean tieneTraccion() {
		return cRuedas;
	}

}
