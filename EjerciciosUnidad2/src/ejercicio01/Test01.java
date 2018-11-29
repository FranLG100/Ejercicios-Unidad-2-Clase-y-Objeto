package ejercicio01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utilesFran.Amadeus;

public class Test01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DVDCine dvd01=new DVDCine();
		//La duraci�n en este es err�nea
		DVDCine dvd02=new DVDCine("El Silencio de los corderos", "The Silence of the Lambs", "Johathan Demme", "Jodie Foster y Anthony Hopkins", "Thriller", -118, "Una agente en entrenamiento del FBI busca la ayuda y consejo de un brillante asesino para poder capturar a otro asesino, el doctor Hannibal Lecter.");
		Amadeus amadeus=new Amadeus();
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		//Mostramos el ejemplo de la pel�cula creada.
		System.out.println((dvd02.esThriller())?"S�":"No");
		System.out.println((dvd02.tieneResumen())?"S�":"No");
		System.out.println(dvd02.muestraDuracion());
		dvd02.muestraDVDCine();
		System.out.println();
		//Otro fallo
		dvd01.setDuracion(-1);
		
		
		//A continuaci�n, le pedimos al usuario que rellene nuestro constructor vac�o.
		System.out.println("Introduzca el t�tulo de la pel�cula");
		dvd01.setTitulo(entrada.readLine());
		System.out.println("Introduzca el t�tulo original de la pel�cula");
		dvd01.setTituloOriginal(entrada.readLine());
		System.out.println("Introduzca director/es de la pel�cula");
		dvd01.setDirector(entrada.readLine());
		System.out.println("Introduzca reparto de la pel�cula");
		dvd01.setReparto(entrada.readLine());
		System.out.println("Introduzca g�nero de la pel�cula");
		dvd01.setGenero(entrada.readLine());
		System.out.println("Introduzca duraci�n de la pel�cula");
		dvd01.setDuracion(amadeus.controlaIntPositivo());
		System.out.println("Introduzca sinopsis ( o no )");
		dvd01.setDescripcion(entrada.readLine());
		//Y al final, mostramos todos los datos.
		dvd01.muestraDVDCine();
		System.out.println("Es Thriller: "+((dvd01.esThriller())?"S�":"No"));
		System.out.println("Tiene resumen: "+((dvd01.tieneResumen())?"S�":"No"));
	}

}
