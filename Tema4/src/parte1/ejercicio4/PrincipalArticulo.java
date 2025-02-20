package parte1.ejercicio4;

import java.util.Scanner;

public class PrincipalArticulo {
	/*
	 * Crea un programa con una clase llamada Articulo con los siguientes atributos:
	 * nombre, precio (sin IVA), iva (siempre será 21) y cuantosQuedan (representa
	 * cuántos quedan en el almacén). En el main de la clase principal instancia un
	 * objeto de la clase artículo.
	 * 
	 * Asígnale valores a todos sus atributos (los que quieras) y muestra por
	 * pantalla un mensaje del estilo “Pijama - Precio:10€ - IVA:21% - PVP:12,1€”
	 * (el PVP es el precio de venta al público, es decir, el precio con IVA).
	 * Luego, cambia el precio y vuelve a imprimir el mensaje.
	 */

	// creamos objetos a nivel de clase
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// creamos variable opción
		char opcion;
		// variable nombre
		String nombre;
		// variable pvp
		double pvp;
		// variable precio
		double precio;
		// variable cantidad
		int cantidad;
		// creamos objeto clase artículo
		Articulo articulo;
		// creamos objeto clase conjunto
		GESTISIMAL Gsl = new GESTISIMAL();

		// do while para repetir menú
		do {
			// mostramos menú llamando a la función mostrar menú
			mostrarMenu();
			// guardamos opción quedanonos con el primer caracter
			opcion = sc.next().charAt(0);
			//limpiamos buffer
			sc.nextLine();

			// switch para realizar las operaciones de menú
			switch (opcion) {
			// caso a mostrar conjunto
			case 'a' -> {
				// llamamos función mostrarConjunto
				Gsl.mostrarConjunto();
			}
			// caso c crear un nuevo artículo
			case 'b' -> {
				// llamamos a la función creaAlumno
				articulo = altaArticulo();
				// llamamos a la función añadeAlumno
				if (Gsl.añadirArticulo(articulo)) {
					// mensaje éxito
					System.out.println("El artículo se ha dado de alta con éxito");
				} else {
					// mensaje error
					System.err.println("El artículo no se pudo dar de alta");
				}

			}
			// caso c borrar objeto
			case 'c' -> {
				// llamamos a la función pedir nombre y la guardamos en la variable nombre
				nombre = pedirNombre();
				// llamamos a la función buscaArticulo con el nombre que le pasamos y lo
				// guardamos
				// en el objeto articulo
				articulo = Gsl.buscaArticulo(nombre);
				// llamamos a la función eliminaArticulo y le pasamos el objeto que deseamos
				// eliminar
				if (Gsl.eliminaArticulo(articulo)) {
					// mensaje éxito
					System.out.println("El artículo se dio de baja con éxito");
				} else {
					// mensaje error
					System.err.println("El artículo no se pudo dar de baja");
				}

			}
			// caso d modificar objeto
			case 'd' -> {

				// menú de modificación
				System.out.println("a. Modificar nombre");
				System.out.println("b. Modificar precio");
				System.out.println();
				System.out.println("Elija opción:");
				// guardamos opción
				opcion = sc.next().charAt(0);
				//limpiamos buffer
				sc.nextLine();
				// if else con opciones
				if (opcion == 'a') {
					// llamamos a la función pedir nombre y la guardamos en la variable nombre
					nombre = pedirNombre();
					// llamamos a la función buscaArtículo con el nombre que le pasamos y lo
					// guardamos
					// en el objeto artículo
					articulo = Gsl.buscaArticulo(nombre);
					// pedimos nuevo nombre
					System.out.println("Introduce el nuevo nombre");
					// guardamos nombre
					nombre = sc.nextLine();
					// modificamos el nombre del artículo
					articulo.setNombre(nombre);
					// opción b
				} else if (opcion == 'b') {
					// llamamos a la función pedir nombre y la guardamos en la variable nombre
					nombre = pedirNombre();
					// llamamos a la función buscaArtículo con el nombre que le pasamos y lo
					// guardamos
					// en el objeto artículo
					articulo = Gsl.buscaArticulo(nombre);
					// pedimos nuevo precio
					System.out.println("Introduce nuevo precio");
					// guardamos
					precio = sc.nextDouble();
					// modificamos precios
					articulo.setPrecio(precio);

					// si no es ninguna
				} else {
					// mensaje error
					System.out.println("La opción elegida no existe");
				}
			}
			// caso e entrada de mercancía
			case 'e' -> {
				// llamamos a la función pedir nombre y la guardamos en la variable nombre
				nombre = pedirNombre();
				// llamamos a la función buscaArticulo con el nombre que le pasamos y lo
				// guardamos
				// en el objeto articulo
				articulo = Gsl.buscaArticulo(nombre);
				// pedimos cantidad llamando a pedirCantidad
				cantidad = pedirCantidad();
				// llamamos a la función almacenar de la clase Artículo
				if (articulo.almacenar(cantidad)) {
					// mensaje exito
					System.out.println("La mercancía ha sido almacenada exitosamente");
				} else {
					// error
					System.out.println("No se ha podido almacenar la mercancía");
				}
			}
			// caso e retirada de mercancía
			case 'f' -> {
				// llamamos a la función pedir nombre y la guardamos en la variable nombre
				nombre = pedirNombre();
				// llamamos a la función buscaArticulo con el nombre que le pasamos y lo
				// guardamos
				// en el objeto articulo
				articulo = Gsl.buscaArticulo(nombre);
				// pedimos cantidad llamando a pedirCantidad
				cantidad = pedirCantidad();
				// llamamos a la función almacenar de la clase Artículo
				if (articulo.vender(cantidad)) {
					// mensaje exito
					System.out.println("La mercancía ha sido retirada exitosamente");
				} else {
					// error
					System.out.println("No se ha podido retirar la mercancía");
				}
			}
			// caso 5 salir del programa
			case 'g' -> {
				// mensaje de salida
				System.out.println("Saliendo del programa");
			}
			// default
			default -> {
				// mensaje de error
				System.out.println("La opción elegida no existe");
			}
			}

			// repetirá el proceso mientras no elijamos la opción 5
		} while (opcion != 'g');
		System.out.println();
		// mensaje de fin de programa
		System.out.println("FIN");
		// cerramos escaner
		sc.close();
	}

	/**
	 * función que muestra un menú
	 */
	public static void mostrarMenu() {
		// menú
		System.out.println();
		System.out.println("Menú");
		System.out.println();
		System.out.println("a. Listado");
		System.out.println("b. Alta");
		System.out.println("c. Baja");
		System.out.println("d. Modificación");
		System.out.println("e. Entrada de mercancía");
		System.out.println("f. Salida de mercancía");
		System.out.println("g. Salir");
		System.out.println();
		System.out.println("Introduce la opción");
	}

	/**
	 * Función que llama a su vez a las funciones que piden nombre, precio y
	 * cantidad y invocan al constructor devolviendo un objeto completo
	 * 
	 * @return objeto Artículo
	 */
	public static Articulo altaArticulo() {
		// objeto artículo
		Articulo articulo;
		// variable nombre. Llamamos pedirNombre
		String nombre = pedirNombre();
		
		// variable precio. Llamamos pedirPrecio
		double precio = pedirPrecio();
		// variable cantidad. Llamamos pedirCantidad
		int cantidad = pedirCantidad();
		// llamamos al constructor y le pasamos los datos recogidos
		articulo = new Articulo(nombre, precio, cantidad);
		// devolvemos objeto Artículo
		return articulo;
	}

	/**
	 * Función que pide el nombre del artículo
	 * 
	 * @return nombre del artículo
	 */
	public static String pedirNombre() {
		String nombre;
		// pedimos nombre del artículo
		System.out.println("Introduce el nombre del artículo");
		// guardamos nombre
		nombre = sc.nextLine();
		// devuelve nombre
		return nombre;

	}

	/**
	 * Función que pide el precio del artículo
	 * 
	 * @return precio del artículo
	 */
	public static double pedirPrecio() {
		double precio;
		// pedimos nombre del artículo
		System.out.println("Introduce el precio del artículo");
		// guardamos nombre
		precio = sc.nextDouble();
		// devuelve precio
		return precio;

	}

	/**
	 * Función que pide la cantidad de artículos
	 * 
	 * @return cantidad de artículos
	 */
	public static int pedirCantidad() {
		int cantidad;
		// pedimos nombre del artículo
		System.out.println("Introduce la cantidad de artículos");
		// guardamos nombre
		cantidad = sc.nextInt();
		// devuelve precio
		return cantidad;

	}

}