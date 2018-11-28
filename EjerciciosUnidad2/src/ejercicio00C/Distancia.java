package ejercicio00C;

public class Distancia {
	
	double millas;
	
	Distancia(){
		millas=0;
	}
	
	Distancia(double millas){
		this.millas=millas;
	}
	
	public double getMillas() {
		return millas;
	}

	public void setMillas(double millas) {
		this.millas = millas;
	}

	public double millasAMetros() {
		return millas*1852;
	}
	
	public double millasAKilometros() {
		return millas*1.852;
	}

}
