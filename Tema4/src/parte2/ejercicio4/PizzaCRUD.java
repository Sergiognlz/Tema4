package parte2.ejercicio4;

import java.util.HashSet;
import java.util.Set;

public class PizzaCRUD {
	// creamos conjunto pizzas de clase objeto pizza
	private Set<Pizza> conjuntoPizzas = new HashSet<>();

	/**
	 * función que muestra por consola el conjunto y los objetos que contiene
	 */
	public void mostrarConjunto() {
		// for each para recorrer el conjunto
		for (Pizza objeto : conjuntoPizzas) {
			// imprimimos el objeto que recorre con la implementación del toString
			System.out.println(objeto);
			System.out.println("-------------------------");
		}
	}

	/**
	 * función que añade un objeto pizza al conjunto
	 * 
	 * @param objeto pizza a añadir
	 * @return true si consigue añadirlo y false si no
	 */
	public boolean añadirPizza(Pizza objeto) {
		// variable exito
		boolean exito = false;

		// comprobamos si el objeto ya se encuentra en el conjunto.
		if (!conjuntoPizzas.contains(objeto)) {
			// si no se encuentra se añade
			conjuntoPizzas.add(objeto);
			// y cambiamos exito a true
			exito = true;
		}
		// devolvemos exito
		return exito;
	}

	public Pizza buscaPizza(int codigo) {
		// creamos objetoAuxiliar inicializado a null
		Pizza objetoAux = null;
		// realizamos un for each para recorrer el conjunto
		for (Pizza pizza : conjuntoPizzas) {
			// si el codigo de pizza coincide con el que buscamos
			if (pizza.getCodigo() == codigo) {
				// lo encontrará y guardamos ese objeto en objetoAux
				objetoAux = pizza;
			}
		}

		// devolvemos objetoAux
		return objetoAux;
	}

	public boolean modificaEstado(int codigo) {
		// booleano exito
		boolean exito = false;
		// objeto pizza
		Pizza objeto = buscaPizza(codigo);
		// si la pizza existe
		if (objeto != null) {
			// cambiamos estado
			objeto.setEstado("SERVIDA");
			// exito pasa a true
			exito = true;
		}
		// devolvemos exito
		return exito;
	}
}
