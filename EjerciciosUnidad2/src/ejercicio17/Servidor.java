package ejercicio17;

import java.io.IOException;

public class Servidor extends Ordenador{
	
	private int monitor;
	private String teclado;
	private String raton;
	
	public Servidor() {
		
	}
	
	
	/**
	 * Constructor de Portatil con ocho parámetros
	 * @param ram Cantidad de memoria RAM del Servidor
	 * @param discoDuro Capacidad de memoria del Servidor
	 * @param procesador Marca del procesador del Servidor
	 * @param grafica Marca de la gráfica del Servidor
	 * @param precio Precio del Servidor
	 * @param monitor Tamaño de la pantalla del Servidor
	 * @param teclado Modelo del teclado del Servidor
	 * @param raton Modelo del ratón del Servidor
	 * */
	public Servidor(int ram, int discoDuro, String procesador, String grafica, double precio, int monitor, String teclado, String raton) throws IOException {
		super(ram, discoDuro, procesador, grafica, precio);
		this.monitor=monitor;
		this.teclado=teclado;
		this.raton=raton;
	}
	

	public int getMonitor() {
		return monitor;
	}

	public void setMonitor(int monitor) {
		this.monitor = monitor;
	}

	public String getTeclado() {
		return teclado;
	}

	public void setTeclado(String teclado) throws IOException {
		this.teclado = amadeus.compruebaTexto(teclado);
	}

	public String getRaton() {
		return raton;
	}

	public void setRaton(String raton) throws IOException {
		this.raton = amadeus.compruebaTexto(raton);
	}



	/**
	 * Método que imprime los datos del portatil
	 * @return Ficha completa del servidor
	 * */
	@Override
	public String toString() {
		return super.toString()+"\nTamanho del monitor: "+monitor
				+"\nTipo de teclado: "+teclado
				+"\nTipo de ratón: "+raton;
	}
	
	
	
	

}
