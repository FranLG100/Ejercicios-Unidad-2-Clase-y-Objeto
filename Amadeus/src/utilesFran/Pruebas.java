package utilesFran;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Amadeus amadeus = new Amadeus();
		int cont = 0;
		int[][] matriz = { { 2, 8, 4, 8 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 2, 3, 3, 3 } };
		System.out.println("Nuestra matriz");
		amadeus.imprimeMatriz(matriz);
		amadeus.puntoDeSilla(matriz);
		int[] array=amadeus.extraerPuntoDeSilla(matriz);
		while(cont<array.length) {
			System.out.println(array[cont]+ " es un punto de silla");
			cont++;
			System.out.println("En la posición: "+array[cont]);
			cont++;
			System.out.println("Y en la posición: "+array[cont]);
			cont++;
		}
		
	}
}
