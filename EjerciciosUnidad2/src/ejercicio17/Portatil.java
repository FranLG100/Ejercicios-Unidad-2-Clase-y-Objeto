package ejercicio17;

public class Portatil extends Ordenador {
	
	private String marca;
	private int pantalla;
	private double peso;
	
	public Portatil() {
		
	}
	
	

	public Portatil(int ram, int discoDuro, String procesador, String grafica, double precio, String marca,
			int pantalla, double peso) {
		super(ram, discoDuro, procesador, grafica, precio);
		this.marca = marca;
		this.pantalla = pantalla;
		this.peso = peso;
	}



	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nTamanho de la pantalla: "+pantalla
				+"\nMarca del portátil: "+marca
				+"\nPeso: "+peso;
	}
	

}
