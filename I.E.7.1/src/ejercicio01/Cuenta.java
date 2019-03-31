package ejercicio01;

public abstract class Cuenta {
	
	protected long numerocuenta;
	protected double saldo=0;
	protected Cliente cliente=new Cliente();
	
	/**
	 * Constructor p�blico de cliente
	 * @param cliente Cliente al cual le pertenece la cuenta
	 * @param numerocuenta N�mero de la cuenta
	 * */
	public 	Cuenta(Cliente cliente, long numerocuenta) {
		this.cliente=cliente;
		this.numerocuenta=numerocuenta;
	}

	/**
	 * M�todo para ingresar saldo en la cuenta
	 * @param cantidad Cantidad de dinero a ingresar en la cuenta
	 * */
	public void ingresarSaldo(double cantidad) {
		saldo+=cantidad;
	}
	
	/**
	 * M�todo para retirar saldo de la cuenta
	 * @param cantidad Cantidad de dinero a ingresar en la cuenta
	 * */
	public abstract void retirarSaldo(double cantidad); 
	
	
	public void actualizarSaldo() {
		
	}
	
	public long getNumerocuenta() {
		return numerocuenta;
	}


	public double getSaldo() {
		return saldo;
	}


	public Cliente getCliente() {
		return cliente;
	}

	

}
