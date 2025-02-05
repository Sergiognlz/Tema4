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
		Punto p1 = new Punto(5, 0);
		// creamos objeto p2
		Punto p2 = new Punto(10, 10);
		// creamos objeto p3
		Punto p3 = new Punto(-3, 7);

		// mostramos por pantalla las coordenadas
		System.out.println(p1.getX() + " ," + p1.getY());
		System.out.println(p2.getX() + " ," + p2.getY());
		System.out.println(p3.getX() + " ," + p3.getY());

		// modificamos coordenadas p1
		p1.setX(p1.getX() + 3);
		p2.setY(p1.getY() - 1);
		// modificamos coordenadas p2
		p2.setX(p2.getX() * 10);
		p2.setY(p2.getX() / 10);
		// modificamos coordenadas p3
		p3.setX(p3.getX() % 3);
		p3.setY(107);

		System.out.println();

		// mostramos por pantalla las coordenadas nuevamente
		System.out.println(p1.getX() + " ," + p1.getY());
		System.out.println(p2.getX() + " ," + p2.getY());
		System.out.println(p3.getX() + " ," + p3.getY());

	}
}
