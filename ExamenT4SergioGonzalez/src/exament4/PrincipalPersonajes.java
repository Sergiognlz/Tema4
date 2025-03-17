package exament4;

import java.util.Random;
import java.util.Scanner;

public class PrincipalPersonajes {

	// creamos escaner a nivel de clase
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// creamos variable int opción
		int opcion;
		// creamos variable nombre
		String nombre;
		// creamos variable cantMonedas
		int cantMonedas;
		// creamos variable puntos de experiencia
		int puntosE;
		// creamos un objeto de tipo personaje
		Personaje pj;
		// creamos objeto personaje encontrado
		Personaje pjEncontrado;
		// creamos objeto random
		Random rand = new Random();

		// creamos do while para repetir las operaciones y mostrar menú
		do {
			// mostramos menú llamando a la función del mismo nombre
			mostrarMenu();
			// pedimos opción llamando a la función del mismo nombre y la guardamos en la
			// variable opción
			opcion = pedirOpcion();

			// realizamos un switch con las distintas operaciones del menú
			switch (opcion) {
			// caso 1: añadir personaje
			case 1 -> {
				// llamamos a la función crear personaje y la guardamos en un objeto de tipo pj
				pj = crearPersonaje();
				// llamamos a la función añadir personaje desde la clase ConjuntoPersonajes y lo
				// metemos en un if.
				if (ConjuntoPersonajes.añadirPersonaje(pj)) {
					// si lo añade mensaje de éxito
					System.out.println("La operación ha sido añadido con éxito");
				} else {
					// si no mensaje fracaso
					System.out.println("La operación ha fracasado");
				}
			}
			// caso 2: lista de personajes
			case 2 -> {
				// llamamos a la función mostrarConjunto desde la clase ConjuntoPersonajes
				ConjuntoPersonajes.mostrarConjunto();
			}
			// caso 3: Recolecta dinero
			case 3 -> {
				// llamamos a la función pedirDinero y la guardamos en cantMonedas
				cantMonedas = pedirDinero();
				// llamamos a la función recolectar dinero desde la clase Personaje
				Personaje.recolectarDinero(cantMonedas);
				//mensaje éxito
				System.out.println("La operación se ha realizado con éxito");
			}
			// caso 4: gastar dinero
			case 4 -> {
				// llamamos a la función pedirDinero y la guardamos en cantMonedas
				cantMonedas = pedirDinero();
				// llamamos a la función gastar dinero desde la clase Personaje
				if(Personaje.gastarDinero(cantMonedas)){
					//mensaje éxito
					System.out.println("La operación se ha realizado con éxito");
					// si no tiene tantas monedas
				}else {
					//mensaje error
					System.out.println("La operación ha fracasado");
				}
			}
			// caso 5: enfertarse a un enemigo
			case 5 -> {
				// generamos puntos de experiencia aleatorios entre 1 y 1000
				puntosE = rand.nextInt(1, 1001);
				// pedimos nombre del personaje al jugador
				nombre = pedirNombre();
				// invocamos al constructor y le pasamos nombre para crear un objeto con nombre
				pj = new Personaje(nombre);
				// realizamos un búsqueda llamando a la función buscarPersonaje desde la clase
				// ConjuntoPersonaje
				pjEncontrado = ConjuntoPersonajes.buscarPersonaje(pj);
				// llamamos a la función enfrentarEnemigo desde el objeto pjEncontrado y le
				// pasamos los puntos de experiencia generados y lo metemos en un if
				if (pjEncontrado.enfrentarEnemigo(puntosE)) {
					// si el personaje gana mensaje
					System.out.println("ENEMIGO DERROTADO");
					// si pierde
				} else {
					// mensaje fracaso
					System.out.println(pjEncontrado.getNombre() + " ha caído en batalla");
					// eliminamos al personaje del conjunto llamando a la función eliminarPj desde
					// la clase ConjuntoPersonaje
					ConjuntoPersonajes.eliminarPj(pjEncontrado);
				}

			}
			// caso 6: eliminar personaje
			case 6 -> {
				// pedimos nombre del personaje al jugador
				nombre = pedirNombre();
				// invocamos al constructor y le pasamos nombre para crear un objeto con nombre
				pj = new Personaje(nombre);
				// eliminamos al personaje del conjunto llamando a la función eliminarPj desde
				// la clase ConjuntoPersonaje metiendolo en un if
				if(ConjuntoPersonajes.eliminarPj(pj)){
					//mensaje de éxito
					System.out.println("La operación se ha realizado con éxito");
					//si no puede eliminarlo
				}else {
					//mensaje fracaso
					System.out.println("La operación ha fracasado");
				}
			}
			//caso 0: salir
			case 0->{
				//mensaje saliendo
				System.out.println("Saliendo...");
			}
			//default
			default->{
				//mensaje error
				System.err.println("La opción introducida no es válida");
			}
			}

			// repetirá hasta que elijamos la opción 0
		} while (opcion != 0);

		// cerramos escaner
		sc.close();
	}

	/**
	 * Función que muestra el menú con las opciones
	 */
	public static void mostrarMenu() {
		// mostramos el menú
		System.out.println();
		System.out.println("MENÚ DE PERSONAJES:");
		System.out.println();
		System.out.println("1. Añadir personaje");
		System.out.println("2. Lista personajes");
		System.out.println("3. Recolecta dinero");
		System.out.println("4. Gasta dinero");
		System.out.println("5. Enfrentarse a un enemigo");
		System.out.println("6. Eliminar personaje");
		System.out.println("0. Salir");
		System.out.println();

	}

	/**
	 * Función que pide al usuario la opción deseada
	 * 
	 * @return opción
	 */
	public static int pedirOpcion() {
		// creamos variable opción
		int opcion;
		// pedimos opción al usuario
		System.out.println("Introduce la opción deseada:");
		// guardamos opción
		opcion = sc.nextInt();
		// limpiamos buffer
		sc.nextLine();

		// devolvemos opción
		return opcion;
	}

	/**
	 * Función que pide el nombre del personaje al usuario
	 * 
	 * @return nombre personaje
	 */
	public static String pedirNombre() {
		// creamos variable nombre
		String nombre;
		// pedimos nombre al usuario
		System.out.println("Introduce el nombre del personaje");
		// guardamos nombre
		nombre = sc.nextLine();

		// devolvemos nombre
		return nombre;
	}

	/**
	 * Función que pide la clase del personaje al usuario
	 * 
	 * @return clase personaje
	 */
	public static String pedirClase() {
		// creamos variable clase
		String clase;
		// pedimos clase al usuario
		System.out.println("Introduce la clase del personaje");
		// guardamos clase
		clase = sc.nextLine().toUpperCase();

		// devolvemos clase
		return clase;
	}

	/**
	 * Función que pide los datos al personaje y llama al constructor, devolviendo
	 * un objeto personaje
	 * 
	 * @return objeto personaje
	 */
	public static Personaje crearPersonaje() {
		// creamos variable nombre y la inicializamos llamando a la función pedir nombre
		String nombre = pedirNombre();
		// creamos variable clase y la inicializamos llamando a la función pedir clase
		String clase = pedirClase();
		// creamos objeto de tipo personaje e invocamos al constructor con los datos
		// recogidos
		Personaje pj = new Personaje(nombre, clase);

		// devolvemos objeto pj
		return pj;
	}

	/**
	 * Función que pide cantidad de monedas al usuario
	 * 
	 * @return cantidad monedas
	 */
	public static int pedirDinero() {
		// variable cantidad de dinero
		int cantDinero;
		// pedimos cantidad de dinero al usuario
		System.out.println("Introduce la cantidad de monedas");
		// guardamos cantidad
		cantDinero = sc.nextInt();
		// limpiamos buffer
		sc.nextLine();
		// devolvemos cantidad de dinero
		return cantDinero;
	}
}
