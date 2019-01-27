package ejercicio17;

import utilesFran.Amadeus;

public class Caracol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Amadeus amadeus=new Amadeus();
		int tamanho=3; //Tama�o de la matriz que vamos a generar
		int contador=1; //Contador. N�mero en el cual empeazamos
		int principio=0; // Variable inicial, para llevar la cuenta de los l�mites
		int fin=tamanho-1; //Variable inicial sobre el final, para llevar la cuenta de los l�mites
		int[][] matriz=new int[tamanho][tamanho]; //Matriz cuadrada. 
		
		while(contador<=(tamanho*tamanho)) { //Mientras el contador no sea igual al 
											//cuadrado del tama�o, repite el bucle
			
			
			for (int i = principio; i <= fin; i++) {	//El primer for, va de izda a dcha,
				matriz[principio][i]=contador++;		//en las filas superiores.
			}
			
			
			for (int i = principio+1; i <= fin; i++) { //El segundo for, de arriba a abajo, 
				matriz[i][fin]=contador++;			  //en las columnas a la derecha.
			}
			
			
			for (int i = fin-1; i >=principio; i--) { //El tercer for, de dcha a izda
				matriz[fin][i]=contador++;			 //en la filas inferiores.
			}
			
			
			for (int i = fin-1; i >=principio+1; i--) { //El �ltimo for, va de abajo a arriba
				matriz[i][principio]=contador++;	   //en las columnas de la izquierda
			}
			
			principio++; //Aumentamos el principio en uno, para comenzar uno despu�s
			fin--; //Reducimos el final para acabar uno antes
		}
		
		amadeus.imprimeMatriz(matriz);

	}

}
