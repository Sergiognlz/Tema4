package parte2.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class AlumnoCRUD {

	private List<Alumno> alumnos = new ArrayList<>();

	/**
	 * Muestra los objetos alumnos guardados en la lista
	 */
	public void mostrarLista() {
		//for each para recorrer la lista
		for (Alumno objeto : alumnos) {
			//imprime el objeto
			System.out.println(objeto);
			System.out.println("-----------------------");
		}
	}

	/**
	 * función que recibe un objeto y lo intenta añadir. Comprueba que no exista en
	 * la lista, y devuelve true en caso de que se añada y false si ya existe y por
	 * lo tanto no se añade
	 * 
	 * @param objeto que se le pasa de tipo alumno
	 * @return booleno true si se ha añadido y false si ya existía 
	 */
	public boolean añadirAlumno(Alumno objeto) {
		//variable éxito
		boolean exito = false;
		//comprueba si el objeto existe en la lista
		if (!alumnos.contains(objeto)) {
			//añade el objeto a la lista
			alumnos.add(objeto);
			//cambia éxito a true
			exito = true;
		}
		//devuelve éxito como true o false
		return exito;
	}

	/**
	 * Función que busca en la lista un alumno en base al nombre que le pasamos por parámetro
	 * @param nombre del alumno que buscamos
	 * @return el objeto alumno que corresponde al nombre
	 */
public Alumno buscaAlumno(String nombre) {
	//objeto de tipo Alumno auxiliar donde guardaremos la dirección del alumno que buscamos
	Alumno objetoAux=null;
	//for each para recorrer la lista alumnos
	for(Alumno alumno:alumnos) {
		//cuando el nombre el objeto alumno coincida con el que buscamos...
		if(alumno.getNombre().equals(nombre)) {
			//guardamos el objeto en el objeto auxiliar
			objetoAux=alumno;
		}
	}
	//devolvemos objeto auxiliar
	return objetoAux;
}

/**
 * función que elimina el objeto alumno de la lista alumnos
 * @param objeto alumno que queremos borrar
 * return true si se ha eliminado y false si no
 */
	public boolean eliminaAlumno(Alumno objeto) {
		return alumnos.remove(objeto);
	}
}
