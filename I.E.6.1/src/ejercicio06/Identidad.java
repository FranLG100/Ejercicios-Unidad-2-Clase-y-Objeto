package ejercicio06;

import java.io.IOException;

import utilesFran.Amadeus;

public class Identidad {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//En este caso, ya ten�a un m�todo en mi clase de utilidades que controlaba
		//que el DNI fuese v�lido. En caso contrario, volv�a a pedirlo.
		
		Amadeus amadeus=new Amadeus();
		System.out.println("Introduzca su DNI");
		String dni=amadeus.recibeTexto();
		amadeus.compruebaNIF(dni);
		
		//Cambia el d�gito noveno por un espacio.
		System.out.println(dni.replace(dni.charAt(8),' '));
	}

}
