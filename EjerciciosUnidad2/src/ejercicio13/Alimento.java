package ejercicio13;

import java.io.IOException;

import utilesFran.Amadeus;

public class Alimento {

	private Amadeus amadeus=new Amadeus();
	private String nombre;
	private int lipidos;
	private int hCarbono;
	private int proteinas;
	private boolean oAnimal;
	private String vitaminas;
	private String minerales;
	
	/**
	 * Constructor por defecto de Alimento, con un par�metro
	 * @param nombre Nombre del alimento
	 * @throws IOException 
	 * */
	public Alimento(String nombre) throws IOException {
		this.nombre=amadeus.compruebaTexto(nombre);
	}
	
	/**
	 * Constructor de Alimento, con siete par�metros de entrada
	 * @param nombre Nombre del alimento
	 * @param lipidos Porcentaje de l�pidos del alimento
	 * @param hCarbono Porcentaje de hidratos de carbono
	 * @param proteinas Porcentaje de prote�nas  del alimento
	 * @param oAnimal Si el alimento es o no de origen animal (booleano)
	 * @param vitaminas Nivel de vitaminas del alimento. A,M o B
	 * @param minerales Nivel de minerales del alimento. A,M o B
	 * @throws IOException 
	 * */
	public Alimento(String nombre, int lipidos, int hCarbono, int proteinas, boolean oAnimal, String vitaminas, String minerales) throws IOException {
		this.nombre=amadeus.compruebaTexto(nombre);
		this.setLipidos(lipidos);
		this.sethCarbono(hCarbono);
		this.setProteinas(proteinas);
		this.oAnimal = oAnimal;
		this.setVitaminas(vitaminas);
		this.setMinerales(minerales);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws IOException {
		this.nombre = amadeus.compruebaTexto(nombre);
	}

	/**
	 * Comprueba si el alimento es diet�tico (lipidos<20% y un nivel de vitaminas A o M)
	 * @return <ul>
	 * 			<li>true El alimento es diet�tico
	 * 			<li>false El alimento no es diet�tico
	 * 			</ul>
	 * */
	public boolean isDietetico() {
		return(lipidos<20 && !vitaminas.equalsIgnoreCase("b"));
	}
	
	/**
	 * Descripci�n del alimento
	 * @return Una descripci�n completa del alimento, incluyendo todos sus datos
	 * */
	public String descripcionAlimento() {
		return "Nombre: "+nombre+"\nL�pidos: "+lipidos+"\nHidratos de Carbono: "+hCarbono+"\nProte�nas: "+proteinas
				+"\nOrigen animal: "+(oAnimal?"S�":"No")+"\nContenido en vitaminas: "+vitaminas
				+"\nContenido en minerales: "+minerales+"\n�Es diet�tico?: "+(isDietetico()?"S�":"No")+"\n";
	}

	public int getLipidos() {
		return lipidos;
	}

	/**
	 * M�todo para establecer el porcentaje de l�pidos. Controla que no sobrepase el 100% al sumarse con los hidratos de carbono y las prote�nas
	 * @param lipidos Porcentaje de l�pidos a introducir
	 * */
	public void setLipidos(int lipidos) throws IOException {
		while((hCarbono+lipidos+proteinas)>100)  {
			System.out.println("El porcentaje del alimento no puede superar el 100%, vuelva a introducir un valor");
			lipidos=amadeus.controlaIntPositivo();
		}
		this.lipidos = lipidos;
	}

	public int gethCarbono() {
		return hCarbono;
	}

	/**
	 * M�todo para establecer el porcentaje de hidratos de carbono. Controla que no sobrepase el 100% al sumarse con los l�pidos y las prote�nas
	 * @param hCarobono Porcentaje de hidratos de carbono a introducir
	 * */
	public void sethCarbono(int hCarbono) throws IOException {
		while((hCarbono+lipidos+proteinas)>100)  {
			System.out.println("El porcentaje del alimento no puede superar el 100%, vuelva a introducir un valor");
			hCarbono=amadeus.controlaIntPositivo();
		}
		this.hCarbono = hCarbono;
	}

	public int getProteinas() {
		return proteinas;
	}

	/**
	 * M�todo para establecer el porcentaje de prote�nas. Controla que no sobrepase el 100% al sumarse con los hidratos de carbono y los l�pidos
	 * @param lipidos Porcentaje de prote�nas a introducir
	 * */
	public void setProteinas(int proteinas) throws IOException {
		while((hCarbono+lipidos+proteinas)>100) {
			System.out.println("El porcentaje del alimento no puede superar el 100%, vuelva a introducir un valor");
			proteinas=amadeus.controlaIntPositivo();
		}
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

	/**
	 * M�todo para establecer el valor de vitaminas. A,M o B
	 * @param vitaminas Nivel de vitaminas del alimento
	 * */
	public void setVitaminas(String vitaminas) throws IOException {
		boolean error=false;
		do {
			if (vitaminas.equalsIgnoreCase("a") || vitaminas.equalsIgnoreCase("m") || vitaminas.equalsIgnoreCase("b")) {
				error = false;
			} else {
				error = true;
				System.out.println("El valor de las vitaminas debe ser A, M o B. Vuelva a introducirlo.");
			}
			if(error)
				vitaminas = amadeus.recibeTexto();
		} while (error);
		this.vitaminas = vitaminas;
	}

	public String getMinerales() {
		return minerales;
	}

	/**
	 * M�todo para establecer el valor de minerales. A,M o B
	 * @param minerales Nivel de minerales del alimento
	 * */
	public void setMinerales(String minerales) throws IOException {
		boolean error=false;
		do {
			if (minerales.equalsIgnoreCase("a") || minerales.equalsIgnoreCase("m") || minerales.equalsIgnoreCase("b")) {
				error = false;
			} else {
				error = true;
				System.out.println("El valor de los minerales debe ser A, M o B. Vuelva a introducirlo.");
			}
			if(error)
				minerales = amadeus.recibeTexto();
		} while (error);
		this.minerales = minerales;
	}
	
	
		
}
