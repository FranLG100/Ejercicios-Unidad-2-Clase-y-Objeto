package ejercicio09;

import java.io.IOException;

public class Test09 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Persona p=new Persona("García", "Ramón", "Hombre", 28822882);
		Docente d=new Docente("García", "Ramón", "Hombre", 28822882, 4, "Profesor", "Comunicación", 6, 8);
		Estudiante e=new Estudiante("García", "Ramón", "Hombre", 28822882, 1231, "Alumno", 800, "C.P. Cristóbal Colón");
		
		System.out.println(p.toString());
		System.out.println();
		System.out.println(d.toString());
		System.out.println(d.pagoParcial());
		System.out.println();
		System.out.println(e.toString());
		System.out.println(e.pagoParcial(14));
		
		
	}

}
