package ejercicio07;

import java.io.IOException;

public class Test07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		
		//Prueba sencilla 
		Asignatura a1=new Asignatura("",-2); //Fallos para arreglar en consola
		Asignatura a2=new Asignatura("Lenguaje",6);
		
		System.out.println(a1.estadoAsignatura());
		System.out.println(a2.estadoAsignatura());
	}

}
