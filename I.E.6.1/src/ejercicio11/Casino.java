package ejercicio11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import utilesFran.Amadeus;

public class Casino {

	Amadeus amadeus=new Amadeus();
	//Random. Para generar los n�meros del bingo.
	Random random=new Random();
	//Lista de n�meros. Nuestros n�meros. Servir�n para generar el cart�n.
	ArrayList<Integer> misNumeros=new ArrayList<Integer>();
	//N�meros de la primera l�nea del cart�n
	ArrayList<Integer> primeraLinea=new ArrayList<Integer>();
	//N�meros de la segunda l�nea del cart�n
	ArrayList<Integer> segundaLinea=new ArrayList<Integer>();
	//N�meros de la tercera l�nea del cart�n
	ArrayList<Integer> terceraLinea=new ArrayList<Integer>();
	//N�meros que han salido del bombo
	ArrayList<Integer> numerosQueHanSalido=new ArrayList<Integer>();
	//Variable con m�ltiples usos auxiliares
	int aux=0;
	//Variable �til para utilizar en el men�
	int opcion=0;
	//Cart�n del bingo. El tama�o ser� luego especificado.
	int[][] carton;
	//Sabremos si ha salido l�nea o no
	boolean linea=false;
	//Para definir si la partida ha terminado o no.
	boolean victoria=false;
	
	/**
	 * M�todo que inicia el juego del Bingo.
	 * */
	public void jugarBingo() throws IOException {
		System.out.println("�Bienvenido! En breve comenzar� la partida del Bingo.");
		System.out.println("Este ser� su cart�n\n");
		this.carton=comprarCarton(); //Al principio, generamos un cart�n para el jugador.
		System.out.println("\nAhora, �Procedamos a jugar!");
		do {
			//Le damos la opci�n a sacar una bola, comprobar qu� n�meros han salido, y comprobar el cart�n propio
			System.out.println("Seleccione una opci�n");
			System.out.println("1.-Sacar bola del bombo");
			System.out.println("2.-Comprobar n�meros que han salido");
			System.out.println("3.-Comprobar mi cart�n");
			opcion=amadeus.controlaIntMinMax(1, 3);
			switch (opcion) {
			case 1:
				sacarBola();
				comprobarLineas();
				break;
			case 2:
				imprimirNumerosQueHanSalido();
				break;

			default:
				imprimeCarton(carton);
				break;
			}
		}while(!victoria);
		System.out.println("�ENHORABUENA! �Has Ganado!");
	}
	
	
	/**
	 * M�todo p�blico que permite generar un cart�n de bingo. 15 N�meros 
	 * en total. Genera 15 n�meros aleatorios sin repetir que formar�n parte de nuestro
	 * cart�n. Los n�meros se ordenar�n de menor a mayor por columnas.
	 * @return carton Array de n�meros que jugamos en esa ronda de Bingo.
	 * */
	public int[][] comprarCarton() {
		int[][] carton = new int[3][5];
		//Hasta que tengamos 15 n�meros sin repetir, se ir�n generando n�meros aleatorios
			do {
				aux = random.nextInt(100);
				if (!misNumeros.contains(aux))
					misNumeros.add(aux);
			} while (misNumeros.size() < 15);
		Collections.sort(misNumeros);
		//Quiero ordenar el cart�n como se ordena en el bingo.
		//Por columnas.
		aux=0;
		int j=0;
		while (j < carton[0].length) {
			for (int i = 0; i < carton.length; i++) {
				carton[i][j] = misNumeros.get(aux);
				aux++;
			}
			j++;
		}

		//Tras ordenarlo, imprimimos el cart�n con el m�todo imprimeCart�n
		imprimeCarton(carton);
		
		//Por �ltimo, llenamos la primera segunda y tercera l�nea con sus n�meros correspondientes.
		//Para saber si en alg�n momento hemos cantado l�nea.
		for (int i = 0; i < carton.length; i++) {
			for (int k = 0; k < carton[i].length; k++) {
				if(i==0)
					primeraLinea.add(carton[i][k]);
				else if(i==1)
					segundaLinea.add(carton[i][k]);
				else
					terceraLinea.add(carton[i][k]);
			}
		}
		return carton;

	}
	
	/**
	 * M�todo p�blico para sacar una bola del bombo del Bingo.
	 * No puede sacar una bola que ya haya salido.
	 * */
	public void sacarBola() {
		boolean valido = false;
		//Evita la repetici�n de n�meros
		do {
			aux = random.nextInt(100);
			if (!numerosQueHanSalido.contains(aux)) {
				numerosQueHanSalido.add(aux); //Lo a�adimos a los n�meros que han salido.
				valido = true;
			}
		} while (!valido);
		valido = false; //Vuelve a poner la variable en falso para otros m�todos.
		Collections.sort(numerosQueHanSalido);
		System.out.println("EL " + aux);
	}
	
	
	/**
	 * Imprimimos los n�meros que han salido del bombo.
	 * */
	public void imprimirNumerosQueHanSalido() {
		System.out.println(numerosQueHanSalido.toString());
	}
	
	/**
	 * Comprobamos las l�neas. En el momento en el que se canta una, no se vuelve a cantar.
	 * 
	 * */
	public void comprobarLineas() {
		if (!linea) {
			if ((numerosQueHanSalido.containsAll(primeraLinea) || numerosQueHanSalido.containsAll(segundaLinea)
					|| numerosQueHanSalido.containsAll(terceraLinea))) {
				System.out.println("�HAN CANTADO L�NEA");
				linea = true;
			}
		}
		if (numerosQueHanSalido.containsAll(misNumeros)) {
			victoria=true;
		}

	}
	
	/**
	 * M�todo p�blico que imprime nuestro cart�n de n�meros, tachando los que ya tenemos.
	 * @param carton Nuestro cart�n de n�meros.
	 * */
	public void imprimeCarton(int[][] carton) {
		for (int i = 0; i < carton.length; i++) {
			for (int j = 0; j < carton[i].length; j++) {
				if(numerosQueHanSalido.contains(carton[i][j]))
					System.out.print("** ");
				else
					System.out.print(carton[i][j]+" ");
			}
			System.out.println();
		}
	}
}
