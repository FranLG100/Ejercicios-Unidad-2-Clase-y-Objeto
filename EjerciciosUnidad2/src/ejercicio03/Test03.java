package ejercicio03;

import java.io.IOException;

import utilesFran.Amadeus;

public class Test03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Cuenta c1=new Cuenta();
		Cuenta c2=new Cuenta(12345678, 600, 100);
		Amadeus amadeus=new Amadeus();
		
		//Probamos algunos datos en la cuenta. Primero mostramos la vacía.
		System.out.println(c1.mostrarCuenta());
		System.out.println();
		//Ingresamos y retiramos dinero
		c1.ingreso(50);
		c1.retirar(25);
		//La mostramos
		System.out.println(c1.mostrarCuenta());
		System.out.println();
		
		//Mostramos la segunda cuenta
		System.out.println(c2.mostrarCuenta());
		System.out.println();
		//Fallamos queriendo
		c2.ingreso(-5);
		c2.retirar(-7);
		//Actualizamos el saldo
		c2.actualizarSaldo();
		//Mostramos la cuenta
		System.out.println(c2.mostrarCuenta());
		
		//El usuario creará una cuenta ahora
		System.out.println("Inrtoduzca su DNI");
		Cuenta c3=new Cuenta();
		c3.setDni(amadeus.controlaIntPositivo()); //Sé que controla Int y no Longs, pero era por hacer una prueba rápida.
		System.out.println("Introduzca saldo inicial");
		c3.setSaldoActual(amadeus.controlaDoublePositivo());
		System.out.println("Introduzca interés");
		c3.setInteres(amadeus.controlaDoublePorcentaje());
		System.out.println("¿Desea aplicarle hoy el interés diario?");
		if(amadeus.afirmaODesmiente()) {
			c3.actualizarSaldo();
		}
		System.out.println("Estos son sus datos:");
		System.out.println(c3.mostrarCuenta());
	}

}
