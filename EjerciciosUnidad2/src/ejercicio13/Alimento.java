package ejercicio13;

public class Alimento {

	private int lipidos;
	private int hCarbono;
	private int proteinas;
	private boolean oAnimal;
	private String vitaminas;
	private String minerales;
	
	/**
	 * Constructor vacío de Alimento
	 * */
	public Alimento() {}
	
	/**
	 * Constructor de Alimento, con seis parámetros de entrada
	 * @param lipidos Porcentaje de lípidos del alimento
	 * @param hCarbono Porcentaje de hidratos de carbono
	 * @param proteinas Porcentaje de proteínas  del alimento
	 * */
	public Alimento(int lipidos, int hCarbono, int proteinas, boolean oAnimal, String vitaminas, String minerales) {
		super();
		this.lipidos = lipidos;
		this.hCarbono = hCarbono;
		this.proteinas = proteinas;
		this.oAnimal = oAnimal;
		this.vitaminas = vitaminas;
		this.minerales = minerales;
	}

	public boolean isDietetico() {
		return(lipidos<20 && !vitaminas.equalsIgnoreCase("b"));
	}
	
	public String descripcionAlimento() {
		return "Lípidos: "+lipidos+"\nHidratos de Carbono: "+hCarbono+"\nProteínas: "+proteinas
				+"\nOrigen animal: "+(oAnimal?"Sí":"No")+"\nContenido en vitaminas: "+vitaminas
				+"\nContenido en minerales: "+minerales+"\n¿Es dietético?: "+(isDietetico()?"Sí":"No")+"\n";
	}

	public int getLipidos() {
		return lipidos;
	}

	public void setLipidos(int lipidos) {
		this.lipidos = lipidos;
	}

	public int gethCarbono() {
		return hCarbono;
	}

	public void sethCarbono(int hCarbono) {
		this.hCarbono = hCarbono;
	}

	public int getProteinas() {
		return proteinas;
	}

	public void setProteinas(int proteinas) {
		this.proteinas = proteinas;
	}

	public boolean isoAnimal() {
		return oAnimal;
	}

	public void setoAnimal(boolean oAnimal) {
		this.oAnimal = oAnimal;
	}

	public String getVitaminas() {
		return vitaminas;
	}

	public void setVitaminas(String vitaminas) {
		this.vitaminas = vitaminas;
	}

	public String getMinerales() {
		return minerales;
	}

	public void setMinerales(String minerales) {
		this.minerales = minerales;
	}
	
	
		
}
