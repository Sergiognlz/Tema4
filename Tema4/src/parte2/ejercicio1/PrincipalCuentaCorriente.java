package parte2.ejercicio1;

import java.util.Scanner;

public class PrincipalCuentaCorriente {

	public static void main(String[] args) {
		// variable DNI
		String DNI;
		// variable nombre
		String nombre;
		// variable saldo
		double saldo;
		// variable nación
		String nacion;
		//variable cantidad
		double cantidad;
		//variable opción
		int opcion;
		// objeto escaner
		Scanner sc = new Scanner(System.in);
		// objeto cuenta corriente
		CuentaCorriente cc;

		// pedimos dni al usuario
		System.out.println("Introduce el DNI del titular");
		// guardamos dni
		DNI = sc.nextLine();
		// pedimos nombre
		System.out.println("Introduce nombre del titular");
		// guardamos nombre
		nombre = sc.nextLine();
		// pedimos saldo inicial
		System.out.println("Introduce el saldo inicial de la cuenta");
		// guardamos saldo
		saldo = sc.nextDouble();
		// pedimos nacionalidad
		System.out.println("Introduce la nacionalidad del titular");
		// guardamos llamando a la función toUpperCase para poner en mayúsculas y evitar
		// errores con el switch
		nacion = sc.next().toUpperCase();
		
		//invocamos al constructor y le damos los valores
		cc=new CuentaCorriente(DNI,nombre,saldo,nacion);
		//espacio
		System.out.println();

		//mostramos menú
		System.out.println("MENÚ:");
		System.out.println("1. Mostrar datos de la cuenta");
		System.out.println("2. Retirar efectivo");
		System.out.println("3. Ingresar efectivo");
		System.out.println("0. Salir del programa");
		System.out.println();
		//pedimos opción
		System.out.println("Introduce la opción deseada");
		//guardamos la opción
		opcion=sc.nextInt();
		
		//while para repetir el menú mientras no se elija la opción 0
		while(opcion!=0) {
			
			//switch para las acciones del menú
			switch(opcion) {
			//caso 1 mostramos datos
			case 1->{
				System.out.println(cc);
				
			}
			//caso 2 retirar efectivo
			case 2->{
				//pedimos cantidad
				System.out.println("Introduzca la cantidad que desea retirar");
				//guardamos cantidad
				cantidad=sc.nextDouble();
				//llamamos al método sacarDinero
				cc.sacarDinero(cantidad);
			}
			//caso 3 ingresar dinero
			case 3->{
				//pedimos cantidad
				System.out.println("Introduzca la cantidad que desea ingresar");
				//guardamos cantidad
				cantidad=sc.nextDouble();
				//llamamos al método sacarDinero
				cc.ingresarDinero(cantidad);
			}
			//caso 0 salir del programa
			case 0->{
				//mensaje de saliendo
				System.out.println("Saliendo");
			}
			//en caso de que la opción introducida no sea válida
			default->{
				//mensaje error
				System.err.println("La opción introducida no es válida");
			}
			
			}
			//repetimos menú
			System.out.println("MENÚ:");
			System.out.println("1. Mostrar datos de la cuenta");
			System.out.println("2. Retirar efectivo");
			System.out.println("3. Ingresar efectivo");
			System.out.println("0. Salir del programa");
			System.out.println();
			//pedimos opción
			System.out.println("Introduce la opción deseada");
			//guardamos la opción
			opcion=sc.nextInt();
			

		}
		
		//cerramos escaner
		sc.close();
	}
}
