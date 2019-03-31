package ejercicio02;

public class Administrador extends Usuario {

	private int deletedMsg=0; //Mensajes eliminados
	private int bans=0; //Usuarios baneados
	
	public Administrador(String nick, String email) {
		super(nick, email);
	}
	
	/**
	 * M�todo que incrementa el n�mero de mensajes borrados
	 * */
	public void incrementBin() {
		deletedMsg++;
	}
	
	/**
	 * M�todo que incrementa el n�mero de baneos de usuarios
	 * */
	public void incrementBans() {
		bans++;
	}
	
	/**
	 * M�todo que permite cambiar el propio nick
	 * */
	public void changeNick(String nick) {
		this.setNick(nick);
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nMensajes borrados: "+deletedMsg+"\nUsuarios baneados: "+bans;
	}
	
}
