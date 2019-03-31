package ejercicio07;

import java.io.IOException;
import java.util.ArrayList;

import utilesFran.Amadeus;

public class Empresa {

	private ArrayList<Empleado> empleados=new ArrayList<Empleado>();
	private boolean verificado;
	private Amadeus amadeus=new Amadeus();
	
	public Empresa() {};
	
	public void menu() throws IOException {
		int opMenu=0;
		do {
		System.out.println("Introduzca opci�n deseada");
		System.out.println("1.-Crear Empleado");
		System.out.println("2.-Modificar Empleado");
		System.out.println("3.-Eliminar Empleado");
		System.out.println("4.-Listar Empleados");
		System.out.println("5.-Mostrar sueldos");
		System.out.println("6.-Salir");
		
		opMenu=amadeus.controlaIntMinMax(1, 6);
		
		switch (opMenu) {
		case 1:
			crearEmpleado();
			break;
		case 2:
			modificarEmpleado();
			break;
		case 3:
			System.out.println("Introduzca n�mero de la SS del empleado a eliminar");
			String aux=amadeus.recibeTexto();
			eliminarEmpleado(aux);
			break;
		case 4:
			listarEmpleados();
			break;
		case 5:
			mostrarSueldos();
			break;
		default:
			break;
		}
		}while(opMenu!=6);
	}
	
	public void crearEmpleado() throws IOException {
		int opcion;
		String nombre, apellido, ss;
		double daux;
		double daux2;
		int iaux;
		
		System.out.println("Seleccione tipo de empleado");
		System.out.println("1.-Empleado Asalariado");
		System.out.println("2.-Empleado por horas");
		System.out.println("3.-Empleado por comisi�n");
		System.out.println("4.-Empleado base m�s comisi�n");
		opcion=amadeus.controlaIntMinMax(1, 4);
		
		do {
			verificado=false;
			System.out.println("Introduzca N�mero de la Seguridad Social");
			ss=amadeus.recibeTexto();
			for (Empleado empleado : empleados) {
				if(ss.equalsIgnoreCase(empleado.getNss())) {
					verificado=true;
					System.out.println("Ya existe ese n�mero de la Seguridad Social");
					break;
				}
			}
		}while(verificado);
		System.out.println("Introduzca Nombre");
		nombre=amadeus.recibeTexto();
		System.out.println("Introduzca Apellido");
		apellido=amadeus.recibeTexto();
		
		switch (opcion) {
		case 1:
			System.out.println("Introduzca salario semanal");
			daux=amadeus.controlaDoublePositivo();
			EmpleadoAsalariado ea=new EmpleadoAsalariado(nombre, apellido, ss, daux);
			empleados.add(ea);
			break;
		case 2:
			System.out.println("Introduzca salario por hora");
			daux=amadeus.controlaDoublePositivo();
			System.out.println("Introduzca n�mero de horas trabajadas");
			iaux=amadeus.controlaIntPositivo();
			EmpleadoPorHoras eph=new EmpleadoPorHoras(nombre, apellido, ss, daux, iaux);
			empleados.add(eph);
			break;
		case 3:
			System.out.println("Introduzca tarifa de comisi�n");
			daux=amadeus.controlaDoublePorcentaje();
			System.out.println("Introduzca valor de ventas brutas");
			daux2=amadeus.controlaDoublePositivo();
			EmpleadoPorComision epc=new EmpleadoPorComision(nombre, apellido, ss, daux, daux2);
			empleados.add(epc);
			break;
		case 4:
			System.out.println("Introduzca tarifa de comisi�n");
			daux=amadeus.controlaDoublePorcentaje();
			System.out.println("Introduzca valor de ventas brutas");
			daux2=amadeus.controlaDoublePositivo();
			System.out.println("Introduzca sueldo base");
			double sueldo=amadeus.controlaDoublePositivo();
			EmpleadoBaseMasComision ebmc=new EmpleadoBaseMasComision(nombre, apellido, ss, daux, daux2,sueldo);
			empleados.add(ebmc);
			break;
		default:
			break;
		}
	}
	/**
	 * M�todo que a�ade un empleado a la empresa
	 * @param e Empleado a a�adir
	 * */
	public void addEmpleado(Empleado e) {
		empleados.add(e);
	}
	
	/**
	 * M�todo que elimina un empleado a la empresa
	 * @param s N�mero de la Seguridad Social del empleado a eliminar
	 * */
	public void eliminarEmpleado(String s) {
		verificado=false;
		for (int i = 0; i < empleados.size(); i++) {
			if(empleados.get(i).getNss().equalsIgnoreCase(s)) {
				empleados.remove(i);
				System.out.println("Empleado eliminado con �xito");
				verificado=true;
				break;
			}
		}
		if(!verificado) {
			System.out.println("Empleado inexistente");
		}
		
	}
	
	/**
	 * M�todo que lista todos los empleados que trabajan en la empresa
	 * */
	public void listarEmpleados() {
		for (Empleado empleado : empleados) {
			System.out.println(empleado+"\n");
		}
	}
	
	/**
	 * M�todo que cambia un valor de un empleado existente
	 * @throws IOException 
	 * */
	public void modificarEmpleado() throws IOException {
		Empleado e=null;
		verificado=false;
		System.out.println("Introduzca n�mero de la Seguridad Social");
		String ss=amadeus.recibeTexto();
		for (Empleado empleado : empleados) {
			if(ss.equalsIgnoreCase(empleado.getNss())) {
				verificado=true;
				e=empleado;
				break;
			}
		}
		if(verificado) {
			System.out.println(e);
			int opcion=0;
			do {
			
			String aux;
			double daux=0;
			int iaux=0;
			
			System.out.println("�Qu� desea modificar?");
			System.out.println("1.-Nombre");
			System.out.println("2.-Apellido");
			if(e instanceof EmpleadoAsalariado) {
				System.out.println("3.-Salario Semanal");
				System.out.println("4.-Salir");
				opcion=amadeus.controlaIntMinMax(1, 4);
			}else if(e instanceof EmpleadoPorHoras) {
				System.out.println("3.-N�mero de Horas");
				System.out.println("4.-Salario por horas");
				System.out.println("5.-Salir");
				opcion=amadeus.controlaIntMinMax(1, 5);
			}else if(e instanceof EmpleadoPorComision) {
				System.out.println("3.-Tarifa de Comisi�n");
				System.out.println("4.-Ventas Brutas");
				System.out.println("5.-Salir");
				opcion=amadeus.controlaIntMinMax(1, 5);
			}else {
				System.out.println("3.-Tarifa de Comisi�n");
				System.out.println("4.-Ventas Brutas");
				System.out.println("5.-Salario Base");
				System.out.println("6.-Salir");
				opcion=amadeus.controlaIntMinMax(1, 6);
			}
			
			switch (opcion) {
			case 1:
				System.out.println("Introduzca nuevo nombre");
				aux=amadeus.recibeTexto();
				e.setPrimerNombre(aux);
				break;
			case 2:
				System.out.println("Introduzca nuevo apellido");
				aux=amadeus.recibeTexto();
				e.setPrimerNombre(aux);
				break;
			case 3:
				if(e instanceof EmpleadoAsalariado) {
					System.out.println("Introduzca nuevo salario semanal");
					daux=amadeus.controlaDoublePositivo();
					((EmpleadoAsalariado) e).setSalarioSemanal(daux);
				}else if(e instanceof EmpleadoPorHoras) {
					System.out.println("Introduzca n�mero de horas trabajadas");
					iaux=amadeus.controlaIntPositivo();
					((EmpleadoPorHoras) e).setnHoras(iaux);
				}else if(e instanceof EmpleadoPorComision) {
					System.out.println("Introduzca nueva tarifa por comisi�n");
					daux=amadeus.controlaDoublePorcentaje();
					((EmpleadoPorComision) e).setTarifaComision(daux);
				}else {
					System.out.println("Introduzca nueva tarifa por comisi�n");
					daux=amadeus.controlaDoublePorcentaje();
					((EmpleadoBaseMasComision) e).setTarifaComision(daux);
				}
				break;
			case 4:
				if(e instanceof EmpleadoAsalariado) {
					opcion=6;
				}else if(e instanceof EmpleadoPorHoras) {
					System.out.println("Introduzca salario por horas trabajadas");
					daux=amadeus.controlaDoublePositivo();
					((EmpleadoPorHoras) e).setSueldoHora(daux);
				}else if(e instanceof EmpleadoPorComision) {
					System.out.println("Introduzca nueva ventas brutas");
					daux=amadeus.controlaDoublePositivo();
					((EmpleadoPorComision) e).setVentasBrutas(daux);
				}else {
					System.out.println("Introduzca nueva ventas brutas");
					daux=amadeus.controlaDoublePositivo();
					((EmpleadoBaseMasComision) e).setVentasBrutas(daux);
				}
				break;
			case 5:
				if(e instanceof EmpleadoPorHoras) {
					opcion=6;
				}else if(e instanceof EmpleadoPorComision) {
					opcion=6;
				}else {
					System.out.println("Introduzca salario base");
					daux=amadeus.controlaDoublePositivo();
					((EmpleadoBaseMasComision) e).setSalarioBase(daux);
				}
				break;
			default:
				break;
			}
		}while(opcion!=6);
			}else {
				System.out.println("Empleado inexistente");
			}
	}
	
	/**
	 * M�todo que muestra los sueldos de los empleados que trabajan en la empresa
	 * */
	public void mostrarSueldos() {
		for (Empleado empleado : empleados) {
			System.out.println("El empleado "+empleado.getPrimerNombre()+" "+empleado.getApellidoPaterno()
			+" cobra "+empleado.ingresos()+"�");
		}
	}
	
}
