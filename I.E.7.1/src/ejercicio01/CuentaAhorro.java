package ejercicio01;

public class CuentaAhorro extends Cuenta {

	private double interes;
	private double saldoMinimo;
	
	/**
	 * Constructor de la clase CuentaAhorro
	 * @param interes Inter�s variable de la cuenta
	 * @param saldoMinimo Saldo m�nimo de la cuenta ahorro. El saldo no podr� bajar de esa cantidad una vez se alcance
	 * */
	public CuentaAhorro(Cliente cliente, long numerocuenta, double interes, double saldoMinimo) {
		super(cliente, numerocuenta);
		this.interes=interes;
		this.saldoMinimo=saldoMinimo;
	}


	/**
	 * M�todo para retirar saldo de la cuenta. No puede retirarse dinero si la cantidad
	 * no llega al m�nimo, o si sacando la cantidad, se bajase del mismo.
	 * @param cantidad Saldo a retirar
	 * */
	public void retirarSaldo(double cantidad) {
		if(saldo<saldoMinimo)
			System.out.println("No se puede retirar dicha cantidad, a�n no hemos llegado a los "+saldoMinimo+"�");
		else if((saldo-cantidad)<saldoMinimo) 
			System.out.println("No se puede retirar dicha cantidad, bajar�amos de los "+saldoMinimo+"�");
		else
			saldo-=cantidad;
		
	}
	
	@Override
	public String toString() {
		return "\nN�mero de cuenta: "+numerocuenta+"\nCliente: "+cliente.getNombre()+" "+cliente.getApellidos()+"\nSaldo: "+saldo;
	}

	/**
	 * M�todo para actualizar la cantidad de dinero en la cuenta.
	 * */
	@Override
	public void actualizarSaldo() {
		saldo=saldo+(saldo*(interes/100));
	}

	public double getInteres() {
		return interes;
	}


	public void setInteres(double interes) {
		this.interes = interes;
	}
	
	
	
	
	
}
