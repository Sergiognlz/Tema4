package ejerciciosConArrays;

import java.util.Scanner;

/*Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un array y los 10 
 * últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario si son iguales o no.*/

public class Ej3 {
	public static void main(String[] args) {
		// creamos tablas
		int tabla1[] = new int[10];
		int tabla2[] = new int[10];
//creamos escaner
		Scanner sc = new Scanner(System.in);

		// creamos for para recorrer la primera tabla
		for (int i = 0; i < tabla1.length; i++) {
			// pedimos al usuario que introduzca un número
			System.out.println("Introduce un número para el valor " + (i + 1) + " de la primera tabla.");
			// guardamos el número en la primera tabla
			tabla1[i] = sc.nextInt();
		}
		// creamos otro para recorrer la segunda tabla
		for (int j = 0; j < tabla2.length; j++) {
			// pedimos al usuario que introduzca un número
			System.out.println("Introduce un número para el valor " + (j + 1) + " de la segunda tabla.");
			// guardamos el número en la primera tabla
			tabla2[j] = sc.nextInt();
		}
		// creo otro bucle para comparar
		for (int k = 0; k < tabla1.length; k++) {
			// creamos un if else que comparará los valores de ambas tablas
			if (tabla1[k]==tabla2[k]) {
				//en caso de ser iguales saltará el mensaje
				System.out.println("El valor del índice " + (k + 1) + " son iguales");
				// en caso de no ser iguales saltará el mensaje del else
			} else {
				System.out.println("El valor del índice " + (k + 1) + " no son iguales");
			}
		}
		//cerramos escaner
		sc.close();
	}

}
