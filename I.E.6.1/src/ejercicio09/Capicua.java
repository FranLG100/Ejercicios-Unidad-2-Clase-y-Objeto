package ejercicio09;

public class Capicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//N�mero a comprobar
		int origen=21312;
		//N�mero que usaremos para comprobar
		int numeroFinal=0;
		//Convertimos el n�mero a String, y a array de caracteres.
		char[] aux=Integer.toString(origen).toCharArray();
		//El comprobante, igual.
		char[] comprobante=Integer.toString(origen).toCharArray();
		boolean capicua=false;
		
		//Pasamos al comprobante el n�mero al rev�s
		for (int i = 0; i < comprobante.length; i++) {
			comprobante[i]=aux[aux.length-i-1];
		}
		
		//Juntamos el n�mero y lo pasamos a integer
		numeroFinal=Integer.parseInt(String.valueOf(comprobante));
		
		//Comprobamos si es o no capic�a
		if(numeroFinal==origen)
			System.out.println("El n�mero es capic�a");
		else
			System.out.println("No lo es");
		
	}

}
