package ejercicio00A;

public class Test00A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno a1=new Alumno();
		Alumno a2=new Alumno("Juan", "Cuesta", "00000000F");
		Alumno a3=new Alumno();
		
		a3.setNombre("Filemón");
		a3.setApellidos("Pi");
		a3.setNif("12345678a");
		
		a1.imprimeAlumno();
		a2.imprimeAlumno();
		a3.imprimeAlumno();
	}

}
