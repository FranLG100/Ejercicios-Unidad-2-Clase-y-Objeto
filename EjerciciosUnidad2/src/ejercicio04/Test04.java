package ejercicio04;

import java.io.IOException;

import utilesFran.Amadeus;

public class Test04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Cafetera c1=new Cafetera();
		Cafetera c2=new Cafetera(500,750);
		Cafetera c3=new Cafetera(200);
		Amadeus amadeus=new Amadeus();
		int control=0;
		
		//Pruebas con cafeteras ya creadas
		System.out.println(c1.getMaxCapacidad());
		System.out.println(c1.getActCapacidad());
		System.out.println();
		System.out.println(c2.getMaxCapacidad());
		System.out.println(c2.getActCapacidad());
		System.out.println();
		System.out.println(c3.getMaxCapacidad());
		System.out.println(c3.getActCapacidad());
		System.out.println();
		c1.servirTaza(5); //Se sirve caf� de una cafetera vac�a. No funcionar�
		c1.llenarCafetera(); //Se llena la cefetera.
		c1.servirTaza(800); //Se echa una taza con 800 de cantidad
		System.out.println(c1.getActCapacidad()); //Imprimimos la cantidad actual de caf�
		c1.servirTaza(300); //Servimos m�s de lo que queda
		System.out.println(c1.getActCapacidad());
		c1.llenarCafetera();
		c1.vaciarCafetera(); //Vaciamos la cafetera
		System.out.println(c1.getActCapacidad());
		
		//Probamos a que el usuario cree una cafetera (con capacidad m�xima y m�nima)
		System.out.println("\nVamos a crear una cafetera");
		System.out.println("�Cu�l ser� su capacidad m�xima?");
		Cafetera c4=new Cafetera();
		c4.setMaxCapacidad(amadeus.controlaIntPositivo());
		System.out.println("�Cu�nto caf� tiene ahora?");
		c4.setActCapacidad(amadeus.controlaIntPositivo());
		do {
		System.out.println("�Qu� desea realizar?");
		System.out.println("1.-Servir una taza");
		System.out.println("2.-Agregar caf� a la cafetera");
		System.out.println("3.-Llenar la cafetera");
		System.out.println("4.-Vaciar la cafetera");
		System.out.println("5.-Consultar cantidad de caf� actual");
		System.out.println("6.-Salir");
		do {
			control=amadeus.controlaIntPositivo();
		}while(control<1||control>6);
		switch (control) {
		case 1:
			System.out.println("Introduzca cantidad a servirse");
			c4.servirTaza(amadeus.controlaIntPositivo());
			break;
		case 2:
			System.out.println("�Cu�nto caf� desea agregar a la cafetera?");
			c4.agregarCafe(amadeus.controlaIntPositivo());
			break;
		case 3:
			c4.llenarCafetera();
			break;
		case 4:
			c4.vaciarCafetera();
			break;
		case 5:
			System.out.println(c4.getActCapacidad());
			break;
		default:
			break;
		}
		}while(control!=6);
	}

}
