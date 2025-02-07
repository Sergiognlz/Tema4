package parte1.ejercicio3;

/**
 * clase rectángulo
 */

public class Rectangulo {

	/**
	 * variable x1
	 */
	private int x1;
	/**
	 * variable y1
	 */
	private int y1;

	/**
	 * variable x2
	 */
	private int x2;
	/**
	 * variable y2
	 */
	private int y2;

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
/**
 * 
 * @return devuelve coordenadas x1
 */
	public int getX1() {
		return x1;
	}
/**
 * modifica coordenadas x1
 * @param coordenadas x1. No puede ser mayor que x2
 */
	public void setX1(int x1) {
		if(x1<x2) {
		this.x1 = x1;
		}
	}
/**
 * 
 * @return coordenadas y1
 */
	public int getY1() {
		return y1;
	}
/**
 * modifica coordenadas y1
 * @param coordenadas y1. No puede ser mayor que y1
 */
	public void setY1(int y1) {
		if(y1<y2) {
		this.y1 = y1;
		}
	}
/**
 * 
 * @return coordenada x2
 */
	public int getX2() {
		return x2;
	}
/**
 * modifica coordenadas x2
 * @param coordenada x2. No puede ser menor que x1 
 */
	public void setX2(int x2) {
		if(x2>x1) {
		this.x2 = x2;
		}
	}
/**
 * 
 * @return coordenadas y2
 */
	public int getY2() {
		return y2;
	}

	/**
	 * Modifica coordenadas y2
	 * @param coordenadas y2. Y2 no puede ser menor que y1
	 */
	public void setY2(int y2) {
		if(y2>y1) {
		this.y2 = y2;
		}
	}
	/**
	 * Modifica al mismo tiempo coordenadas x1 e y1
	 * @param coordenada x1
	 * @param coordenada y1
	 */
	public void setX1Y1(int x1, int y1) {
		
		this.x1=x1;
		this.y1=y1;
	}
	
	/**
	 * Modifica al mismo tiempo coordenadas x2 e y2
	 * @param coordenada x2
	 * @param coordenada y2
	 */
	public void setX2Y2(int x2, int y2) {
		
		this.x2=x2;
		this.y2=y2;
	}
	/**
	 * Modifica todas las corrdenadas
	 * @param coordenada x1
	 * @param coordenada y1
	 * @param coordenada x2
	 * @param coordenada y2
	 */
	public void setAll(int x1, int y1, int x2, int y2) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	/**
	 * Calcula el perímetro
	 * @return perímetro
	 */
	public double getPerimetro() {
		double perimetro=(this.x1+this.y1+this.x2+this.y2);
		
		return perimetro;
	}
	/**
	 * Calcula el área del rectángulo
	 * @return area
	 */
	public double getArea() {
		double area=(this.x1-this.x2)*(this.y1-this.y2);
		
		return area;
	}
	/**
	 * Devuelve cadena con todos los valores de los atributos además del perímetro y el área
	 */
	public String toString() {
		String cadena="Coordenada x1: "+this.x1+"\n";
		cadena+="Coordenada y1: "+this.y1+"\n";
		cadena+="Coordenada x2: "+this.x2+"\n";
		cadena+="Coordenada y2: "+this.y2+"\n";
		cadena+="Perímetro: "+getPerimetro()+"\n";
		cadena+="Área: "+getArea()+"\n";
		
		return cadena;
	}
	
}
