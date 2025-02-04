package parte1.ejercicio3;

/**
 * clase rectángulo
 */

public class Rectangulo {

	/**
	 * variable x1
	 */
	int x1;
	/**
	 * variable y1
	 */
	int y1;

	/**
	 * variable x2
	 */
	int x2;
	/**
	 * variable y2
	 */
	int y2;

	/**
	 * constructor rectángulo
	 * 
	 * @param x1 coordenadas x1
	 * @param y1 coordenadas y1
	 * @param x2 coordenadas x2
	 * @param y2 coordenadas y2
	 */
	Rectangulo(int x1, int y1, int x2, int y2) {
//comprobamos que x2 sea mayor que x1 y y2 sea mayor que y1
		if (x2 > x1 && y2 > y1) {
			this.x1 = x1;
			this.x2 = x2;
			this.y2 = y2;
			this.y1 = y1;
		}
	}
}
