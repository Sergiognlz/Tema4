package parte4.ejercicio3;

import java.util.Scanner;

public class PrincipalFecha {
	// escaner a nivel de clase
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// variable opción
		int opcion;
		// variable hora
		int dia;
		// variable minuto
		int mes;
		// variable segundo
		int año;
		// objeto hora
		Fecha f;
		
		System.out.println();
		System.out.println("Aplicación Calendario");
		System.out.println();
		

		// creamos el objeto hora llamando a la función
		f = creaFecha();

		// do while para repetir el proceso hasta que elijamos salir
		do {
			// mostramos menú llamando a la función del mismo nombre
			mostrarMenu(f);
			// llamamos a pedir opción y lo guardamos en la variable opción
			opcion = pedirOpcion();
			//
			if (opcion == 1) {
				f.diaSiguiente();

			} else if (opcion == 0) {
				System.out.println("Saliendo");
			} else {
				System.out.println("Opción no válida");
			}

		} while (opcion != 0);

	
		System.out.println("Fin de programa");
		//cerramos escaner
		sc.close();
	}
	

	/**
	 * función pedir hora
	 * 
	 * @return hora
	 */
	public static int pedirDia() {
		// variable hora
		int dia;

		// pedimos hora
		System.out.println("Introduce día");
		// guardamos
		dia = sc.nextInt();

		// devolvemos hora
		return dia;
	}

	/**
	 * función pedir minuto
	 * 
	 * @return minuto
	 */
	public static int pedirMes() {
		// variable hora
		int mes;

		// pedimos hora
		System.out.println("Introduce mes");
		// guardamos
		mes = sc.nextInt();

		// devolvemos hora
		return mes;
	}

	/**
	 * función pedir segundo
	 * 
	 * @return segundo
	 */
	public static int pedirAño() {
		// variable hora
		int año;

		// pedimos hora
		System.out.println("Introduce la año");
		// guardamos
		año = sc.nextInt();

		// devolvemos hora
		return año;
	}

	/**
	 * función crea objeto
	 * 
	 * @return objeto hora
	 */
	public static Fecha creaFecha() {
		int dia = pedirDia();
		int mes = pedirMes();
		int año = pedirAño();
		Fecha objeto = new Fecha(dia,mes,año);

		// devolvemos objeto;
		return objeto;
	}

	/**
	 * función pedir opción
	 * 
	 * @return opción
	 */
	public static int pedirOpcion() {
		int opcion;
		// pedimos opcion
		System.out.println("Introduce la opción");
		// guardamos opción
		opcion = sc.nextInt();
		// devolvemos opción
		return opcion;
	}

	/**
	 * función mostrar menu
	 */
	public static void mostrarMenu(Fecha f) {
		System.out.println();
		System.out.println(f);
		System.out.println();
		System.out.println("Menú:");
		System.out.println("1. Incrementar día");
		System.out.println("0. Salir");
	}


}