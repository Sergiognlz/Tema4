package ejerciciosConArrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Necesitamos crear un programa para mostrar el ranking de puntuaciones de un torneo de ajedrez
 * con 8 jugadores. Se le pedirá al usuario que introduzca las puntuaciones de todos los jugadores 
 *(habitualmente valores entre 1000 y 2800, de tipo entero) y luego muestre las puntuaciones en orden descendente 
 *(de la más alta a la más baja).*/
public class Ej5 {
	public static void main(String[] args) {
		// creamos tabla
		int tabla[] = new int[8];
		// creamos segunda tabla
		int tabla2[] = new int[8];
		int k = 0;
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		// creamos for para recorrer la tabla
		for (int i = 0; i < tabla.length; i++) {
			// creamos un do while para controlar que el rango de los valores se encuentren
			// entre 1000 y 2800

			do {
				// pedimos al usuario que introduzca los valores
				System.out.println("Introduce la puntación del jugador nº " + (i + 1));
				// guardamos el valor en la posción
				tabla[i] = sc.nextInt();
			} while (!(tabla[i] >= 1000 && tabla[i] <= 2800));

		}
		// ordenamos la tabla con la función sort
		Arrays.sort(tabla);
		// mostramos tabla
		System.out.println(Arrays.toString(tabla));
		// creamos otro for recorrer la tabla a la inversa
		for (int j = tabla.length-1; j >= 0; j--) {

		
			//
			tabla2[k]=tabla[j];
			k++;
		}
		System.out.println(Arrays.toString(tabla2));

		// cerramos escaner
		sc.close();
	}

}
