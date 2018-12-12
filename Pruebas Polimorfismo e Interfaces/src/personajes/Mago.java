package personajes;

public class Mago extends Personaje implements Jugador{

	public Mago(String nombre) {
		super(nombre);
	}
	

	public void Ataca() {
		System.out.println("¡"+nombre+" lanza un hechizo!");
	}


	@Override
	public void Defender() {
		// TODO Auto-generated method stub
		System.out.println("El mago se defiende");
	}


	@Override
	public void Gritar() {
		// TODO Auto-generated method stub
		System.out.println("¡Chúpate esa!");
	}
	
	public void Leer() {
		System.out.println("El mago lee");
	}
	
}
