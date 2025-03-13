package practicaexamen;

import java.util.HashSet;
import java.util.Set;

public class ListaEmpleados {

	// creamos conjunto de empleados privada y estática
	private static Set<Empleado> listaEmpleados = new HashSet<>();

	/**
	 * Función que recorre la lista y muestra los objetos de clase empleados que
	 * encuentra
	 */
	public static void mostrarEmpleados() {
		// For each para recorrer el conjunto
		for (Empleado objeto : listaEmpleados) {
			// mostramos por pantalla los objetos
			System.out.println(objeto);
		}
	}

	/**
	 * Función que añade un empleado al conjunto
	 * 
	 * @param objeto que deseamos añadir
	 * @return true si tiene éxtio y false si no
	 */
	public static boolean añadirEmpleado(Empleado objeto) {
		// variable exito que nos dirá si la operación de añadir tiene exito
		boolean exito = listaEmpleados.add(objeto);

		// devolvemos exito
		return exito;
	}

	/**
	 * Función que realiza una búsqueda en el conjunto y devuelve el objeto que
	 * estamos buscando
	 * 
	 * @param obj con el mismo dni que el que buscamos
	 * @return el objeto que buscamos o null si no se encuentra
	 */
	public static Empleado buscarEmpleado(Empleado obj) {
		// creamos un objeto auxiliar que usaremos para guardar el que encontremos. Si
		// no se encuntra será null, por lo que debemos inicializarlo a null
		Empleado objAux = null;
		// creamos un for each para recorrer el conjunto
		for (Empleado empleado : listaEmpleados) {
			// si el objeto empleado es igual al que pasamos por parámetro lo habremos
			// encontrado
			if (empleado.equals(obj)) {
				// lo guardamos en el objeto auxiliar
				objAux = empleado;
			}
		}
		// devolvemos el objetoAuxiliar
		return objAux;
	}

	public static boolean eliminarEmpleado(Empleado obj) {
		// variable exito. La inicializamos con un remove de lista de empleado donde
		// deseamos eliminar el objeto obj
		boolean exito = listaEmpleados.remove(obj);

		// devolvemos exito
		return exito;
	}

}
