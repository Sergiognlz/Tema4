package practicaexamen;

import java.util.Objects;

/**
 * clase empleado
 */
public class Empleado {

//atributo privado dni
	private String dni;
	// atributo privado nombre
	private String nombre;
	// atributo privado sueldo base
	private double sueldoBase;
	// atributo privado horas extras realizadas durante el mes
	private int horasExtras;
	// atributo privado importe de la hora extra
	private static double importeHoraExtra=8;

	/**
	 * Construtor objeto empleado basado en dni
	 * 
	 * @param dni
	 */
	public Empleado(String dni) {
		// solo aceptará las cadenas que tengan 9 dígitos
		if (dni.length() == 9) {
			// el dni del objeto será el que le pasemos por parámetro
			this.dni = dni;
		}
	}

	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param sueldoBase
	 * @param horasExtras
	 */
	public Empleado(String dni, String nombre, double sueldoBase, int horasExtras) {
		// solo aceptará las cadenas que tengan 9 dígitos, que no sean nulos o espacios
		// en blanco
		if (dni.length() == 9 && dni != null && !dni.isBlank()) {
			// el dni del objeto será el que le pasemos por parámetro
			this.dni = dni;
		}
		// solo aceptará cadenas que no sean nulo ni estén en blanco
		if (nombre != null && !nombre.isBlank()) {
			// el nombre del objeto será el que pasemos por parámentro
			this.nombre = nombre;
		}
		// solo aceptará sueldos base positivos
		if (sueldoBase > 0) {
			// el sueldo base será el que pasemos por parámetro
			this.sueldoBase = sueldoBase;
		}
		// solo aceptará horas extras mayores o iguales a 0
		if (horasExtras >= 0) {
			// las horas extras del objeto serás las pasadas por parámetro
			this.horasExtras = horasExtras;
		}
		
	}

	/**
	 * Muestra el dni del empleado
	 * 
	 * @return dni empleado
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Muestra nombre del empleado
	 * 
	 * @return nombre empleado
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica nombre empleado
	 * 
	 * @param nuevo nombre empleado
	 */
	public void setNombre(String nombre) {
		if(nombre!=null&&!nombre.isBlank()) {
		this.nombre = nombre;
		}
	}

	/**
	 * Muestra sueldo base del empleado
	 * 
	 * @return sueldo base empleado
	 */
	public double getSueldoBase() {
		return sueldoBase;
	}

	/**
	 * Modifica el suelo base del empleado
	 * 
	 * @param nuevo sueldoBase empleado
	 */
	public void setSueldoBase(double sueldoBase) {
		if(sueldoBase>0) {
		this.sueldoBase = sueldoBase;
		}
	}

	/**
	 * Muestra horas extras del empleado
	 * 
	 * @return horas extras empleado
	 */
	public double getHorasExtras() {
		return horasExtras;
	}

	/**
	 * Modifica horas extras del empleado
	 * 
	 * @param nuevo valor horasExtras
	 */
	public void setHorasExtras(int horasExtras) {
		if(horasExtras>=0) {
		this.horasExtras = horasExtras;
		}
	}

	/**
	 * Muestra el importe de la hora extra del empleado
	 * 
	 * @return importe hora extra
	 */
	public static double getImporteHoraExtra() {
		return importeHoraExtra;
	}

	/**
	 * Modifica el importe de la hora extra
	 * 
	 * @param nuevo importeHoraExtra
	 */
	public static void setImporteHoraExtra(double importeHoraExtra) {
		if(importeHoraExtra>0) {
		Empleado.importeHoraExtra = importeHoraExtra;
		}
	}

	/**
	 * Función que calcula el complemento salarial de las horas extras del empleado
	 * 
	 * @return valor del complemento en euros.
	 */
	public double calcularComplemento() {
		// será igual a las horas extras por el valor de las mismas
		double complemento = (double)this.horasExtras *importeHoraExtra;
		// devuelve complemento
		return complemento;
	}

	/**
	 * Función que calcular el sueldo bruto del empleado
	 * 
	 * @return sueldo bruto en euros del empleado
	 */
	public double sueldoBruto() {
		// Será igual al sueldo base más el complemento
		double sBruto = this.sueldoBase + calcularComplemento();
		// devolvemos sueldo bruto
		return sBruto;
	}

	/**
	 * Sobreescritura del método toString
	 */
	@Override
	public String toString() {
		// en la cadena mostraremos los datos de la siguiente manera:
		String cadena = this.dni + " " + this.nombre + "\n";
		cadena += "Horas Extras: " + this.horasExtras + "\n";
		cadena += "Sueldo Bruto: " + sueldoBruto() + " € \n";
		cadena += "--------------------------------------------";
		// devolvemos cadena
		return cadena;
	}

	/**
	 * Sobreescritura del método equals. Dos objetos serán iguales cuando tengan el mismo dni
	 */
	@Override
	public boolean equals(Object obj) {
		// variable iguales a false. Partimos de la base de que no será iguales a menos
		// que lo demostremos
		boolean iguales = false;
		// creamos un objeto empleado y casteamos el objeto que recibimos por parámetros
		// para que sean del mismo tipo
		Empleado empl = (Empleado) obj;
		// si el dni de ambos objetos coincide
		if (this.dni.equals(empl.dni)) {
			// entonces serán iguales
			iguales = true;
		}
		// devolvemos iguales
		return iguales;
	}

	/**
	 * Sobreescritura del método hashCode
	 */
	@Override
	public int hashCode() {
		// tendrán el mismo hashCode cuando el dni coincida
		return Objects.hash(dni);
	}

}
