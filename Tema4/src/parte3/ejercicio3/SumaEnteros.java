package parte3.ejercicio3;

public class SumaEnteros {

	/**
	 * función sumaEnteros
	 * @param número objetivo a sumar
	 * @return suma de enteros desde 1 hasta número objetivo
	 */
	public int sumaEnteros(int num) {
		int suma=0;
		
		for(int i=0;i<=num;i++) {
			suma+=i;
		}
		
		return suma;
	}
	
	/**
	 *  función sumaEnteros 
	 * @param numIni número de inicio de la suma
	 * @param numFin número final de la suma
	 * @return suma de los números desde numIni a numFin
	 */
	public int sumaEnteros(int numIni, int numFin) {
		int suma=0;
		
		for(int i=numIni;i<=numFin;i++) {
			suma+=i;
		}
		
		return suma;
	}
	
}
