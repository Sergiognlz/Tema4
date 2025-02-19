package parte1.ejercicio4;

import java.util.HashSet;
import java.util.Set;

public class GESTISIMAL {
	// conjunto de clase objeto Articulo
	private Set<Articulo> conjunto = new HashSet<>();

	/**
	 * función que muestra los artículos del conjunto
	 */
	public void mostrarConjunto() {
		// for each
		for (Articulo objeto : conjunto) {
			// mostramos por pantalla el toString del objeto
			System.out.println(objeto);

		}
	}

	/**
	 * Función que añade el objeto Artículo al conjunto si no se encuentra en él
	 * 
	 * @param objeto que queremos añadir
	 * @return deuelve true si ha podido añadirlo(no estaba ya en el conjunto) o
	 *         false si no lo añadió
	 */
	public boolean añadirArticulo(Articulo objeto) {

		// devolvemos true o false dependiendo de si ya se encuentra en el conjunto
		return conjunto.add(objeto);
	}

	/**
	 * Función que busca artículos en el conjunto a partir del nombre que le pasamos
	 * por parámetro
	 * 
	 * @param nombre el artículo que queremos buscar
	 * @return objeto auxiliar donde guardamos el artículo que queremos buscar
	 */
	public Articulo buscaArticulo(String nombre) {
		// variable objeto auxiliar
		Articulo objetoAux = null;
		// for each para recorrer el conjunto
		for (Articulo objeto : conjunto) {
			// cuando el nombre del objeto recorrido sea igual a la cadena que buscamos...
			if (objeto.getNombre().equals(nombre)) {
				// guardamos el objeto en objeto Auxiliar
				objetoAux = objeto;
			}

		}
		// devolvemos objeto Auxiliar
		return objetoAux;

	}
	/**
	 * función que elimina un objeto artículo 
	 * @param objeto que se desea eliminar
	 * @return true si lo elimina y false si no
	 */
	public boolean eliminaArticulo (Articulo objeto) {
		//devolvemos true si se elimina y false si no
		return conjunto.remove(objeto);
	}
	
}