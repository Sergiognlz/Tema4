package ejerciciosSinArrays;

import java.util.Scanner;

/*Realiza un programa que pida la temperatura media que ha hecho 
 * en cada mes de un determinado año y que muestre a continuación un diagrama de
 *  barras horizontales con esos datos. Las barras del diagrama se pueden dibujar
 *  a base de asteriscos o cualquier otro carácter.*/
public class Ej7 {
	public static void main(String[] args) {
		// creamos tabla para los meses
		String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		// creamos tabla donde guardamos las temperaturas
		double temp[] = new double[12];
		// creamos escaner
		Scanner sc = new Scanner(System.in);

//creamos un bucle para registrar en cada hueco de la tabla los valores de temperatura que introduciremos más adelante
		for (int i = 0; i < temp.length; i++) {
			// pedimos al usuario que introduzca la temperatura de cada mes
			System.out.print("Introduce la temperatura de " + meses[i]);
			// guardamos valor en la tabla temperatura
			temp[i] = sc.nextDouble();

		}
		// creamos un for each para leer la tabla e imprimir los asteriscos para cada
		
		System.out.println("Diagrama de Temperatura");
		for (int i = 0; i < 12; ++i) {
			// imprimimos asteriscos)

			System.out.print(meses[i]+"    \t");
		
		for (int j = 1; j < temp[i]; j++) {
			System.out.print("*");

		}
		System.out.println();
		}
		sc.close();
	}
}
