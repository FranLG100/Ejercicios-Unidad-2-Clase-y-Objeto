package ejercicio16;

public class Guerreros extends Personajes{
	
	private String arma;

	public Guerreros(String nombre, int maxEnergia,String arma) {
		super(nombre,maxEnergia);
		energia=this.maxEnergia;
		this.arma = arma;
	}
	
	public void combatir(int ataque) {
		if(ataque>energia)
			System.out.println(nombre+" no tiene la energía suficiente para hacer eso.");
		else {
			energia-=ataque;
			System.out.println("¡Síii! ¡"+nombre+" ha atacado con gran venganza y furiosa cólera con su fiel "+arma+", y todavía le quedan "+energia+"ptos de energía!");
		}
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}
	
	

	
	
	

}
