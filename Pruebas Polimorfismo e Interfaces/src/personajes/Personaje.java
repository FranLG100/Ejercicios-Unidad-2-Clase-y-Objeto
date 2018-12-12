package personajes;

public abstract class Personaje {

	protected String nombre;
	
	public Personaje(String nombre) {
		this.nombre=nombre;
	}
	
	public void Ataca() {
		System.out.println("¡"+nombre+" ataca!");
	}
	
	public abstract void Defender();
	
}
