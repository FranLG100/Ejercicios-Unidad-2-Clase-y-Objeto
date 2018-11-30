package ejercicio17;

import java.io.IOException;

import utilesFran.Amadeus;

public class Ordenador {

	protected Amadeus amadeus=new Amadeus();
	protected int ram;
	protected int discoDuro;
	protected String procesador;
	protected String grafica;
	protected double precio;
	
	public Ordenador() {
		
	}
	

	/**
	 * Constructor de Ordenador con cinco parámetros
	 * @param ram Cantidad de memoria RAM del ordenador
	 * @param discoDuro Capacidad de memoria del PC
	 * @param procesador Marca del procesador del PC
	 * @param grafica Marca de la gráfica del PC
	 * @param precio Precio del PC
	 * */
	public Ordenador(int ram, int discoDuro, String procesador, String grafica, double precio) throws IOException {
		if(ram<0) {
			System.out.println("La RAM no puede ser negativa. Introduzcalo de nuevo");
			ram=amadeus.controlaIntPositivo();
		}
		this.ram = ram;
		if(discoDuro<0) {
			System.out.println("El Disco duro no puede ser negativo. Introduzcalo de nuevo");
			discoDuro=amadeus.controlaIntPositivo();
		}
		this.discoDuro = discoDuro;
		this.procesador = amadeus.compruebaTexto(procesador);
		this.grafica = amadeus.compruebaTexto(grafica);
		if(precio<0) {
			System.out.println("El precio no puede ser negativo. Introduzcalo de nuevo");
			precio=amadeus.controlaDoublePositivo();
			}
	}



	public int getRam() {
		return ram;
	}

	public void setRam(int ram) throws IOException {
		if(ram<0) {
			System.out.println("La RAM no puede ser negativa. Introduzcalo de nuevo");
			ram=amadeus.controlaIntPositivo();
		}
		this.ram = ram;
	}

	public int getDiscoDuro() {
		return discoDuro;
	}

	public void setDiscoDuro(int discoDuro) {
		this.discoDuro = discoDuro;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) throws IOException {
		this.procesador = amadeus.compruebaTexto(procesador);
	}

	public String getGrafica() {
		return grafica;
	}

	public void setGrafica(String grafica) throws IOException {
		this.grafica = amadeus.compruebaTexto(grafica);
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	/**
	 * Método que imprime los datos del ordenador
	 * @return Ficha completa del ordenador
	 * */
	@Override
	public String toString() {
		return "Memoria Ram: "+ram
				+"\nCapacidad de Disco Duro: "+discoDuro
				+"\nMarca del procesador: "+procesador
				+"\nMarca de la gráfica: "+grafica
				+"\nPrecio: "+precio;
	}
	
	
	
	
	
}
