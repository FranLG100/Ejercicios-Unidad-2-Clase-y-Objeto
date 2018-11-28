package ejercicio11;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangulo t1=new Triangulo(2,4,6);
		Triangulo t2=new Triangulo(6,2,4);
		Triangulo t3=new Triangulo(4,6,2);
		Triangulo t4=new Triangulo(4,4,4);
		Triangulo t5=new Triangulo(4,6,4);
		Triangulo[] vt1= {t1,t2,t3};
		Triangulo[] vt2= {t1,t4,t2};
		
		System.out.println(t1.compareTo_Triangulos(t1, t3));
		System.out.println(t1.compareTo_Triangulos(t1, t4));
		System.out.println(t1.compareTo_VTriangulos(vt1));
		System.out.println(t1.compareTo_VTriangulos(vt2));
		System.out.println(t4.tipo_Triangulo());
		System.out.println(t5.tipo_Triangulo());
		System.out.println(t1.tipo_Triangulo());
	}

}
