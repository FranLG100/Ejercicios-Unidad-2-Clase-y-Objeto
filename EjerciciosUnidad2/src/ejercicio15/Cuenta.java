package ejercicio15;

public class Cuenta {
	
	private static int id=100001;
	private int numCuenta;
	private float saldo;
	
	public Cuenta() {
		numCuenta=id;
		id++;	
		saldo=0;
	}
	
	public Cuenta(float saldo) {
		numCuenta=id;
		id++;	
		this.saldo=saldo;
	}

	public void ingresar(float saldo) {
		this.saldo+=saldo;
	}
	
	public void extraer(float saldo) {
		this.saldo-=saldo;
	}
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	

}
