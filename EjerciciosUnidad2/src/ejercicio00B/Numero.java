package ejercicio00B;

public class Numero {
	
	private double numero;
	
	Numero(){
		numero=0;
	}
	
	Numero(double numero){
		this.numero=numero;
	}

	public double getValor() {
		return numero;
	}
	
	public double getDoble() {
		return numero*2;
	}
	
	public double getTriple() {
		return numero*3;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}
	
	public void Aniade(double num) {
		this.numero+=num;
	}
	
	public void Resta(double num) {
		this.numero-=num;
	}

}
