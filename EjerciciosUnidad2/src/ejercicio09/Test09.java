package ejercicio09;

import java.io.IOException;

public class Test09 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Persona p=new Persona("Garc�a", "Ram�n", "Hombre", "288228825");//DNI NO V�LIDO. Pedir� que se arregle por consola
		Docente d=new Docente("Garc�a", "Ram�n", "Hombre", "28822885Q", 4, "Profesor", "Comunicaci�n", 6, 8);
		//Estudiante con fallo a corregir en consola
		Estudiante e=new Estudiante("", "Ram�n", "Hombre", "28582288Q", 1231, "Alumno", 800, "C.P. Crist�bal Col�n");
		
		//Test sencillo para probar que funcionan sus m�todos.
		System.out.println(p.toString());
		System.out.println();
		System.out.println(d.toString());
		System.out.println(d.pagoParcial());
		System.out.println();
		System.out.println(e.toString());
		System.out.println(e.pagoParcial(14));
		
		
	}

}
