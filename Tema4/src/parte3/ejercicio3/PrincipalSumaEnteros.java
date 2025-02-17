package parte3.ejercicio3;

import java.util.Scanner;

public class PrincipalSumaEnteros {
	public static void main(String[] args) {
		// variable num1
		int num1;
		// variable num2;
		int num2;
		// variable opción
		int opcion;
		// creamos función como objetos
		SumaEnteros suma = new SumaEnteros();
		// objeto escaner
		Scanner sc = new Scanner(System.in);

		// pedimos opción al usuario
		System.out.println("1. Suma desde 1 hasta un número");
		System.out.println("2. Suma desde numéro Inicio hasta número Fin");
		// guardamos opción
		opcion = sc.nextInt();

		// si la opción es 1
		if (opcion == 1) {
			// pedimos número1 al usuario
			System.out.println("Introduce el número objetivo");
			num1 = sc.nextInt();
			System.out.println();
			// llamamos funció e imprimimos resultado
			System.out.println(suma.sumaEnteros(num1));

			// si la opción es 2
		} else if (opcion == 2) {
			// pedimos primer número
			System.out.println("Introduce número de inicio");
			// guardamos
			num1 = sc.nextInt();

			// pedimos segundo número
			System.out.println("Introduce número de fin");
			// guardamos
			num2 = sc.nextInt();
			System.out.println();
			// llamamos a la función
			System.out.println(suma.sumaEnteros(num1, num2));
			// si no es ninguna de los dos
		} else {
			System.err.println("La opción introducida no existe");
		}
		System.out.println();
		System.out.println("FIN");
		// cerramos escaner
		sc.close();
	}
}
