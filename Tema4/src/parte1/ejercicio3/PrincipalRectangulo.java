package parte1.ejercicio3;

public class PrincipalRectangulo {
	/*
	 * Crea un programa con una clase llamada Rectangulo que representará un
	 * rectángulo mediante dos coordenadas (x1,y1) y (x2,y2) en un plano, por lo que
	 * la clase deberá tener cuatro atributos enteros: x1, y1, x2, y2. En el main de
	 * la clase principal instancia 2 objetos Rectangulo en (0,0)(5,5) y (7,9)(2,3).
	 * Muestra por pantalla sus coordenadas, perímetros (suma de lados) y áreas
	 * (ancho x alto). Modifica todas las coordenadas como consideres y vuelve a
	 * imprimir coordenadas, perímetros y áreas.
	 */
	public static void main(String[] args) {
		
		//creamos objeto r1
		Rectangulo r1=new Rectangulo();
		//creamos objeto r2
		Rectangulo r2=new Rectangulo(); 
		
		//asignamos los atributos al objeto 1
		r1.x1=0;
		r1.y1=0;
		r1.x2=5;
		r1.y2=5;
		//asignamos los atributos al objeto 2
		r2.x1=7;
		r2.y1=9;
		r2.x2=2;
		r2.y2=3;
		
		//mostramos sus coordenadas por pantalla
		System.out.println(r1.x1+" ,"+r1.y1);
		
		
		
		
	}
}
