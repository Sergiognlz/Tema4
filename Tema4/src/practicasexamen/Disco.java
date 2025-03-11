package practicasexamen;

public class Disco {

	enum Genero {
		ROCK, POP, JAZZ, BLUES
	};

	private int codigo;

	private String autor;

	private String titulo;

	private int duracion;

	private Genero genero;

	public Disco(int codigo) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
	}

	public Disco(int codigo, String autor, String titulo, int duracion, String genero) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
		if(autor!=null&&!autor.isBlank()) {
		this.autor = autor;
		}
		if(titulo!=null&&!titulo.isBlank()) {
		this.titulo = titulo;
		}
		if(duracion>0) {
		this.duracion = duracion;
		}
		
		if(genero!=null&&!genero.isBlank()) {
			compruebaGenero(genero);
		}
	}

	
	
	public void compruebaGenero(String genero) {
		
		switch(genero) {
		case "ROCK", "POP", "JAZZ", "BLUES"->{
			
			this.genero=Genero.valueOf(genero);
		}
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Genero getGenero() {
		return genero;
	}

	
	
	
	
	
	
}
