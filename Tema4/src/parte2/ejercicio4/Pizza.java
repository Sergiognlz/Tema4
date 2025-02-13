package parte2.ejercicio4;

public class Pizza {

	enum Tamaño {
		MEDIA, FAMILIAR
	};

	enum Tipo {
		MARGARITA, CUATROQUESOS, FUNGHI
	};

	enum Estado {
		PEDIDA, SERVIDA
	}

	private int codigo;

	private Tamaño tamaño = Tamaño.MEDIA;

	private Tipo tipo = Tipo.MARGARITA;

	private Estado estado = Estado.PEDIDA;

	/**
	 * Constructor para objeto pizza
	 * 
	 * @param codigo de la pizza
	 * @param tamaño de la pizza
	 * @param tipo   de pizza
	 */
	public Pizza(int codigo, String tamaño, String tipo) {

		if (codigo > 0) {
			this.codigo = codigo;
		}

		if (tamaño != null && !tamaño.isBlank()) {
			switch (tamaño) {
			case "MEDIA", "FAMILIAR" -> {
				this.tamaño = Tamaño.valueOf(tamaño);
			}
			}
		}

		if (tipo != null && !tipo.isBlank()) {
			switch (tipo) {
			case "MARGARITA", "CUATROQUESOS", "FUNGHI" -> {
				this.tipo = Tipo.valueOf(tipo);
			}
			}
		}
	}

	/**
	 * get Estado pizza
	 * 
	 * @return estado de la pizza
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * set Estado pizza. Modifica el atributo
	 * 
	 * @param estado pizza
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	/**
	 * get código
	 * 
	 * @return código pizza
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * get tamaño
	 * 
	 * @return tamaño pizza
	 */
	public Tamaño getTamaño() {
		return tamaño;
	}

	/**
	 * get tipo
	 * 
	 * @return tipo de pizza
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * sobreescritura del método toString para que almacene los valores que deseamos
	 */
	@Override
	public String toString() {
		String cadena = this.codigo + ": ";
		cadena += this.tamaño + " - ";
		cadena += this.tipo + " - ";
		cadena += this.estado;

		return cadena;
	}

	/**
	 * sobreescritura del método equals donde definimos que dos objetos Pizza serán
	 * iguales si el atributo código coincide
	 */
	@Override
	public boolean equals(Object obj) {
		boolean igual = false;
		Pizza otraPizza = (Pizza) obj;

		if (this.codigo == otraPizza.codigo) {
			igual = true;
		}
		return igual;
	}

}
