package ejercicio17;

import java.io.IOException;

public class Portatil extends Ordenador {
	
	private String marca;
	private int pantalla;
	private double peso;
	
	public Portatil() {
		
	}
	
	
	/**
	 * Constructor de Portatil con ocho par�metros
	 * @param ram Cantidad de memoria RAM del Port�til
	 * @param discoDuro Capacidad de memoria del Port�til
	 * @param procesador Marca del procesador del Port�til
	 * @param grafica Marca de la gr�fica del Port�til
	 * @param precio Precio del Port�til
	 * @param marca Marca del Port�til
	 * @param pantalla Tama�o de la pantalla del Port�til
	 * @param peso Peso del Port�til
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
	 * M�todo que imprime los datos del portatil
	 * @return Ficha completa del portatil
	 * */
	@Override
	public String toString() {
		return super.toString()+"\nTamanho de la pantalla: "+pantalla
				+"\nMarca del port�til: "+marca
				+"\nPeso: "+peso;
	}
	

}
