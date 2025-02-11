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
 * @param titulo libro
 * @param autor libro
 * @param ejemplares de libros existentes
 * @param  libros prestados 
 * @param genero literario al que pertenece
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
	 * @return titulo del libro
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * get autor
	 * @return autor del libro
	 */
	public String getAutor() {
		return autor;
	}
	
/**
 * Get ejemplares 
 * @returne jemplares del libro en existencia
 */
	public int getEjemplares() {
		return ejemplares;
	}

	
	/**
	 * get prestados
	 * @return cantidad de libros prestados
	 */
	public int getPrestados() {
		return prestados;
	}
	
	/**
	 * Get género
	 * @return género literario al que pertenece el libro. Narrativo por defecto
	 */
	public Genero getGenero() {
		return genero;
	}
	
	
	/**
	 * Set ejemplares. Modifica el atriburo ejemplares
	 * @param ejemplares a mofidicar
	 */
	public void setEjemplares(int ejemplares) {
		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
		}
	}
	
	/**
	 * Modifica el atributo prestados
	 * @param libros prestados a modificar
	 */
	public void setPrestados(int prestados) {
		if (prestados <= this.ejemplares) {
			this.prestados = prestados;
		}
	}
	
	
	
}
