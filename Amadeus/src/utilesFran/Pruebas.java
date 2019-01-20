package utilesFran;

import java.util.StringTokenizer;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Amadeus amadeus = new Amadeus();
		StringTokenizer token=amadeus.cargaTokenizer("Esto es una prueba","e");

	while(token.hasMoreTokens()) {
		System.out.println(token.nextToken());
	}
	}
}
