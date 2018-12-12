package unidad2.ejercicio17;

import java.io.IOException;

public class Portatil extends Ordenador {
	
	private String marca;
	private int pantalla;
	private double peso;
	
	public Portatil() {
		
	}
	
	
	/**
	 * Constructor de Portatil con ocho parámetros
	 * @param ram Cantidad de memoria RAM del Portátil
	 * @param discoDuro Capacidad de memoria del Portátil
	 * @param procesador Marca del procesador del Portátil
	 * @param grafica Marca de la gráfica del Portátil
	 * @param precio Precio del Portátil
	 * @param marca Marca del Portátil
	 * @param pantalla Tamaño de la pantalla del Portátil
	 * @param peso Peso del Portátil
	 * */
	public Portatil(int ram, int discoDuro, String procesador, String grafica, double precio, String marca,
			int pantalla, double peso) throws IOException {
		super(ram, discoDuro, procesador, grafica, precio);
		this.marca = amadeus.compruebaTexto(marca);
		this.pantalla = pantalla;
		if(peso<0) {
			System.out.println("El peso no puede ser negativo");
			peso=amadeus.controlaDoublePositivo();
		}
		this.peso = peso;
	}



	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) throws IOException {
		this.marca = amadeus.compruebaTexto(marca);
	}

	public int getPantalla() {
		return pantalla;
	}

	public void setPantalla(int pantalla) {
		this.pantalla = pantalla;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) throws IOException {
		if(peso<0) {
			System.out.println("El peso no puede ser negativo");
			peso=amadeus.controlaDoublePositivo();
		}
		this.peso = peso;
	}
	
	/**
	 * Método que imprime los datos del portatil
	 * @return Ficha completa del portatil
	 * */
	@Override
	public String toString() {
		return super.toString()+"\nTamanho de la pantalla: "+pantalla
				+"\nMarca del portátil: "+marca
				+"\nPeso: "+peso;
	}
	

}
