package ejercicio16;

public class Magos extends Personajes {

	private String poder;
	
	public Magos (String nombre, String poder) {
		this.nombre=nombre;
		this.maxEnergia=100;
		energia=this.maxEnergia;
		this.poder=poder;
	}
	
	public String encantar() {
		energia-=2;
		return  "El poderoso mago "+nombre+" ha usado su poder "+poder+" para acabar con sus enemigos. Le quedan "+energia+"ptos de energía.";
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}
	
	
}
