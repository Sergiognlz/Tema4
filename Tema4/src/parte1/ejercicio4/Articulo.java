package parte1.ejercicio4;

/**
 * clase artículo
 */
public class Articulo {
	/**
	 * atributo nombre
	 */
	private String nombre;

	/**
	 * atributo precio sin iva
	 */
	private double precio;
	/**
	 * atributo iva
	 */
	public static final double IVA=0.21;
	
	/**
	 * atributo cuantos quedan en el almacén
	 */
	private int cuantosQuedan;
	
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
/**
 * 
 * @return nombre artículo
 */
	public String getNombre() {
		return nombre;
	}
/**
 * modifica nombre artículo
 * @param nombre artículo. NO puede ser null, vacío o blanco
 */
	public void setNombre(String nombre) {
		if(nombre!=null&&!nombre.isBlank()) {
		this.nombre = nombre;
		}
	}
/**
 * 
 * @return  precio artículo
 */
	public double getPrecio() {
		return precio;
	}
/**
 * modifica precio artículo
 * @param precio artículo. No puede ser menor o igual que 0
 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
/**
 * 
 * @return cuantos artículos quedan
 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}
/**
 * modifica cuantos archivos quedan
 * @param cuantosQuedan. No puede ser menor que 0
 */
	public void setCuantosQuedan(int cuantosQuedan) {
		if(cuantosQuedan>=0) {
		this.cuantosQuedan = cuantosQuedan;
		}
	}
	/**
	 * calculamos el precio final de un artículo añadiendo el iva
	 * @return precioFinal
	 */
	public double getPVP() {
		double precioFinal=this.precio;
		
		precioFinal+=this.precio*IVA;
		
		return precioFinal;
	}
	/**
	 * Calculamos un descuento en base a un porcentaje que le pasamos por argumento
	 * @param descuento porcentaje que le pasamos
	 * @return precio final con el descuento
	 */
	public double getPVPDescuento(int descuento) {
		double precioDescuento=this.precio;
		
		precioDescuento-=this.precio*((double)descuento/10);
		
		return precioDescuento;
	}
}
