package ejercicio11;

import java.util.Arrays;

public class Triangulo {
	
	private double long_lado1;
	private double long_lado2;
	private double long_lado3;
	
	
	public Triangulo(double long_lado1, double long_lado2, double long_lado3) {
		super();
		this.long_lado1 = long_lado1;
		this.long_lado2 = long_lado2;
		this.long_lado3 = long_lado3;
	}
	
	
	
	public double getLong_lado1() {
		return long_lado1;
	}



	public void setLong_lado1(double long_lado1) {
		this.long_lado1 = long_lado1;
	}



	public double getLong_lado2() {
		return long_lado2;
	}



	public void setLong_lado2(double long_lado2) {
		this.long_lado2 = long_lado2;
	}



	public double getLong_lado3() {
		return long_lado3;
	}



	public void setLong_lado3(double long_lado3) {
		this.long_lado3 = long_lado3;
	}



	public boolean compareTo_Triangulos(Triangulo a, Triangulo b) {
		double[] t1= {a.getLong_lado1(), a.getLong_lado2(), a.getLong_lado3()};
		double[] t2= {b.getLong_lado1(), b.getLong_lado2(), b.getLong_lado3()};
		
		Arrays.sort(t1);
		Arrays.sort(t2);
		
		return (t1[0]==t2[0] && t1[1]==t2[1] && t1[2]==t2[2]);
		
	}
	
	public boolean compareTo_VTriangulos(Triangulo v[]) {
		boolean comprobador=true;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				comprobador=v[i].compareTo_Triangulos(v[i], v[j]);
				if(!comprobador)
					break;
			}
		}
		return comprobador;
	}
	
	public int tipo_Triangulo() {
		if(long_lado1==long_lado2 && long_lado1==long_lado3)
			return 1;
		else if(long_lado2==long_lado3 || long_lado1==long_lado3 || long_lado2==long_lado1)
			return 2;
		else
			return 3;
	}


}
