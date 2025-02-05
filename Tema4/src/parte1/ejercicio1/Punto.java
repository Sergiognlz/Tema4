package parte1.ejercicio1;

/**
 * clase Punto
 */
public class Punto {

	// creamos atributo para coodenada x
	private int x;
	// creamos atributo para coodenada y
	private int y;

	/**
	 * Constructor con los atributos
	 * 
	 * @param x coordenada x
	 * @param y coordenada y
	 */
	public Punto(int x, int y) {

		this.x = x;
		this.y = y;

	}

	/**
	 * devuelve el valor de la coordenada x del punto
	 * 
	 * @return coordenada x
	 */
	public int getX() {
		return x;
	}

	/**
	 * modifica coordenada x
	 * 
	 * @param coordenada x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * devuelve el valor de la coordenada y del punto
	 * 
	 * @return coordenada y
	 */
	public int getY() {
		return y;
	}

	/**
	 * modifica coordenada y
	 * 
	 * @param coordenada y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * modifica coordenadas X e Y al mismo tiempo
	 * 
	 * @param coordenadas x
	 * @param coordenadas y
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * desplaza el punto
	 * 
	 * @param incremento coordenadas X
	 * @param incremento coordenadas Y
	 */
	public void desplaza(int dX, int dY) {
		this.x += x;
		this.y += y;
	}
/**
 * calcula la distancia entre dos puntos
 * @param  objeto punto
 * @return distancia double
 */
	public double distancia(Punto p) {
		double distanciaXY;

		distanciaXY = Math.sqrt((Math.pow((p.x - this.x), 2) + Math.pow((p.y - this.y), 2)));

		return distanciaXY;
	}
}
