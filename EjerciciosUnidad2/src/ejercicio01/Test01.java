package ejercicio01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utilesFran.Amadeus;

public class Test01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DVDCine dvd01=new DVDCine();
		//La duración en este es errónea
		DVDCine dvd02=new DVDCine("El Silencio de los corderos", "The Silence of the Lambs", "Johathan Demme", "Jodie Foster y Anthony Hopkins", "Thriller", -118, "Una agente en entrenamiento del FBI busca la ayuda y consejo de un brillante asesino para poder capturar a otro asesino, el doctor Hannibal Lecter.");
		Amadeus amadeus=new Amadeus();
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		//Mostramos el ejemplo de la película creada.
		System.out.println((dvd02.esThriller())?"Sí":"No");
		System.out.println((dvd02.tieneResumen())?"Sí":"No");
		System.out.println(dvd02.muestraDuracion());
		dvd02.muestraDVDCine();
		System.out.println();
		//Otro fallo
		dvd01.setDuracion(-1);
		
		
		//A continuación, le pedimos al usuario que rellene nuestro constructor vacío.
		System.out.println("Introduzca el título de la película");
		dvd01.setTitulo(entrada.readLine());
		System.out.println("Introduzca el título original de la película");
		dvd01.setTituloOriginal(entrada.readLine());
		System.out.println("Introduzca director/es de la película");
		dvd01.setDirector(entrada.readLine());
		System.out.println("Introduzca reparto de la película");
		dvd01.setReparto(entrada.readLine());
		System.out.println("Introduzca género de la película");
		dvd01.setGenero(entrada.readLine());
		System.out.println("Introduzca duración de la película");
		dvd01.setDuracion(amadeus.controlaIntPositivo());
		System.out.println("Introduzca sinopsis ( o no )");
		dvd01.setDescripcion(entrada.readLine());
		//Y al final, mostramos todos los datos.
		dvd01.muestraDVDCine();
		System.out.println("Es Thriller: "+((dvd01.esThriller())?"Sí":"No"));
		System.out.println("Tiene resumen: "+((dvd01.tieneResumen())?"Sí":"No"));
	}

}
