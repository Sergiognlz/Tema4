package parte3.ejercicio5;

import java.util.Random;

public class NumerosAleatorios {
/**Diseña una clase que contenga tres funciones de nombre numerosAleatorios que hagan lo siguiente:
 * 
1. La primera de las funciones recibirá un argumento de tipo entero que indicará la cantidad de números aleatorios a generar. 
Esta función generará números aleatorios comprendidos entre 0 y 1 y los mostrará por pantalla.

2. La segunda de las funciones recibirá dos argumentos de tipo entero: 
El primero indica la cantidad de números aleatorios a generar
El segundo indica el valor máximo que tomará el número aleatorio. 
Los números aleatorios generados deben estar entre 0 y el valor máximo introducido por parámetro. 
En este caso los números aleatorios deben ser enteros. Los números aleatorios generados deben mostrarse por pantalla.

3. La tercera de las funciones recibirá tres argumentos de tipo entero: 
El primero indica la cantidad de números aleatorios a generar
El segundo indica el valor mínimo que tomará el número aleatorio. 
El tercero indica el valor máximo que tomará el número aleatorio.
Los números aleatorios generados deben estar entre el valor mínimo y el valor máximo introducidos por parámetro. 
En este caso los números aleatorios deben ser enteros. Los números aleatorios generados deben mostrarse por pantalla.*/
	
	//creamos objeto random a nivel de clase para usarlo en todas las funciones
	static Random rand=new Random();
	/**
	 * función que recibe un número e imprime tantos números aleatorios entre 0 y 1
	 * @param cantNum cantidad de números a imprimir
	 */
	public void numerosAleatorios(int cantNum) {
		for(int i=0;i<cantNum;i++){
			System.out.println(rand.nextInt(0,2));
			
		}
		
	}
	/**
	 *  función que recibe dos números e imprime tantos números aleatorios entre 0 y el segundo número
	 * @param cantNum cantidad de números a imprimir
	 * @param numMax número máximo que generará
	 */
	public void numerosAleatorios(int cantNum, int numMax) {
		for(int i=0;i<cantNum;i++){
			System.out.println(rand.nextInt(0,(numMax+1)));
			
		}
		
	}
	/**
	 *  función que recibe tres números e imprime tantos números aleatorios entre el último número y el segundo 
	 * @param cantNum cantidad de números a imprimir
	 * @param numMax número máximo aleatorio que imprimirá
	 * @param numMin número mínimo aleatorio que imprimirá
	 */
	public void numerosAleatorios(int cantNum, int numMax, int numMin) {
		for(int i=0;i<cantNum;i++){
			System.out.println(rand.nextInt(numMin,(numMax+1)));
			
		}
		
	}
	
}
