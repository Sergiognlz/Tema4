package ejerciciosConArrays;

import java.util.Arrays;

/*Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0 y 9 
 * (utiliza Math.random()*10). Luego ordena los valores del array y los mostrará por pantalla.*/
public class Ej4 {
public static void main(String[] args) {
	//creamos la tabla
	int tabla[]=new int[30];
	
	//creamos for para recorrer la tabla
	for(int i=0;i<tabla.length;i++) {
		//rellenamos con Match.random
		tabla[i]=(int) (Math.random()*10);
	}
	Arrays.sort(tabla);
	System.out.println(Arrays.toString(tabla));
}
}
