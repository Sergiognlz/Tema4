package parte1.ejercicio2;

/**
 * clase persona
 */
public class Persona {
	/**
	 * variable dni
	 */
	private String dni;
	/**
	 * variable nombre
	 */
	private String nombre;
	/**
	 * variable apellidos
	 */
	private String apellidos;
	/**
	 * variable edad
	 */
	private int edad;

	/**
	 * constructor persona
	 * 
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 */
	public Persona(String dni, String nombre, String apellidos, int edad) {
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
/**
 * 
 * @return dni persona. 
 */
	public String getDni() {

		return dni;
	}


/**
 * 
 * @return nombre persona
 */
	public String getNombre() {
		return nombre;
	}
/**
 * modifica nombre persona
 * @param nombre de la persona. No puede ser null, vacío y blanco
 */
	public void setNombre(String nombre) {
		if(nombre!=null&&!nombre.isBlank()) {
		this.nombre = nombre;
		}
	}
/**
 * 
 * @return apellidos de la persona
 */
	public String getApellidos() {
		return apellidos;
	}
/**
 * modifica apellidos persona
 * @param apellidos persona. No puede ser null, vacío y blanco
 */
	public void setApellidos(String apellidos) {
		if(nombre!=null&&!nombre.isBlank()) {
		this.apellidos = apellidos;
		}
	}
/**
 * 
 * @return edad persona
 */
	public int getEdad() {
		return edad;
	}
/**
 * modifica edad persona
 * @param edad. No puede ser  menor que 0
 */
	public void setEdad(int edad) {
		if(edad>0) {
		this.edad = edad;
		}
	}
	
	

}
