package ejercicio18;

import java.io.IOException;

import utilesFran.Amadeus;

public class OrdenarMatriz {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Amadeus amadeus=new Amadeus();
		int [][] matriz=amadeus.creaMatriz(5, 5, 9); //Creamos una matriz de 5x5 de con valores de 1 a 9
		int[] arrayAuxiliar=new int[5]; //Creamos una matriz auxiliar de 5 huecos (longitud de columna o fila)
		amadeus.imprimeMatriz(matriz); //Imprimimos la matriz original, para ver qu� tenemos.
		int fila=0; //Fila a ordenar (la introducir� el usuario).
		
		System.out.println("\nIntroduzca fila a ordenar");
		fila=amadeus.controlaIntMinMax(0, 4); //El usuario introducir� una fila, de 0 a 4.
		
		//Y dicha fila ser� ordenada
		matriz=amadeus.ordenaFilaMatrizAscendente(matriz,fila);
		
		System.out.println();
		amadeus.imprimeMatriz(matriz);
		
		//Posteriormente, se ordenar� la diagonal
		System.out.println("\nAhora ordenaremos la diagonal");
		
		for (int i = 0; i < arrayAuxiliar.length; i++) {
			arrayAuxiliar[i]=matriz[i][i];
		}
		arrayAuxiliar=amadeus.ordenacionDirectaAscendenteArray(arrayAuxiliar);
		for (int i = 0; i < arrayAuxiliar.length; i++) {
			matriz[i][i]=arrayAuxiliar[i];
		}
		
		System.out.println();
		amadeus.imprimeMatriz(matriz);
	}

}
