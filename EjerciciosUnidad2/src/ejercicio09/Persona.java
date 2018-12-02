package ejercicio09;

import java.io.IOException;

import utilesFran.Amadeus;

public class Persona {

	protected Amadeus amadeus=new Amadeus();
	protected String apellidos; //Apellidos de la persona
	protected String nombre; //Nombre de la persona
	protected String sexo; //Género de la persona
	protected String dni; //DNI de la persona
	
	/**
	 * Constructor de Persona, con cuatro parámetros
	 * @param apellidos Apellidos de la persona
	 * @param nombre Nombre de la persona
	 * @param sexo Género de la persona
	 * @param dni Número identificativo de la persona
	 * @throws IOException 
	 * */
	public Persona(String apellidos, String nombre, String sexo, String dni) throws IOException {
		this.apellidos = amadeus.compruebaTexto(apellidos);
		this.nombre = amadeus.compruebaTexto(nombre);
		this.sexo = amadeus.compruebaTexto(sexo);
		this.dni = amadeus.compruebaNIF(dni);
	}
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) throws IOException {
		this.apellidos = amadeus.compruebaTexto(apellidos);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) throws IOException {
		this.nombre = amadeus.compruebaTexto(nombre);
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) throws IOException {
		this.sexo = amadeus.compruebaTexto(sexo);
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) throws IOException {
		this.dni = amadeus.compruebaNIF(dni);
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
