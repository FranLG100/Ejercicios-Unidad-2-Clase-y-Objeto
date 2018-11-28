package ejercicio14;

public class Marte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marciano et1=new Marciano("Rodolfo");
		et1.cuentaMarcianos();
		Marciano et2=new Marciano("Basilio");
		et1.cuentaMarcianos();
		Marciano et3=new Marciano("Remigio");
		et1.cuentaMarcianos();
		et2.Muere();
		et2.cuentaMarcianos();
		Marciano et4=new Marciano("Agustín");
		et2.cuentaMarcianos();
		et2.Muere();
		et1.estaVivo();
		et2.estaVivo();
		et3.estaVivo();
		et4.estaVivo();
	}

}
