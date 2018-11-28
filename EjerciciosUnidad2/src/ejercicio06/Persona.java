package ejercicio06;

public class Persona {

	protected String nombre;
	protected int edad;
	
	/**
	 * Constructor de la clase persona con dos par�metros
	 * @param nombre Nombre de la persona
	 * @param edad Edad (en a�os) de la persona
	 * */
	public Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	/**
	 * Constructor de la clase persona por defecto
	 * */
	public Persona() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * M�todo que devuelve los datos de la persona
	 * @return Ficha de la persona, en la cual se incluye nombre y edad
	 * */
	@Override
	public String toString() {
		return "Nombre: "+nombre
				+"\nEdad: "+edad;
	}
	
	
	
}
