package parte1.ejercicio2;

import java.util.Scanner;

public class PrincipalPersona {
	/*
	 * Crea un programa con una clase llamada Persona que representará los datos
	 * principales de una persona: dni, nombre, apellidos y edad. En el main de la
	 * clase principal instancia dos objetos de la clase Persona. Luego, pide por
	 * teclado los datos de ambas personas (guárdalos en los objetos). Por último,
	 * imprime dos mensajes por pantalla (uno por objeto) con un mensaje del estilo
	 * “Azucena Luján García con DNI … es / no es mayor de edad”.
	 */

	public static void main(String[] args) {
		//objeto escaner
		Scanner sc=new Scanner(System.in);
		//variable cadena
		String cadena;
		//creamos objeto p1
		Persona p1=new Persona();
		//creamos objeto p1
		Persona p2=new Persona();

		//for para recorrer dos veces
		for(int i=0;i<2;i++) {
		
		//pedimos dni al usuario
		System.out.println("Introduce dni");
		//guardamos en el atributo correspondiente
		//cuando sea par
		 if(i%2==0) {
			 //guardará en p1
			 p1.dni=sc.next();
			 //si es impar
		 }else {
			 //p2
			 p2.dni=sc.next();
		 }
		 //lipiamos buffe
		sc.nextLine();
		//pedimos nombre al usuario
		System.out.println("Introduce nombre");
		//guardamos en el atributo correspondiente
		 if(i%2==0) {
			 //guardará en p1
			 p1.nombre=sc.nextLine();
			 //si es impar
		 }else {
			 //p2
			 p2.nombre=sc.nextLine();
		 }
		
		//pedimos apellidos al usuario
		System.out.println("Introduce apellidos");
		//guardamos en el atributo correspondiente
		 if(i%2==0) {
			 //guardará en p1
			 p1.apellidos=sc.nextLine();
			 //si es impar
		 }else {
			 //p2
			 p2.apellidos=sc.nextLine();
		 }
		
		//pedimos edad al usuario
		System.out.println("Introduce edad");
		//guardamos en el atributo correspondiente
		 if(i%2==0) {
			 //guardará en p1
			 p1.edad=sc.nextInt();
			 //si es impar
		 }else {
			 //p2
			 p2.edad=sc.nextInt();
		 }
		
		}
		//mostramos por pantalla el objeto persona 1
		System.out.println(p1.nombre+" "+p1.apellidos+" con dni "+p1.dni+(cadena=p1.edad<18?" no es mayor de edad":" es mayor de edad"));
		
		//mostramos por pantalla el objeto persona 2
				System.out.println(p2.nombre+" "+p2.apellidos+" con dni "+p2.dni+(cadena=p2.edad<18?" no es mayor de edad":" es mayor de edad"));
		//cerramos escaner
				sc.close();
	}
}
