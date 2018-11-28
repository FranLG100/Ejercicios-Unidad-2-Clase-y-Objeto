package ejercicio12;

public class Empleado {

	private String nombre;
	private int nHoras;
	private int pago;
	
	
	public Empleado(String nombre, int nHoras, int pago) {
		super();
		this.nombre = nombre;
		this.nHoras = nHoras;
		this.pago = pago;
	}


	public double pagoEmpleado() {
		if(nHoras<=40)
			return nHoras*pago;
		else
			return (40*pago)+((nHoras-40)*(pago*1.5));
	}
	
	@Override
	public String toString() {
		return nombre+" trabajó "+nHoras+" horas, cobra "+pago+" euros la hora, por lo que le corresponde un sueldo de "+pagoEmpleado()+" euros \n";
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getnHoras() {
		return nHoras;
	}


	public void setnHoras(int nHoras) {
		this.nHoras = nHoras;
	}


	public int getPago() {
		return pago;
	}


	public void setPago(int pago) {
		this.pago = pago;
	}
	
	
	
}
