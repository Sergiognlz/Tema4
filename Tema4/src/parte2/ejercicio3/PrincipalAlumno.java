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
		//creamos variable media
		double media;
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
				if(Ac.añadirAlumno(alumno)) {
					System.out.println("El alumno se añadió correctamente");
				}else {
					System.err.println("No se pudo añadir el alumno");
				}
				
			}
			//caso 3 moficar alumno
			case 3->{
				//llamamos a la función pedir nombre y la guardamos en la variable nombre
				nombre=pedirNombre();
				//llamamos a la función buscaAlumno con el nombre que le pasamos y lo guardamos en el objeto alumno
				alumno=Ac.buscaAlumno(nombre);
				//llamamos a la función pedirMedia y la guardamos en la variable media
				media=pedirMedia();
				//invocamos el setMedia para modificar el atributo media del objeto alumno
				alumno.setMedia(media);
			}
			//caso 4 borrar alumno
			case 4->{
				//llamamos a la función pedir nombre y la guardamos en la variable nombre
				nombre=pedirNombre();
				//llamamos a la función buscaAlumno con el nombre que le pasamos y lo guardamos en el objeto alumno
				alumno=Ac.buscaAlumno(nombre);
				//llamamos a la función eliminaAlumno y le pasamos el alumno que deseamos eliminar
				if(Ac.eliminaAlumno(alumno)) {
					System.out.println("El alumno se ha eliminado con éxito");
				}else {
					System.err.println("El alumno no se pudo eliminar");
				}
				
			}
			//caso 5 salir del programa
			case 5->{
				//mensaje de salida
				System.out.println("Saliendo del programa");
			}
			//default
			default->{
				//mensaje de error
				System.out.println("La opción elegida no existe");
			}
			}
			
			//repetirá el proceso mientras no elijamos la opción 5
		}while(opcion!=5);
		System.out.println();
		//mensaje de fin de programa
		System.out.println("FIN");
		//cerramos escaner
		sc.close();
	}
	/**
	 * función que muestra un menú
	 */
	public static void mostrarMenu() {
		//menú
		System.out.println();
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
//llamamos a la función pedirNombre y lo guardamos en una cadena
	nombre=pedirNombre();
	//llamamos a la función pedirMedia y lo guardamos en un double
	media=pedirMedia();
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
public static double pedirMedia() {
	//creamos variable nombre
	double media;
	
	//pedimos nombre
	System.out.println("Introduce la media del alumno");
	//guardamos 
	media=sc.nextDouble();
	
	//devolvemos nombre 
	return media;
}

}
