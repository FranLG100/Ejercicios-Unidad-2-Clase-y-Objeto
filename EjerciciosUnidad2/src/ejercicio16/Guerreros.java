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
			System.out.println(nombre+" no tiene la energ�a suficiente para hacer eso.");
		else {
			energia-=ataque;
			System.out.println("�S�ii! �"+nombre+" ha atacado con gran venganza y furiosa c�lera con su fiel "+arma+", y todav�a le quedan "+energia+"ptos de energ�a!");
		}
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}
	
	

	
	
	

}
