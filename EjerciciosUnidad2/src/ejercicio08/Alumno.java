package ejercicio08;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import utilesFran.Amadeus;

public class Alumno {
	
	private Amadeus amadeus=new Amadeus();
	private String nombreAlumno; //Nombre del Alumno
	private int edad; //Edad del alumno
	private Asignatura asignatura; //Objeto Asignatura
	private ArrayList<Asignatura> temario=new ArrayList(); //Lista de Asignaturas del alumno
	
	
	
	/**
	 * Constructor vac�o de un Alumno
	 * */
	public Alumno(){
	}
	
	
	/**
	 * Constructor de un Alumno con tres par�metros
	 * @param nombreAlumno Nombre del Alumno
	 * @param edad Edad del alumno
	 * @param asignatura Asignatura que est� cursando el alumno
	 * */
	public Alumno(String nombreAlumno, int edad, Asignatura asignatura) throws NumberFormatException, IOException {
		this.nombreAlumno=nombreAlumno;
		this.edad=edad;
		Asignatura a=new Asignatura(asignatura.getNombre(), asignatura.getNota());
		this.temario.add(a);
	}
	
	/**
	 * M�todo que a�ade una asignatura al temario/n�mero de asignaturas del alumno
	 * @param asignatura Asignatura que queremos a�adirle al alumno
	 * */
	public void addAsignatura(Asignatura asignatura) throws NumberFormatException, IOException {
		Asignatura a=new Asignatura(asignatura.getNombre(), asignatura.getNota());
		this.temario.add(a);
	}
	
	/**
	 * M�todo que imprime todas las asignaturas del alumno
	 * @return Asignaturas cursadas por el alumno, junto a su nota y su estado
	 * @see Asignatura
	 * */
	public String imprimeAsignaturas() {
		String impresion="";
		for (int i = 0; i < temario.size(); i++) {
			impresion+=temario.get(i).getNombre()+": "+temario.get(i).getNota()+"\n"+temario.get(i).estadoAsignatura()+"\n";
		}
		return impresion;
	}
	
	/**
	 * M�todo que imprime la ficha del alumno
	 * @return Nombre y edad del alumno, junto a las asignaturas cursadas, junto a su nota y su estado
	 * @see Asignatura
	 * */
	public String imprimeAlumno() {
		return "Nombre: "+nombreAlumno+"\nEdad: "+edad+"\n"+imprimeAsignaturas();
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) throws IOException {
		this.nombreAlumno = amadeus.compruebaTexto(nombreAlumno);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws IOException {
		if(edad<0) {
			System.out.println("La edad no puede ser negativa");
			edad=amadeus.controlaIntPositivo();
		}
		this.edad = edad;
	}

	public ArrayList<Asignatura> getTemario() {
		return temario;
	}

	public void setTemario(ArrayList<Asignatura> temario) {
		this.temario = temario;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
	
	

}
