package parte1.ejercicio2;

/**
 * clase persona
 */
public class Persona {
	/**
	 * variable dni
	 */
	String dni;
	/**
	 * variable nombre
	 */
	String nombre;
	/**
	 * variable apellidos
	 */
	String apellidos;
	/**
	 * variable edad
	 */
	int edad;

	/**
	 * constructor persona
	 * 
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 */
	Persona(String dni, String nombre, String apellidos, int edad) {
		// comprobamos que no sea null, no esté vacío o compuesto por caracteres en
		// blanco
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
		// comprobamos que no sea null, no esté vacío o compuesto por caracteres en
		// blanco
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		// comprobamos que no sea null, no esté vacío o compuesto por caracteres en
		// blanco
		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
		// comprobamos que no sea 0 o negativo
		if (edad>0) {
			this.edad = edad;
		}
	}

}
