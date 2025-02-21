package parte4.ejercicio4;

import java.util.Scanner;

import parte4.ejercicio4.Disco.Genero;

public class PrincipalDisco {
//creamos Scanner a nivel de clase para usarlo donde lo necesitemos
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// creamos la variable opción
		int opcion;
		// creamos variable código
		int codigo;
		// creamos objeto disco
		Disco objeto;

		// creamos do while para mostrar menú las veces que necesitemos
		do {
			// mostramos menú llamando a la función mostrarMenu
			mostrarMenu();
			// guardamos la opción
			opcion = sc.nextInt();
			// limpiamos buffer
			sc.nextLine();

			// switch para las operaciones del menú
			switch (opcion) {
			// caso 1: listado discos
			case 1 -> {
				// mostramos conjunto llamando a la función mostrar conjunto
				DiscoCRUD.mostrarConjunto();
			}
			// caso 2: añadir disco
			case 2 -> {
				// llamamos a la función crearDisco para que nos pida los valores de los
				// atributos y cree el objeto disco
				objeto = crearDisco();
				// si se añade
				if (DiscoCRUD.añadirDisco(objeto)) {
					// mensaje exito
					System.out.println("El disco ha sido añadido con éxito");
					// si no se añade
				} else {
					// mensaje error
					System.err.println("No se ha podido añadir");
				}
			}
			// caso 3: borrar disco
			case 3 -> {
				// llamamos a la función pedirCodigo
				codigo = pedirCodigo();
				// llamamos al constructor pasandole solo el código
				objeto = new Disco(codigo);
				// volvemos a guardar en objeto esta vez el objeto que corresponde con el código
				// del objeto que buscamos
				objeto = DiscoCRUD.buscaDisco(objeto);
				//comprobamos que lo encuentre
				if(objeto!=null) {
					//comprobamos si lo ha eliminado llamando a la función eliminaDisco
					if(DiscoCRUD.eliminaDisco(objeto)) {
						//si lo consigue eliminar
						System.out.println("El disco ha sido eliminado con éxito");
						//sino
					}else {
						//error
						System.err.println("No ha podido eliminar el disco");
					}
					
					//si no lo encuentra...
				}else {
					//es que no existe
					System.out.println("El disco que intenta eliminar no existe");
					
				}

			}
			//caso 4: saliendo
			case 4->{
				//mensaje salida
				System.out.println("Saliendo del programa");
				System.out.println();
			}
			//default
			default->{
				//mensaje error opción
				System.err.println("La opción elegida no exite");
			}
			}

			// repetirá hasta elegir la opción 4
		} while (opcion != 4);

	}

	/**
	 * función que muestra el menú
	 */
	public static void mostrarMenu() {
		// imprimimos menú
		System.out.println();
		System.out.println("Menú:");
		System.out.println();
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Disco");
		System.out.println("3. Borrar");
		System.out.println("4. Salir");
		System.out.println();
		System.out.println("Introduce opción:");

	}

	/**
	 * función que pide un código al usuario y lo devuelve
	 * 
	 * @return código
	 */
	public static int pedirCodigo() {
		// variable código
		int codigo;

		// pedimos código
		System.out.println("Introduce el código del disco");
		// guardamos código
		codigo = sc.nextInt();
		// limiamos buffer
		sc.nextLine();

		// devuelve código
		return codigo;
	}

	/**
	 * función que pide el autor al usuario y lo devuelve
	 * 
	 * @return autor
	 */
	public static String pedirAutor() {
		// variable autor
		String autor;

		// pedimos dato
		System.out.println("Introduce el autor del disco");
		// guardamos dato
		autor = sc.nextLine();

		// devuelve dato
		return autor;
	}

	/**
	 * función que pide el título al usuario y lo devuelve
	 * 
	 * @return autor
	 */
	public static String pedirTitulo() {
		// variable titulo
		String titulo;

		// pedimos dato
		System.out.println("Introduce el título del disco");
		// guardamos dato
		titulo = sc.nextLine();

		// devuelve dato
		return titulo;
	}

	/**
	 * función que pide la duración al usuario y lo devuelve
	 * 
	 * @return duración
	 */
	public static double pedirDuracion() {
		// variable duración
		double duracion;

		// pedimos dato
		System.out.println("Introduce la duración del disco");
		// guardamos dato
		duracion = sc.nextDouble();
		// limiamos buffer
		sc.nextLine();

		// devuelve dato
		return duracion;
	}

	/**
	 * función que pide el género al usuario y lo devuelve
	 * 
	 * @return género
	 */
	public static String pedirGenero() {
		// variable género
		String genero;

		// pedimos dato
		System.out.println("Introduce el género del disco");
		// guardamos dato
		genero = sc.nextLine().toUpperCase();
	
		// devuelve dato
		return genero;
	}

	public static Disco crearDisco() {
		// creamos objeto disco
		Disco objeto;
		// variable código
		int codigo;
		// variable autor
		String autor;
		// variable título
		String titulo;
		// variable duración
		double duracion;
		// variable genero
		String genero;

		// llamamos a las funciones y lo guardamos en las variables correspondientes
		codigo = pedirCodigo();
		autor = pedirAutor();
		titulo = pedirTitulo();
		duracion = pedirDuracion();
		genero = pedirGenero();

		// llamamos al constructor y creamos el objeto
		objeto = new Disco(codigo, autor, titulo, duracion, genero);

		// devolvemos objeto
		return objeto;
	}
}
