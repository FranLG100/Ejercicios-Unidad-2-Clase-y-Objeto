package ejercicio05;

import java.io.IOException;

import utilesFran.Amadeus;

public class Empleado {
	
	private Amadeus amadeus=new Amadeus();
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
	 * @throws IOException 
	 * */
	public Empleado(int dni) throws IOException {
		if(dni<0) {
			System.out.println("El DNI no puede ser negativo. Introduzca otro");
			dni=amadeus.controlaIntPositivo();
		}
		this.dni = dni;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) throws IOException {
		if(dni<0) {
			System.out.println("El DNI no puede ser negativo. Introduzca otro");
			dni=amadeus.controlaIntPositivo();
		}
		this.dni = dni;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) throws IOException {
		if(sueldoBase<0) {
			System.out.println("Su empleado debería cobrar algo. Introduzca otra cantidad");
			sueldoBase=amadeus.controlaDoublePositivo();
		}
		this.sueldoBase = sueldoBase;
	}

	public double getPagoHoraExtra() {
		return pagoHoraExtra;
	}

	public void setPagoHoraExtra(double pagoHoraExtra) throws IOException {
		if(pagoHoraExtra<0) {
			System.out.println("Su empleado debería cobrar algo por las horas extra. Introduzca otra cantidad");
			pagoHoraExtra=amadeus.controlaDoublePositivo();
		}
		this.pagoHoraExtra = pagoHoraExtra;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) throws IOException {
		if(horasExtra<0) {
		System.out.println("Introduzca un número de horas positiva");
		horasExtra=amadeus.controlaIntPositivo();
		}
		this.horasExtra = horasExtra;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) throws IOException {
		if(irpf>100 || irpf<0) {
			System.out.println("Valor no válido. Introduzca un valor entre 0 y 100");
			irpf=amadeus.controlaDoublePorcentaje();
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

	public void setnHijos(int nHijos) throws IOException {
		if(nHijos<0) {
			System.out.println("No puede tener hijos negativos. Introduzca otro valor");
			nHijos=amadeus.controlaIntPositivo();
		}
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
