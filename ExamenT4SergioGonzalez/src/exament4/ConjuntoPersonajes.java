package exament4;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPersonajes {

	// creamos un conjunto de personajes
	private static Set<Personaje> conjuntoPjs = new HashSet<>();

	/**
	 * Función que recibe un objeto personaje y lo añade al conjunto
	 * 
	 * @param objeto personaje
	 * @return true si lo añade y flase si no
	 */
	public static boolean añadirPersonaje(Personaje pj) {
		// creamos booleano éxito y la inicializamos añadiendo un pj al conjunto.
		boolean exito = conjuntoPjs.add(pj);

		// devolvemos exito;
		return exito;
	}

	/**
	 * función que recorre el conjunto y muestra por pantalla los objetos que lo
	 * componen
	 */
	public static void mostrarConjunto() {
		//mostramos cantidad de monedas
		System.out.println("Monedas: "+Personaje.getCantMonedas());
		// creamos un for each para recorrer el conjunto
		for (Personaje pj : conjuntoPjs) {
		
			// mostramos por pantalla el personaje
			System.out.println(pj);
		}
	}
	
	/**
	 * Función que recibe un objeto de tipo pj y busca en el conjunto un objeto igual
	 * @param pj
	 * @return objeto personaje
	 */
	public static Personaje buscarPersonaje(Personaje pj) {
		//creamos objeto pjAuxiliar inicializado a null
		Personaje pjAux=null;
		//for each para recorrer el conjunto
		for(Personaje objeto:conjuntoPjs) {
			//si el objeto que recorremos es igual al objeto que buscamos
			if(objeto.equals(pj)) {
				//guardamos el objeto en el objejto auxiliar
				pjAux=objeto;
			}
		}
		//devolvemos pjAuxiliar
		return pjAux;
	}
	
	/**
	 * Función que recibe un personje y lo borra del conjunto
	 * @param pj 
	 * @return true o false en base al éxito de la operación
	 */
	public static boolean eliminarPj(Personaje pj) {
		//variable booleana éxito a false
		boolean exito=false;
		//si el objeto existe
		if(pj!=null) {
			//lo borra del conjunto
			conjuntoPjs.remove(pj);
			//éxito a true
			exito=true;
		}
		//devolvemos éxito
		return exito;
	}
	
}
