package ejercicio09;

import java.io.IOException;

public class Test09 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Persona p=new Persona("García", "Ramón", "Hombre", "288228825");//DNI NO VÁLIDO. Pedirá que se arregle por consola
		Docente d=new Docente("García", "Ramón", "Hombre", "28822885Q", 4, "Profesor", "Comunicación", 6, 8);
		//Estudiante con fallo a corregir en consola
		Estudiante e=new Estudiante("", "Ramón", "Hombre", "28582288Q", 1231, "Alumno", 800, "C.P. Cristóbal Colón");
		
		//Test sencillo para probar que funcionan sus métodos.
		System.out.println(p.toString());
		System.out.println();
		System.out.println(d.toString());
		System.out.println(d.pagoParcial());
		System.out.println();
		System.out.println(e.toString());
		System.out.println(e.pagoParcial(14));
		
		
	}

}
