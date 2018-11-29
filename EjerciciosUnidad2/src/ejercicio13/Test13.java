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
		System.out.println("¿Cuántos alimentos desea introducir?");
		cantidad = amadeus.controlaIntPositivo();
		Alimento[] aa = new Alimento[cantidad];
		String aux = "";
		boolean error = true;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < aa.length; i++) {
			aa[i] = new Alimento();
			System.out.println("Introduzca porcentaje de lípidos");
			aa[i].setLipidos(amadeus.controlaIntPorcentaje());
			System.out.println("Introduzca porcentaje de hidratos de carbono");
			do {
			aa[i].sethCarbono(amadeus.controlaIntPorcentaje());
			if((aa[i].getLipidos()+aa[i].gethCarbono())>100) {
				System.out.println("La suma de los porcentajes no puede ser superior a 100");
			}
			}while((aa[i].getLipidos()+aa[i].gethCarbono())>100);
			System.out.println("Introduzca porcentaje de proteínas");
			do {
			aa[i].setProteinas(amadeus.controlaIntPorcentaje());
			if((aa[i].getLipidos()+aa[i].gethCarbono()+aa[i].getProteinas())>100) {
				System.out.println("La suma de los porcentajes no puede ser superior a 100");
			}
			}while((aa[i].getLipidos()+aa[i].gethCarbono()+aa[i].getProteinas())>100);
			System.out.println("¿Es de Origen Animal?");
			aa[i].setoAnimal(amadeus.afirmaODesmiente());
			System.out.println("Introduzca nivel de Vitaminas (a, m o b)");
			do {
				aux = entrada.readLine();
				if (aux.equalsIgnoreCase("a") || aux.equalsIgnoreCase("m") || aux.equalsIgnoreCase("b")) {
					error = false;
				} else {
					error = true;
					System.out.println("El valor debe ser A, M o B. Vuelva a introducirlo.");
				}
			} while (error);
			aa[i].setVitaminas(aux);
			System.out.println("Introduzca nivel de Minerales (a, m o b)");
			do {
				aux = entrada.readLine();
				if (aux.equalsIgnoreCase("a") || aux.equalsIgnoreCase("m") || aux.equalsIgnoreCase("b")) {
					error = false;
				} else {
					error = true;
					System.out.println("El valor debe ser A, M o B. Vuelva a introducirlo.");
				}
			} while (error);
			aa[i].setMinerales(aux);
			System.out.println("----------------------------------");
		}

		for (

				int i = 0; i < aa.length; i++) {
			System.out.println("\nAlimento número "+(i+1)+":\n"
				+aa[i].descripcionAlimento());
		}
	}

}
