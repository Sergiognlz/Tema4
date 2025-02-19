package parte2.ejercicio3;

import java.util.Scanner;

public class PrincipalAlumno {
	//creamos Scanner a nivel de clase declarándolo como estático
	static Scanner sc=new Scanner(System.in);
	//Main principal
	public static void main(String[] args) {
		//variable opción
		int opcion;
		//creamos variable nombre
		String nombre;
		//creamos objeto alumno
		Alumno alumno;
		//creamos lista
		AlumnoCRUD Ac=new AlumnoCRUD();
	
	
		//do while para repetir menú
		do {
		//mostramos menú llamando a la función mostrar menú	
			mostrarMenu(); 
			//guardamos opción
			opcion=sc.nextInt();
			//limpiamos buffer
			sc.nextLine();
			
			//switch para realizar las operaciones de menú
			switch(opcion) {
			//caso 1 mostrar lista
			case 1->{
				//llamamos función mostrarLista
				Ac.mostrarLista();
			}
			//caso 2 crear nuevo alumno
			case 2->{
				//llamamos a la función creaAlumno
				alumno=creaAlumno();
				//llamamos a la función añadeAlumno
				Ac.añadirAlumno(alumno);
				
			}
			//caso 3 moficar alumno
			case 3->{
				//llamamos a la función pedir nombre
				nombre=pedirNombre();
			}
			
			}
			
			
		}while(opcion!=5);
		
		
		
	}
	/**
	 * función que muestra un menú
	 */
	public static void mostrarMenu() {
		//menú
		System.out.println("Menú");
		System.out.println();
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
		System.out.println();
		System.out.println("Introduce la opción");
	}
	
public static Alumno creaAlumno() {
	//declaramos objeto alumno
	Alumno alumno;
	//variable nombre
	String nombre;
	//variable media
	double media;
	//pedimos nombre
	System.out.println("Introduce el nombre del alumno");
	//guardamos nombre
	nombre=sc.nextLine();
	//pedimos media
	System.out.println("Introduce la nota media del alumno");
	//guardamos media
	media=sc.nextDouble();
	//limpiamos buffer
	sc.nextLine();
	
	//llamamos al constructor
	alumno=new Alumno(nombre,media);
	
	//devolvemos objeto alumno
	return alumno;
}

/**
 * función que pide un nombre del alumno al usuario
 * @return nombre del alumno
 */
public static String pedirNombre() {
	//creamos variable nombre
	String nombre;
	
	//pedimos nombre
	System.out.println("Introduce el nombre del alumno");
	//guardamos 
	nombre=sc.nextLine();
	
	//devolvemos nombre 
	return nombre;
}


}
