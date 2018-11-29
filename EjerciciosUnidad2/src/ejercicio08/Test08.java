package ejercicio08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utilesFran.Amadeus;

public class Test08 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Amadeus amadeus = new Amadeus();
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		// Prueba con valores ya dados
		Asignatura a1 = new Asignatura("Lenguaje", 1);
		Asignatura a2 = new Asignatura("Sociales", 5);
		Asignatura a3 = new Asignatura("Ambientales", 6);
		Asignatura a4 = new Asignatura("", -2); //Error a arreglar en consola
		Asignatura a5 = new Asignatura("Matemáticas", 10);

		Alumno alum = new Alumno("", -19, a1); //Error a arreglar en consola
		Alumno alum2 = new Alumno("Perico Palos", 22, a3);
		Alumno alum3 = new Alumno("Bernarda Alba", 19, a5);
		alum.addAsignatura(a2);
		System.out.println(alum.imprimeAsignaturas());
		a2.setNota(8);
		System.out.println(alum.imprimeAsignaturas());
		alum.getTemario().get(1).setNota(8);

		alum2.addAsignatura(a4);

		System.out.println(alum.imprimeAlumno());
		System.out.println(alum2.imprimeAlumno());
		System.out.println(alum3.imprimeAlumno());

		// Prueba para el usuario
		int control = 0;
		System.out.println();

		System.out.println("Introduzca nombre del Alumno");
		Alumno alum4 = new Alumno();
		alum4.setNombreAlumno(entrada.readLine());
		System.out.println("Introduzca edad del alumno");
		alum4.setEdad(amadeus.controlaIntPositivo());
		do {
			System.out.println("Introduzca operación para " + alum4.getNombreAlumno());
			System.out.println("1.- Añadir asignatura");
			System.out.println("2.- Consultar ficha de Alumno");
			System.out.println("3.- Salir");
			do {
				control = amadeus.controlaIntPositivo();
			} while (control < 1 || control > 3);

			switch (control) {
			case 1:
				Asignatura subject=new Asignatura();
				System.out.println("Introduzca nombre de la asignatura");
				subject.setNombre(entrada.readLine());
				System.out.println("Introduzca nota de la asignatura");
				subject.setNota(amadeus.controlaDoublePositivo());
				alum4.addAsignatura(subject);
				break;
			case 2:
				System.out.println(alum4.imprimeAlumno());
				break;
			default:
				break;
			}
		} while (control != 3);
	}

}
