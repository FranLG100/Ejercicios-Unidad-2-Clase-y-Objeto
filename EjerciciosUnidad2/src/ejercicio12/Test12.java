package ejercicio12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utilesFran.Amadeus;

public class Test12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Amadeus amadeus=new Amadeus();
		System.out.println("Buenas tardes.");
		Empleado e=new Empleado("n",0,0);
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		//En lugar de tres empleados, son los que usuario desee meter.
		e.imprimirEmpleados();
	}

}
