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
		if (edad > 0) {
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
	 * 
	 * @param nombre de la persona. No puede ser null, vacío y blanco
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
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
	 * 
	 * @param apellidos persona. No puede ser null, vacío y blanco
	 */
	public void setApellidos(String apellidos) {
		if (nombre != null && !nombre.isBlank()) {
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
	 * 
	 * @param edad. No puede ser menor que 0
	 */
	public void setEdad(int edad) {
		if (edad > 0) {
			this.edad = edad;
		}
	}

	/**
	 * Devuelve true si es mayor de edad o false si no
	 * 
	 * @return booleano mayor
	 */
	public boolean esMayorEdad() {
		boolean mayor = true;
		if (edad < 18) {
			mayor = false;
		}

		return mayor;
	}

	/**
	 * devuelve true si es jubilado o false si no
	 * 
	 * @return booleano jubilado
	 */
	public boolean esJubilado() {
		boolean jubilado = true;
		if (edad < 65) {
			jubilado = false;
		}

		return jubilado;
	}

	/**
	 * devuelve la diferencia entre edades
	 * 
	 * @param objeto persona
	 * @return int diferencia edades
	 */
	public int diferenciaEdad(Persona p) {
		int diferencia = 0;

		diferencia = Math.abs(this.edad - p.edad);

		return diferencia;
	}
/*
 * devuelve cadena con los valores de los atributos del objeto sobreescribiendo el método toString
 */
	public String toString() {
		
		String cadena = "Dni: " + this.dni + "\n";
		cadena += "Nombre: " + this.nombre + "\n";
		cadena += "Apellidos: " + this.apellidos + "\n";
		cadena += "Edad: " + this.edad + "\n";
		return cadena;
	}
}
