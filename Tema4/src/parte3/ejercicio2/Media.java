package parte3.ejercicio2;

public class Media {

	/**
	 * Diseña una clase que contenga dos funciones de nombre media que hagan lo
	 * siguiente: 
	 * La primera de las funciones recibirá dos argumentos de tipo entero
	 * y devolverá la media de ambos. El valor a devolver debe ser double. 
	 * La segunda de las funciones recibirá tres argumentos de tipo entero y devolverá
	 * la media de los tres. El tipo a devolver debe ser double.
	 */
	
	public static double media(int num1, int num2) {
		double media=(double)(num1+num2)/2;
		
		return media;
	}
	
	public static double media(int num1, int num2, int num3) {
		double media=(double)(num1+num2+num3)/3;
		
		return media;
	}
	

}
