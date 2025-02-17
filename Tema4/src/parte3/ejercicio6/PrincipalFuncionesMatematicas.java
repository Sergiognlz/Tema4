package parte3.ejercicio6;

import java.util.Scanner;

import parte3.ejercicio5.NumerosAleatorios;

public class PrincipalFuncionesMatematicas {
	public static void main(String[] args) {

		// variable num
		int numN;
		// variable base
		double base;
		// variable opción
		int opcion;
		// objeto escaner
		Scanner sc = new Scanner(System.in);

		// menú
		System.out.println("1. Sumatorio de número N ");
		System.out.println("2. Potencia de número base y potencia N");
		System.out.println("3. Serie de Fibonacci de número N");
		System.out.println();
		System.out.println("Introduce la opción");
		// guardamos opción
		opcion = sc.nextInt();

		// switch con las operaciones
		switch (opcion) {
		// caso 1
		case 1 -> {
			// pedimos N
			System.out.println("Introduce número N");
			// guardamos N
			numN = sc.nextInt();
			// llamamos a la función y pasamos numN
			System.out.println(FuncionesMatematicas.sumatorio(numN));
		}
		// caso 2
		case 2 -> {
			// pedimos N
			System.out.println("Introduce número base");
			// guardamos N
			base = sc.nextDouble();
			// pedimos max
			System.out.println("Introduce número potencia");
			// guardamos
			numN = sc.nextInt();
			// llamamos a la función y le pasamos numN y max
			System.out.println(FuncionesMatematicas.potencia(base, opcion));
		}
		case 3 -> {
			// pedimos N
			System.out.println("Introduce número N");
			// guardamos N
			numN = sc.nextInt();

			// llamamos a la función y le pasamos numN, max y min
			System.out.println(FuncionesMatematicas.serieFibonaci(numN));
		}
		// deafault
		default -> {
			System.out.println("La opción introducida no existe");
		}
		}
		System.out.println();
		System.out.println("Fin Programa");
		// cerramos escaner
		sc.close();
	}
}