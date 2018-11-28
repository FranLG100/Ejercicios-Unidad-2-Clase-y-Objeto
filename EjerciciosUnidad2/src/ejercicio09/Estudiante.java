package ejercicio09;

public class Estudiante extends Persona{

	private int codigo;
	private String categoria;
	private double pagoPensiones;
	private String colegio;
	

	public Estudiante(String apellidos, String nombre, String sexo, int dni, int codigo, String categoria,
			int pagoPensiones, String colegio) {
		super(apellidos, nombre, sexo, dni);
		this.codigo = codigo;
		this.categoria = categoria;
		this.pagoPensiones = pagoPensiones;
		this.colegio = colegio;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public double getPagoPensiones() {
		return pagoPensiones;
	}


	public void setPagoPensiones(int pagoPensiones) {
		this.pagoPensiones = pagoPensiones;
	}


	public String getColegio() {
		return colegio;
	}


	public void setColegio(String colegio) {
		this.colegio = colegio;
	}
	
	public double pagoParcial(double promedio) {
		double pago=0;
		if(promedio<13)
			pago=pagoPensiones;
		else if(promedio>=13 && promedio<=16)
			pago= pagoPensiones-pagoPensiones*0.08;
		else if(promedio>16)
			pago=pagoPensiones-pagoPensiones*0.15;
		return pago;
	}


	@Override
	public String toString() {
		return super.toString()+"\nCódigo: "+codigo+"\nCategoria: "+categoria+"\nPago Pensiones: "+pagoPensiones+"\nColegio Anterior: "+colegio;
	}
	
	
	
	
	

}
