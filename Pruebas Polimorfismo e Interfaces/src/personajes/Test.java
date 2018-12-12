package personajes;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personaje[] personajes=new Personaje[3];
		personajes[0]=new Guerrero("Kronk");
		personajes[1]=new Mago("Stan");
		Guerrero g=new Guerrero("Steiner");
		Mago m=new Mago("Merlín");
		Jugador j=new Mago("Rasmodius");
		//No puedo instanciar un personaje porque es una clase abstracta
		Personaje p=new Personaje("Luis");
		personajes[2]=p;
		Personaje q=new Guerrero("Juan");
		
		//Pueden acceder a cualquiera de sus métodos, inclusive gritar.
		System.out.println("\nPRUEBA GUERRERO Y MAGO");
		g.Gritar();
		g.Cargar();
		m.Gritar();
		m.Leer();
		
		//Al ser jugador, sólo puede gritar.
		System.out.println("\nPRUEBA INTERFAZ");
		j.Gritar();
		
		System.out.println("\nPRUEBA POLIMORFISMO");
		//Pueden defenderse y gritar, porque son Personajes. Pero no gritar, 
		//porque Personaje no implementa el grito. Ni son métodos comunes.
		//Es decir, no pueden ni Leer() ni Cargar()
		for (int i = 0; i < personajes.length; i++) {
			personajes[i].Ataca();
			personajes[i].Defender();
		}
		
		
	}

}
