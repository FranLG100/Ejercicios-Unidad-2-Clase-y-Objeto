package ejercicio08;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Alumno {
	
	private String nombreAlumno;
	private int edad;
	private Asignatura asignatura;
	private ArrayList<Asignatura> temario=new ArrayList();
	
	
	
	/**
	 * Constructor vacío de un Alumno
	 * */
	public Alumno(){
	}
	
	
	/**
	 * Constructor de un Alumno con tres parámetros
	 * @param nombreAlumno Nombre del Alumno
	 * @param edad Edad del alumno
	 * @param asignatura Asignatura que está cursando el alumno
	 * */
	public Alumno(String nombreAlumno, int edad, Asignatura asignatura) throws NumberFormatException, IOException {
		this.nombreAlumno=nombreAlumno;
		this.edad=edad;
		Asignatura a=new Asignatura(asignatura.getNombre(), asignatura.getNota());
		this.temario.add(a);
	}
	
	/**
	 * Método que añade una asignatura al temario/número de asignaturas del alumno
	 * @param asignatura Asignatura que queremos añadirle al alumno
	 * */
	public void addAsignatura(Asignatura asignatura) throws NumberFormatException, IOException {
		Asignatura a=new Asignatura(asignatura.getNombre(), asignatura.getNota());
		this.temario.add(a);
	}
	
	/**
	 * Método que imprime todas las asignaturas del alumno
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
	 * Método que imprime la ficha del alumno
	 * @return Nombre y edad del alumno, junto a las asignaturas cursadas, junto a su nota y su estado
	 * @see Asignatura
	 * */
	public String imprimeAlumno() {
		return "Nombre: "+nombreAlumno+"\nEdad: "+edad+"\n"+imprimeAsignaturas();
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
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
