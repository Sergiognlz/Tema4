package ejerciciosSinArrays;

import java.util.Arrays;
import java.util.Scanner;

/*Diseñar un programa que solicite al usuario 5 números decimales y los almacene en una tabla. 
 * Utiliza el mismo bucle tanto para solicitar los 5 números como para almacenarlos en la tabla. 
 * A continuación, en un bucle distinto, mostrar por consola los números en el mismo orden en el que se han introducido.*/
public class Ej2 {
	public static void main(String[] args) {
//Creamos la tabla
		double tabla[] = new double[5];
		// creamos escaner
		Scanner sc = new Scanner(System.in);
		// creamos un for para recorrer la tabla
		for (int i = 0; i < tabla.length; i++) {
			// pedimos un número al usuario para cada hueco de la tabla
			System.out.println("Introduce un número decimal para el valor " + (i + 1));
			// guardamos el número introducido en el hueco de la tabla
			tabla[i] = sc.nextDouble();
		}
		// creamos otro for para imprimir los valores en orden
		for (int i = 0; i < tabla.length; i++) {
			// imprimimos los números introducidos en el mismo orden en que se han
			// introducido
			System.out.println(tabla[i]);

		}
		sc.close();
	}
}
