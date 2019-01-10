package utilesFran;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

/**
 * Clase de utilidades (control de variables, aplicaci�n de try catch, ...)
 * de uso personal
 * @author Francisco Antonio Lorente Girol
 * @version 1.0
 * */

public class Amadeus {

	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	boolean error = false;
	Random random=new Random();

	/**
	 * M�todo que aplica solicita la introducci�n de un dato tipo Integer
	 * y aplica los try catch necesarios durante el proceso.
	 * @return N�mero entero controlado
	 * */
	public int controlaInt() throws IOException {
		int entero = 0;
		do {
			try {
				entero = Integer.parseInt(entrada.readLine());
				error = false;
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Valor no v�lido");
				error = true;
			}
		} while (error);
		return entero;
	}

	/**
	 * M�todo que aplica solicita la introducci�n de un dato tipo Integer
	 * y aplica los try catch necesarios durante el proceso.
	 * @return N�mero entero controlado positivo (incluyendo el 0)
	 * */
	public int controlaIntPositivo() throws IOException {
		int entero = 0;
		do {
			try {
				entero = Integer.parseInt(entrada.readLine());
				error = false;
				if (entero < 0)
					System.out.println("Introduzca un valor positivo");
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Valor no v�lido");
				error = true;
			}
		} while (error || entero < 0);
		return entero;
	}
	
	public int controlaIntMinMax(int min, int max) throws IOException {
		int aux=0;
		if(min>max) {
			aux=max;
			max=min;
			min=aux;
		}
		int entero = 0;
		do {
			try {
				entero = Integer.parseInt(entrada.readLine());
				error = false;
				if (entero<min || entero>max)
					System.out.println("Introduzca un valor entre "+min+" y "+max);
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Valor no v�lido");
				error = true;
			}
		} while (error || entero<min || entero>max);
		return entero;
	}

	/**
	 * M�todo que aplica solicita la introducci�n de un dato tipo Integer
	 * y aplica los try catch necesarios durante el proceso.
	 * @return N�mero entero controlado entre 0 y 100
	 * */
	public int controlaIntPorcentaje() throws IOException {
		int entero = 0;
		do {
			try {
				entero = Integer.parseInt(entrada.readLine());
				error = false;
				if (entero < 0)
					System.out.println("Introduzca un valor mayor a 0");
				if (entero > 100)
					System.out.println("Introduzca un valor menor a 100");
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Valor no v�lido");
				error = true;
			}
		} while (error || entero < 0 || entero > 100);
		return entero;
	}

	/**
	 * M�todo que aplica solicita la introducci�n de un dato tipo Double
	 * y aplica los try catch necesarios durante el proceso.
	 * @return N�mero del tipo double controlado
	 * */
	public double controlaDouble() throws IOException {
		double entero = 0;
		do {
			try {
				entero = Double.parseDouble(entrada.readLine());
				error = false;
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Valor no v�lido, vuelva a introducirlo");
				error = true;
			}
		} while (error);
		return entero;
	}

	/**
	 * M�todo que aplica solicita la introducci�n de un dato tipo Double
	 * y aplica los try catch necesarios durante el proceso.
	 * @return N�mero del tipo double positivo (incluyendo 0)
	 * */
	public double controlaDoublePositivo() throws IOException {
		double entero = 0;
		do {
			try {
				entero = Double.parseDouble(entrada.readLine());
				error = false;
				if (entero < 0)
					System.out.println("Introduzca un valor positivo");
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Valor no v�lido, vuelva a introducirlo");
				error = true;
			}
		} while (error || entero < 0);
		return entero;
	}

	/**
	 * M�todo que aplica solicita la introducci�n de un dato tipo Double
	 * y aplica los try catch necesarios durante el proceso.
	 * @return N�mero del tipo double controlado entre 0 y 100
	 * */
	public double controlaDoublePorcentaje() throws IOException {
		double entero = 0;
		do {
			try {
				entero = Double.parseDouble(entrada.readLine());
				error = false;
				if (entero < 0)
					System.out.println("Introduzca un valor mayor a 0");
				if (entero > 100)
					System.out.println("Introduzca un valor menor a 100");
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Valor no v�lido");
				error = true;
			}
		} while (error || entero < 0 || entero > 100);
		return entero;
	}

	/**
	 * M�todo que aplica solicita la introducci�n de un dato tipo Float
	 * y aplica los try catch necesarios durante el proceso.
	 * @return N�mero del tipo float controlado
	 * */
	public float controlaFloat() throws IOException {
		float entero = 0;
		do {
			try {
				entero = Float.parseFloat(entrada.readLine());
				error = false;
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Valor no v�lido, vuelva a introducirlo");
				error = true;
			}
		} while (error);
		return entero;
	}

	/**
	 * M�todo que aplica solicita la introducci�n de un dato tipo Float
	 * y aplica los try catch necesarios durante el proceso.
	 * @return N�mero del tipo float positivo (incluye el 0)
	 * */
	public float controlaFloatPositivo() throws IOException {
		float entero = 0;
		do {
			try {
				entero = Float.parseFloat(entrada.readLine());
				error = false;
				if (entero < 0)
					System.out.println("Introduzca un valor positivo");
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Valor no v�lido, vuelva a introducirlo");
				error = true;
			}
		} while (error || entero < 0);
		return entero;
	}

	/**
	 * M�todo que aplica solicita la introducci�n de una cadena de caracteres por teclado.
	 * El m�todo comprueba si se ha escrito 's', 's�', 'si', 'yes','y', 'no','n'
	 * @return <ul>
	 * <li>true Si se ha escrito 's', 's�', 'si', 'yes','y'
	 * <li>false Si se ha escrito 'n', 'no'
	 * </ul>
	 * */
	public boolean afirmaODesmiente() throws IOException {
		String respuesta;
		do {
			respuesta = entrada.readLine();
			error = false;
			if (respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("y") || respuesta.equalsIgnoreCase("s�")
					|| respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("yes"))
				return true;
			else if (respuesta.equalsIgnoreCase("no") || respuesta.equalsIgnoreCase("n"))
				return false;
			else {
				error = true;
				System.out.println("Valor no v�lido, introduzca si o no");
			}
		} while (error);
		return false;
	}

	/**
	 * Solicita por consola la entrada por teclado de una cadena de caracteres.
	 * Comprueba que dicha cadena no est� vac�a o que no sean todos espacios en blanco.
	 * @return Cadena de caracteres v�lida
	 * */
	public String recibeTexto() throws IOException {
		String respuesta;
		boolean vacio = true;
		char c;
		do {
			respuesta = entrada.readLine();
			for (int i = 0; i < respuesta.length(); i++) {
				c = respuesta.charAt(i);
				if (!Character.isWhitespace(c)) {
					vacio = false;
					break;
				}
			}
			if (vacio)
				System.out.println("El texto no debe estar vac�o, introduzca datos");
		} while (vacio);
		return respuesta;
	}
	
	/**
	 * Comprueba que una cadena no est� vac�a o que no sean todos espacios en blanco.
	 * @param s Cadena de caracteres a comprobar
	 * @return Cadena de caracteres v�lida
	 * */
	public String compruebaTexto(String s) throws IOException {
		String respuesta=s;
		boolean vacio = true;
		char c;
		do {
			for (int i = 0; i < respuesta.length(); i++) {
				c = respuesta.charAt(i);
				if (!Character.isWhitespace(c)) {
					vacio = false;
					break;
				}
			}
			if (vacio) {
				System.out.println("El texto no debe estar vac�o, introduzca datos");
				respuesta = entrada.readLine();
			}
		} while (vacio);
		return respuesta;
	}
	
	/**
	 * M�todo que comprueba que el DNI tenga el formato adecuado de 8 d�gitos y una letra al final
	 * @param s DNI a comprobar
	 * @return DNI validado
	 * */
	public String compruebaNIF(String s) throws IOException {
		String respuesta=s;
		boolean error = false;
		char c;
		
		do {
			error=false;
			while(respuesta.length()!=9) {
				System.out.println("Longitud del DNI incorrecta, vuelva a introducirlo");
				respuesta=recibeTexto();
			}
			for (int i = 0; i < 8; i++) {
				c = respuesta.charAt(i);
				if (!Character.isDigit(c)) {
					error = true;
					break;
				}
			}
			if(!Character.isAlphabetic(respuesta.charAt(8)))
				error=true;
			if (error) {
				System.out.println("DNI no v�lido. Vu�lvalo a introducir");
				respuesta = entrada.readLine();
			}
		} while (error);
		return respuesta;
	}
	
	/*/////////////////////////////////////////////////////////////////////*/
	/*/ARRAYS//////////////////////////////////////////////////////////////*/
	/*/////////////////////////////////////////////////////////////////////*/
	
	/**
	 * M�todo que llena un array ya existente con valores aleatorios
	 * @param array Array que deseamos rellenar
	 * @param maxVal Valor m�ximo de los n�meros aleatorios generados que llenar�n el array
	 * @return El m�todo devolver� el array que metimos como par�metro de entrada ya relleno
	 * */
	public int[] rellenaArray(int[] array, int maxVal) {
		int val;
		for (int i = 0; i < array.length; i++) {
			val=random.nextInt(maxVal)+1;
			array[i]=val;
		}
		return array;
		
	}
	
	/**
	 * M�todo que crea un array ya lleno con valores aleatorios
	 * @param tamanho Tama�o del Array que deseamos crear
	 * @param maxVal Valor m�ximo de los n�meros aleatorios generados que llenar�n el array
	 * @return El m�todo devolver� un array de tama�o 'tamanho' ya lleno
	 * */
	public int[] creaArrayLleno(int tamanho,int maxVal) {
		int[] array=new int[tamanho];
		return rellenaArray(array,maxVal);
		
	}
	
	/**
	 * M�todo que imprime los valores de un array
	 * @param array Array que deseamos imprimir
	 * */
	public void imprimeArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	/**
	 * M�todo que suma los valores de dos arrays
	 * @param a Primer array que deseamos sumar
	 * @param b Segundo array que deseamos sumar
	 * @return El m�todo devolver� un array con la suma de los arrays anteriores
	 * */
	public int[] sumaArray(int[]a, int[]b) {
		int capacidad=a.length;
		int[] suma=new int[capacidad];
		for (int i = 0; i < suma.length; i++) {
			suma[i]=a[i]+b[i];
		}
		return suma;
	}
	
	/**
	 * M�todo que ordena de menor a mayor un Array
	 * @param array Array que deseamos ordenar
	 * @return Array ya ordenado
	 * */
	public int[] ordenaArrayMenorMayor(int[] array) {
		Arrays.sort(array);
		return array;
	}
	
	/**
	 * M�todo que ordena de mayor a menor un Array
	 * @param array Array que deseamos ordenar
	 * @return Array ya ordenado
	 * */
	public int[] ordenaArrayMayorMenor(int[] array) {
		Arrays.sort(array);
		array=invierteArray(array);
		return array;
	}
	
	/**
	 * M�todo que invierte el orden de un array
	 * @param array Array que deseamos invertir
	 * @return Array ya invertido
	 * */
	public int[] invierteArray(int[] array) {
		int[] inversion=new int[array.length];
		for (int i = 0; i < array.length; i++) {
			inversion[i]=array[array.length-1-i];
		}
		return inversion;
	}
	
	public int[] ordenacionAscendenteBurbujaArray(int[] array) {
		int aux;
		int mayor = array[0];
		boolean comprueba = true;
		while (comprueba) {
			comprueba = false;
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;
					comprueba = true;
				}
			}
		}
		return array;
	}
	
	public int[] ordenacionDescendenteBurbujaArray(int[] array) {
		int aux;
		int mayor = array[0];
		boolean comprueba = true;
		while (comprueba) {
			comprueba = false;
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] < array[j + 1]) {
					aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;
					comprueba = true;
				}
			}
		}
		return array;
	}
	
	public int[] ordenacionDirectaAscendenteArray(int[] array) {
		int index=0;
		int aux=0;
		for (int i = 1; i < array.length; i++) {
			index=i;
			aux=array[i];
			while((index>0)&&(array[index-1]>aux)) {
				array[index]=array[index-1];
				index--;
			}
			array[index]=aux;
		}
		return array;
	}
	
	public int[] ordenacionDirectaDescendenteArray(int[] array) {
		int index=0;
		int aux=0;
		for (int i = 1; i < array.length; i++) {
			index=i;
			aux=array[i];
			while((index>0)&&(array[index-1]<aux)) {
				array[index]=array[index-1];
				index--;
			}
			array[index]=aux;
		}
		return array;
	}
	
	/*/////////////////////////////////////////////////////////////////////*/
	/*/MATRICES////////////////////////////////////////////////////////////*/
	/*/////////////////////////////////////////////////////////////////////*/
	
	
	/**
	 * M�todo que llena una matriz ya existente con valores aleatorios
	 * @param matriz Matriz que deseamos rellenar
	 * @param maxVal Valor m�ximo de los n�meros aleatorios generados que llenar�n la matriz
	 * @return El m�todo devolver� la matriz que metimos como par�metro de entrada ya relleno
	 * */
	public int[][] rellenaMatriz(int[][] matriz, int maxVal) {
		int val;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				val=random.nextInt(maxVal)+1;
				matriz[i][j]=val;
			}
		}
		return matriz;	
	}
	
	
	/**
	 * M�todo que crea una matriz ya llena con valores aleatorios
	 * @param tamanho Tama�o de la matriz que deseamos crear
	 * @param maxVal Valor m�ximo de los n�meros aleatorios generados que llenar�n la matriz
	 * @return El m�todo devolver� una matriz de tama�o 'tamanho' ya lleno
	 * */
	public int[][] creaMatrizLlena(int filas, int columnas, int maxVal) {
		int[][]matriz=new int[filas][columnas];
		return rellenaMatriz(matriz, maxVal);
	}
	
	
	/**
	 * M�todo que imprime los valores de una matriz
	 * @param matriz Matriz que deseamos imprimir
	 * */
	public void imprimeMatriz(int[][]matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	
	/**
	 * M�todo que suma los valores de dos matrices
	 * @param a Primera matriz que deseamos sumar
	 * @param b Segunda matriz que deseamos sumar
	 * @return El m�todo devolver� una matriz con la suma de las dos matrices anteriores
	 * */
	public int[][] sumaMatriz(int[][]a, int[][]b) {
		int nFilas=a.length;
		int nColumnas=a[0].length;
		int[][] suma=new int[nFilas][nColumnas];
		for (int i = 0; i < suma.length; i++) {
			for (int j = 0; j < suma[i].length; j++) {
				suma[i][j]=a[i][j]+b[i][j];
			}
		}
		return suma;
	}
	
	/**
	 * M�todo que halla el mayor valor de una matriz
	 * @param matriz Matriz de la cual deseamos hallar el mayor valor
	 * @return Retorna el mayor valor de la matriz.
	 * */
	public int mayorEnLaMatriz(int[][] matriz) {
		int aux=matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j]>aux)
					aux=matriz[i][j];
			}
		}
		return aux;
	}
	
	/**
	 * M�todo que halla las posiciones del mayor valor de una matriz
	 * @param matriz Matriz de la cual deseamos hallar las posiciones del mayor valor
	 * @return Retorna las posiciones del mayor valor de una matriz.
	 * */
	public void posicionesMayorEnLaMatriz(int[][] matriz) {
		int mayor=mayorEnLaMatriz(matriz);
		System.out.println("El mayor n�mero se encuentra en la/s posici�n/es: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(mayor==matriz[i][j])
					System.out.print("["+i+"]["+j+"]  ");
			}
		}
	}
	
	/**
	 * M�todo que halla el menor valor de una matriz
	 * @param matriz Matriz de la cual deseamos hallar el menor valor
	 * @return Retorna el menor valor de la matriz.
	 * */
	public int menorEnLaMatriz(int[][] matriz) {
		int aux=matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j]<aux)
					aux=matriz[i][j];
			}
		}
		return aux;
	}
	
	
	/**
	 * M�todo que halla las posiciones del menor valor de una matriz
	 * @param matriz Matriz de la cual deseamos hallar las posiciones del menor valor
	 * @return Retorna las posiciones del menor valor de una matriz.
	 * */
	public void posicionesMenorEnLaMatriz(int[][] matriz) {
		int menor=menorEnLaMatriz(matriz);
		System.out.println("El menor n�mero se encuentra en la/s posici�n/es: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(menor==matriz[i][j])
					System.out.print("["+i+"]["+j+"]  ");
			}
		}
	}
	
	public int mayorEnFila(int[][] matriz, int fila) {
		int aux=matriz[fila][0];
		for (int i = 0; i < matriz.length; i++) {
			if(matriz[fila][i]>aux)
				aux=matriz[fila][i];
		}
		return aux;
	}
	
	//DA EL NUMERO DE COLUMNA EN EL CUAL EST�
	public int[] posicionesMayorEnFila(int[][] matriz,int fila) {
		int aux=mayorEnFila(matriz,fila);
		int cont=0;
		int j=0;
		for (int i = 0; i < matriz.length; i++) {
			if(aux==matriz[fila][i])
				cont++;
		}
		int[] respuesta=new int[cont];
		
		for (int i = 0; i < matriz.length; i++) {
			if(aux==matriz[fila][i]) {
				respuesta[j]=i;
				j++;
			}
		}
		return respuesta;
	}
	
	public int mayorEnColumna(int[][] matriz, int columna) {
		int aux=matriz[0][columna];
		for (int i = 0; i < matriz.length; i++) {
			if(matriz[i][columna]>aux)
				aux=matriz[i][columna];
		}
		return aux;
	}
	
	//DA EL N�MERO DE FILA EN EL CUAL EST�
	public int[] posicionesMayorEnColumna(int[][] matriz,int columna) {
		int aux=mayorEnColumna(matriz,columna);
		int cont=0;
		int j=0;
		for (int i = 0; i < matriz.length; i++) {
			if(aux==matriz[i][columna])
				cont++;
		}
		int[] respuesta=new int[cont];
		
		for (int i = 0; i < matriz.length; i++) {
			if(aux==matriz[i][columna]) {
				respuesta[j]=i;
				j++;
			}
		}
		return respuesta;
	}
	
	public int menorEnFila(int[][] matriz, int fila) {
		int aux=matriz[fila][0];
		for (int i = 0; i < matriz.length; i++) {
			if(matriz[fila][i]<aux)
				aux=matriz[fila][i];
		}
		return aux;
	}
	
	public int[] posicionesMenorEnFila(int[][] matriz,int fila) {
		int aux=menorEnFila(matriz,fila);
		int cont=0;
		int j=0;
		for (int i = 0; i < matriz.length; i++) {
			if(aux==matriz[fila][i])
				cont++;
		}
		int[] respuesta=new int[cont];
		
		for (int i = 0; i < matriz.length; i++) {
			if(aux==matriz[fila][i]) {
				respuesta[j]=i;
				j++;
			}
		}
		return respuesta;
	}
	
	public int menorEnColumna(int[][] matriz, int columna) {
		int aux=matriz[0][columna];
		for (int i = 0; i < matriz.length; i++) {
			if(matriz[i][columna]<aux)
				aux=matriz[i][columna];
		}
		return aux;
	}
	
	public int[] posicionesMenorEnColumna(int[][] matriz,int columna) {
		int aux=menorEnColumna(matriz,columna);
		int cont=0;
		int j=0;
		for (int i = 0; i < matriz.length; i++) {
			if(aux==matriz[i][columna])
				cont++;
		}
		int[] respuesta=new int[cont];
		
		for (int i = 0; i < matriz.length; i++) {
			if(aux==matriz[i][columna]) {
				respuesta[j]=i;
				j++;
			}
		}
		return respuesta;
	}
	
}
