package ejerciciosSinArrays;

import java.util.Scanner;

/*Crea un programa que pida diez números reales por teclado, los almacene en un array, 
 * y luego lo recorra para calcular la suma de todos los números y, 
 * además, averiguar el máximo y mínimo y mostrarlos por pantalla.*/
public class Ej5 {
	public static void main(String[] args) {
		// creamos la tabla
		int tabla[] = new int[10];
		// creamos variable para guardar la suma de la tabla
		int sumaTabla = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		// creamos escanner
		Scanner sc = new Scanner(System.in);
		// creamos for para recorrer la tabla
		for (int i = 0; i < tabla.length; i++) {
			// pedimos al usuario que inserte valores en la tabla
			System.out.println("Introduce un número para el valor " + (i + 1));
			// guardamos el número
			tabla[i] = sc.nextInt();
		}
		// creamos un for each para recorrer la tabla
		for (int i : tabla) {
			//calculamos la suma de los valores introducidos
			sumaTabla += i;
			//calculamos el número más pequeño.
			min = i < min ? i : min;
			//calculamos el númemro mayor.
			max = i > max ? i : max;
		}
		//imprimimos por pantalla
		System.out.println("Suma de los valores: "+sumaTabla);
		System.out.println("Valor máximo: "+max);
		System.out.println("Valor mínimo: "+min);
	//cerramos escaner
		sc.close();
	}
}
