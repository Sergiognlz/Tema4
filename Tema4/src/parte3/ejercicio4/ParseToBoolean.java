package parte3.ejercicio4;

public class ParseToBoolean {

	/**
	 * función que recibe un número y devuelve false si el número es 0 o true si es
	 * 1
	 * 
	 * @param num número pasado a la función
	 * @return booleano parse
	 */
	public boolean parseToBoolean(int num) {
		boolean parse = false;

		if (num == 1) {
			parse = true;
		}
		return parse;

	}
	
	public boolean parseToBoolean(String cadena) {
		boolean parse = false;

		if (cadena.equalsIgnoreCase("true")) {
			parse = true;
		}
		return parse;

	}
	
	
	
}
