package ejercicio17;

public class Ordenador {

	protected int ram;
	protected int discoDuro;
	protected String procesador;
	protected String grafica;
	protected double precio;
	
	public Ordenador() {
		
	}
	

	public Ordenador(int ram, int discoDuro, String procesador, String grafica, double precio) {
		super();
		this.ram = ram;
		this.discoDuro = discoDuro;
		this.procesador = procesador;
		this.grafica = grafica;
		this.precio = precio;
	}



	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
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

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getGrafica() {
		return grafica;
	}

	public void setGrafica(String grafica) {
		this.grafica = grafica;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Memoria Ram: "+ram
				+"\nCapacidad de Disco Duro: "+discoDuro
				+"\nMarca del procesador: "+procesador
				+"\nMarca de la gráfica: "+grafica
				+"\nPrecio: "+precio;
	}
	
	
	
	
	
}
