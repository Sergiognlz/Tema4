package parte3.ejercicio2;

import java.util.Scanner;

public class PrincipalMedia {
	public static void main(String[] args) {
		// creamos variable opción
		int opcion;

		// creamos objeto escaner
		Scanner sc = new Scanner(System.in);

		// menú opciones
		System.out.println("1. Media 5 y 3");
		System.out.println("2. Media de 5, 3 y 10");
		System.out.println();
		System.out.println("Elige una opción");
		// guardamos opción
		opcion = sc.nextInt();

		// controlamos la respuesta. Si es la opción 1
		if (opcion == 1) {
			// llamamos a la función y le pasamos los números enteros
			System.out.println(Media.media(5, 3));
			
			//si la opción es 2
		} else if (opcion == 2) {
			//llamamos a la función pasándole números doubles
			System.out.println(Media.media(5,3,10));
			//en caso de introducir otra opción 
		} else {
			//mensaje de error
			System.err.println("La opción introducida no existe");
		}
		//cerramos escaner 
		sc.close();
	}
}
