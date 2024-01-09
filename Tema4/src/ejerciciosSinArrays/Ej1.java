package ejerciciosSinArrays;

import java.util.Arrays;
import java.util.Random;

/*Crea una tabla de enteros de longitud 10 que se inicializará con números aleatorios comprendidos entre 1 y 100. */
public class Ej1 {
	public static void main(String[] args) {
		// Creamos la tabla
		int tabla[] = new int[10];

		// Creo la función random para que genere un número aleatorio
		Random r = new Random();
		// creo un for para que recorra la tabla
		for (int i = 0; i < tabla.length; i++) {
			// guardamos un valor aleatorio en cada posición de la tabla
			tabla[i] = r.nextInt(1, 101);
		}
		// imprimimos los valores de la tabla
		System.out.println(Arrays.toString(tabla));
	}
}
