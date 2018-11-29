package ejercicio09;

import java.io.IOException;

import utilesFran.Amadeus;

public class Persona {

	protected Amadeus amadeus=new Amadeus();
	protected String apellidos;
	protected String nombre;
	protected String sexo;
	protected int dni;
	
	/**
	 * Constructor de Persona, con cuatro par�metros
	 * @param apellidos Apellidos de la persona
	 * @param nombre Nombre de la persona
	 * @param sexo G�nero de la persona
	 * @param dni N�mero identificativo de la persona
	 * @throws IOException 
	 * */
	public Persona(String apellidos, String nombre, String sexo, int dni) throws IOException {
		this.apellidos = amadeus.compruebaTexto(apellidos);
		this.nombre = amadeus.compruebaTexto(nombre);
		this.sexo = amadeus.compruebaTexto(sexo);
		if(dni<0) {
			System.out.println("El DNI no puede ser negativo, vu�lvalo a introducir");
			dni=amadeus.controlaIntPositivo();
		}
		this.dni = dni;
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
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) throws IOException {
		if(dni<0) {
			System.out.println("El DNI no puede ser negativo, vu�lvalo a introducir");
			dni=amadeus.controlaIntPositivo();
		}
		this.dni = dni;
	}
	
	/**
	 * M�todo que devuelve la ficha de la persona
	 * @return Ficha completa de la persona, mostrando nombre, apellidos, sexo y dni
	 * */
	@Override
	public String toString() {
		return "Nombre: " + nombre +"\nApellidos: "+apellidos+"\nSexo: "+sexo+"\nDNI: "+dni;
	}
	
	
	
	
}
