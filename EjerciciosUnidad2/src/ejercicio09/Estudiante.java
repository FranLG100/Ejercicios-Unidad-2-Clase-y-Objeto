package ejercicio09;

import java.io.IOException;

public class Estudiante extends Persona{

	private int codigo;
	private String categoria;
	private double pagoPensiones;
	private String colegio;
	

	/**
	 * Constructor de Estudiante, con nueve par�metros
	 * @param apellidos Apellidos del estudiante
	 * @param nombre Nombre del estudiante
	 * @param sexo G�nero del estudiante
	 * @param dni N�mero identificativo del estudiante
	 * @param codigo C�digo del estudiante
	 * @param categoria Categor�a del estudiante
	 * @param pagoPensiones Pago de pensiones del estudiante
	 * @param colegio Colegio del cual procede el estudiante
	 * @throws IOException 
	 * */
	public Estudiante(String apellidos, String nombre, String sexo, String dni, int codigo, String categoria,
			int pagoPensiones, String colegio) throws IOException {
		super(apellidos, nombre, sexo, dni);
		this.codigo = codigo;
		this.categoria = amadeus.compruebaTexto(categoria);
		if(pagoPensiones<0) {
			System.out.println("El pago de pensiones no puede ser negativo, vuelva a introducir");
			pagoPensiones=amadeus.controlaIntPositivo();
		}
		this.pagoPensiones = pagoPensiones;
		this.colegio = colegio; //He dejado que s� pueda ponerse en blanco
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


	public void setCategoria(String categoria) throws IOException {
		this.categoria = amadeus.compruebaTexto(categoria);
	}


	public double getPagoPensiones() {
		return pagoPensiones;
	}


	public void setPagoPensiones(int pagoPensiones) throws IOException {
		if(pagoPensiones<0) {
			System.out.println("El pago de pensiones no puede ser negativo, vuelva a introducir");
			pagoPensiones=amadeus.controlaIntPositivo();
		}
		this.pagoPensiones = pagoPensiones;
	}


	public String getColegio() {
		return colegio;
	}


	public void setColegio(String colegio) {
		this.colegio = colegio;
	}
	
	/**
	 * M�todo que devuelve un pago parcial del Estudiante, teniendo en cuenta su promedio
	 * de pago de pensiones
	 * @param promedio Promedio (porcentaje) del pago de pensiones
	 * @return Pago parcial del Estudiante
	 * */
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


	/**
	 * M�todo que devuelve los datos del Estudiante
	 * @return Ficha completa con todos los datos del estudiante
	 * */
	@Override
	public String toString() {
		return super.toString()+"\nC�digo: "+codigo+"\nCategoria: "+categoria+"\nPago Pensiones: "+pagoPensiones+"\nColegio Anterior: "+colegio;
	}
	
	
	
	
	

}
