package parte1.ejercicio4;

/**
 * clase artículo
 */
public class Articulo {
	/**
	 * atributo nombre
	 */
	String nombre;

	/**
	 * atributo precio sin iva
	 */
	double precio;
	/**
	 * atributo iva
	 */
	final double IVA=0.21;
	
	/**
	 * atributo cuantos quedan en el almacén
	 */
	int cuantosQuedan;
	
	/**
	 * constructor Artículo
	 * @param nombre
	 * @param precio
	 * @param IVA
	 * @param cuantosQuedan
	 */
	Articulo(String nombre, double precio, int cuantosQuedan){
		//comprobamos que no sea null, cadena vacía ni espacios en blanco
		if(nombre!=null&&!nombre.isBlank()) {
		this.nombre=nombre;
		}
		//comprobamos que precio sea mayor que 0
		if(precio>0) {
			this.precio=precio;
		}
		//comprobamos que no se manor que 0
		if(cuantosQuedan>=0) {
			this.cuantosQuedan=cuantosQuedan;
		}
	}
}
