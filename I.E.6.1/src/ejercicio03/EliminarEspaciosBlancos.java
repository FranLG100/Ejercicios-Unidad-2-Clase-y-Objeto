package ejercicio03;

public class EliminarEspaciosBlancos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//En este sencillo ejemplo, almacenaremos una frase en el String 'frase'.
		String frase=" Su per ca li fra gi l�s ti   co es pia li do so";
		
		//A continuaci�n, con 'replaceAll', cambiaremos todos los espacios (//s) por nada.
		frase=frase.replaceAll("\\s", "");
		
		/*Y ya hemos eliminado los espacios en blanco. Con 'trim' podemos eliminar los espacios
		en blanco que hay delante o detr�s de una cadena. En este caso, est� hecho para eliminar
		espacios intermedios.*/
		System.out.println(frase);
	}

}
