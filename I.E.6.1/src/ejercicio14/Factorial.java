package ejercicio14;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(CalculaFactorial(4));

	}
	
	/**
	 * M�todo est�tico que calcula el factorial de un n�mero
	 * @param num N�mero entero del cual queremos conocer el factorial
	 * @return Factorial del n�mero, calculado con este m�todo recursivo
	 * */
	public static int CalculaFactorial(int num) {

		if(num==0) 
			return 1;
		else
		return num*CalculaFactorial(num-1); //Devuelve el n�mero y el propio m�todo llam�ndose con la misma  variable -1.
	}

}
