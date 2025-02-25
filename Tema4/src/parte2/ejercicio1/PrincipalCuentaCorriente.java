package parte2.ejercicio1;

import java.util.Scanner;

public class PrincipalCuentaCorriente {

	// objeto escaner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// variable DNI
		String DNI;
		// variable nombre
		String nombre;
		// variable saldo
		double saldo;
		// variable nación
		String nacion;
		// variable cantidad
		double cantidad;
		// variable opción
		int opcion;

		// objeto cuenta corriente
		CuentaCorriente cc;

		// do while para repetir las operaciones
		do {
			// llamamos a la función mostrar menú
			mostrarMenu();
			// guardamos la opción
			opcion = sc.nextInt();
			// limpiamos buffer
			sc.nextLine();

			// switch para las acciones del menú
			switch (opcion) {
			// caso 1 mostramos datos
			case 1 -> {
				// llamamos a la función que muestra el conjunto
				CuentaCorrienteCRUD.mostrarConjunto();

			}
			// caso 2 crear cuenta
			case 2 -> {
				// llamamos a la función crearCuenta y la guardamos en el objeto cc
				cc = crearCuenta();
				// si se añade
				if (CuentaCorrienteCRUD.añadirCuenta(cc)) {
					// mensaje exito
					System.out.println("Se ha añadido correctamente");
					// si no
				} else {
					// mensaje error
					System.err.println("No se ha podido añadir");
				}

			}
			// caso 3 retirar efectivo
			case 3 -> {
				// llamamos a la función pedir dni
				DNI = pedirDNI();
				// llamamos al constructor y creamos un objeto con ese dni
				cc = new CuentaCorriente(DNI);
				// llamamos a la función buscar cuenta y guardamos la encontrada en cc de nuevo.
				// Ya tenemos el objeto al que pertenece el dni
				cc = CuentaCorrienteCRUD.buscarCuenta(cc);
				// pedimos cantidad llamando a la función pedir saldo
				cantidad = pedirCantidad();
				// llamamos al método sacarDinero
				if (cc.sacarDinero(cantidad)) {
					System.out.println("La operación se ha realizado con éxito");
				} else {
					System.err.println("No se ha podido realizar la operación");
				}
			}
			// caso 4 ingresar dinero
			case 4 -> {
				// llamamos a la función pedir dni
				DNI = pedirDNI();
				// llamamos al constructor y creamos un objeto con ese dni
				cc = new CuentaCorriente(DNI);
				// llamamos a la función buscar cuenta y guardamos la encontrada en cc de nuevo.
				// Ya tenemos el objeto al que pertenece el dni
				cc = CuentaCorrienteCRUD.buscarCuenta(cc);
				// pedimos cantidad llamando a la función pedir saldo
				cantidad = pedirCantidad();
				// llamamos al método sacarDinero
				if (cc.ingresarDinero(cantidad)) {
					System.out.println("La operación se ha realizado con éxito");
				} else {
					System.err.println("No se ha podido realizar la operación");
				}
			}
			// caso 0 salir del programa
			case 0 -> {
				// mensaje de saliendo
				System.out.println("Saliendo");
			}
			// en caso de que la opción introducida no sea válida
			default -> {
				// mensaje error
				System.err.println("La opción introducida no es válida");
			}

			}

			// while para repetir el menú mientras no se elija la opción 0
		} while (opcion != 0);

		System.out.println();
		System.out.println("Fin de programa");

		// cerramos escaner
		sc.close();
	}

	/**
	 * muestra el menú
	 */
	public static void mostrarMenu() {
		// menú
		System.out.println();
		System.out.println("MENÚ:");
		System.out.println();
		System.out.println("1. Mostrar datos de la cuenta");
		System.out.println("2. Insertar datos cuenta");
		System.out.println("3. Retirar efectivo");
		System.out.println("4. Ingresar efectivo");
		System.out.println("0. Salir del programa");
		System.out.println();
		// pedimos opción
		System.out.println("Introduce la opción deseada");
	}

	/**
	 * función que pide el dni del titular
	 * 
	 * @return dni titular
	 */
	public static String pedirDNI() {
		// variable dni
		String dni;

		// pedimos al usuario
		System.out.println("Introduce el DNI del titular");
		// guardamos
		dni = sc.nextLine();

		// devuelve dni
		return dni;

	}

	/**
	 * función que pide nombre
	 * 
	 * @return nombre del titular
	 */
	public static String pedirNombre() {
		// variable nombre
		String nombre;

		// pedimos al usuario
		System.out.println("Introduce el nombre del titular");
		// guardamos
		nombre = sc.nextLine();

		// devuelve nombre
		return nombre;

	}

	/**
	 * función que pide saldo de la cuenta
	 * 
	 * @return saldo cuenta
	 */
	public static double pedirSaldo() {
		// variable saldo
		double saldo;

		// pedimos al usuario
		System.out.println("Introduce el de la cuenta");
		// guardamos
		saldo = sc.nextDouble();
		// limpiamos buffer
		sc.nextLine();
		// devuelve dni
		return saldo;

	}

	/**
	 * función pedir nacionalidad
	 * 
	 * @return nacionalidad
	 */
	public static String pedirNacionalidad() {
		// variable nacionalidad
		String nacionalidad;

		// pedimos al usuario
		System.out.println("Introduce el nacionalidad del titular");
		// guardamos
		nacionalidad = sc.nextLine().toUpperCase();

		// devuelve nacionalidad
		return nacionalidad;
	}

	/**
	 * función que pide los atributos y crea un objeto
	 * 
	 * @return objeto creado
	 */
	public static CuentaCorriente crearCuenta() {
		// variable dni
		String dni = pedirDNI();
		// variable nombre
		String nombre = pedirNombre();
		// variable saldo
		double saldo = pedirSaldo();
		// variable nacionalidad
		String nacionalidad = pedirNacionalidad();
		// creamos objeto cuenta corriente llamando al constructor
		CuentaCorriente objeto = new CuentaCorriente(dni, nombre, saldo, nacionalidad);

		// devuelve objeto creado
		return objeto;
	}

	public static double pedirCantidad() {
		// variable saldo
		double cantidad;

		// pedimos al usuario
		System.out.println("Introduce cantidad");
		// guardamos
		cantidad = sc.nextDouble();
		// limpiamos buffer
		sc.nextLine();
		// devuelve dni
		return cantidad;

	}
}