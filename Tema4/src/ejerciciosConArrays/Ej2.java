package ejerciciosConArrays;

import java.util.Arrays;

/*Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores: 
 * 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. 
 * hasta introducir 10 diez veces el 10, y luego la muestre por pantalla. 
 * En esta ocasión has de utilizar Arrays.fill().*/
public class Ej2 {
	public static void main(String[] args) {
	
//creamos la tabla
	int tabla[]=new int[55];

	int contador=0;
	//creamos un for para recorrer y rellenar la tabla
	
	for(int i=0;i<10;i++) {
		
		Arrays.fill(tabla,contador+i,contador+i+1+i,i+1);
		contador+=i;
	
		
	}
	System.out.println(Arrays.toString(tabla));
	
}
}