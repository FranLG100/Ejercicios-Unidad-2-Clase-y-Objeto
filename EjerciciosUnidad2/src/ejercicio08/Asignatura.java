package ejercicio08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utilesFran.Amadeus;

public class Asignatura {
	
	private String nombre;
	private double nota;
	private Amadeus amadeus=new Amadeus();
	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	
	
	/**
	 * Constructor vacío de Asignatura  
	 * */
	public Asignatura() throws NumberFormatException, IOException {

	}
	/**
	 * Constructor de Asignatura con un nombre y una nota asignadas
	 * @param nombre Nombre de la asignatura
	 * @param nota Nota/Calificación que ha obtenido la asignatura, entre 0 y 10
	 * */
	public Asignatura(String nombre, double nota) throws NumberFormatException, IOException {
		this.nombre=nombre;
		this.nota=nota;
		while(this.nota<0||this.nota>10) {
			System.out.println("Introduzca una nota válida para la asignatura "+this.nombre);
			this.nota=amadeus.controlaDoublePositivo();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	/**
	 * Método para establecer la nota de una asignatura.
	 * A su vez, controla que esa nota esté entre 0 y 10
	 * @param nota Nota de la asignatura (entre 0 y 10)
	 * */
	public void setNota(double nota) throws IOException {
		while(nota<0||nota>10) {
			System.out.println("Introduzca una nota válida para la asignatura "+this.nombre);
			nota=amadeus.controlaDoublePositivo();
		}
		this.nota = nota;
	}
	
	
	/**
	 * Método que devuelve el estado de la asignatura
	 * @return <ul>
	 * 				<li>Si la nota es mayor o igual a 5: La asignatura está aprobada
	 * 				<li>Si la nota es menor a 5: La asignatura está suspensa
	 * 			</ul>
	 * */
	public String estadoAsignatura() {
		if(nota>=5)
			return "La Asignatura "+nombre+" está aprobada";
		else
			return "La Asignatura "+nombre+" está suspensa";
	}
	
	
	
	

}
