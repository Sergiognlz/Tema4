package parte4.ejercicio4;

import java.util.HashSet;
import java.util.Set;

public class DiscoCRUD {
//creamos un conjunto para guardar los discos de tipo objeto Disco
	private static Set<Disco> conjuntoDiscos = new HashSet<>();

	/**
	 * función que muestra los atributos del objeto
	 */
	public static void mostrarConjunto() {

		// for each para recorrer el conjunto
		for (Disco objeto : conjuntoDiscos) {
			// imprimimos el objeto
			System.out.println(objeto);
			System.out.println("--------------------------------");

		}
	}

	/**
	 * función que añade un objeto disco al conjunto
	 * 
	 * @param objeto disco
	 * @return true si lo añade, false si no
	 */
	public static boolean añadirDisco(Disco objeto) {
		// variable exito
		boolean exito = false;
		// comprobamos si el objeto que queremos añadir ya existe en el conjunto
		if (!conjuntoDiscos.contains(objeto)) {
			// si no existe lo añadimos
			conjuntoDiscos.add(objeto);
			// cambiamos exito a true
			exito = true;

		}

		// devuelve exito
		return exito;
	}

	/**
	 * función que recibe un objeto y comprueba si uno igual se encuentra en el
	 * conjunto
	 * 
	 * @param objeto a buscar
	 * @return objeto encontrado o null si no lo encuentra
	 */
	public static Disco buscaDisco(Disco objeto) {
		// creamos objeto discoAux
		Disco discoAux = null;

		// recorremos el conjunto con un for each
		for (Disco disco : conjuntoDiscos) {
			// si el objeto disco es igual en código(por el equals implementado) al objeto
			// que pasamos...
			if (disco.equals(objeto)) {
				// guardamos el objeto disco en discoAux
				discoAux = disco;
			}
		}
		// devolvemos discoAux
		return discoAux;
	}

	/**
	 * función que recibe un objeto y elimina el objeto del conjunto
	 * @param objeto que se va a elimnar
	 * @return true si lo elimina, false si no
	 */
	public static boolean eliminaDisco(Disco objeto) {
		// variable exito
		boolean exito = false;
		// si lo consigue borrar
		if (conjuntoDiscos.remove(objeto)) {
			// exito será true
			exito = true;
		}
		// devolvemos exito
		return exito;
	}
}
