package ejercicio10B;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import utilesFran.Amadeus;

public class Tablero {

	Amadeus amadeus = new Amadeus();
	String[][] matriz = new String[8][8]; //Este ser� nuestro tablero
	ArrayList<String> celdas = new ArrayList<String>(); //Celdas que hemos introducido
	ArrayList<String> barcos = new ArrayList<String>(); //Celdas en las que se encuentra un barco
	int fila = 0; //Fila
	int columna = 0; //Columna
	int nBarcos = 8; //N�mero de barcos que queremos colocar
	int nBarcosActuales = 0; //N�mero de barcos colocados
	boolean valido=false; //Auxiliar que nos indicar� si el programa continua realizando una tarea o no
	Random random = new Random(); //Generador de n�meros aleatorios

	/**
	 * M�todo p�blico que sirve para generar el tablero inicial. Cada casilla es un String
	 * que muestra la fila y la columna ("00", "01", "02", etc.)
	 * */
	public void iniciarTablero() {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Integer.toString(i) + Integer.toString(j);
				//System.out.print(matriz[i][j] + " ");
			}
			//System.out.println();
		}
	}

	/**
	 * M�todo p�blico que sirve para mostrar el tablero. Si hemos fallado, se mostrar� 
	 * una 'X'. Si hemos acertado, un '*'. Si no hemos tocado esa casilla, se mostrar�
	 * una 'O'.
	 * */
	public void mostrarTablero() {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				String aux = Integer.toString(i) + Integer.toString(j);
				if (barcos.contains(aux) && celdas.contains(aux)) {
					System.out.print("*" + " ");
					//nBarcosActuales--;
					}
				else if(celdas.contains(aux)) {
					System.out.print("X" + " ");
				}
				else
					System.out.print("O" + " ");
			}
			System.out.println();
		}
	}

	/*
	 * public void mostrarTableroActualizado(int x, int y) {
	 * 
	 * for (int i = 0; i < matriz.length; i++) { for (int j = 0; j <
	 * matriz[i].length; j++) { if (j==x && i==y) System.out.print('X' + " "); else
	 * System.out.print('O' + " "); } System.out.println(); } }
	 */

	/**
	 * M�todo p�blico para que el jugador introduzca una celda del tablero.
	 * Introduce una fila y una columna, que se pasar� a String y se comparar� con la 
	 * lista de barcos. Se controlar� que no se introduzcan celdas repetidas.
	 * Se muestra el tablero tras introducir una celda.
	 * */
	public void introducirCelda() throws IOException {
		boolean repetido=false;
		System.out.println("Introduzca fila [0-7]");
		do {
			fila = amadeus.controlaIntPositivo();
		} while (fila > 7);

		System.out.println("Introduzca columna [0-7]");
		do {
			columna = amadeus.controlaIntPositivo();
		} while (columna > 7);

		String celda = Integer.toString(fila) + Integer.toString(columna);
		if(!celdas.contains(celda)) {
			celdas.add(celda);
		}else
			repetido=true;
		//CONTROLAR AHORA LA REPETICI�N
		if (barcos.contains(celda) && !repetido) {
			//nBarcosActuales--;
			System.out.println("�Tocado!");
		}
		mostrarTablero();
	}

	/**
	 * M�todo p�blico para inicializar los barcos de una casilla.
	 * Se controla para que no se puedan introducir dos barcos en la misma casilla.
	 * */
	public void iniciarBarcosPequenhos() {
		do {
			int aux1 = random.nextInt(8);
			int aux2= random.nextInt(8);
			String auxString = Integer.toString(aux1)+Integer.toString(aux2);
			if (!barcos.contains(auxString)) {
				barcos.add(auxString);
				nBarcosActuales++;
			}
		} while (nBarcosActuales < 4);
	}
	
	/**
	 * M�todo p�blico para inicializar los barcos de dos casillas.
	 * Se controla para que no se puedan introducir dos barcos en la misma casilla.
	 * */
	public void iniciarBarcosMedianos() {
		do {
			while(!valido) {
			int aux1 = random.nextInt(8);
			int aux2= random.nextInt(8);
			int opcion=random.nextInt(2);
			String auxString = Integer.toString(aux1)+Integer.toString(aux2);
			if(opcion==1)
				colocarEnVertical(aux1, aux2, auxString,2);
			else
				colocarEnVertical(aux1, aux2, auxString,2);
			}
			//String auxString = Integer.toString(aux1)+Integer.toString(aux2);

				nBarcosActuales++;
				valido=false;
		} while (nBarcosActuales < 7);
	}
	
	/**
	 * M�todo p�blico para inicializar el barco de tres casillas.
	 * */
	public void iniciarBarcosGrandes() {
		do {
			while(!valido) {
			int aux1 = random.nextInt(8);
			int aux2= random.nextInt(8);
			int opcion=random.nextInt(2);
			String auxString = Integer.toString(aux1)+Integer.toString(aux2);
			if(opcion==1)
				colocarEnVertical(aux1, aux2, auxString,3);
			else
				colocarEnVertical(aux1, aux2, auxString,3);
			}
			//String auxString = Integer.toString(aux1)+Integer.toString(aux2);

				nBarcosActuales++;
				valido=false;
		} while (nBarcosActuales < 8);
	}
	
	/**
	 * M�todo p�blico para colocar los barcos de m�s de una casilla
	 * en posici�n vertical.
	 * @param posA Fila de la primera casilla del barco
	 * @param posB Columna de la primera casilla del barco
	 * @param casilla Casilla del primer fragmento del barco
	 * @param longitud Longitud del barco a colocar.
	 * */
	public void colocarEnVertical(int posA, int posB, String casilla, int longitud) {
		int cont = 0;
		ArrayList<String> memoria=new ArrayList<String>(); //Aqu� guardaremos las casillas del barco.
		memoria.add(casilla); //A�adimos la casilla inicial
		String auxString = null; //Un String que funcionar� como auxiliar
		if (((7 - posA) >= longitud) && !barcos.contains(casilla)) { //Si el barco no sobrepasa la matriz, continuamos
			while (cont < longitud-1) { //Hasta que lleguemos a la longitud, realizamos el paso (restamos uno porque descontamos la primera casilla)
				posA++; //Bajamos una columna
				auxString = Integer.toString(posA) + Integer.toString(posB); //Convertimos a casilla
				if (!barcos.contains(auxString)) { //Si la casilla no est� ocupada, la metemos en la memoria
					memoria.add(auxString);
					valido=true;
				}else { //Si est� ocupada y no podemos continuar, invalidamos el proceso y limpiamos la memoria
					valido=false;
					memoria.clear();
					break;
				}
				cont++; //Sumamos uno al fragmento del barco
			}
			if(valido) {//Si todo est� en orden
				barcos.addAll(memoria); //A�adimos todas las casillas de la memoria a la lista de barcos
				memoria.clear(); //Y la limpiamos para posteriores procesos
			}
			
		}
		
	}
	
	/**
	 * M�todo p�blico para colocar los barcos de m�s de una casilla
	 * en posici�n horizontal.
	 * @param posA Fila de la primera casilla del barco
	 * @param posB Columna de la primera casilla del barco
	 * @param casilla Casilla del primer fragmento del barco
	 * @param longitud Longitud del barco a colocar.
	 * */
	public void colocarEnHorizontal(int posA, int posB, String casilla, int longitud) {
		int cont = 0;
		ArrayList<String> memoria=new ArrayList<String>();
		memoria.add(casilla);
		String auxString = null;
		if (((7 - posB) >= longitud) && !barcos.contains(casilla)) {
			while (cont < longitud-1) {
				posB++; //Todo igual al proceso anterior, pero recorremos uno a la derecha
				auxString = Integer.toString(posA) + Integer.toString(posB);
				if (!barcos.contains(auxString)) {
					memoria.add(auxString);
					valido=true;
				}else {
					valido=false;
					memoria.clear();
					break;
				}
				cont++;
			}
			if(valido) {
				barcos.addAll(memoria);
				memoria.clear();
			}
			
		}
		
	}
	
	/**
	 * M�todo p�blico para iniciar el juego de los barquitos
	 * */
	public void Jugar() throws IOException {
		iniciarBarcosPequenhos(); //Inicializa los barcos pequenhos
		iniciarBarcosMedianos(); //Inicializa los barcos medianos
		iniciarBarcosGrandes(); //Inicializa los barcos graneds
		iniciarTablero(); //Inicializa el tablero
		do {
			introducirCelda();
			//System.out.println("Quedan "+nBarcosActuales+" barcos");
		}while(!celdas.containsAll(barcos)); //Comprueba si las celdas que hemos introducido contienen las casillas de los barcos.
		System.out.println("�Has ganado!");
	}

}
