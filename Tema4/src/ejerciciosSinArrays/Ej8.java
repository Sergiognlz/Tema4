package ejerciciosSinArrays;

import java.util.Arrays;
import java.util.Scanner;

/*Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros 
 *aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y mostrará en
 *qué posiciones del array aparece N. */
public class Ej8 {
public static void main(String[] args) {
	//creamos la tabla donde guardar los 100 números
	int tabla[]=new int[100];
	//creamos variable donde guardar el número que pediremos al usuario
	int num;
	//creamos el escaner
	Scanner sc= new Scanner(System.in);
	
//creamos un for para recorrer la tabla y rellenarla
	for(int i=0;i<tabla.length;++i) {
		//En cada iteración rellenamos un valor con un número aleatorio
		tabla[i]=(int)(1+Math.random() *10);
	}
	//pedimos al usuario un valor n 
	System.out.println("Introduce un número");
	//guardamos el número 
	num=sc.nextInt();
	
	
	for(int j=0;j<tabla.length;j++) {
		if (num==tabla[j]) {
			System.out.println(j);
		
		}
}
	System.out.println(Arrays.toString(tabla));
	sc.close();
}
}
