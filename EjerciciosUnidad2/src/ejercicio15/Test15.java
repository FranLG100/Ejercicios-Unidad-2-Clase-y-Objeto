package ejercicio15;

import java.io.IOException;

import utilesFran.Amadeus;

public class Test15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Amadeus amadeus = new Amadeus();
		int code;
		Cuenta a = null;

		System.out.println("Buenos días.");
		do {
			System.out.println("¿Qué operación desea realizar?");
			System.out.println("1.-Crear una cuenta vacía" + "\n2.-Crear una cuenta con saldo inicial"
					+ "\n3.-Ingresar dinero" + "\n4.-Retirar dinero" + "\n5.-Ver saldo" + "\n6.-Salir");
			do {
				code = amadeus.controlaIntPositivo();
				if (code < 1 || code > 6)
					System.out.println("El valor no está incluido en el menú, vuelva a introducirlo");
			} while (code < 1 || code > 6);
			switch (code) {
			case 1:
				a = new Cuenta();
				break;
			case 2:
				System.out.println("Introduzca un saldo inicial");
				a = new Cuenta(amadeus.controlaFloatPositivo());
				break;
			case 3:
				if (a == null)
					System.out.println("No ha creado ninguna cuenta");
				else {
					System.out.println("¿Qué cantidad desea ingresar?");
					a.ingresar(amadeus.controlaFloatPositivo());
				}
				break;
			case 4:
				if (a == null)
					System.out.println("No ha creado ninguna cuenta");
				else {
					System.out.println("¿Qué cantidad desea ingresar?");
					a.extraer(amadeus.controlaFloatPositivo());
				}
				break;
			case 5:
				if (a == null)
					System.out.println("No ha creado ninguna cuenta");
				else
					System.out.println("Dispone de " + a.getSaldo() + "€ en su cuenta.");
				break;
			default:
				break;
			}
		} while (code != 6);

	}

}
