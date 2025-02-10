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
	private Nacionalidad nacion;

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
		case "Española" -> {
			this.nacion = Nacionalidad.ESPAÑOLA;
		}
		default -> {
			this.nacion = Nacionalidad.EXTRANJERA;

		}
		}

	}

}
