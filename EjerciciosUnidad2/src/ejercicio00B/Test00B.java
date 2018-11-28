package ejercicio00B;

public class Test00B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Numero n=new Numero(5);
		
		n.Aniade(2);
		System.out.println(n.getValor());
		n.Resta(2);
		System.out.println(n.getValor());
		System.out.println(n.getDoble());
		System.out.println(n.getTriple());
	}

}
