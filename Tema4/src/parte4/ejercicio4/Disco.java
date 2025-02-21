package parte4.ejercicio4;

import java.util.Objects;

public class Disco {
	// creamos enumerado tipo género
	enum Genero {
		ROCK, POP, JAZZ, BLUES
	};

//creamos atributo privado código
	private int codigo;
	// creamos atributo privado autor
	private String autor;
	// creamos atributo privado título
	private String titulo;
	// creamos atributo privado duración
	private double duracion;
	// creamos atributo privado genero
	private Genero genero;

	/**
	 * constructor disco en base a código
	 * 
	 * @param codigo del disco
	 */
	public Disco(int codigo) {
		// comprobamos que sea mayor que 0
		if (codigo > 0) {
			this.codigo = codigo;
		}
	}

	/**
	 * constructor de objeto disco con todos los atributos
	 * 
	 * @param codigo   del disco
	 * @param autor    del disco
	 * @param titulo   del disco
	 * @param duracion del disco
	 * @param genero   del disco
	 */
	public Disco(int codigo, String autor, String titulo, double duracion, String genero) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (duracion > 0) {
			this.duracion = duracion;
		}
		if(genero!=null) {
		compruebaGenero(genero);
		}
	}
/**
 * comprobamos que el género corresponde con los existentes
 * @param genero del disco
 */
	public void compruebaGenero(String genero) {

		switch (genero) {
		case "ROCK", "POP", "JAZZ", "BLUES" -> {
			this.genero = Genero.valueOf(genero);
		}
		}
	}

public int getCodigo() {
	return codigo;
}

public String getAutor() {
	return autor;
}

public String getTitulo() {
	return titulo;
}

public double getDuracion() {
	return duracion;
}

public Genero getGenero() {
	return genero;
}
	/**
	 * implementación del método toString
	 * devuelve una cadena con los datos del objeto
	 */
@Override
public String toString() {
	String cadena="";
	cadena+="Codigo:"+this.codigo+"\n";
	cadena+="Autor:"+this.autor+"\n";
	cadena+="Título:"+this.titulo+"\n";
	cadena+="Duración:"+this.duracion+"mins.\n";
	cadena+="Género:"+this.genero+"\n";
	
	return cadena;
}
/**
 * implementación del equals en base al código
 */
@Override
public boolean equals(Object obj) {
	boolean igual=false;
	
	Disco objeto2=(Disco)obj;
	
	if(this.codigo==objeto2.codigo) {
		igual=true;
	}
	
	return igual;
}
/**
 * implementación del hash en base al código
 */
@Override
public int hashCode() {

	return Objects.hash(codigo);
}

}
