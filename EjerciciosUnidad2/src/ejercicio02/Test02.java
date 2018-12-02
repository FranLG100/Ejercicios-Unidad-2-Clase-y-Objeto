package ejercicio02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utilesFran.Amadeus;

public class Test02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Vehiculo v1=new Vehiculo("Ford");
		Vehiculo v2=new Vehiculo("Seat");
		Amadeus amadeus=new Amadeus();
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		//A continuación, algunas probaturas con los dos objetos ya creados.
		System.out.println(v1.imprimirVehiculo());
		
		v2.setcRuedas(true);
		//Error (a conciencia, para probar que funcione)
		v2.setPotencia(-2300);
		
		System.out.println();
		System.out.println(v2.imprimirVehiculo());
		System.out.println();
		
		//Ahora, le pediremos al usuario que cree él el objeto
		System.out.println("Introduzca el modelo del coche que desea crear");
		Vehiculo v3=new Vehiculo(entrada.readLine());
		System.out.println("Introduzca potencia del vehículo");
		v3.setPotencia(amadeus.controlaDoublePositivo());
		//A esta pregunta, se puede responder con si, sí, no, n, yes, y o s
		System.out.println("¿Tiene tracción a las cuatro ruedas?");
		v3.setcRuedas(amadeus.afirmaODesmiente());
		System.out.println("Este es el coche que ha creado:");
		System.out.println(v3.imprimirVehiculo());

	}

}
