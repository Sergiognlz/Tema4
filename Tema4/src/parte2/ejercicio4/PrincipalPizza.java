package parte2.ejercicio4;

import java.util.Scanner;

public class PrincipalPizza {

	/**
	 * Crea un CRUD a partir de la clase Pizza. Para ello, crea un programa en el
	 * main que vaya registrando las pizzas que se han pedido en el día.
	 * 
	 * El menú del programa debe tener, al menos, las siguientes opciones:
	 * 
	 * Listado de pizzas Nuevo pedido Pizza servida Salir
	 **/
	// creamos objeto escaner a nivel de clase
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// creamos variable opción
		char opcion;
		// creamos variable código
		int codigo;
		// creamos variable tamaño
		String tamaño;
		// creamos variable tipo
		String tipo;
		// creamos objeto pizza
		Pizza pizza;
		// creamos objeto clase PizzaCRUD
		PizzaCRUD pC = new PizzaCRUD();

		// do while que repetirá el proceso hasta que elijamos la opción salir
		do {
			// llamamos a la función mostrarMenu
			mostrarMenu();
			// guardamos la opción
			opcion = sc.next().charAt(0);
			// limpiamos buffer
			sc.nextLine();

			// switch con las operaciones del menú
			switch (opcion) {

			// caso a: Mostrar pizzas en el conjunto
			case 'a' -> {
				// llamamos a la función mostrarConjunto desde el objeto pC
				pC.mostrarConjunto();

			}
			// caso b: añadir nueva pizza
			case 'b' -> {
				// llamamos a la función crearPizza y lo guardamos en objeto pizza
				pizza = creaPizza();
				// llamamos a la función añadirPizza y le pasamos el objeto pizza. Lo metemos en
				// un if que mostrará un mensaje de exito si se ha añadido y de error si no
				if (pC.añadirPizza(pizza)) {
					//mensaje exito
					System.out.println("Se ha añadido la pizza correctamente");
				}else {
					//mensaje de error
					System.err.println("No se ha podido añadir la pizza");
				}
			}
			//caso c:modificar estado pizza
			case 'c'->{
				//pedimos códgo llamando a pedirCodigo
				codigo=pedirCodigo();
				//llamamos a buscaPizza y le pasamos el código y guardamos el objeto que devuelve el objeto pizza
				pizza=pC.buscaPizza(codigo);
				//si la pizza existe
				if(pC.modificaEstado(codigo)) {
				//mensaje de cambio
				System.out.println("Se ha cambiado el estado a SERVIDA");
				//en caso de que no exista
				}else {
					//mensaje
					System.out.println("El código de la pizza no existe");
					
				}
			}
			//caso d: salir del programa
			case 'd'->{
				//mensaje saliendo
				System.out.println("Saliendo del programa");
			}
			//default
			default->{
				//mensaje de error
				System.out.println("La opción introducida no existe");
			}
			}

			// repetirá hasta que elijamos la opción d
		} while (opcion != 'd');
		System.out.println();
		//mensaje fin programa
		System.out.println("Fin de programa");
		//cerramos escaner
		sc.close();
	}

	/**
	 * Función que muestra por pantalla el menú
	 */
	public static void mostrarMenu() {
		// menú
		System.out.println();
		System.out.println("Menú:");
		System.out.println();
		System.out.println("a. Listado de pizzas");
		System.out.println("b. Nuevo pedido");
		System.out.println("c. Pizza servida");
		System.out.println("d. Salir");
		System.out.println();
		System.out.println("Elije una opción");

	}

	/**
	 * función que pide el código de la pizza y lo devuelve
	 * 
	 * @return código de la pizza
	 */
	public static int pedirCodigo() {
		// variable código
		int codigo;

		// pedimos código al usuario
		System.out.println("Introduce el código de la pizza");
		// guardamos código
		codigo = sc.nextInt();
		// limpiamos buffer
		sc.nextLine();
		// devolvemos código
		return codigo;
	}

	/**
	 * función que pide el tamaño de la pizza y lo devuelve
	 * 
	 * @return tamaño de la pizza
	 */
	public static String pedirTamaño() {
		// variable código
		String tamaño;

		// pedimos código al usuario
		System.out.println("Introduce el tamaño de la pizza");
		// guardamos código
		tamaño = sc.nextLine().toUpperCase();
		// devolvemos código
		return tamaño;
	}

	/**
	 * función que pide el tamaño de la pizza y lo devuelve
	 * 
	 * @return tamaño de la pizza
	 */
	public static String pedirTipo() {
		// variable código
		String tipo;

		// pedimos código al usuario
		System.out.println("Introduce el tipo de pizza");
		// guardamos código
		tipo = sc.nextLine().toUpperCase();
		// devolvemos código
		return tipo;
	}

	/**
	 * Función que recoge los valores de los atributos del objeto Pizza y crea el
	 * objeto
	 * 
	 * @return objeto pizza ya creado
	 */
	public static Pizza creaPizza() {
		// creamos objeto pizza
		Pizza objeto;
		// creamos variable codigo
		int codigo;
		// creamos variable tamaño
		String tamaño;
		// creamos variable tipo
		String tipo;
		// llamamos a la función pedirCodigo y lo guardamos en codigo
		codigo = pedirCodigo();
		// llamamos a la función pedirTamaño y lo guardamos en tamaño
		tamaño = pedirTamaño();
		// llamamos a la función pedirTipo y lo guardamos en tipo
		tipo = pedirTipo();
		// llamamos al constructor y le pasamos los valores de los atributos
		objeto = new Pizza(codigo, tamaño, tipo);

		// devolvemos objeto
		return objeto;
	}

}
