package exament4;

import java.util.Objects;
import java.util.Random;

public class Personaje {
//enumerado de tipo Clase
	enum Clase {
		GUERRERO, MAGO, PICARO
	};

	// atributo privado nombre
	private String nombre;
	// atributo privado nivel inicializado a 1;
	private int nivel = 1;
	// atributo privado puntos experiencia totales inicializado a 0
	private int puntosTotales = 0;
	// atributo privado clase
	private Clase clase;
	// atributo privado estático cantidad de monedas inicializado a 0
	private static int cantMonedas = 0;

	/**
	 * Construtor personaje solo con nombre
	 * 
	 * @param nombre del personaje
	 */
	public Personaje(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Constructor personaje con nombre y clase
	 * 
	 * @param nombre del personaje
	 * @param clase  del personaje
	 */
	public Personaje(String nombre, String clase) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		// llamamos a la función comprueba clase y le pasamos el string
		compruebaClase(clase);
	}

	/**
	 * Función que comprueba que la clase que pasamos es de los tipos esperados
	 * 
	 * @param clase de personaje
	 */
	public void compruebaClase(String clase) {
		// comprobamos que no sea nulo
		if (clase != null) {
			// con un switch comprobamos los valores deseados
			switch (clase) {
			case "GUERRERO", "MAGO", "PICARO" -> {
				// damos al valor clase el de la cadena con un casteo de string a tipo clase 
				this.clase = Clase.valueOf(clase);
			}
			}
		}
	}

	/**
	 * Muestra el nivel de personaje
	 * 
	 * @return nivel
	 */
	public int getNivel() {
		return nivel;
	}

	/**
	 * Modifica el nivel del personaje
	 * 
	 * @param nivel
	 */
	public void setNivel(int nivel) {
		if (nivel > 0) {
			this.nivel = nivel;
		}
	}

	/**
	 * Muestra puntos totales de experiencia
	 * 
	 * @return puntos totales
	 */
	public int getPuntosTotales() {
		return puntosTotales;
	}

	/**
	 * modifica puntos totales de experiencia
	 * 
	 * @param puntosTotales
	 */
	public void setPuntosTotales(int puntosTotales) {
		if (puntosTotales > 0) {
			this.puntosTotales = puntosTotales;
		}
	}

	/**
	 * Muestra cantidad monedas del grupo
	 * 
	 * @return cantidad monedas
	 */
	public static int getCantMonedas() {
		return cantMonedas;
	}

	/**
	 * Modifica cantidad de monedas del grupo
	 * 
	 * @param cantMonedas
	 */
	public static void setCantMonedas(int cantMonedas) {
		if (cantMonedas > 0) {
			Personaje.cantMonedas = cantMonedas;
		}
	}

	/**
	 * Muestra nombre de personaje
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Muestra clase de personaje
	 * 
	 * @return clase
	 */
	public String getClase() {
		// casteamos a String con un value of
		return String.valueOf(clase);
	}

	/**
	 * Método que recibe una cantidad de dinero recolectada y lo suma a la cantidad
	 * de monedas
	 * 
	 * @param cantDinero a sumar
	 */
	public static void recolectarDinero(int cantDinero) {
		// sumamos dinero al total
		cantMonedas += cantDinero;
	}

	/**
	 * Método que recibe una cantidad de dinero recolectada y lo resta a la cantidad
	 * de monedas
	 * 
	 * @param cantDinero
	 * @return true si tiene exito y false si fracasa
	 */
	public static boolean gastarDinero(int cantDinero) {
		// variable booleana exito inicializada a false
		boolean exito = false;
		if ((cantMonedas - cantDinero) >= 0) {
			// restamos dinero al total
			cantMonedas -= cantDinero;
			// exito pasa a true
			exito = true;
		}
		// devolvemos exito
		return exito;
	}

	/**
	 * Recibirá un valor que representará los puntos que gana el jugador si derrota
	 * al enemigo. El método debe decidir de forma aleatoria si el jugador derrota o
	 * no al enemigo. Si lo derrota, sumará los puntos a su puntuación total y
	 * actualizará el nivel en caso de que suba de nivel, y devolverá true. En caso
	 * contrario devolverá false.
	 * 
	 * @param puntos que obtendrá si gana
	 * @return true si gana y false si pierde
	 */
	public boolean enfrentarEnemigo(int puntos) {
		// creamos objeto random
		Random rand = new Random();
		// variable booleana inicializada aleatoriamente que nos dirá si gana o no
		boolean gana = rand.nextBoolean();
		// si gana
		if (gana) {
			// sumaremos los puntos obtenidos a los puntos totales de experiencia
			this.puntosTotales += puntos;
			// y actualizaremos el nivel
			this.nivel = (int) Math.sqrt(puntosTotales);
		}

		// devolvemos gana
		return gana;
	}

	/**
	 * Sobreescritura del método toString con los datos deseados
	 */
	@Override
	public String toString() {
		// creamos variable cadena
		String cadena = this.nombre + "\t N:" + this.nivel + "\t P:" + this.puntosTotales + "\t" + this.clase;

		// devolvemos cadena
		return cadena;
	}

	/**
	 * Sobreescritura del método hashcode
	 */
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	/**
	 * sobreescritura del método equals en base al nombre del objeto
	 */
	@Override
	public boolean equals(Object obj) {
		// creamos booleano iguales. Será false mientras no se demuestre lo contrario
		boolean iguales = false;
		// creamos objeto de tipo personaje y casteamos el objeto recibido
		Personaje pj = (Personaje) obj;
		// Dos personajes serán iguales cuando tengan el mismo nombre
		if (this.nombre.equals(pj.nombre)) {
			// iguales pasa a ser true
			iguales = true;

		}
		// devolvemos iguales
		return iguales;
	}
	
	
}
