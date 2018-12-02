package ejercicio06;

import java.io.IOException;

import utilesFran.Amadeus;

public class Persona {

	protected Amadeus amadeus=new Amadeus();
	protected String nombre; //Nombre de la persona
	protected int edad; //Edad de la persona
	
	/**
	 * Constructor de la clase persona con dos parámetros
	 * @param nombre Nombre de la persona
	 * @param edad Edad (en años) de la persona
	 * @throws IOException 
	 * */
	public Persona(String nombre, int edad) throws IOException {
		this.nombre=amadeus.compruebaTexto(nombre);
		if(edad<0) {
			System.out.println("La edad no puede ser negativa, introduzca otra");
			edad=amadeus.controlaIntPositivo();
		}
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

	public void setNombre(String nombre) throws IOException {
		this.nombre = amadeus.compruebaTexto(nombre);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws IOException {
		if(edad<0) {
			System.out.println("La edad no puede ser negativa, introduzca otra");
			edad=amadeus.controlaIntPositivo();
		}
		this.edad = edad;
	}

	/**
	 * Método que devuelve los datos de la persona
	 * @return Ficha de la persona, en la cual se incluye nombre y edad
	 * */
	@Override
	public String toString() {
		return "Nombre: "+nombre
				+"\nEdad: "+edad;
	}
	
	
	
}
