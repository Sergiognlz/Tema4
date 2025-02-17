package parte3.ejercicio6;

public class FuncionesMatematicas {
	/**
	 * Crea una clase denominada FuncionesMatematicas. En esta clase se definirán
	 * las siguientes funciones estáticas, que deben ser implementadas de forma
	 * recursiva:
	 * 
	 * int sumatorio(int numero): Devuelve la suma de todos los números entre 1 y n.
	 * double
	 * 
	 * potencia(double a, int n): Esta función devuelve el resultado de an.
	 * 
	 * int serieFibonacci(int numero): A esta función se le pasará un número entero
	 * y nos devolverá el término correspondiente de la serie de Fibonacci. El
	 * enésimo valor de la serie de Fibonacci se calcula sumando los dos valores
	 * anteriores de la serie
	 */
	/**
	 * función recursiva que devuleve la suma de todos los números entre 1 y n
	 * 
	 * @param numero
	 * @return sumatorio
	 */
	public static int sumatorio(int numero) {
		int suma;

		if (numero == 1) {
			suma = 1;
		} else {
			suma = numero + sumatorio(numero - 1);
		}

		return suma;
	}

	/**
	 * Funcición que devuelve el resultado de "a" elevado a "n".
	 * 
	 * @param a base
	 * @param n potencia
	 * @return resultado
	 */
	public static double potencia(double a, int n) {
		double pot;

		if (n == 0) {
			pot = 1;
		} else {
			pot = Math.pow(a, potencia(a, n - 1));
		}
		return pot;
	}

	/**
	 * función se le pasará un número entero y nos devolverá el término
	 * correspondiente de la serie de Fibonacci. El enésimo valor de la serie de
	 * Fibonacci se calcula sumando los dos valores anteriores de la serie
	 * 
	 * @param num que se le pasa
	 * @return resultado 
	 */
	public static int serieFibonaci(int num) {
		int result;

		if (num == 1) {
			result = 1;
		}else if(num==2) {
			result=1;
		}else {
			result = serieFibonaci(num - 1) + serieFibonaci(num - 2);
		}

		return result;
	}

}
