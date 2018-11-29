package ejercicio01;

import java.io.IOException;

import utilesFran.Amadeus;

public class DVDCine {

	/**
	 * <h2>Clase DVDCine. Se utiliza para crear fichas de pel�culas.</h2>*/
	
	
	private Amadeus amadeus=new Amadeus();
	/**
	 * Atributo T�tulo de la pel�cula (en espa�ol)
	 */
	private String titulo;
	/**
	 * Atributo T�tulo original de la pel�cula
	 */
	private String tituloOriginal;
	/**
	 * Atributo Nombre del director/es de la pel�cula
	 */
	private String director;
	/**
	 * Atributo Reparto de actores de la pel�cula
	 */
	private String reparto;
	/**
	 * Atributo G�nero de la pel�cula
	 */
	private String genero;
	/**
	 * Atributo Duraci�n de la pel�cula
	 */
	private int duracion;
	/**
	 * Atributo Descripci�n de la pel�cula
	 */
	private String descripcion;

	/**
	 * Constructor por defecto. Crea pel�culas con los valores inicializados por defecto.
	 */
	public DVDCine() {
		titulo = "Amadeus";
		tituloOriginal = "Amadeus";
		director = "Milos Forman";
		reparto = "Murray Abraham y Tom Hulce";
		genero = "Drama";
		duracion = 161;
		descripcion = "";
	}
	
	/**
	 * Constructor con 7 par�metros. Crea la ficha de una pel�cula
	 * @param titulo T�tulo de la pel�cula (en espa�ol)
	 * @param tituloOriginal T�tulo original de la pel�cula
	 * @param director Nombre del director/es de la pel�cula
	 * @param reparto Reparto de actores de la pel�cula
	 * @param genero G�nero de la pel�cula
	 * @param duracion Duraci�n de la pel�cula
	 * @param descripcion Descripci�n o breve sinopsis de la pel�cula
	 * @throws IOException 
	 */
	public DVDCine(String titulo, String tituloOriginal, String director, String reparto, String genero, int duracion, String descripcion) throws IOException {
		this.titulo=titulo;
		this.tituloOriginal=tituloOriginal;
		this.director=director;
		this.reparto=reparto;
		this.genero=genero;
		if(duracion<0) {
			System.out.println("La duraci�n no puede ser menor a 0");
			duracion=amadeus.controlaIntPositivo();
		}
		this.duracion=duracion;
		this.descripcion=descripcion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) throws IOException {
		this.titulo = amadeus.compruebaTexto(titulo);
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) throws IOException {
		this.tituloOriginal = amadeus.compruebaTexto(tituloOriginal);
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) throws IOException {
		this.director = amadeus.compruebaTexto(director);
	}

	public String getReparto() {
		return reparto;
	}

	public void setReparto(String reparto) throws IOException {
		this.reparto = amadeus.compruebaTexto(reparto);
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) throws IOException {
		this.genero = amadeus.compruebaTexto(genero);
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) throws IOException {
		if(duracion<0) {
			System.out.println("La duraci�n no puede ser menor a 0");
			duracion=amadeus.controlaIntPositivo();
		}
		this.duracion = duracion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * M�todo que imprime por pantalla la ficha de la pel�cula
	 */
	public void muestraDVDCine() {
		System.out.println(titulo+" ("+tituloOriginal+")"+" de: "+director);
		System.out.println("Con: "+reparto);
		System.out.println(genero+" - "+duracion+"min");
		System.out.println("Resumen: "+descripcion);
	}
	
	/**
	 * M�todo que indica si una pel�cula pertecene al g�nero 'Thriller'
	 * @return <ul>
	 * 			<li>true: La pel�cula tiene como g�nero 'Thriller'
	 * 			<li>false: La pel�cula tiene como g�nero otro distinto a 'Thriller'
	 * 			</ul>
	 */
	public boolean esThriller() {
		return genero.equalsIgnoreCase("thriller");
	}
	
	/**
	 * M�todo que indica si una pel�cula posee resumen o no
	 * @return <ul>
	 * 			<li>true: La pel�cula tiene resumen
	 * 			<li>false: La pel�cula no tiene resumen
	 * 			</ul>
	 */
	public boolean tieneResumen() {
		return !descripcion.isEmpty();
	}
	
	/**
	 * M�todo que indica la duraci�n de la pel�cula en minutos
	 * @return duraci�n en minutos de la pel�cula
	 */
	public String muestraDuracion() {
		return duracion+" min";
	}
}
