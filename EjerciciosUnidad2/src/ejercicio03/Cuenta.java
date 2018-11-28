package ejercicio03;

public class Cuenta {
	
	private static long id=100001; //Nos servirá para llevar un número de cuenta incremental
	private long nCuenta; //Número de cuenta
	private long dni;
	private double saldoActual;
	private double interes;
	
	/**
	 * Constructor vacío. Crea una cuenta bancaria con los datos por defecto.
	 * Se le asigna un número de cuenta incremental.
	 */
	public Cuenta() {
		nCuenta=id;
		id++;
		dni=10000000;
		saldoActual=0;
		interes=0;
	}
	
	/**
	 * Constructor con tres parámetros.
	 * @param dni Número de identificación del dueño de la cuenta
	 * @param saldoActual Cantidad de dinero disponible en la cuenta.
	 * @param interes Porcentaje de interés aplicado a la cuenta. No puede ser menor a 0 o mayor a 100.
	 */
	public Cuenta(long dni, double saldoActual, double interes) {
		nCuenta=id;
		id++;
		this.dni=dni;
		this.saldoActual=saldoActual;
		if(interes>100)
			this.interes=100;
		if(interes<0)
			this.interes=0;
		this.interes=interes;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		if(interes>100)
			this.interes=100;
		if(interes<0)
			this.interes=0;
		this.interes = interes;
	}
	
	/**
	 * Método que actualiza la cantidad de dinero de la cuenta bancaria.
	 * Al emplearlo, se le suma el interés diario (porcentaje de interés entre 365 días) al saldo actual.
	 * */
	public void actualizarSaldo() {
		saldoActual+=(saldoActual*(interes/36500));
	}
	
	/**
	 * Método que ingresa/suma dinero al saldo actual de la cuenta bancaria.
	 * @param ingreso Cantidad de dinero a ingresar en la cuenta.
	 * */
	public void ingreso(double ingreso) {
		if(ingreso<0)
			System.out.println("No puede hacer un ingreso negativo");
		else
			saldoActual+=ingreso;
	}
	
	/**
	 * Método que retira/extrae dinero del saldo actual de la cuenta bancaria.
	 * @param retirar Cantidad de dinero a retirar de la cuenta.
	 * */
	public void retirar(double retirar) {
		if(retirar<0)
			System.out.println("Ponga valores positivos");
		else
			saldoActual-=retirar;
	}
	
	/**
	 * Método que muestra los datos de la cuenta bancaria
	 * @return Texto mostrando el estado actual de la cuenta, así como su número identificativo y su dueño
	 * */
	public String mostrarCuenta() {
		return "Número de cuenta: "+nCuenta+
				"\nDNI: "+dni+
				"\nSaldo actual: "+saldoActual+
				"\nInterés anual: "+interes;
	}
	
	
	
	

}
