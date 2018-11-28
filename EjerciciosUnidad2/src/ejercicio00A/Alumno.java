package ejercicio00A;

public class Alumno {
	
	private String nombre;
	private String apellidos;
	private String nif;
	
	Alumno(){
		nombre="John";
		apellidos="Doe";
		nif="88888888H";
	}
	
	Alumno(String nombre, String apellidos, String nif){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.nif=nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public void imprimeAlumno() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellidos: "+apellidos);
		System.out.println("Nif: "+nif);
		System.out.println("");
	}
}
