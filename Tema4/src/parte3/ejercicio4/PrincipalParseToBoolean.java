package parte3.ejercicio4;

import java.util.Scanner;

public class PrincipalParseToBoolean {
	public static void main(String[] args) {
		// variable número
		int num;
		// variable cadena
		String cadena;
		// variable opción
		int opcion;
		// objeto función
		ParseToBoolean parse = new ParseToBoolean();
		// objeto escaner
		Scanner sc = new Scanner(System.in);

		// pedimos opción al usuario
		System.out.println("1. Introducir número");
		System.out.println("2. Introducir cadena");
		// guardamos opción
		opcion = sc.nextInt();
		// limpiamos buffer
		sc.nextLine();
		// si la opción es 1
		if (opcion == 1) {
			// pedimos número
			System.out.println("Introduce número");
			// guardamos
			num = sc.nextInt();
			// llamamos a la función e imprimimos resultado
			System.out.println(parse.parseToBoolean(num));
			// si la opción es 2
		} else if (opcion == 2) {
			// pedimos cadena
			System.out.println("Introduce cadena");
			// guardamos
			cadena = sc.nextLine();
			// llamamos a la función e imprimimos resultado
			System.out.println(parse.parseToBoolean(cadena));
			// si no es ninguno
		} else {
			// mesaje error
			System.err.println("La opción introducida no existe");
		}
		//cerramos escaner
		sc.close();
	}
}
