package parte4.ejercicio3;

public class Fecha {

	// variable dia
	private int dia;
	// variable mes
	private int mes;
	// variable año
	private int año;

	/**
	 * constructor Fecha
	 * 
	 * @param dia
	 * @param mes
	 * @param año
	 */
	public Fecha(int dia, int mes, int año) {

		this.dia = dia;
		this.mes = mes;
		this.año = año;

		if (!fechaCorrecta()) {
			this.dia = 1;
			this.mes = 1;
			this.año = 1970;
		}

	}

	/**
	 * función que nos dice si es bisiesto
	 * 
	 * @return true si es bisiesto, false si no
	 */
	public boolean esBisiesto() {
		// variable bisiesto
		boolean bisiesto = false;
		// si es bisiesto...
		if ((this.año % 4 == 0) && (this.año % 100 != 0) || (this.año % 100 == 0)) {
			// bisiesto a true
			bisiesto = true;
		}
		// devolvemos bisiesto;
		return bisiesto;
	}

	/**
	 * función que comprueba que la fecha es correcta
	 * 
	 * @return true si es correcta y false si no
	 */
	public boolean fechaCorrecta() {
		boolean correcto = false;

		// comprobamos el mes en el que estamos y si tiene los días que tiene que tener
		switch (this.mes) {

		case 1, 3, 5, 7, 10, 12 -> {
			if (this.dia > 0 && this.dia <= 31) {
				correcto = true;
			}
		}
		case 2 -> {
			if (esBisiesto() && (this.mes > 0 && this.mes <= 29)) {
				correcto = true;

			} else if (!esBisiesto() && (this.mes > 0 && this.mes <= 28)) {
				correcto = true;

			}
		}
		case 4, 6, 9, 11 -> {
			if (this.dia > 0 && this.dia <= 30) {
				correcto = true;
			}
		}
		}
		return correcto;
	}

	/**
	 * función día siguiente. Incrementa en uno el día
	 */
	public void diaSiguiente() {

		this.dia++;

		switch (this.mes) {

		case 1, 3, 5, 7, 8, 10, 12 -> {
			if (this.dia > 31) {
				this.dia = 1;
				mes++;
				if (this.mes > 12) {
					this.mes = 1;
					año++;
				}
			}
		}
		case 2 -> {
			if (esBisiesto() && (this.dia > 29)) {
				this.dia = 1;
				mes++;
				if (this.mes > 12) {
					this.mes = 1;
					año++;
				}

			} else if (!esBisiesto() && (this.dia > 28)) {
				this.dia = 1;
				mes++;
				if (this.mes > 12) {
					this.mes = 1;
					año++;
				}
			}
		}
		case 4, 6, 9, 11 -> {
			if (this.dia > 30) {
				this.dia = 1;
				mes++;
				if (this.mes > 12) {
					this.mes = 1;
					año++;
				}
			}
		}
		}
	}

	@Override
	public String toString() {
		String cadena = "";

		if (this.dia < 10) {
			cadena += "0" + this.dia;
		} else {
			cadena += this.dia;
		}

		if (this.mes < 10) {
			cadena += "-0" + this.mes;
		} else {
			cadena += "-" + this.mes;
		}
		if (this.año < 10) {
			cadena += "-000" + this.año;
		} else if (this.año < 100) {
			cadena += "-00" + this.año;
		} else if (this.año < 1000) {
			cadena += "-0" + this.año;
		} else {
			cadena += "-" + this.año;
		}

		return cadena;
	}

}
