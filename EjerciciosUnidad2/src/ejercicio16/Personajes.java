package ejercicio16;

public class Personajes {
	
	protected String nombre;
	protected int energia;
	protected int maxEnergia;
	
	public Personajes() {
		nombre="";
		maxEnergia=0;
		energia=maxEnergia;
	}
	
	public Personajes(String nombre, int maxEnergia) {
		this.nombre=nombre;
		this.maxEnergia=maxEnergia;
		this.energia=this.maxEnergia;
	}
	
	public void alimentarse(int alimento) {
		energia+=alimento;
		if(energia>maxEnergia) {
			System.out.println(nombre+ " ahora est� a tope de energ�a, ya no puede alimentarse m�s.");
			energia=maxEnergia;
		}else
			System.out.println(nombre+" se ha alimentado y ha recuperado "+alimento+"ptos de energ�a.");
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMaxEnergia() {
		return maxEnergia;
	}
	public void setEnergia(int maxEnergia) {
		this.maxEnergia = maxEnergia;
	}
	
	

}
