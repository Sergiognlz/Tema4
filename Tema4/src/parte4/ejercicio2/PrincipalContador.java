package parte4.ejercicio2;

import java.util.Scanner;

public class PrincipalContador {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// variable opción
		int opcion;
		// variable contador;
		int cont;
		// objeto contador
		Contador objeto;
		// mostramos título de programa
		System.out.println("Aplicación contador");
		System.out.println();
		// llamamos a la función que crea el objeto
		objeto = creaContador();
		// do while para repetir el proceso hasta que elijamos salir
		do {
			// mostramos menú llamando a la función del mismo nombre
			mostrarMenu(objeto);
			// llamamos a pedir opción y lo guardamos en la variable opción
			opcion = pedirOpcion();
			// switch con las opciones
			switch (opcion) {
			// caso 1: incremento
			case 1 -> {
				//llamamos función incrementar
				objeto.incrementar();
			}
			//caso 2: decremento
			case 2->{
				//llamamos a la función decrementar
				objeto.decrementar();
			}
			//caso 0: salir
			case 0->{
				//mensaje salida
				System.out.println("Fin de Programa");
			}
			default->{
				System.out.println("La opción introducida no es válida");
			}
			}
			//repetirá hasta elegir 0
		} while (opcion != 0);
		//cerramos escaner
		sc.close();
	}

	/**
	 * función mostrar menu
	 */
	public static void mostrarMenu(Contador cont) {
		System.out.println();
		System.out.println(cont);
		System.out.println();
		System.out.println("Menú:");
		System.out.println("1. Incremento de 1 unidad");
		System.out.println("2. Decremento de 1 unidad");
		System.out.println("0. Salir");
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
	 * función que pide el valor del atributo contador
	 * 
	 * @return contador
	 */
	public static int pedirCont() {
		// variable contador
		int cont;
		// pedimos contador al usuario
		System.out.println("Introduce el valor de inicio del contador");
		// guardamos
		cont = sc.nextInt();

		// devolvemos contador
		return cont;
	}

	/**
	 * Función que pide el valor de contador y crea un objeto contador con ese
	 * atributo
	 * 
	 * @return
	 */
	public static Contador creaContador() {
		// variable contador y llamamos a la función para inicializarla
		int cont = pedirCont();
		// objeto contador y llamamos al constructor para inicializarla y le pasamos la
		// variable contador
		Contador objeto = new Contador(cont);

		// devolvemos objeto
		return objeto;
	}
}
