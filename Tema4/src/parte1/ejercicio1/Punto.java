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
	 * @return coordenada x
	 */
	public int getX() {
		return x;
	}
	/**
	 * modifica coordenada x
	 * @param coordenada x
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * devuelve el valor de la coordenada y del punto
	 * @return coordenada y
	 */
	public int getY() {
		return y;
	}
	/**
	 * modifica coordenada y
	 * @param coordenada y
	 */
	public void setY(int y) {
		this.y = y;
	}
	

}
