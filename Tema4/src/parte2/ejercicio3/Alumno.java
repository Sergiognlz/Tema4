package parte2.ejercicio3;

/*Diseñar la clase Alumno, de los que interesa almacenar su nombre y su  nota media, que puede contener decimales. 
Añade un constructor que reciba el nombre y la nota media del alumno.
Añade los getters/setters que consideres oportunos. 
Crea también el método toString que devolverá una cadena con el nombre del alumno y a la derecha su nota.
*/

public class Alumno {

	private String nombre = "";

	private double media;

	
	
	/**
	 * constructor alumno
	 * @param nombre del alumno
	 * @param media del alumno
	 */
	public Alumno(String nombre, int media) {
		if(nombre!=null&&!nombre.isBlank()) {
			this.nombre=nombre;
		}
		if(media>=0) {
			this.media=media;
		}
	}
	
	
	
	
	/**
	 * get nombre
	 * 
	 * @return nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * set nombre. Modifica nombre
	 * 
	 * @param nombre alumno. No puede ser nulo, blanco o vacío
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * get media del alumno
	 * 
	 * @return media del alumno
	 */
	public double getMedia() {
		return media;
	}

	/**
	 * set media alumno. Modifica media
	 * 
	 * @param media
	 */
	public void setMedia(double media) {
		if (media >= 0 && media <= 10) {
			this.media = media;
		}
	}

	/**
	 * método toString que devuelve una cadena con los datos del alumno
	 */
	@Override
	public String toString() {
		String cadena = "";
		cadena += "Nombre alumno: " + this.nombre + "\n";
		cadena += "Media: " + this.media + "\n";
		return cadena;
	}

	/**
	 * comprueba que los objetos sean iguales. Serán iguales cuando los nombres sean
	 * iguales
	 */
	@Override
	public boolean equals(Object obj) {
		boolean igual = false;
		Alumno otroAlumno = (Alumno) obj;
		if (this.nombre.equals(otroAlumno.nombre)) {
			igual = true;
		}
		return igual;
	}
}
