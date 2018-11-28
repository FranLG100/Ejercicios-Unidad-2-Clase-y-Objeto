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
		Empleado[] a=new Empleado[3];
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < a.length; i++) {
			a[i]=new Empleado("n",0,0);
			System.out.println("Introduzca nombre del Empleado número "+(i+1));
			a[i].setNombre(entrada.readLine());
			System.out.println("Introduzca número de horas trabajadas del Empleado número "+(i+1));
			a[i].setnHoras(amadeus.controlaIntPositivo());
			System.out.println("Introduzca pago por hora trabajada del Empleado número "+(i+1));
			a[i].setPago(amadeus.controlaIntPositivo());
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].toString());
		}
	}

}
