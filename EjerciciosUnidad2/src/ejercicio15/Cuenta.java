package ejercicio15;

import java.io.IOException;

import utilesFran.Amadeus;

public class Cuenta {
	
	private Amadeus amadeus=new Amadeus();
	private static int id=100001;
	private int numCuenta;
	private float saldo;
	
	/**Constructor vac�o de Cuenta. Tiene un saldo cero, y un n�mero de cuenta incremental*/
	public Cuenta() {
		numCuenta=id;
		id++;	
		saldo=0;
	}
	
	/**
	 * Contructor de cuenta con un par�metro de entrada. Tiene un n�mero de cuenta incremental
	 * @param saldo Saldo inicial de la cuenta creada
	 * */
	public Cuenta(float saldo) throws IOException {
		numCuenta=id;
		id++;	
		if(saldo<0) {
			System.out.println("Al crear la cuenta, el saldo no debe ser negativo, vu�lvalo a introducir");
			saldo=amadeus.controlaFloatPositivo();
		}
		this.saldo=saldo;
	}

	/**
	 * M�todo para ingresar dinero en la cuenta
	 * @param saldo Cantidad de dinero a ingresar
	 * */
	public void ingresar(float saldo) throws IOException {
		if(saldo<0) {
			System.out.println("No puede ingresar un n�mero negativo, vu�lvalo a introducir");
			saldo=amadeus.controlaFloatPositivo();
		}
		this.saldo+=saldo;
	}
	
	/**
	 * M�todo para retirar dinero de la cuenta
	 * @param saldo Cantidad de dinero a retirar
	 * */
	public void extraer(float saldo) throws IOException {
		if(saldo<0) {
			System.out.println("No puede retirar un n�mero negativo, vu�lvalo a introducir");
			saldo=amadeus.controlaFloatPositivo();
		}
		this.saldo-=saldo;
	}
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	

}
