package ejercicio05;

import java.io.IOException;

import utilesFran.Amadeus;

public class Empleado {
	
	private Amadeus amadeus=new Amadeus();
	private String dni;
	private double sueldoBase;
	private double pagoHoraExtra;
	private int horasExtra;
	private double irpf;
	private boolean casado;
	private int nHijos;
	
	/**
	 * Constructor vac�o de la clase empleado. Crea un empleado con sus valores por defecto.
	 * */
	public Empleado() {
	}

	/**
	 * Constructor con un par�metro de la clase empleado. Crea un empleado con su n�mero identificativo.
	 * @param dni N�mero de identidad del empleado.
	 * @throws IOException 
	 * */
	public Empleado(String dni) throws IOException {
		this.dni = amadeus.compruebaNIF(dni);
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) throws IOException {
		this.dni = amadeus.compruebaNIF(dni);
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) throws IOException {
		if(sueldoBase<0) {
			System.out.println("Su empleado deber�a cobrar algo. Introduzca otra cantidad");
			sueldoBase=amadeus.controlaDoublePositivo();
		}
		this.sueldoBase = sueldoBase;
	}

	public double getPagoHoraExtra() {
		return pagoHoraExtra;
	}

	public void setPagoHoraExtra(double pagoHoraExtra) throws IOException {
		if(pagoHoraExtra<0) {
			System.out.println("Su empleado deber�a cobrar algo por las horas extra. Introduzca otra cantidad");
			pagoHoraExtra=amadeus.controlaDoublePositivo();
		}
		this.pagoHoraExtra = pagoHoraExtra;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) throws IOException {
		if(horasExtra<0) {
		System.out.println("Introduzca un n�mero de horas positiva");
		horasExtra=amadeus.controlaIntPositivo();
		}
		this.horasExtra = horasExtra;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) throws IOException {
		if(irpf>100 || irpf<0) {
			System.out.println("Valor no v�lido. Introduzca un valor entre 0 y 100");
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
	 * M�todo que calcula el pago que le corresponde al empleado por las horas extras realizadas
	 * @return Pago por las horas extras realizadas
	 * */
	public double calculaHorasExtra() {
		return pagoHoraExtra*horasExtra;
	}
	
	/**
	 * M�todo que calcula el sueldo bruto del empleado
	 * @return Pago del sueldo bruto del empleado, correspondiente a su sueldo base m�s el pago de sus horas extra
	 * */
	public double sueldoBruto() {
		return sueldoBase+calculaHorasExtra();
	}
	
	/**
	 * M�todo que calcula la retenci�n de IRPF sobre el sueldo bruto del empleado
	 * @return Retenci�n del IRPF (%) del sueldo bruto del empleado, teniendo en cuenta su n�mero de hijos y si est� o no casado.
	 * */
	public double calculoRetencion() {
		return sueldoBruto()*((irpf-nHijos-((casado)?2:0))/100);
	}

	/**
	 * M�todo que devuelve una ficha reducida del empleado
	 * @return Ficha con el Dni del empleado, estado civil y n�mero de hijos.
	 * */
	public String println() {
		return "DNI: "+dni+
				"\nCasado: "+((casado)?"S�":"No")
				+"\nN�mero de hijos: "+nHijos;
	}
	
	/**
	 * M�todo que devuelve una ficha completa del empleado
	 * @return Ficha con el Dni del empleado, estado civil, n�mero de hijos, sueldo base, complemento por horas extra
	 * , sueldo bruto, retenci�n de IRPF y su sueldo neto.
	 * */
	public String printAll() {
		return "DNI: "+dni
				+"\nCasado: "+((casado)?"S�":"No")
				+"\nN�mero de hijos: "+nHijos
				+"\nSueldo Base: "+sueldoBase
				+"\nComplemento por horas extra: "+calculaHorasExtra()
				+"\nSueldo Bruto: "+sueldoBruto()
				+"\nRetenci�n de IRPF: "+calculoRetencion()
				+"\nSueldo Neto: "+(sueldoBruto()-calculoRetencion());
				
	}

	/**
	 * M�todo copia los datos de un empleado en otro empleado
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
