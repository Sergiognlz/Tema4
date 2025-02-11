package parte2.ejercicio2;

//clase libro
public class Libro {

	enum Genero {
		NARRATIVO, lIRICO, DRAMATICO, DIDACTICO, POETICO
	};

	private String titulo = "";

	private String autor = "";

	private int ejemplares;

	private int prestados;

	private Genero genero = Genero.NARRATIVO;

	/**
	 * constructor libro
	 * 
	 * @param titulo del libro. No puede ser nulo, vacío o blanco
	 * @param autor  del libro. No puede ser nulo, vacío o blanco
	 */
	public Libro(String titulo, String autor) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
	}

	/**
	 * Constructo libro
	 * 
	 * @param titulo      del libro. No puede ser nulo, vacío o blanco
	 * @param autor       del libro. No puede ser nulo, vacío o blanco
	 * @param ejemplares. Debe ser mayor que 0
	 * @param prestados.  No puede ser mayor que ejemplares
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
		}
		if (prestados <= this.ejemplares) {
			this.prestados = prestados;
		}
	}

	/**
	 * Constructor libro
	 * 
	 * @param titulo     libro
	 * @param autor      libro
	 * @param ejemplares de libros existentes
	 * @param libros     prestados
	 * @param genero     literario al que pertenece
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados, String genero) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
		}
		if (prestados <= this.ejemplares) {
			this.prestados = prestados;
		}

		switch (genero) {
		case "LIRICO" -> {
			this.genero = Genero.lIRICO;
		}
		case "DRAMATICO" -> {
			this.genero = Genero.DRAMATICO;
		}
		case "DIDACTICO" -> {
			this.genero = Genero.DIDACTICO;
		}
		case "POETICO" -> {
			this.genero = Genero.POETICO;
		}

		}
	}

	/**
	 * get titulo
	 * 
	 * @return titulo del libro
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * get autor
	 * 
	 * @return autor del libro
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Get ejemplares
	 * 
	 * @returne jemplares del libro en existencia
	 */
	public int getEjemplares() {
		return ejemplares;
	}

	/**
	 * get prestados
	 * 
	 * @return cantidad de libros prestados
	 */
	public int getPrestados() {
		return prestados;
	}

	/**
	 * Get género
	 * 
	 * @return género literario al que pertenece el libro. Narrativo por defecto
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * Set ejemplares. Modifica el atriburo ejemplares
	 * 
	 * @param ejemplares a mofidicar
	 */
	public void setEjemplares(int ejemplares) {
		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
		}
	}

	/**
	 * Modifica el atributo prestados
	 * 
	 * @param libros prestados a modificar
	 */
	public void setPrestados(int prestados) {
		if (prestados <= this.ejemplares) {
			this.prestados = prestados;
		}
	}

	/**
	 * Método que pasa una cantidad de ejemplares para el préstamo y lo suma al
	 * número de ejemplares prestados. No se pueden prestar más que el número de
	 * ejemplares existentes.
	 * 
	 * @param cantidad de ejemplares que se van a prestar
	 * @return Devuelve true si ha podido realizar el prestamo y false si no
	 */
	public boolean prestaLibro(int cantidad) {
		boolean prestamo = false;

		if (this.prestados + cantidad <=this.ejemplares) {
			this.prestados += cantidad;
			prestamo = true;
		}

		return prestamo;
	}

	/**
	 * Método que pasa una cantidad de ejemplares para la devoluciób y lo resta al
	 * número de ejemplares prestados. No se pueden devolver más que el número de
	 * ejemplares prestados.
	 * 
	 * @param cantidad de ejemplares que se van a devolver
	 * @return Devuelve true si ha podido realizar la devolución y false si no
	 */
	public boolean devuelveLibro(int cantidad) {
		boolean devolucion = false;

		if (this.prestados - cantidad >=0) {
			this.prestados -= cantidad;
			devolucion = true;
		}

		return devolucion;
	}

	/**
	 * @Override de método toString que devuelve los datos del libro
	 */

	public String toString() {
		String cadena = "";
		cadena += "Título: " + this.titulo + "\n";
		cadena += "Autor: " + this.autor + "\n";
		cadena += "Nº Ejemplares: " + this.ejemplares + "\n";
		cadena += "Nº Prestados: " + this.prestados + "\n";
		cadena += "Genero: " + this.genero + "\n";
		return cadena;
	}

	@Override
	public boolean equals(Object obj) {
		boolean igual = false;

		Libro l1 = (Libro) obj;

		if (this.titulo.equalsIgnoreCase(l1.titulo) && this.autor.equals(l1.autor)) {
			igual = true;
		}

		return igual;
	}
}
