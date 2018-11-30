package ejercicio12;

import java.io.IOException;

import utilesFran.Amadeus;

public class Empleado {

	private Amadeus amadeus=new Amadeus();
	private String nombre;
	private int nHoras;
	private double pago;
	
	
	/**
	 * Constructor de Empleado, con tres parámetros de entrada
	 * @param nombre Nombre del empleado
	 * @param nHoras Número de horas trabajadas por el empleado
	 * @param pago Pago por hora trabajada del empleado
	 * */
	public Empleado(String nombre, int nHoras, int pago) {
		super();
		this.nombre = nombre;
		this.nHoras = nHoras;
		this.pago = pago;
	}


	/**
	 * Método que devuelve el pago que se le aplica al empleado
	 * @return Pago por el total de horas trabajadas al empleado, con suplemento si ha trabajado más de 40 horas
	 * */
	public double pagoEmpleado() {
		if(nHoras<=40)
			return nHoras*pago;
		else
			return (40*pago)+((nHoras-40)*(pago*1.5));
	}
	
	/**
	 * Método que devuelve la situación completa del empleado
	 * @return Situación del empleado. Nombre, horas trabajadas, y cuánto debe percibir por ello
	 * */
	@Override
	public String toString() {
		return nombre+" trabajó "+nHoras+" horas, cobra "+pago+" euros la hora, por lo que le corresponde un sueldo de "+pagoEmpleado()+" euros \n";
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) throws IOException {
		this.nombre = amadeus.compruebaTexto(nombre);
	}


	public int getnHoras() {
		return nHoras;
	}


	public void setnHoras(int nHoras) throws IOException {
		if(nHoras<0) {
			System.out.println("El valor de las horas no puede ser negativo");
			nHoras=amadeus.controlaIntPositivo();
		}
		this.nHoras = nHoras;
	}


	public double getPago() {
		return pago;
	}


	public void setPago(double pago) throws IOException {
		if(pago<0) {
			System.out.println("El pago no puede ser negativo");
			pago=amadeus.controlaDoublePositivo();
		}
		this.pago = pago;
	}
	
	/**
	 * Método para recibir e imprimir datos de cuantos empleados se desee. Pedirá cuantos
	 * empleados se desea introducir, su nombre, sus horas trabajadas, y su sueldo.
	 * Al final, imprimirá a todos esos empleados.
	 * */
	public void imprimirEmpleados() throws IOException {
		int k;
		System.out.println("¿Cuántos empleados desea introducir?");
		k=amadeus.controlaIntPositivo();
		Empleado[] a=new Empleado[k];
		for (int i = 0; i < a.length; i++) {
			a[i]=new Empleado("n",0,0);
			System.out.println("Introduzca nombre del Empleado número "+(i+1));
			a[i].setNombre(amadeus.recibeTexto());
			System.out.println("Introduzca número de horas trabajadas del Empleado número "+(i+1));
			a[i].setnHoras(amadeus.controlaIntPositivo());
			System.out.println("Introduzca pago por hora trabajada del Empleado número "+(i+1));
			a[i].setPago(amadeus.controlaIntPositivo());
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].toString());
		}
	}
	
	
	
}
