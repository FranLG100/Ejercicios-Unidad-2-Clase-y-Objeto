package ejercicio17;

public class Servidor extends Ordenador{
	
	private int monitor;
	private String teclado;
	private String raton;
	
	public Servidor() {
		
	}
	
	

	public Servidor(int ram, int discoDuro, String procesador, String grafica, double precio, int monitor, String teclado, String raton) {
		super(ram, discoDuro, procesador, grafica, precio);
		this.monitor=monitor;
		this.teclado=teclado;
		this.raton=raton;
	}
	

	public int getMonitor() {
		return monitor;
	}

	public void setMonitor(int monitor) {
		this.monitor = monitor;
	}

	public String getTeclado() {
		return teclado;
	}

	public void setTeclado(String teclado) {
		this.teclado = teclado;
	}

	public String getRaton() {
		return raton;
	}

	public void setRaton(String raton) {
		this.raton = raton;
	}



	@Override
	public String toString() {
		return super.toString()+"\nTamanho del monitor: "+monitor
				+"\nTipo de teclado: "+teclado
				+"\nTipo de ratón: "+raton;
	}
	
	
	
	

}
