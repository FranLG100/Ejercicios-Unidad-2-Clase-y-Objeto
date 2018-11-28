package ejercicio05;

public class Empleado {
	
	private int dni;
	private double sueldoBase;
	private double pagoHoraExtra;
	private int horasExtra;
	private double irpf;
	private boolean casado;
	private int nHijos;
	
	/**
	 * Constructor vacío de la clase empleado. Crea un empleado con sus valores por defecto.
	 * */
	public Empleado() {
	}

	/**
	 * Constructor con un parámetro de la clase empleado. Crea un empleado con su número identificativo.
	 * @param dni Número de identidad del empleado.
	 * */
	public Empleado(int dni) {
		this.dni = dni;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public double getPagoHoraExtra() {
		return pagoHoraExtra;
	}

	public void setPagoHoraExtra(double pagoHoraExtra) {
		this.pagoHoraExtra = pagoHoraExtra;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		if(irpf>100) {
			irpf=100;
			System.out.println("El valor no puede ser más de 100, se pondrá a 100 por defecto");
		}
		if(irpf<0)
		{
			irpf=0;
			System.out.println("El valor no puede ser menos de 0, se pondrá a 0 por defecto");
		}
		this.irpf = irpf;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getnHijos() {
		return nHijos;
	}

	public void setnHijos(int nHijos) {
		this.nHijos = nHijos;
	}
	
	/**
	 * Método que calcula el pago que le corresponde al empleado por las horas extras realizadas
	 * @return Pago por las horas extras realizadas
	 * */
	public double calculaHorasExtra() {
		return pagoHoraExtra*horasExtra;
	}
	
	/**
	 * Método que calcula el sueldo bruto del empleado
	 * @return Pago del sueldo bruto del empleado, correspondiente a su sueldo base más el pago de sus horas extra
	 * */
	public double sueldoBruto() {
		return sueldoBase+calculaHorasExtra();
	}
	
	/**
	 * Método que calcula la retención de IRPF sobre el sueldo bruto del empleado
	 * @return Retención del IRPF (%) del sueldo bruto del empleado, teniendo en cuenta su número de hijos y si está o no casado.
	 * */
	public double calculoRetencion() {
		return sueldoBruto()*((irpf-nHijos-((casado)?2:0))/100);
	}

	/**
	 * Método que devuelve una ficha reducida del empleado
	 * @return Ficha con el Dni del empleado, estado civil y número de hijos.
	 * */
	public String println() {
		return "DNI: "+dni+
				"\nCasado: "+((casado)?"Sí":"No")
				+"\nNúmero de hijos: "+nHijos;
	}
	
	/**
	 * Método que devuelve una ficha completa del empleado
	 * @return Ficha con el Dni del empleado, estado civil, número de hijos, sueldo base, complemento por horas extra
	 * , sueldo bruto, retención de IRPF y su sueldo neto.
	 * */
	public String printAll() {
		return "DNI: "+dni
				+"\nCasado: "+((casado)?"Sí":"No")
				+"\nNúmero de hijos: "+nHijos
				+"\nSueldo Base: "+sueldoBase
				+"\nComplemento por horas extra: "+calculaHorasExtra()
				+"\nSueldo Bruto: "+sueldoBruto()
				+"\nRetención de IRPF: "+calculoRetencion()
				+"\nSueldo Neto: "+(sueldoBruto()-calculoRetencion());
				
	}

	/**
	 * Método copia los datos de un empleado en otro empleado
	 * @param e Empleado del cual deseamos copiar los datos.
	 * */
	public void copiaEmpleado(Empleado e) {
		this.dni = e.dni;
		this.sueldoBase = e.sueldoBase;
		this.pagoHoraExtra = e.pagoHoraExtra;
		this.horasExtra = e.horasExtra;
		this.irpf = e.irpf;
		this.casado = e.casado;
		this.nHijos = e.nHijos;
	}
	
	
	
	

}
