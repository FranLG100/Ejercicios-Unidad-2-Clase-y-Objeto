package ejercicio10;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PapasYChocos pyc=new PapasYChocos();
		
		pyc.showPapas();
		System.out.println(pyc.getComensales());
		pyc.addPapas(1);
		pyc.addChocos(2);
		pyc.showPapas();
		pyc.showChocos();
		System.out.println(pyc.getComensales());

	}

}
