package parte1.ejercicio2;

import java.util.Scanner;

public class PrincipalPersona {
	/*
	 * Crea un programa con una clase llamada Persona que representará los datos
	 * principales de una persona: dni, nombre, apellidos y edad. En el main de la
	 * clase principal instancia dos objetos de la clase Persona. Luego, pide por
	 * teclado los datos de ambas personas (guárdalos en los objetos). Por último,
	 * imprime dos mensajes por pantalla (uno por objeto) con un mensaje del estilo
	 * “Azucena Luján García con DNI … es / no es mayor de edad”.
	 */

	public static void main(String[] args) {
		// variable dni;
		String dni;
		// variable nombre
		String nombre;
		// variable apellidos
		String apellidos;
		// variable edad
		int edad;
		// variable donde guardaremnos si es mayor de edad
		String mayoria;

		// objeto escaner
		Scanner sc = new Scanner(System.in);
		// creamos objeto p1
		Persona p1 = null;
		// creamos objeto p1
		Persona p2 = null;

		// for para recorrer dos veces
		for (int i = 0; i < 2; i++) {
			// cuando sea par
			if (i % 2 == 0) {
				// pedimos dni al usuario
				System.out.println("Introduce dni");
				// guardamos en el atributo correspondiente

				// guardará en p1
				dni = sc.next();
				// lipiamos buffe
				sc.nextLine();
				// pedimos nombre al usuario
				System.out.println("Introduce nombre");
				// guardamos en el atributo correspondiente

				nombre = sc.nextLine();

				// pedimos apellidos al usuario
				System.out.println("Introduce apellidos");
				// guardamos en el atributo correspondiente
				apellidos = sc.nextLine();

				// pedimos edad al usuario
				System.out.println("Introduce edad");
				// guardamos en el atributo correspondiente
				edad = sc.nextInt();

				// constructor objeto persona 1
				p1 = new Persona(dni, nombre, apellidos, edad);
				// sino
			} else {
				// pedimos dni al usuario
				System.out.println("Introduce dni");
				// guardamos en el atributo correspondiente

				// guardará en p1
				dni = sc.next();
				// lipiamos buffe
				sc.nextLine();
				// pedimos nombre al usuario
				System.out.println("Introduce nombre");
				// guardamos en el atributo correspondiente

				nombre = sc.nextLine();

				// pedimos apellidos al usuario
				System.out.println("Introduce apellidos");
				// guardamos en el atributo correspondiente
				apellidos = sc.nextLine();

				// pedimos edad al usuario
				System.out.println("Introduce edad");
				// guardamos en el atributo correspondiente
				edad = sc.nextInt();

				// constructor objeto persona 2
				p2 = new Persona(dni, nombre, apellidos, edad);
			}

		}
		// mostramos por pantalla el objeto persona 1
		System.out.println(p1.nombre + " " + p1.apellidos + " con dni " + p1.dni
				+ (mayoria = p1.edad < 18 ? " no es mayor de edad" : " es mayor de edad"));

		// mostramos por pantalla el objeto persona 2
		System.out.println(p2.nombre + " " + p2.apellidos + " con dni " + p2.dni
				+ (mayoria = p2.edad < 18 ? " no es mayor de edad" : " es mayor de edad"));
		// cerramos escaner
		sc.close();
	}
}
