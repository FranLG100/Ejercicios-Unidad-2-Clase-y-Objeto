package ejercicio02;

public class SustitucionDePalabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//En este String guardaremos la frase a cambiar. La imprimiremos
		String frase="Y entonces el guerrero cogi� su espada y mat� a su enemigo";
		System.out.println(frase);
		
		//Ahora, con 'replaceAll', cambiaremos las cadenas que queramos por otras deseadas
		frase=frase.replaceAll("espada", "caja de herramientas");
		frase=frase.replaceAll("mat�", "ayud�");
		frase=frase.replaceAll("enemigo", "benefactor");
		System.out.println(frase);
	}

}
