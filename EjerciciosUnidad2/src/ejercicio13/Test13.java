package ejercicio13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utilesFran.Amadeus;

public class Test13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int cantidad;
		Amadeus amadeus = new Amadeus();
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("¿Cuántos alimentos desea introducir?");
		cantidad = amadeus.controlaIntPositivo();
		Alimento[] aa = new Alimento[cantidad];
		

		for (int i = 0; i < aa.length; i++) {
			System.out.println("Introduzca nombre del alimento");
			aa[i] = new Alimento(amadeus.recibeTexto());
			System.out.println("Introduzca porcentaje de lípidos");
			aa[i].setLipidos(amadeus.controlaIntPorcentaje());
			System.out.println("Introduzca porcentaje de hidratos de carbono");
			aa[i].sethCarbono(amadeus.controlaIntPorcentaje());
			System.out.println("Introduzca porcentaje de proteínas");
			aa[i].setProteinas(amadeus.controlaIntPorcentaje());
			System.out.println("¿Es de Origen Animal?");
			aa[i].setoAnimal(amadeus.afirmaODesmiente());
			System.out.println("Introduzca nivel de Vitaminas (a, m o b)");
			aa[i].setVitaminas(entrada.readLine());
			System.out.println("Introduzca nivel de Minerales (a, m o b)");
			aa[i].setMinerales(entrada.readLine());
			System.out.println("----------------------------------");
		}

		for (
				int i = 0; i < aa.length; i++) {
			System.out.println("\nAlimento número "+(i+1)+":\n"
				+aa[i].descripcionAlimento());
		}
	}

}
