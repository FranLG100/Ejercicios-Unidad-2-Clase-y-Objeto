package ejercicio16;

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Guerreros archer=new Guerreros("Archer", 80, "Comecráneos");
		Magos stanley=new Magos("Stanley","Tormenta de ácido");
		
		archer.combatir(70);
		archer.combatir(20);
		archer.alimentarse(90);
		archer.combatir(20);
		archer.alimentarse(10);
		System.out.println();
		System.out.println(stanley.encantar());
		stanley.alimentarse(10);
		System.out.println(stanley.encantar());
		System.out.println(stanley.encantar());
		System.out.println(stanley.encantar());
		stanley.alimentarse(5);
	}

}
