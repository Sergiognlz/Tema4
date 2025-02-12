package parte2.ejercicio2;

import java.util.Scanner;

public class PrincipalLibro {
	/**
	 * Crea una clase llamada Libro que guarde la información de cada uno de los
	 * libros de una biblioteca. La clase debe guardar el título del libro, autor,
	 * número de ejemplares del libro y número de ejemplares prestados. También se
	 * desea conocer el género del libro, pudiendo tener los siguientes valores:
	 * Narrativo, Lírico, Dramático, Didáctico y Poético. La clase contendrá los
	 * siguientes métodos:
	 */
	public static void main(String[] args) {
		// variable título
		String titulo;
		// variable autor
		String autor;
		// variable número de ejemplares
		int nEjemplares;
		// variable número de prestados
		int nPrestados;
		// variable género
		String genero;
		// variable cantidad
		int cantidad;
		// variable opción
		int opcion;
		// creamos objeto libro 1
		Libro libro1;
		//creamos objeto libro 2
		Libro libro2=new Libro("El Señor de los Anillos","J.R.L. Tolkien",10,0);
		// objeto escaner
		Scanner sc = new Scanner(System.in);

		// pedimos el título del libro al usuario
		System.out.println("Introduce el título del libro");
		// guardamos título
		titulo = sc.nextLine();
		// pedimos autor
		System.out.println("Introduce el autor del libro");
		// guardamos autor
		autor = sc.nextLine();
		// pedimos número de ejemplares existentes
		System.out.println("Introduce el número de ejemplares en existencia");
		// guardamos el número
		nEjemplares = sc.nextInt();
		//limpiamos el buffer
		sc.nextLine();
		// pedimos el género del libro
		System.out.println("Introduce el género del libro (narrativo, lirico, dramatico, didactico, poetico)");
		// guardamos género en mayúsculas
		genero = sc.nextLine().toUpperCase();

		// invocamos al constructor y le pasamos los valores de los atributos
		libro1 = new Libro(titulo, autor, nEjemplares, 0, genero);

		// espacio
		System.out.println();

		// mostramos menú
		System.out.println("MENÚ:");
		System.out.println("1. Mostrar datos del libro");
		System.out.println("2. Realizar préstamo");
		System.out.println("3. Realizar devolución");
		System.out.println("0. Salir del programa");
		System.out.println();
		// pedimos opción
		System.out.println("Introduce la opción deseada");
		// guardamos la opción
		opcion = sc.nextInt();

		// while para repetir el menú mientras no se elija la opción 0
		while (opcion != 0) {

			// switch para las acciones del menú
			switch (opcion) {
			// caso 1 mostramos datos
			case 1 -> {
				System.out.println(libro1);

			}
			// caso 2 retirar efectivo
			case 2 -> {
				// pedimos cantidad
				System.out.println("Introduzca la cantidad de libros que desea tomar prestado");
				// guardamos cantidad
				cantidad = sc.nextInt();
				// llamamos al método sacarDinero
				libro1.prestaLibro(cantidad);
			}
			// caso 3 ingresar dinero
			case 3 -> {
				// pedimos cantidad
				System.out.println("Introduzca la cantidad de libros que desea devolver");
				// guardamos cantidad
				cantidad = sc.nextInt();
				// llamamos al método sacarDinero
			libro1.devuelveLibro(cantidad);
			}
			// caso 0 salir del programa
			case 0 -> {
				// mensaje de saliendo
				System.out.println("Saliendo");
			}
			// en caso de que la opción introducida no sea válida
			default -> {
				// mensaje error
				System.err.println("La opción introducida no es válida");
			}

			}
			//volvemos a mostrar menú
			System.out.println("MENÚ:");
			System.out.println("1. Mostrar datos del libro");
			System.out.println("2. Realizar préstamo");
			System.out.println("3. Realizar devolución");
			System.out.println("0. Salir del programa");
			System.out.println();
			// pedimos opción
			System.out.println("Introduce la opción deseada");
			// guardamos la opción
			opcion = sc.nextInt();

		}

		if(libro1.equals(libro2)) {
			System.out.println("Los libros son iguales");
		}else {
			System.out.println("Los libros no son iguales");
		}
		// cerramos escaner
		sc.close();

	}
}
