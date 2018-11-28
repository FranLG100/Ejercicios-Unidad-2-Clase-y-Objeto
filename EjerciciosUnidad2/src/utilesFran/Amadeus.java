package utilesFran;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Amadeus {

	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	boolean error = false;

	public int controlaInt() throws IOException {
		int entero = 0;
		do {
			try {
				entero = Integer.parseInt(entrada.readLine());
				error = false;
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Valor no v�lido");
				error = true;
			}
		} while (error);
		return entero;
	}
	
	public int controlaIntPositivo() throws IOException {
		int entero = 0;
		do {
			try {
				entero = Integer.parseInt(entrada.readLine());
				error = false;
				if(entero<0)
					System.out.println("Introduzca un valor positivo");
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Valor no v�lido");
				error = true;
			}
		} while (error || entero<0);
		return entero;
	}

	public int controlaIntPorcentaje() throws IOException {
		int entero = 0;
		do {
			try {
				entero = Integer.parseInt(entrada.readLine());
				error = false;
				if(entero<0)
					System.out.println("Introduzca un valor mayor a 0");
				if(entero>100)
					System.out.println("Introduzca un valor menor a 100");
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Valor no v�lido");
				error = true;
			}
		} while (error || entero<0 || entero>100);
		return entero;
	}
	
	public double controlaDouble() throws IOException {
		double entero = 0;
		do {
			try {
				entero = Double.parseDouble(entrada.readLine());
				error = false;
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Valor no v�lido, vuelva a introducirlo");
				error = true;
			}
		} while (error);
		return entero;
	}

	public double controlaDoublePositivo() throws IOException {
		double entero = 0;
		do {
			try {
				entero = Double.parseDouble(entrada.readLine());
				error = false;
				if(entero<0)
					System.out.println("Introduzca un valor positivo");
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Valor no v�lido, vuelva a introducirlo");
				error = true;
			}
		} while (error||entero<0);
		return entero;
	}
	
	public double controlaDoublePorcentaje() throws IOException {
		double entero = 0;
		do {
			try {
				entero = Double.parseDouble(entrada.readLine());
				error = false;
				if(entero<0)
					System.out.println("Introduzca un valor mayor a 0");
				if(entero>100)
					System.out.println("Introduzca un valor menor a 100");
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Valor no v�lido");
				error = true;
			}
		} while (error || entero<0 || entero>100);
		return entero;
	}
	
	public float controlaFloat() throws IOException {
		float entero = 0;
		do {
			try {
				entero = Float.parseFloat(entrada.readLine());
				error = false;
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Valor no v�lido, vuelva a introducirlo");
				error = true;
			}
		} while (error);
		return entero;
	}

	public float controlaFloatPositivo() throws IOException {
		float entero = 0;
		do {
			try {
				entero = Float.parseFloat(entrada.readLine());
				error = false;
				if(entero<0)
					System.out.println("Introduzca un valor positivo");
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Valor no v�lido, vuelva a introducirlo");
				error = true;
			}
		} while (error||entero<0);
		return entero;
	}
	
	public boolean afirmaODesmiente() throws IOException {
		String respuesta;
		do {
			respuesta = entrada.readLine();
			error = false;
			if (respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("y") || respuesta.equalsIgnoreCase("s�") || respuesta.equalsIgnoreCase("s"))
				return true;
			else if (respuesta.equalsIgnoreCase("no") || respuesta.equalsIgnoreCase("n"))
				return false;
			else {
				error = true;
				System.out.println("Valor no v�lido, introduzca si o no");
			}
		} while (error);
		return false;
	}
}
