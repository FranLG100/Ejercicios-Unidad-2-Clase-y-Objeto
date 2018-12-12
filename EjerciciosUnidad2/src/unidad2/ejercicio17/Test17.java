package unidad2.ejercicio17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utilesFran.Amadeus;

public class Test17 {

	/**
	 * Método estático que controla que la capacidad del disco duro sea múltiplo de 5
	 * @param capacidad Capacidad de disco duro a controlar
	 * @return Capacidad del disco duro ya validada
	 * */
	public static int controlDiscoDuro(int capacidad) throws IOException {
		int comprobante=capacidad;
		Amadeus amadeus=new Amadeus();
		while(comprobante%5!=0 || comprobante<5) {
			System.out.println("La capacidad del disco duro debe ser múltiplo de 5. Vuelva a intentarlo.");
			comprobante=amadeus.controlaIntPositivo();
		}
		return comprobante;
	}
	
	/**
	 * Método estático que controla que la marca del procesador sea la indicada
	 * @param procesador Marca del procesador a introducir
	 * @return Procesador validado
	 * */
	public static String controlProcesador(String procesador) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String[] listaProcesadores= {"Intel", "AMD", "IBM"};
		boolean error=false;
		String comprobanteProcesador=procesador;
		do {
			error=true;
			for (int i = 0; i < listaProcesadores.length; i++) {
				if(comprobanteProcesador.equalsIgnoreCase(listaProcesadores[i]))
					error=false;
			}
			if(error) {
				System.out.println("Lo sentimos, el modelo debe ser Intel, AMD o IBM. Pruebe de nuevo");
				comprobanteProcesador=entrada.readLine();
			}
		}while(error);
		return comprobanteProcesador;	
	}
	
	/**
	 * Método estático que controla que el tamaño de la pantalla sea de al menos, 14
	 * @param capacidad Tamaño de la pantalla a controlar
	 * @return Tamaño de la pantalla ya validado
	 * */
	public static int controlPantalla(int capacidad) throws IOException {
		int comprobante=capacidad;
		Amadeus amadeus=new Amadeus();
		while(comprobante<14) {
			System.out.println("El tamaño de la pantalla debe ser al menos 14. Vuelva a intentarlo.");
			comprobante=amadeus.controlaIntPositivo();
		}
		return comprobante;
	}
	
	/**
	 * Método estático que controla que el precio sea válido
	 * @return Precio válido del ordenador
	 * */
	public static double controlPrecio() throws IOException {
		Amadeus amadeus=new Amadeus();
		double controlPrecio;
		controlPrecio=amadeus.controlaDoublePositivo();
		return controlPrecio;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		Amadeus amadeus=new Amadeus();
		Servidor s1=new Servidor(4,10,"Intel","NVidia",400,20,"Mecánico","De bolita");
		Servidor s2=new Servidor(16,50,"IBM","ATI",300,15,"Logitech","Gaming Mars");
		Servidor s3=new Servidor();
		Portatil p1=new Portatil(12,40,"AMD","Intel",250,"Toshiba",14,20);
		Portatil p2=new Portatil(8,240,"AMD","NVidia",650,"HP",34,60);
		Portatil p3=new Portatil();
		
		System.out.println(s2.toString());
		System.out.println("\n"+p2.toString());
		
		System.out.println("\nBuenos días.");
		System.out.println("Procedamos a crear un Servidor.");
		System.out.println("Introduzca memoria RAM del servidor");
		s3.setRam(amadeus.controlaIntPositivo());
		System.out.println("Introduzca capacidad del disco duro del servidor");
		s3.setDiscoDuro(controlDiscoDuro(amadeus.controlaIntPositivo()));
		System.out.println("Introduzca modelo del procesador del servidor");
		s3.setProcesador(controlProcesador(entrada.readLine()));
		System.out.println("Introduzca modelo de la tarjeta gráfica del servidor");
		s3.setGrafica(entrada.readLine());
		System.out.println("Introduzca precio del servidor");
		s3.setPrecio(controlPrecio());
		System.out.println("Introduzca tamaño de la pantalla del servidor");
		s3.setMonitor(controlPantalla(amadeus.controlaIntPositivo()));
		System.out.println("Introduzca modelo de teclado");
		s3.setTeclado(entrada.readLine());
		System.out.println("Introduzca modelo de ratón");
		s3.setRaton(entrada.readLine());
		
		System.out.println("Ahora, procedamos con el portátil.");
		System.out.println("Introduzca memoria RAM del portátil");
		p3.setRam(amadeus.controlaIntPositivo());
		System.out.println("Introduzca capacidad del disco duro del portátil");
		p3.setDiscoDuro(controlDiscoDuro(amadeus.controlaIntPositivo()));
		System.out.println("Introduzca modelo del procesador del portátil");
		p3.setProcesador(controlProcesador(entrada.readLine()));
		System.out.println("Introduzca modelo de la tarjeta gráfica del portátil");
		p3.setGrafica(entrada.readLine());
		System.out.println("Introduzca precio del portátil");
		p3.setPrecio(controlPrecio());
		System.out.println("Introduzca tamaño de la pantalla del portátil");
		p3.setPantalla(amadeus.controlaIntPositivo());
		System.out.println("Introduzca marca del portátil");
		p3.setMarca(entrada.readLine());
		System.out.println("Introduzca peso del portátil");
		p3.setPeso(amadeus.controlaDoublePositivo());

		System.out.println("Así ha quedado el Servidor:\n");
		System.out.println(s3.toString());
		System.out.println("\nAsí ha quedado el Portátil:\n");
		System.out.println(p3.toString());
		
		
	}

}
