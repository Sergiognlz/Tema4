package ejerciciosSinArrays;

import java.util.Scanner;

/*Realiza un programa que pida 8 números enteros y los almacene en una tabla. 
 *A continuación, en un bucle distinto, recorrerá esa tabla y mostrará esos números 
 *junto con la palabra “par” o “impar” según proceda.*/
public class Ej6 {
public static void main(String[] args) {
	//creamos tabla
	int tabla[]=new int [8];
	
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	
	//creamos for para almacenar los números
	for(int i=0;i<tabla.length;i++) {
		//pedimos los números al usuario
		System.out.println("Introduce un número para el valor "+(i+1));
		//guardamos el valor 
		tabla[i]=sc.nextInt();
		
	}
	//creamos un for each para leer la tabla y mostrar si es par o no.
	for(int num:tabla) {
		//averiguamos cuando los números son pares o impares
		if(num%2==0) {
			
			System.out.println(num+" Par");
		}else {
		
		//imprimimos los números
		System.out.println(num+" Impar");
		}
	}
	//cerramos escaner
	sc.close();
}
}
