package parte2.ejercicio1;

import java.util.HashSet;
import java.util.Set;

public class CuentaCorrienteCRUD {

	// conjunto de tipo cuenta corriente
	private static Set<CuentaCorriente> conjuntoCuentas = new HashSet<>();

	/**
	 * muestra los objetos en el conjunto
	 */
	public static void mostrarConjunto() {
		// for each para recorrer el conjunto
		for (CuentaCorriente objeto : conjuntoCuentas) {
			// mostramos por pantalla objeto
			System.out.println(objeto);
			System.out.println("-------------------------");
		}
	}
/**
 * función que añade el objeto recibido al conjunto
 * @param objeto recibido
 * @return true si se añade, false si no
 */
	public static boolean añadirCuenta(CuentaCorriente objeto) {
		//variable exito
		boolean exito=false;
		//comprobamos si existe el objeto en el conjunto
		if(!conjuntoCuentas.contains(objeto)) {
			//si no existe se añade
			conjuntoCuentas.add(objeto);
			//existo pasa a true
			exito=true;
		}
		
		//devolvemos exito
		return exito;
	}
	
	public static CuentaCorriente buscarCuenta(CuentaCorriente cuenta) {
		//creamos objeto auxiliar
		CuentaCorriente objetoAux=null;
		//for each para recorrer el conjunto
		for(CuentaCorriente objeto:conjuntoCuentas) {
			//si el objeto que recorremos coincide con el que buscamos
			if(objeto.equals(cuenta)) {
				//guardamos la referencia en objeto auxiliar
				objetoAux=objeto;
			}
		}
		
		
		//devolvemos objeto auxiliar
		return objetoAux;
	}
	
	
}
