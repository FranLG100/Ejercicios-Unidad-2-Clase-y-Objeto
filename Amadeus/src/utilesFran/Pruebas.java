package utilesFran;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Amadeus amadeus=new Amadeus();
		int cont=0;
		int[] array=amadeus.creaArrayLleno(10, 99);
		amadeus.imprimeArray(array);
		int[] pares=amadeus.extraeParesArray(array);
		int[] impares=amadeus.extraeImparesArray(array);
		
		pares=amadeus.ordenacionSeleccionDirectaAscendenteArray(pares);
		impares=amadeus.ordenacionSeleccionDirectaDescendenteArray(impares);
		
		for (int i = 0; i < pares.length; i++) {
			array[cont]=pares[i];
			cont++;
		}
		
		for (int i = 0; i < impares.length; i++) {
			array[cont]=impares[i];
			cont++;
		}
		
		System.out.println();
		amadeus.imprimeArray(array);
		
		
	}

}
