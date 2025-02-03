package parte1.ejercicio1;

public class PrincipalPunto {
	/*
	 * Crea un programa con una clase llamada Punto que representará un punto de dos
	 * dimensiones en un plano. Solo contendrá dos atributos enteros llamados x e y
	 * (coordenadas). En el main de la clase principal instancia 3 objetos Punto con
	 * las coordenadas (5,0), (10,10) y (-3,7). Muestra por pantalla sus coordenadas
	 * (utiliza un println para cada punto). Modifica todas las coordenadas (prueba
	 * distintos operadores como = + - += *=...) y vuelve a imprimirlas por
	 * pantalla.
	 */
	public static void main(String[] args) {
		// creamos objeto p1
		Punto p1 = new Punto();
		// creamos objeto p2
		Punto p2 = new Punto();
		// creamos objeto p3
		Punto p3 = new Punto();

		// coordenadas p1
		p1.x = 5;
		p2.y = 0;
		// coordenadas p2
		p2.x = 10;
		p2.y = 10;
		// coordenadas p3
		p3.x = -3;
		p3.y = 7;

		// mostramos por pantalla las coordenadas
		System.out.println(p1.x + " ," + p1.y);
		System.out.println(p2.x + " ," + p2.y);
		System.out.println(p3.x + " ," + p3.y);
		
		
		// modificamos coordenadas p1
		p1.x += 3;
		p2.y -= 1;
		// modificamos coordenadas p2
		p2.x *= 10;
		p2.y /= 10;
		// modificamos coordenadas p3
		p3.x %= 3;
		p3.y = 107;

		
		System.out.println();
		

		// mostramos por pantalla las coordenadas nuevamente
		System.out.println(p1.x + " ," + p1.y);
		System.out.println(p2.x + " ," + p2.y);
		System.out.println(p3.x + " ," + p3.y);

	}
}
