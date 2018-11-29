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
	 * Constructor de Docente, con nueve parámetros
	 * @param apellidos Apellidos del docente
	 * @param nombre Nombre del docente
	 * @param sexo Género del docente
	 * @param dni Número identificativo del docente
	 * @param categoria Categoria del docente
	 * @param estudios Estudios de posgrado que posee del docente
	 * @param horas Número de horas extra que ha realizado el docente este mes
	 * @param pago Cantidad pagada por hora extra al profesor
	 * */

	public Docente(String apellidos, String nombre, String sexo, int dni, int codigo, String categoria, String estudios, int horas, double pago) throws IOException {
		super(apellidos,nombre,sexo,dni);
		if(codigo<0) {
			System.out.println("Error en el código");
			codigo=amadeus.controlaIntPositivo();
		}
		this.codigo = codigo;
		this.categoria = amadeus.compruebaTexto(categoria);
		this.estudios = estudios;
		if(horas<0) {
			System.out.println("Error en las horas");
			horas=amadeus.controlaIntPositivo();
		}
		this.horas = horas;
		if(pago<0) {
			System.out.println("Error en las horas");
			pago=amadeus.controlaDoublePositivo();
		}
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


	public void setHoras(int horas) throws IOException {
		if(horas<0) {
			System.out.println("Error en las horas");
			horas=amadeus.controlaIntPositivo();
		}
		this.horas = horas;
	}


	public double getPago() {
		return pago;
	}


	public void setPago(double pago) throws IOException {
		if(pago<0) {
			System.out.println("Error en las horas");
			pago=amadeus.controlaDoublePositivo();
		}
		this.pago = pago;
	}
	
	/**
	 * Método que calcula cuánto debe percibir el docente por las horas extras trabajadas
	 * @return Cantidad de dinero que debe percibir el docente por sus horas extra
	 * */
	public double pagoParcial() {
		return horas*pago;
	}
	
	/**
	 * Método que devuelve los datos del Docente
	 * @return Ficha completa con todos los datos del docente
	 * */
	public String toString() {
		return super.toString()+"\nCódigo: "+codigo+"\nCategoria: "+categoria+"\nEstudios de Posgrado: "+estudios+"\nHoras de clase: "+horas+"\nPago por hora: "+pago;
	}
	
}
