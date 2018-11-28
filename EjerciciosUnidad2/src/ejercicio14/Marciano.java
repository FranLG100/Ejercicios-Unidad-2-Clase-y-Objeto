package ejercicio14;

public class Marciano {

	private static int numMarcianos=0;
	private boolean vivo;
	private String nombre;
	
	public Marciano(String nombre) {
		numMarcianos++;
		this.nombre=nombre;
		this.vivo=true;
		Nace();
	}
	
	public void Nace() {
		System.out.println("Hola, he nacido y soy el marciano "+nombre);
	}
	
	public void Muere() {
		if(vivo) {
			System.out.println("El marciano "+nombre+" ha muerto");
			vivo=false;
			numMarcianos--;
		}else {
			System.out.println(nombre +" ya está muerto.");
		}
		
	}
	
	public void estaVivo() {
		if(vivo)
			System.out.println(nombre+" está vivo.");
		else
			System.out.println(nombre+" está muerto.");
	}
	
	public void cuentaMarcianos() {
		System.out.println("Hay "+numMarcianos+" marcianos con vida.");
	}
}
