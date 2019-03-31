package ejercicio06;

import java.util.Map;
import java.util.TreeMap;

public class Catalogo {

	private TreeMap<Integer,Obra> catalogo=new TreeMap<Integer,Obra>();
	private boolean error=false;
	
	public Catalogo() {}
	
	/**
	 * M�todo para a�adir una obra al cat�logo.
	 * Comprueba que dicha obra no sea una falsificaci�n y que su n�mero no se encuentre en el cat�logo
	 * @param obra Obra a a�adir al cat�logo
	 * */
	public void addObra(Obra obra) {
		error=false;
		if(catalogo.containsKey(obra.getNumInventario())) {
			System.out.println("Ese n�mero de cat�logo ya est� incluido en nuestro cat�logo");
			error=true;
		}
		else {
			if(obra instanceof Escultura) {
				for (Map.Entry<Integer, Obra> escultura : catalogo.entrySet()) {
					if(escultura.getValue() instanceof Escultura) {
						if(((Escultura) escultura.getValue()).equalsEscultura((Escultura)obra)) {
							System.out.println("Ya tenemos una obra con esas caracter�sticas en nuestro museo.");
							System.out.println("�Est� intentando incluir una falsificaci�n?");
							error=true;
						}
					}
				}
			}
			
			if(obra instanceof Pintura) {
				for (Map.Entry<Integer, Obra> pintura : catalogo.entrySet()) {
					if(pintura.getValue() instanceof Pintura) {
						if(((Pintura) pintura.getValue()).equalsPintura((Pintura)obra)) {
							System.out.println("Ya tenemos una obra con esas caracter�sticas en nuestro museo.");
							System.out.println("�Est� intentando incluir una falsificaci�n?");
							error=true;
						}
					}
				}
			}
		}
		if(!error) {
			System.out.println("La obra ha sido a�adida con �xito");
			catalogo.put(obra.getNumInventario(), obra);
		}
		
	}
	
	/**
	 * M�todo que eliminar una obra del cat�logo
	 * @param num N�mero de inventario de la obra a eliminar
	 * */
	public void eliminarObra(int num) {
		if(!catalogo.containsKey(num))
			System.out.println("Esa obra no existe en nuestro cat�logo");
		else {
			catalogo.remove(num);
			System.out.println("Obra eliminada con �xito");
		}
			
	}
	
	/**
	 * M�todo para buscar una obra en el cat�logo
	 * @param num N�mero de inventario de la obra a buscars
	 * */
	public void buscarObra(int num) {
		if(!catalogo.containsKey(num))
			System.out.println("Esa obra no existe en nuestro cat�logo");
		else {
			System.out.println(catalogo.get(num));
		}
	}
	
	/**
	 * M�todo que obtiene la superficie total que ocupan los cuadros del cat�logo
	 * */
	public void obtenerSuperficie() {
		int superficie=0;
		for (Map.Entry<Integer, Obra> pintura : catalogo.entrySet()) {
			if(pintura.getValue() instanceof Pintura)
				superficie+=((((Pintura) pintura.getValue()).getAncho())*(((Pintura) pintura.getValue()).getAlto()));
		}
		
		System.out.println("La superficie total de las pinturas que alberga el museo es de "+((double)(superficie/10000))+"m2.");
	}
	
	/**
	 * M�todo que halla la estatua m�s alta que se encuentra actualmente en el museo
	 * */
	public void masAlta() {
		int alt=0;
		int aux = 0;
		for (Map.Entry<Integer, Obra> escultura : catalogo.entrySet()) {
			if(escultura.getValue() instanceof Escultura) {
				if(alt<((Escultura) escultura.getValue()).getAltura())
					aux=escultura.getKey();
			}
		}
		
		System.out.println("La escultura m�s alta del museo es la obra n�"+aux);
	}

	public TreeMap<Integer, Obra> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(TreeMap<Integer, Obra> catalogo) {
		this.catalogo = catalogo;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}
	
	
	
}
