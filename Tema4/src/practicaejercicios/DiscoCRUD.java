package practicaejercicios;

import java.util.HashSet;
import java.util.Set;

public class DiscoCRUD {
	//conjunto privado y estático de tipo disco
	private static Set<Disco>conjuntoDiscos=new HashSet<>();
	
	
	/**
	 * Función que recorre el conjunto y muestra por pantalla los objetos que lo componen
	 */
	public static void mostrarConjunto() {
		
		for(Disco obj:conjuntoDiscos) {
			System.out.println(obj);
			System.out.println();
		}
	}
	
	/**
	 * Función que recibe un objeto disco y lo añade al conjunto 
	 * @param obj disco
	 * @return true si lo añade o false si no
	 */
	public static boolean añadirDisco(Disco obj) {
		boolean exito=conjuntoDiscos.add(obj);
		
		return exito;
	}
	
	/**
	 * Función que recibe un objeto y busca en el conjunto un objeto igual
	 * @param obj que queremos buscar
	 * @return objeto encontrado
	 */
	/*
	public static Disco buscaDisco(Disco obj) {
		//objeto de tipo disco auxiliar
		Disco objAux=null;
		//for each para recorrer el conjunto
		for(Disco objeto:conjuntoDiscos) {
			//si el objeto que recorro es igual al que le paso
			if(objeto.equals(obj)) {
				//guardo el objeto en objeto auxiliar
				objAux=objeto;
			}
		}
		//devuelvo objeto auxiliar
		return objAux;
	}
	*/
	
	/**
	 * función que elimina un objeto disco
	 * @param obj disco
	 * @return true si lo elimina y false si no
	 */
	public static boolean eliminaDisco(Disco obj) {
		boolean exito=conjuntoDiscos.remove(obj);
		
		return exito;
	}

	
}
