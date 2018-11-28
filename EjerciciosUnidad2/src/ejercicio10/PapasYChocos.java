package ejercicio10;

public class PapasYChocos {
	
	private static int chocos;
	private static int papas;
	
	/**
	 * Constructor por defecto de Papas y Chocos. Comienza con 0 Kgs de papas y chocos
	 * */
	public PapasYChocos() {
		
	}
	
	
	/**
	 * M�todo que a�ade/resta Kgs de choco al almac�n. Nunca baja por debajo de 0Kg
	 * @param x Kg de choco a a�adir 
	 * */
	public void addChocos(int x){
		chocos+=x;
		if(chocos<0) {
			System.out.println("�Nos hemos quedado sin chocos!");
			chocos=0;
		}
	}
	
	/**
	 * M�todo que a�ade/resta Kgs de papas al almac�n. Nunca baja por debajo de 0Kg
	 * @param x Kg de papas a a�adir 
	 * */
	public void addPapas(int x) {
		papas+=x;
		if(papas<0){
			System.out.println("�Nos hemos quedado sin papas!");
			papas=0;
		}
	}
	
	/**
	 * M�todo que devuelve la cantidad de comensales a los que se pueden atender
	 * @return Cantidad de comensales que se pueden atender, teniendo en cuenta que con 1Kg de papas y 0,5Kg de chocos se alimenta a tres personas
	 * */
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
	
	/**
	 * M�todo que muestra la cantidad de chocos que quedan en el almac�n
	 * */
	public void showChocos(){
		System.out.println("Quedan "+chocos+"Kg de chocos en el almac�n");
	}
	
	/**
	 * M�todo que muestra la cantidad de papas que quedan en el almac�n
	 * */
	public void showPapas(){
		System.out.println("Quedan "+papas+"Kg de papas en el almac�n");
	}

}
