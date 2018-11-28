package ejercicio09;

import java.io.IOException;

import utilesFran.Amadeus;

public class Docente extends Persona{

	private int codigo;
	private String categoria;
	private String estudios;
	private int horas;
	private double pago;
	private Amadeus amadeus=new Amadeus();
	
	
	
	/**
	 * 
	 * */
	public Docente(String apellidos, String nombre, String sexo, int dni, int codigo, String categoria, String estudios, int horas, double pago) throws IOException {
		super(apellidos,nombre,sexo,dni);
		if(codigo<0) {
			System.out.println("Error en el código");
			codigo=amadeus.controlaIntPositivo();
		}
		this.codigo = codigo;
		this.categoria = categoria;
		this.estudios = estudios;
		this.horas = horas;
		this.pago = pago;
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


	public String getEstudios() {
		return estudios;
	}


	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public double getPago() {
		return pago;
	}


	public void setPago(double pago) {
		this.pago = pago;
	}
	
	public double pagoParcial() {
		return horas*pago;
	}
	
	public String toString() {
		return super.toString()+"\nCódigo: "+codigo+"\nCategoria: "+categoria+"\nEstudios de Posgrado: "+estudios+"\nHoras de clase: "+horas+"\nPago por hora: "+pago;
	}
	
}
