package practicaejercicios;

import java.util.Objects;

public class Disco {
	enum Genero {
		ROCK, POP, JAZZ, BLUES
	};

//atributo privado código
	private int codigo;
	// atributo privado autor
	private String autor;
	// atributo privado título
	private String titulo;
	// atributo privado duración
	private double duracion;
	// atributop privado de tipo Género
	private Genero genero;

	/**
	 * Constructor de Disco en base a código
	 * 
	 * @param codigo del disco
	 */
	public Disco(int codigo) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
	}

	/**
	 * Constructor completo
	 * 
	 * @param codigo
	 * @param autor
	 * @param titulo
	 * @param duracion
	 * @param genero
	 */
	public Disco(int codigo, String autor, String titulo, double duracion, String genero) {
		// comprobamos que sea mayor que 0
		if (codigo > 0) {
			this.codigo = codigo;
		}
		// comprobamos que no sea null o espacio en blanco
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		// comprobamos que no sea null o espacio en blanco
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		// comprobamos que sea mayor que 0
		if (duracion > 0) {
			this.duracion = duracion;
		}
		// llamamos a la función comprueba código
		compruebaCodigo(genero);
	}

	/**
	 * comprueba que el género se corresponda con los esperados
	 * 
	 * @param genero
	 */
	public void compruebaCodigo(String genero) {
		// se comprueba que no sea null
		if (genero != null) {
			// switch con los distintos géneros
			switch (genero) {
			case "ROCK", "POP", "JAZZ", "BLUES" -> {
				// cast de string a tipo Género
				this.genero = Genero.valueOf(genero);
			}
			}
		}
	}

	/**
	 * Muestra códido del disco
	 * 
	 * @return código
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Muestra autor del disco
	 * 
	 * @return autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * muestra título disco
	 * 
	 * @return título
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * muesta duración del disco
	 * 
	 * @return duración
	 */
	public double getDuracion() {
		return duracion;
	}

	/**
	 * muestra género del disco
	 * 
	 * @return género
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * sobreescritura del método toString
	 */
	@Override
	public String toString() {
		String cadena = "Código: " + this.codigo + "\n";
		cadena += "Título: " + this.titulo + "\n";
		cadena += "Autor: " + this.autor + "\n";
		cadena += "Duración: " + this.duracion + " mins.";
		
		return cadena;
	}

	/**
	 * sobreescritura del hashcode
	 */
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	/**
	 * sobreescritura del método equals
	 */
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		// casteo y guardamos en objeto disco de tipo Disco
		Disco disc = (Disco) obj;
		// dos discos serán iguales cuando su código sea el mismo
		if (this.codigo == disc.codigo) {
			// iguales a true
			iguales = true;
		}

		return iguales;
	}

}
