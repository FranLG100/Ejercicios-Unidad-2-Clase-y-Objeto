package ejercicio09;

import java.io.IOException;

public class Test09 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Persona p=new Persona("Garc�a", "Ram�n", "Hombre", 28822882);
		Docente d=new Docente("Garc�a", "Ram�n", "Hombre", 28822882, 4, "Profesor", "Comunicaci�n", 6, 8);
		Estudiante e=new Estudiante("Garc�a", "Ram�n", "Hombre", 28822882, 1231, "Alumno", 800, "C.P. Crist�bal Col�n");
		
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
