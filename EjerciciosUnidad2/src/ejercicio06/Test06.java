package ejercicio06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utilesFran.Amadeus;

public class Test06 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Persona p1=new Persona("Francisco Lorente", 25);
		Empleado e1=new Empleado("Juan Ignacio Martínez", 42, 1600);
		Empleado e2=new Empleado();
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		Amadeus amadeus= new Amadeus();
		
		//Prueba sencilla de los métodos de Persona y Empleado
		System.out.println(p1.toString());
		System.out.println();
		System.out.println(e1.toString());
		e1.setNombre(""); //Fallo aquí (queriendo, se corrige en consola)
		System.out.println();
		System.out.println(e1.toString());
		
		//Prueba con un usuario metiendo datos
		System.out.println("\nBuenos días.");
		System.out.println("Introduzca nombre de empleado");
		e2.setNombre(entrada.readLine());
		System.out.println("Introduzca edad");
		e2.setEdad(amadeus.controlaIntPositivo());
		System.out.println("Introduzca sueldo");
		e2.setSueldo(amadeus.controlaDoublePositivo());
		System.out.println();
		System.out.println(e2.toString());
	}

}
