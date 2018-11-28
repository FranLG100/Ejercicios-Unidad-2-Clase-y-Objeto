package ejercicio05;

import java.io.IOException;

import utilesFran.Amadeus;

public class Test05 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Amadeus amadeus=new Amadeus();
		//Creamos dos empleados vacíos
		Empleado e1=new Empleado();
		Empleado e2=new Empleado();
		
		//Imprimimos uno de ellos
		System.out.println(e2.printAll());
		//Ahora, el usuario le dará vida.
		System.out.println("Introduzca DNI");
		e2.setDni(amadeus.controlaIntPositivo());
		System.out.println("Introduzca sueldo base");
		e2.setSueldoBase(amadeus.controlaDoublePositivo());
		System.out.println("Introduzca pago por hora extra");
		e2.setPagoHoraExtra(amadeus.controlaDoublePositivo());
		System.out.println("Introduzca número de horas extra realizadas este mes");
		e2.setHorasExtra(amadeus.controlaIntPositivo());
		System.out.println("Introduzca porcentaje de IRPF");
		e2.setIrpf(amadeus.controlaDoublePositivo());
		System.out.println("¿Está casado?");
		e2.setCasado(amadeus.afirmaODesmiente());
		System.out.println("¿Cuántos hijos tiene?");
		e2.setnHijos(amadeus.controlaIntPositivo());
		//Comprobamos cómo ha cambiado su ficha.
		System.out.println(e2.printAll());
		System.out.println();
		//Imprimimos al otro empleado, el cual estaba vacío.
		System.out.println(e1.printAll());
		System.out.println();
		//Copiamos al empleado 2 en el empleado 1, y vemos que ocurre cuando volvemos a imprimirlo.
		e1.copiaEmpleado(e2);
		System.out.println(e1.printAll());
		

	}

}
