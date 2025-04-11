package parte4.ejercicio1;

public class NegativeSecondException extends Exception{
	
	@Override
	public String toString() {
		
		return "El valor segundo es negativo ";
	}

	
	@Override
	public String getMessage() {
		
		return "El valor segundo es negativo";
	}
}
