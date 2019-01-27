package ejercicio07;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//El ejercicio 8 est� hecho aqu� tambi�n.
		
		//Copiamos el String a dividir. 
		String notas="Juan Carlos \n 8.5 \n Andr�s \n 4.9 \n Pedro \n 3.8 \n Juan \n 6.3";
		//Y lo dividimos a partir de los saltos de l�nea ("\n").
		StringTokenizer token=new StringTokenizer(notas,"\n");
		//Aqu� guardaremos las notas num�ricas.
		double[] notasNumericas=new double[4];
		//Nor servir� de �ndice para el array de notas.
		int i=0;
		
		//Imprimiremos las notas y nombres en el orden deseado
		while(token.hasMoreTokens()) {
			System.out.println("El alumno "+token.nextToken().trim()+" ha sacado la nota "+token.nextToken().trim());
		}
		
		//Volvemos a cargar los tokens
		token=new StringTokenizer(notas,"\n");
		
		//Y esta vez, guardamos las notas en el array de notas, ignorando el resto.
		while (token.hasMoreTokens()) {
			token.nextToken().trim(); 
			notasNumericas[i]=Double.parseDouble(token.nextToken().trim());
			i++;
		}
		
		//Y las imprimimos para ver si ha funcionado.
		for (int j = 0; j < notasNumericas.length; j++) {
			System.out.println(notasNumericas[j]);
		}

	}

}
