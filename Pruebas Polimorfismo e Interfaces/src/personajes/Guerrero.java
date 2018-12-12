package personajes;

public class Guerrero extends Personaje implements Jugador {

	public Guerrero(String nombre) {
		super(nombre);
	}
	
	public void Ataca() {
		System.out.println("¡"+nombre+" pega un hachazo!");
	}

	@Override
	public void Defender() {
		// TODO Auto-generated method stub
		System.out.println("El guerrero se defiende");
	}

	@Override
	public void Gritar() {
		// TODO Auto-generated method stub
		System.out.println("¡WAAAAAGH!");
	}
	
	public void Cargar() {
		System.out.println("El guerrero carga");
	}
	
}
