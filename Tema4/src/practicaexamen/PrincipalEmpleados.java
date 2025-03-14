package practicaexamen;

import java.util.Scanner;

public class PrincipalEmpleados {

	// creamos el objeto escaner a nivel de clase para poder usarlo donde nos
	// interese
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// creamos variable opción
		int opcion;
		// creamos objeto empleado
		Empleado objeto;
		// variable dni
		String dni;

		// bienvenida del sistema
		System.out.println("LISTA DE EMPLEADOS");

		// do while para repetir el menú y las interacciones
		do {
			// mostramos menú llamando a la función del mismo nombre
			mostrarMenu();
			// pedimos la opción llamando a la función del mismo nombre
			opcion = pedirOpcion();

			// switch con las operaciones según la opción elegida
			switch (opcion) {
			// caso 1: añadir empleado
			case 1 -> {
				// llamamos a la función crear empleado y lo guardamos en el objeto que tenemos
				// creado previamente
				objeto = crearEmpleado();
				// llamamos a la función añadir empleado de la clase lista de empleados y le
				// pasamos el objeto que queremos crear.
				if (ListaEmpleados.añadirEmpleado(objeto)) {
					// si puede crear el objeto mostraremos un mensaje exitoso
					System.out.println("La operación se ha realizado con éxito");
					// si no lo consigue
				} else {
					// mensaje de fracaso
					System.out.println("La operación  ha fracasado");
				}
			}
			// caso 2: mostrar lista
			case 2 -> {
				// llamamos a la función mostrar empleados desde la clase lista de empleados
				ListaEmpleados.mostrarEmpleados();
			}
			// caso 3: modificar horas extra
			case 3 -> {
				// llamamos a la función modificar horas extra y lo metemos en un if
				if (modificarHE()) {
					// si lo modifica mensaje éxito
					System.out.println("La operación se ha realizado con éxito");
				} else {
					// si no lo modifica mensaje fracaso
					System.out.println("La operación ha fracasado");
				}

			}
			// caso 4: modificar importe horas extras
			case 4 -> {
				// llamamos a la función modificar horas extras
				modificarImporteHE();
			}
			// caso 5:eliminar empleado
			case 5 -> {
				// pedimos dni llamando a la función del mismo nombre
				dni = pedirDNI();
				// llamamos al constructor y le pasamos dni
				objeto = new Empleado(dni);
				// llamamos a la función de la clase ListaEmpleados eliminarEmpleado y lo
				// metemos en un if
				if (ListaEmpleados.eliminarEmpleado(objeto)) {
					// si tiene éxito mensaje informativo
					System.out.println("La operación se ha realizado con éxito");
				} else {
					// que no, pues lo mismo
					System.out.println("La operación ha fracasado");
				}
			}
			// caso 0: salir
			case 0 -> {
				// mensaje de salida
				System.out.println("Saliendo del programa");
			}
			// default
			default -> {
				// mensaje opción errónea
				System.out.println("La opción introducida no es válida");
			}
			}

		} while (opcion != 0);

		// cerramos escaner
		sc.close();
	}

	public static void mostrarMenu() {
		// espacio en blanco para que no quede feo
		System.out.println();
		// Mostramos menú
		System.out.println("Menú Empleados:");
		System.out.println("1. Añadir empleado");
		System.out.println("2. Listar empleados");
		System.out.println("3. Modificar horas extra");
		System.out.println("4. Modificar importe horas extra");
		System.out.println("5. Eliminar empleado");
		System.out.println("0. Salir");
		// más espacio
		System.out.println();
	}

	/**
	 * Función que pide al usuario la opción deseada del menú
	 * 
	 * @return opción elegida
	 */
	public static int pedirOpcion() {
		// variable opción
		int opcion;
		// pedimos opción al usuario
		System.out.println("Introduce la opción deseada");
		// guardamos la opción
		opcion = sc.nextInt();
		// limpiamos buffer
		sc.nextLine();
		// devolvemos opción
		return opcion;
	}

	/**
	 * Función que pide el dni al usuario
	 * 
	 * @return dni
	 */
	public static String pedirDNI() {
		// variable dni
		String dni;
		// pedimos dni al usuario
		System.out.println("Introduce el dni del empleado");
		// guardamos dni
		dni = sc.nextLine();
		// devolvemos dni
		return dni;
	}

	/**
	 * Función que pide el nombre al usuario
	 * 
	 * @return nombre
	 */
	public static String pedirNombre() {
		// variable nombre
		String nombre;
		// pedimos nombre al usuario
		System.out.println("Introduce el nombre del empleado");
		// guardamos nombre
		nombre = sc.nextLine();
		// devolvemos dni
		return nombre;
	}

	/**
	 * Función que pide el sueldo base al usuario
	 * 
	 * @return sueldo base
	 */
	public static double pedirSueldoBase() {
		// variable sueldo base
		double sueldoBase;
		// pedimos sueldo base al usuario
		System.out.println("Introduce el sueldo base del empleado");
		// guardamos sueldo base
		sueldoBase = sc.nextDouble();
		// limpiamos buffer
		sc.nextLine();

		// devolvemos sueldo base
		return sueldoBase;
	}

	/**
	 * Función que pide las horas extra al usuario
	 * 
	 * @return horas extras
	 */
	public static int pedirHorasExtra() {
		// variable horas extra
		int horasExtra;
		// pedimos horas extra al usuario
		System.out.println("Introduce las horas extra del empleado");
		// guardamos horas extra
		horasExtra = sc.nextInt();
		// limpiamos buffer
		sc.nextLine();

		// devolvemos sueldo base
		return horasExtra;
	}

	/**
	 * Función que pide el importe de las horas extra al usuario
	 * 
	 * @return importe horas extra
	 */
	public static double pedirImporteHE() {
		// variable importeHE
		double importeHE;
		// pedimos importe al usuario
		System.out.println("Introduce el importe de las horas extra del empleado");
		// guardamos importe
		importeHE = sc.nextDouble();
		// limpiamos buffer
		sc.nextLine();

		// devolvemos sueldo base
		return importeHE;
	}

	public static Empleado crearEmpleado() {
		// variable dni e inicializamos llamando a la función pedir dni
		String dni = pedirDNI();
		// variable nombre e inicializamos llamando a la función pedir nombre
		String nombre = pedirNombre();
		// variable sueldo base e inicializamos llamando a la función pedir sueldo base
		double sueldoBase = pedirSueldoBase();
		// variable horas extra e inicializamos llamando a la función pedir horas extra
		int horasExtra = pedirHorasExtra();
		// creamos objeto empleado e invocamos al constructor con los datos recogidos
		Empleado objeto = new Empleado(dni, nombre, sueldoBase, horasExtra);

		// devolvemos objeto empleado
		return objeto;
	}

	/**
	 * Función que pide el dni del empleado, realiza un búsqueda el empleado y
	 * modifica sus horas extras concretas.
	 * 
	 * @return true si tiene éxito y false si no
	 */
	public static boolean modificarHE() {
		// variable exito a false
		boolean exito = false;
		// variable dni;
		String dni;
		// variable horas extras
		int horasExtra;
		// objeto empleado
		Empleado objeto;
		// objeto encontrado
		Empleado objEncontrado;

		// pedimos el dni del empleado para saber a quien quiere cambiar la horas extras
		dni = pedirDNI();
		// llamamos al constructor solo con el dni y creamos un objeto que solo tenga
		// dni
		objeto = new Empleado(dni);
		// llamamos a la función buscar empleado de la clase ListaEmpleados y le pasamos
		// el objeto. Guardamos el objeto obtenido de la búsqueda en objEncontrado;
		objEncontrado = ListaEmpleados.buscarEmpleado(objeto);
		// si objeto encontrado no es null (existe un objeto que modificar) realizamos
		// las siguientes operaciones
		if (objEncontrado != null) {
			// pedimos horas extras llamando a la función del mismo nombre y lo guardamos en
			// la variable horas extras
			horasExtra = pedirHorasExtra();
			// modificamos el atributo horas extra del objeto encontrado mediante el método
			// set del objeto
			objEncontrado.setHorasExtras(horasExtra);
			// exito será true
			exito = true;
		}
		// devolvemos exito
		return exito;
	}

	/**
	 * Función que pide el nuevo importe de las horas extra y lo modifica
	 */
	public static void modificarImporteHE() {
		// creamos variable nuevo importe y llamamos a la función pedir importe horas
		// extra para inicializarlo
		double nuevoImporte = pedirImporteHE();
		// llamamos a la función estática setImporteHoraExtra desde la clase empleado y
		// le pasamos por parámetro el nuevo importe
		Empleado.setImporteHoraExtra(nuevoImporte);
	}

}
