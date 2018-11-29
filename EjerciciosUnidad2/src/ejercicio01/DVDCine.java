package ejercicio01;

import java.io.IOException;

import utilesFran.Amadeus;

public class DVDCine {

	/**
	 * <h2>Clase DVDCine. Se utiliza para crear fichas de películas.</h2>*/
	
	
	private Amadeus amadeus=new Amadeus();
	/**
	 * Atributo Título de la película (en español)
	 */
	private String titulo;
	/**
	 * Atributo Título original de la película
	 */
	private String tituloOriginal;
	/**
	 * Atributo Nombre del director/es de la película
	 */
	private String director;
	/**
	 * Atributo Reparto de actores de la película
	 */
	private String reparto;
	/**
	 * Atributo Género de la película
	 */
	private String genero;
	/**
	 * Atributo Duración de la película
	 */
	private int duracion;
	/**
	 * Atributo Descripción de la película
	 */
	private String descripcion;

	/**
	 * Constructor por defecto. Crea películas con los valores inicializados por defecto.
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
	 * Constructor con 7 parámetros. Crea la ficha de una película
	 * @param titulo Título de la película (en español)
	 * @param tituloOriginal Título original de la película
	 * @param director Nombre del director/es de la película
	 * @param reparto Reparto de actores de la película
	 * @param genero Género de la película
	 * @param duracion Duración de la película
	 * @param descripcion Descripción o breve sinopsis de la película
	 * @throws IOException 
	 */
	public DVDCine(String titulo, String tituloOriginal, String director, String reparto, String genero, int duracion, String descripcion) throws IOException {
		this.titulo=titulo;
		this.tituloOriginal=tituloOriginal;
		this.director=director;
		this.reparto=reparto;
		this.genero=genero;
		if(duracion<0) {
			System.out.println("La duración no puede ser menor a 0");
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
			System.out.println("La duración no puede ser menor a 0");
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
	 * Método que imprime por pantalla la ficha de la película
	 */
	public void muestraDVDCine() {
		System.out.println(titulo+" ("+tituloOriginal+")"+" de: "+director);
		System.out.println("Con: "+reparto);
		System.out.println(genero+" - "+duracion+"min");
		System.out.println("Resumen: "+descripcion);
	}
	
	/**
	 * Método que indica si una película pertecene al género 'Thriller'
	 * @return <ul>
	 * 			<li>true: La película tiene como género 'Thriller'
	 * 			<li>false: La película tiene como género otro distinto a 'Thriller'
	 * 			</ul>
	 */
	public boolean esThriller() {
		return genero.equalsIgnoreCase("thriller");
	}
	
	/**
	 * Método que indica si una película posee resumen o no
	 * @return <ul>
	 * 			<li>true: La película tiene resumen
	 * 			<li>false: La película no tiene resumen
	 * 			</ul>
	 */
	public boolean tieneResumen() {
		return !descripcion.isEmpty();
	}
	
	/**
	 * Método que indica la duración de la película en minutos
	 * @return duración en minutos de la película
	 */
	public String muestraDuracion() {
		return duracion+" min";
	}
}
