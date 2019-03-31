package ejercicio05;

public abstract class Empleado implements Calculos {
	
	private String nombre;
	private String dni;
	private int nhijos;
	
	public Empleado() {}

	/**
	 * Constructor de la clase Empleado
	 * @param nombre Nombre del empleado
	 * @param dni Dni del empleado
	 * */
	public Empleado(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "\nDNI: "+dni+"\nNombre: "+nombre;
	}

	public abstract double calcularSueldo();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * M�todo que calcula la cantidad de sueldo retenida dependiendo de la cantidad cobrada
	 * */
	@Override
	public double retencion() {
		// TODO Auto-generated method stub
		if(calcularSueldo()>=2500)
			return calcularSueldo()*0.2;
		
		else if(calcularSueldo()>=1500)
			return calcularSueldo()*0.18;
		
		else if(calcularSueldo()>=1000)
			return calcularSueldo()*0.15;
		
		else 
			return calcularSueldo()*0.12;
	}

	/**
	 * M�todo que calcula cu�nto le corresponde a un empleado de gratificaci�n
	 * dependiendo de su n�mero de hijos
	 * @param nhijos N�mero de hijos
	 * */
	@Override
	public double gratificacion(int nhijos) {
		// TODO Auto-generated method stub
		this.nhijos=nhijos;
		if(nhijos>3)
			return 300;
		else if(nhijos>=1)
			return 200;
		else
			return 0;
	}

	/**
	 * M�todo que calcula el sueldo, teniendo en cuenta la retenci�n y la gratificaci�n
	 * */
	@Override
	public double calcular() {
		return calcularSueldo()-retencion()+gratificacion(nhijos);
	}

	public int getNhijos() {
		return nhijos;
	}

	public void setNhijos(int nhijos) {
		this.nhijos = nhijos;
	}
	
	

}
