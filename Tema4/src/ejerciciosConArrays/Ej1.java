package ejerciciosConArrays;

import java.util.Arrays;
import java.util.Scanner;

/*Crea un programa que pida al usuario dos valores N y M y luego cree un array de tamaño N que contenga M 
 *en todas sus posiciones. Luego muestra el array por pantalla.*/
public class Ej1 {
	public static void main(String[] args) {
		// creamos variable n y m
		int N = 0, M;
		// Creamos la tabla que usaremos
		int tabla[];
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		// pedimos al usuario el valor N
		System.out.println("Introduce el tamaño de la tabla");
		// guardamos el valor
		N = sc.nextInt();
		// pedimos al usuario el valor M
		System.out.println("Introduce el contenido de la tabla");
		// guardamos el valor
		M = sc.nextInt();
		tabla = new int[N];

		// rellenamos la tabla con la clase fill
		Arrays.fill(tabla, M);
		// imprimos el resultado
		System.out.println(Arrays.toString(tabla));

		// cerramos escaner
		sc.close();

	}
}
