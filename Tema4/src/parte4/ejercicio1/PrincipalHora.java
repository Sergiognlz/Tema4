package parte4.ejercicio1;

import java.util.Scanner;

public class PrincipalHora {

	// escaner a nivel de clase
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// variable opción
		int opcion;
		// variable hora
		int hora;
		// variable minuto
		int minuto;
		// variable segundo
		int segundo;
		// objeto hora
		Hora h;
		System.out.println();
		System.out.println("Aplicación Reloj");
		mostrarReloj();

		// creamos el objeto hora llamando a la función
		h = creaHora();

		// do while para repetir el proceso hasta que elijamos salir
		do {
			// mostramos menú llamando a la función del mismo nombre
			mostrarMenu(h);
			// llamamos a pedir opción y lo guardamos en la variable opción
			opcion = pedirOpcion();
			//
			if (opcion == 1) {
				h.incrementaSegundo();

			} else if (opcion == 0) {
				System.out.println("Saliendo");
			} else {
				System.out.println("Opción no válida");
			}

		} while (opcion != 0);

		mostrarReloj();
		System.out.println("Fin de programa");
		//cerramos escaner
		sc.close();
	}
	

	/**
	 * función pedir hora
	 * 
	 * @return hora
	 */
	public static int pedirHora() {
		// variable hora
		int hora;

		// pedimos hora
		System.out.println("Introduce la hora");
		// guardamos
		hora = sc.nextInt();

		// devolvemos hora
		return hora;
	}

	/**
	 * función pedir minuto
	 * 
	 * @return minuto
	 */
	public static int pedirMinuto() {
		// variable hora
		int minuto;

		// pedimos hora
		System.out.println("Introduce minutos");
		// guardamos
		minuto = sc.nextInt();

		// devolvemos hora
		return minuto;
	}

	/**
	 * función pedir segundo
	 * 
	 * @return segundo
	 */
	public static int pedirSegundo() {
		// variable hora
		int segundo;

		// pedimos hora
		System.out.println("Introduce la segundos");
		// guardamos
		segundo = sc.nextInt();

		// devolvemos hora
		return segundo;
	}

	/**
	 * función crea objeto
	 * 
	 * @return objeto hora
	 */
	public static Hora creaHora() {
		int hora = pedirHora();
		int minuto = pedirMinuto();
		int segundo = pedirSegundo();
		Hora objeto = new Hora(hora, minuto, segundo);

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
	public static void mostrarMenu(Hora h) {
		System.out.println();
		System.out.println(h);
		System.out.println();
		System.out.println("Menú:");
		System.out.println("1. Incrementar 1 segundo");
		System.out.println("0. Salir");
	}

	public static void mostrarReloj() {
		System.out.println("    --------");
		System.out.println("     ------");
		System.out.println("      ----");
		System.out.println("       --");
		System.out.println("      ----");
		System.out.println("     ------");
		System.out.println("    --------");
	}
}
