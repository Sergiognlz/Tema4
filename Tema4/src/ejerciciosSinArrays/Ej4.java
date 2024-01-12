package ejerciciosSinArrays;

import java.util.Arrays;

/*Define un array de 12 números enteros con nombre num y asigna los valores según la tabla que se muestra a continuación. 
 * Muestra el contenido de todos los elementos del array por consola. 
 * ¿Qué sucede con los valores de los elementos que no han sido inicializados?*/
public class Ej4 {
	public static void main(String[] args) {
		//creamos la tabla num
		int num[]=new int[12];
		//declaramos los valores de la tabla que nos interesan
		num[0]=39;
		num[1]=-1;
		num[4]=0;
		num[6]=14;
		num[8]=5;
		num[9]=120;
		
		//imprimimos la tabla
		System.out.println(Arrays.toString(num));
	}
}
