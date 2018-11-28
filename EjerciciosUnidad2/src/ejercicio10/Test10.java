package ejercicio10;

import java.io.IOException;

import utilesFran.Amadeus;

public class Test10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		PapasYChocos pyc=new PapasYChocos();
		Amadeus amadeus=new Amadeus();
		int control=0;
		
		//Test normal
		pyc.showPapas();
		System.out.println(pyc.getComensales());
		pyc.addPapas(1);
		pyc.addChocos(2);
		pyc.showPapas();
		pyc.showChocos();
		System.out.println(pyc.getComensales());
		pyc.addChocos(-500);
		pyc.addPapas(-500);
		
		//Ahora, prueba del usuario
		System.out.println();
		do {
			System.out.println("\n�Qu� operaci�n desea realizar?");
			System.out.println("1.- A�adir/Restar papas");
			System.out.println("2.- A�adir/Restar chocos");
			System.out.println("3.- Consultar papas en el almac�n");
			System.out.println("4.- Consultar chocos en el almac�n");
			System.out.println("5.- �A cu�ntos comensales puedo servir?");
			System.out.println("6.- Salir");
			do {
				control=amadeus.controlaIntPositivo();
			}while(control<1||control>6);
			
			switch (control) {
			case 1:
				System.out.println("�Cu�ntos kg de papas quieres a�adir o quitar (n�mero negativo)?");
				pyc.addPapas(amadeus.controlaInt());
				break;
			case 2:
				System.out.println("�Cu�ntos kg de chocos quieres a�adir o quitar (n�mero negativo)?");
				pyc.addChocos(amadeus.controlaInt());
				break;
			case 3:
				pyc.showPapas();
				break;
			case 4:
				pyc.showChocos();
				break;
			case 5:
				System.out.println("Puedes servir a "+pyc.getComensales()+" comensales");
				break;
			default:
				break;
			}
		}while(control!=6);
		
		

	}

}
