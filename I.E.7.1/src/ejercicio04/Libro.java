package ejercicio04;

public class Libro extends Publicacion implements Prestable {

	private boolean prestado=false;
	
	
	public Libro(int codigo, String titulo, int anho) {
		super(codigo, titulo, anho);
	}
	
	@Override
	public String toString() {
		return "\nTipo de publicaci�n: Libro"+super.toString()+"\nDisponible: "+(prestado?"No":"S�");
	}

	/**
	 * M�todo que presta el libro
	 * */
	@Override
	public void prestar() {
		this.prestado=true;
		
	}

	/**
	 * M�todo que devuelve el libro (el cual estaba prestado)
	 * */
	@Override
	public void devolver() {
		this.prestado=false;
		
	}

	/**
	 * M�todo que informa sobre el estado del libro
	 * @return <ul><li>true - El libro est� prestado</li><li>false - El libro est� disponible</li></ul>
	 * */
	@Override
	public Boolean prestado() {
		return prestado;
	}

	
	
	

}
