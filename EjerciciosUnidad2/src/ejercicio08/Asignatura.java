package ejercicio08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utilesFran.Amadeus;

public class Asignatura {
	
	private String nombre; //Nombre de la Asignatura
	private double nota; //Nota de la asignatura
	private Amadeus amadeus=new Amadeus();
	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	
	
	/**
	 * Constructor vac�o de Asignatura  
	 * */
	public Asignatura() throws NumberFormatException, IOException {

	}
	/**
	 * Constructor de Asignatura con un nombre y una nota asignadas
	 * @param nombre Nombre de la asignatura
	 * @param nota Nota/Calificaci�n que ha obtenido la asignatura, entre 0 y 10
	 * */
	public Asignatura(String nombre, double nota) throws NumberFormatException, IOException {
		this.nombre=amadeus.compruebaTexto(nombre);
		while(nota<0||nota>10) {
			System.out.println("Introduzca una nota v�lida para la asignatura "+this.nombre);
			nota=amadeus.controlaDoublePositivo();
		}
		this.nota=nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws IOException {
		this.nombre = amadeus.compruebaTexto(nombre);
	}

	public double getNota() {
		return nota;
	}

	/**
	 * M�todo para establecer la nota de una asignatura.
	 * A su vez, controla que esa nota est� entre 0 y 10
	 * @param nota Nota de la asignatura (entre 0 y 10)
	 * */
	public void setNota(double nota) throws IOException {
		while(nota<0||nota>10) {
			System.out.println("Introduzca una nota v�lida para la asignatura "+this.nombre);
			nota=amadeus.controlaDoublePositivo();
		}
		this.nota = nota;
	}
	
	
	/**
	 * M�todo que devuelve el estado de la asignatura
	 * @return <ul>
	 * 				<li>Si la nota es mayor o igual a 5: La asignatura est� aprobada
	 * 				<li>Si la nota es menor a 5: La asignatura est� suspensa
	 * 			</ul>
	 * */
	public String estadoAsignatura() {
		if(nota>=5)
			return "La Asignatura "+nombre+" est� aprobada";
		else
			return "La Asignatura "+nombre+" est� suspensa";
	}
	
	
	
	

}
