package parte3.ejercicio5;

import java.util.Scanner;

public class PrincipalNumerosAleatorios {
	public static void main(String[] args) {
		// variable num1
		int numN;
		// variable num2
		int max;
		// variable num3
		int min;
		// variable opción
		int opcion;
		// objeto numerosAleatorios
		NumerosAleatorios nA = new NumerosAleatorios();
		// objeto escaner
		Scanner sc = new Scanner(System.in);

		// menú
		System.out.println("1. Genera N números aleatorios entre 0 y 1 ");
		System.out.println("2. Genera N números aleatorios entre 0 y Max");
		System.out.println("3. Genera N números aleatorios entre Min y Max");
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
			nA.numerosAleatorios(numN);
		}
		// caso 2
		case 2 -> {
			// pedimos N
			System.out.println("Introduce número N");
			// guardamos N
			numN = sc.nextInt();
			// pedimos max
			System.out.println("Introduce número Max");
			// guardamos
			max = sc.nextInt();
			// llamamos a la función y le pasamos numN y max
			nA.numerosAleatorios(numN, max);
		}
		case 3 -> {
			// pedimos N
			System.out.println("Introduce número N");
			// guardamos N
			numN = sc.nextInt();
			// pedimos max
			System.out.println("Introduce número Max");
			// guardamos
			max = sc.nextInt();
			// pedimos min
			System.out.println("Introduce número Min");
			// guardamos
			min=sc.nextInt();
			//llamamos a la función y le pasamos numN, max y min
			nA.numerosAleatorios(numN, max, min);

		}
		//deafault
		default->{
			System.out.println("La opción introducida no existe");
		}
		}
		System.out.println();
		System.out.println("Fin Programa");
		//cerramos escaner
		sc.close();
	}
}
