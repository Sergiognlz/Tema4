package ejerciciosSinArrays;

import java.util.Scanner;

/*Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, 
 * es decir, el primero que se introduce es el último en mostrarse.*/
public class Ej3 {
	public static void main(String[] args) {
		//Creamos la tabla
				double tabla[] = new double[10];
				// creamos escaner
				Scanner sc = new Scanner(System.in);
				// creamos un for para recorrer la tabla
				for (int i = 0; i < tabla.length; i++) {
					// pedimos un número al usuario para cada hueco de la tabla
					System.out.println("Introduce un número decimal para el valor " + (i + 1));
					// guardamos el número introducido en el hueco de la tabla
					tabla[i] = sc.nextDouble();
				}
				System.out.println(tabla.length);
				// creamos otro for para imprimir los valores en orden
				for (int i = tabla.length-1;i>=0; i--) {
					// imprimimos los números introducidos en el mismo orden en que se han
					// introducido
					System.out.println(tabla[i]);

				}
				sc.close();
			}
}
