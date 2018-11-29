package ejercicio06;

import java.io.IOException;

public class Empleado extends Persona {

	private double sueldo;

	
	
	
	/**
	 * Constructor de la clase empleado por defecto
	 * */
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructor de la clase empleado con tres parámetros
	 * @param nombre Nombre del empleado
	 * @param edad Edad (en años) del empleado
	 * @param sueldo Sueldo que percibe el empleado
	 * @throws IOException 
	 * */
	public Empleado(String nombre, int edad, double sueldo) throws IOException {
		super(nombre, edad);
		this.sueldo=sueldo;
		// TODO Auto-generated constructor stub
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) throws IOException {
		if(sueldo<0) {
			System.out.println("El sueldo no debe ser negativo, introduzca otro");
			sueldo=amadeus.controlaDoublePositivo();
		}
		this.sueldo = sueldo;
	}
	
	
	
	/**
	 * Método que devuelve los datos del empleado
	 * @return Ficha del empleado, en la cual se incluye nombre, edad y sueldo
	 * */
	@Override
	public String toString() {
		return super.toString()+"\nSueldo: "+sueldo;
	}


	

	

}
