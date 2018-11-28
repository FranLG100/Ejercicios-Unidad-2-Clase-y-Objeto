package ejercicio09;

public class Persona {

	protected String apellidos;
	protected String nombre;
	protected String sexo;
	protected int dni;
	
	/**
	 * Constructor de Persona, con cuatro parámetros
	 * @param apellidos Apellidos de la persona
	 * @param nombre Nombre de la persona
	 * @param sexo Género de la persona
	 * @param dni Número identificativo de la persona
	 * */
	public Persona(String apellidos, String nombre, String sexo, int dni) {
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.sexo = sexo;
		this.dni = dni;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	/**
	 * Método que devuelve la ficha de la persona
	 * @return Ficha completa de la persona, mostrando nombre, apellidos, sexo y dni
	 * */
	@Override
	public String toString() {
		return "Nombre: " + nombre +"\nApellidos: "+apellidos+"\nSexo: "+sexo+"\nDNI: "+dni;
	}
	
	
	
	
}
