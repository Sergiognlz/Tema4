package parte2.ejercicio1;

/**
 * Clase cuenta corriente donde almacenaremos los datos que necesitamos
 */
public class CuentaCorriente {

	// creamos enumerado tipo nacionalidad
	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	};

	// atributo DNI del titular
	private String DNI;

	// atributo nombre completo del titular
	private String nombre;

	// atributo saldo de la cuenta
	private double saldo;

	// atributo nacionalidad
	private Nacionalidad nacion = Nacionalidad.ESPAÑOLA;

	/**
	 * Constructor que recoje los siguientes atributos de la cuenta corriente:
	 * 
	 * @param DNI   del titular
	 * @param saldo de la cuenta
	 */
	public CuentaCorriente(String DNI, double saldo) {
		if (DNI != null && !DNI.isBlank()) {
			this.DNI = DNI;
		}
		this.saldo = saldo;
	}

	/**
	 * Constructor que recoje los siguientes atributos de la cuenta corriente:
	 * 
	 * @param DNI    del titular
	 * @param nombre del titular
	 * @param saldo  de la cuenta corriente
	 */
	public CuentaCorriente(String DNI, String nombre, double saldo) {

		if (DNI != null && !DNI.isBlank()) {
			this.DNI = DNI;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		this.saldo = saldo;
	}

	/**
	 * Constructor que recoje los siguientes atributos de la cuenta corriente:
	 * 
	 * @param DNI          del titular
	 * @param nombre       del titular
	 * @param saldo        de la cuenta
	 * @param nacionalidad del titular
	 */
	public CuentaCorriente(String DNI, String nombre, double saldo, String nacion) {
		if (DNI != null && !DNI.isBlank()) {
			this.DNI = DNI;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		this.saldo = saldo;

		switch (nacion) {
		case "ESPAÑOLA" -> {
			this.nacion = Nacionalidad.ESPAÑOLA;
		}
		default -> {
			this.nacion = Nacionalidad.EXTRANJERA;

		}
		}

	}

	/**
	 * Get DNI. Devuelve DNI
	 * 
	 * @return DNI titular
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * Get nombre. Devuelve nombre
	 * 
	 * @return nombre del titular
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Get saldo. Devuelve saldo
	 * 
	 * @return saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Get nación. Devuelve nación
	 * 
	 * @return nacionalidad del titular
	 */
	public Nacionalidad getNacion() {
		return nacion;
	}

	/**
	 * Set nombre. Modifica el nombre
	 * 
	 * @param nombre del titular de la cuenta. Si es nulo, vacío o espacio en blanco
	 *               no lo modifica.
	 */
	public void setNombre(String nombre) {

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

	}

	/**
	 * Set saldo. Modifica saldo inicial. Si el resultado final es menor que 0 no
	 * permite la modificación. NO LE VEO SENTIDO A ESTE MÉTODO
	 * 
	 * @param cantidad a incrementar/decrementar de la cuenta corriente
	 */
	public void setSaldo(double cantidad) {
		if (this.saldo - cantidad < 0) {
			this.saldo += cantidad;
		}
	}

	/**
	 * Set nacionalidad. Modifica la nacionalidad solo acepta dos valores. Si el
	 * valor introducido no es ninguno de los dos se deja como está.
	 * 
	 * @param nacion del titular
	 */
	public void setNacionalidad(String nacion) {
		switch (nacion) {
		case "ESPAÑOLA" -> {
			this.nacion = Nacionalidad.ESPAÑOLA;
		}
		case "EXTRANJERA" -> {
			this.nacion = Nacionalidad.EXTRANJERA;

		}
		default -> {

		}
		}
	}

	/**
	 * Método que resta una cantidad introducida por parámetro de la cuenta
	 * corriente cuando el titular saca dinero de la misma. Si existe suficiente
	 * saldo para retirar devolverá true y lo restará del total. De no ser así
	 * devolverá false
	 * 
	 * @param cantidad a retirar de la cuenta
	 * @return true si la operación es exitosa o false sino
	 */
	public boolean sacarDinero(double cantidad) {
		boolean exito = false;

		if ((this.saldo - cantidad) >= 0) {
			this.saldo -= cantidad;
			exito = true;
		}

		return exito;
	}

	/**
	 * Método que incrementa el saldo. Hay que comprobar que el saldo a ingresar es
	 * una cantidad positiva. Devolverá true si se puede llevar a cabo la operación
	 * y false en caso contrario.
	 * 
	 * @param cantidad a ingresar
	 * @return true si la operación es un éxito o false si no
	 */
	public boolean ingresarDinero(double cantidad) {
		boolean exito = false;

		if (cantidad > 0) {
			this.saldo += cantidad;
		}

		return exito;
	}

	/**
	 * Método toString que devuelve una cadena con la información de la cuenta
	 * corriente.
	 */
	public String toString() {
		String cadena = "DATOS TITULAR \n";
		cadena += "DNI: " + this.DNI + "\n";
		cadena += "Nombre: " + this.nombre + "\n";
		cadena += "Saldo cuenta: " + this.saldo + "€ \n";
		cadena += "Nacionalidad :" + this.nacion + "\n";
		return cadena;
	}

	/**
	 * método equals. Dos cuentas serán iguales cuando coincidan en dni y nombre
	 */
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		CuentaCorriente cc2 = (CuentaCorriente) obj;

		if (this.DNI.equals(cc2.DNI) && this.nombre.equals(cc2.nombre)) {
			iguales = true;
		}

		return super.equals(obj);
	}

}
