package ejercicio06;

public class Obra {

	private String titulo;
	private int numInventario;
	private Artista autor;
	private int anyo;
	
	public Obra() {}
	
	
	/**
	 * Constructor de una Obra
	 * @param titulo T�tulo de la obra
	 * @param numInventario N�mero de inventario de la Obra
	 * @param autor Autor de la Obra
	 * @param anyo A�o de la obra
	 * */
	public Obra(String titulo, int numInventario, Artista autor, int anyo) {
		super();
		this.titulo = titulo;
		this.numInventario = numInventario;
		this.autor = autor;
		this.anyo = anyo;
	}


	@Override
	public String toString() {
		return "\nT�tulo: "+titulo+"\nC�digo de Inventario: "+numInventario+"\nAutor: "+autor.getNombre()+"\nA�o: "+anyo;
	}


	/**
	 * M�todo que compara la obra con otra obra, dadas unas caracter�sticas
	 * @param obra Obra con la cual comparar esta obra
	 * @return <ul><li>true - Si ambas obras tienen las mismas caracter�sticas</li><li>false - Si no las tienen</li></ul>
	 * */
	public boolean equalsObra(Obra obra) {
		if(this.titulo.equalsIgnoreCase(obra.getTitulo()) && this.autor.getNombre().equalsIgnoreCase(obra.getAutor().getNombre()) && this.anyo==obra.anyo)
			return true;
		else
			return false;
	}

	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public int getNumInventario() {
		return numInventario;
	}



	public void setNumInventario(int numInventario) {
		this.numInventario = numInventario;
	}



	public Artista getAutor() {
		return autor;
	}



	public void setAutor(Artista autor) {
		this.autor = autor;
	}



	public int getAnyo() {
		return anyo;
	}



	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	
}
