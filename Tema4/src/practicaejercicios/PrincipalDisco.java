package practicaejercicios;

import java.util.Scanner;

public class PrincipalDisco {

	// creamos escaner a nivel de clase
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// creamos variable opción que será un char
		char opcion;
		// creamos objeto disco
		Disco objeto;
		//creamos variable codigo
		int codigo;

		// crearemos un do while para repetir el menú y las operaciones
		do {
			// mostramos menú llamando a la función
			mostrarMenu();
			// llamamos a la función perdir opción y la guardamos en la variable opción
			opcion = pedirOpcion();

			// creamos un switch para las distintas opciones
			switch (opcion) {
			// caso 1: mostrar lista
			case 'A' -> {
				// llamamos a la función mostrar conjunto
				DiscoCRUD.mostrarConjunto();
			}
			// caso 2: añadir disco
			case 'B' -> {
				// llamamos a la función crear disco y lo guardamos en un objeto de tipo disco
				objeto = crearDisco();
				// llamamos a la función añadir disco y le pasamos el objeto, lo metemos en un
				// if y nos mostrará un mensaje de éxito o fracaso
				if (DiscoCRUD.añadirDisco(objeto)) {
					System.out.println("La operación se ha realizado con éxito");
				} else {
					System.out.println("La operación ha fracasado");
				}

			}
			// caso 3: borrar disco
			case 'C' -> {
				//llamamos a la función pedir código y guardamos lo que devuelve en la variable codigo
				codigo=pedirCodigo();
				//inicializamos el objeto disco e invocamos al constructor pasandole solo el código
				objeto=new Disco(codigo);
				//llamamos a la función elimina disco y lo metemos en un if. Muestra mensaje de éxito o fracaso
				if(DiscoCRUD.eliminaDisco(objeto)) {
					System.out.println("La operación se ha realizado correctamente");
				}else {
					System.out.println("La operación ha fracasado");
				}
				

			}
			// caso 4: salir
			case 'S' -> {
				System.out.println("Saliendo de programa");

			}
			// default
			default -> {
				System.out.println("La opción introducida no es válida");
			}
			}

		} while (opcion != 'S');

		// cerramos escaner
		sc.close();
	}

	/**
	 * Función que muestra el menú
	 */
	public static void mostrarMenu() {

		System.out.println();
		System.out.println("DISCOS A LA VENTA");
		System.out.println();
		System.out.println("Menú:");
		System.out.println("A. Listado");
		System.out.println("B. Nuevo Disco");
		System.out.println("C. Borrar Disco");
		System.out.println("S. Salir");

	}

	/**
	 * Función que pide la opción del menú
	 * 
	 * @return opción
	 */
	public static char pedirOpcion() {
		// variable opcion
		char opcion;
		// pedimos opción
		System.out.println("Introduce la opción deseada");
		// guardamos, hacemos un to upper case para ponerlo en mayúsculas y un charAt(0)
		// para quedarnos con el primer carácter
		opcion = sc.nextLine().toUpperCase().charAt(0);

		return opcion;
	}

	/**
	 * función que pide el código del disco
	 * 
	 * @return código disco
	 */
	public static int pedirCodigo() {
		int codigo;
		// pedimos el código
		System.out.println("Introduce el código del disco");
		// guardamos
		codigo = sc.nextInt();
		// limpiamos buffer
		sc.nextLine();
		return codigo;
	}

	/**
	 * Función que pide el nombre del autor
	 * 
	 * @return nombre autor
	 */
	public static String pedirAutor() {
		String autor;
		// pedimos nombre
		System.out.println("Introduce el nombre del autor");
		// guardamos
		autor = sc.nextLine();

		// devolvemos autor
		return autor;
	}

	/**
	 * Función que pide el nombre del autor
	 * 
	 * @return nombre autor
	 */
	public static String pediTitulo() {
		String titulo;
		// pedimos nombre
		System.out.println("Introduce el título del disco");
		// guardamos
		titulo = sc.nextLine();

		// devolvemos autor
		return titulo;
	}

	/**
	 * función que pide duración del disco
	 * 
	 * @return duración disco
	 */
	public static double pedirDuracion() {
		double duracion;
		// pedimos el código
		System.out.println("Introduce duración del disco");
		// guardamos
		duracion = sc.nextDouble();
		// limpiamos buffer
		sc.nextLine();
		return duracion;
	}

	/**
	 * Función que pide el género del disco
	 * 
	 * @return género disco
	 */
	public static String pedirGenero() {
		String genero;
		// pedimos nombre
		System.out.println("Introduce el género del disco");
		// guardamos
		genero = sc.nextLine().toUpperCase();

		// devolvemos autor
		return genero;
	}

	/**
	 * Función que pide los atributos y crea un objeto disco
	 * 
	 * @return objeto disco
	 */
	public static Disco crearDisco() {
		// creamos variable de los atributos y llamamos a la función que piden los datos
		int codigo = pedirCodigo();
		String autor = pedirAutor();
		String titulo = pediTitulo();
		double duracion = pedirDuracion();
		String genero = pedirGenero();

		// creamos un objeto disco e invocamos al constructor
		Disco obj = new Disco(codigo, autor, titulo, duracion, genero);

		return obj;
	}

}
