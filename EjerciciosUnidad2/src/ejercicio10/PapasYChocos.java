package ejercicio10;

public class PapasYChocos {
	
	private static int chocos;
	private static int papas;
	
	public PapasYChocos() {
		
	}
	
	public void addChocos(int x){
		chocos+=x;
		if(chocos<0)
			chocos=0;
	}
	
	public void addPapas(int x) {
		papas+=x;
		if(papas<0)
			papas=0;
	}
	
	public int getComensales() {
		int nClientes=0;
		int auxNClientes=0;
		if(chocos>=0.5 && papas>=1) {
			nClientes=papas*3;
			auxNClientes=chocos*6;
			}
		if(auxNClientes>nClientes)
			auxNClientes=nClientes;
		else
			nClientes=auxNClientes;
		return nClientes;
	}
	
	public void showChocos(){
		System.out.println("Quedan "+chocos+"Kg de chocos en el almacén");
	}
	public void showPapas(){
		System.out.println("Quedan "+papas+"Kg de papas en el almacén");
	}

}
