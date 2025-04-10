package parte4.ejercicio1;

public class NegativeMinuteException extends Exception{

	@Override
	public String toString() {
		
		return "El valor minuto es negativo ";
	}

	
	@Override
	public String getMessage() {
		
		return "El valor minuto es negativo";
	}
}