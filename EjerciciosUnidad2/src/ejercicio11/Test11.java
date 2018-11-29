package ejercicio11;

import java.io.IOException;

public class Test11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Triangulo t1=new Triangulo(2,4,6);
		Triangulo t2=new Triangulo(6,2,4);
		Triangulo t3=new Triangulo(4,6,2);
		Triangulo t4=new Triangulo(4,4,4);
		Triangulo t5=new Triangulo(4,6,4);
		Triangulo[] vt1= {t1,t2,t3};
		Triangulo[] vt2= {t1,t4,t2};
		
		//Comprobación de los métodos
		/*Como vemos, los triángulos son iguales sin importar el orden de sus lados*/
		System.out.println(t1.compareTo_Triangulos(t1, t3));
		/*En este caso, son desiguales*/
		System.out.println(t1.compareTo_Triangulos(t1, t4)); 
		/*Estos tres triángulos son iguales, solo cambia el orden de sus lados*/
		System.out.println(t1.compareTo_VTriangulos(vt1));
		/*Estos, no lo son*/
		System.out.println(t1.compareTo_VTriangulos(vt2));
		/*Equilátero*/
		System.out.println(t4.tipo_Triangulo());
		/*Isósceles*/
		System.out.println(t5.tipo_Triangulo());
		/*Escaleno*/
		System.out.println(t1.tipo_Triangulo());
	}

}
