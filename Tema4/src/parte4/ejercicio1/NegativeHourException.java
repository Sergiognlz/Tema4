package parte4.ejercicio1;

public class NegativeHourException extends Exception {

	@Override
	public String toString() {
		
		return "El valor hora es negativo ";
	}

	
	@Override
	public String getMessage() {
		
		return "El valor hora es negativo";
	}
}