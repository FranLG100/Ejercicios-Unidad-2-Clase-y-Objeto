package unidad2.ejercicio16;

import java.io.IOException;

import utilesFran.Amadeus;

public class Test16 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int code=0;
		int secCode=0;
		Amadeus amadeus=new Amadeus();
		String aux="";
		int energia = 0;
		Guerreros g=null;
		Magos m=null;
		
		System.out.println("¡Bienvenidos a World of Warriors!");
		System.out.println("Escoja una clase de personaje");
		System.out.println("1.-Guerrero");
		System.out.println("2.-Mago");
		do {
		code=amadeus.controlaIntPositivo();
		if(code<1||code>2)
			System.out.println("¡No tenemos esa clase, introduzca el valor correcto!");
		}while(code<1||code>2);
		switch (code) {
		case 1:
			System.out.println("Así que un guerrero, ¿eh?, introduzca el nombre de su arma");
			aux=amadeus.recibeTexto();
			System.out.println("¿Cuál es su nivel de energía?");
			energia=amadeus.controlaIntPositivo();
			break;
		case 2:
			System.out.println("Así que un mago, ¿eh?, ¿y cual es su poder?");
			aux=amadeus.recibeTexto();
		default:
			break;
		}
		System.out.println("Y lo más importante... ¿Cómo se llama?");
		if(code==1)
			g=new Guerreros(amadeus.recibeTexto(),energia,aux);
		else
			m=new Magos(amadeus.recibeTexto(),aux);
		System.out.println("Estamos listos para jugar");
		do {
		System.out.println("¿Qué acción desea realizar?");
		System.out.println("1.-Atacar");
		System.out.println("2.-Alimentarse");
		System.out.println("3.-Consultar Energía");
		System.out.println("4.-Salir");
		do {
			secCode=amadeus.controlaIntPositivo();
		}while(secCode<1||secCode>4);
		switch (secCode) {
		case 1:
			if(code==1) {
				System.out.println("¿Cuánta energía deseas gastar en el proceso?");
				g.combatir(amadeus.controlaIntPositivo());
			}else
				System.out.println(m.encantar());
			break;
		case 2:
			System.out.println("¿Cuánto vas a alimentarte?");
			if(code==1)
				g.alimentarse(amadeus.controlaIntPositivo());
			else
				m.alimentarse(amadeus.controlaIntPositivo());
			break;
		case 3:
			if(code==1)
				g.consultarEnergia();
			else
				m.consultarEnergia();
			break;
		}
		}while(secCode!=4);
		System.out.println("¡Hasta otra, camarada!");
	}

}
