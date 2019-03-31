package ejercicio05;

public class Comercial extends Empleado {

	private double sueldoBruto;
	private double importeVentas;
	
	public Comercial() {
	}


	public Comercial(String nombre, String dni) {
		super(nombre, dni);
	}
	
	/**
	 * Constructor de la clase Comercial
	 * @param sueldoBruto Sueldo bruto del comercial
	 * @param importeVentas Importe que le corresponden al comercial por ventas realizadas
	 * */
	public Comercial(String nombre, String dni, double sueldoBruto, double importeVentas) {
		super(nombre, dni);
		this.importeVentas=importeVentas;
		this.sueldoBruto=sueldoBruto;
	}

	public String toString() {
		return super.toString()+"\nSueldo bruto: "+sueldoBruto+"\nImporte de las Ventas: "+importeVentas;
	}

	/**
	 * M�todo para calcular el sueldo del comercial
	 * @return Sueldo Bruto m�s comisi�n sobre el importe de ventas
	 * */
	@Override
	public double calcularSueldo() {
		return sueldoBruto+calcularComision();
	}
	
	/**
	 * M�todo que calcula la comisi�n que le corresponde al comercial
	 * @return Comisi�n que le corresponde al comercial
	 * */
	public double calcularComision() {
		return importeVentas*0.1;
	}


	public double getSueldoBruto() {
		return sueldoBruto;
	}


	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}


	public double getImporteVentas() {
		return importeVentas;
	}


	public void setImporteVentas(double importeVentas) {
		this.importeVentas = importeVentas;
	}
	
	
}
