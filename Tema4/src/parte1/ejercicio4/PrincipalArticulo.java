package parte1.ejercicio4;

public class PrincipalArticulo {
	/*
	 * Crea un programa con una clase llamada Articulo con los siguientes atributos:
	 * nombre, precio (sin IVA), iva (siempre será 21) y cuantosQuedan (representa
	 * cuántos quedan en el almacén). En el main de la clase principal instancia un
	 * objeto de la clase artículo.
	 * 
	 * Asígnale valores a todos sus atributos (los que quieras) y muestra por
	 * pantalla un mensaje del estilo “Pijama - Precio:10€ - IVA:21% - PVP:12,1€”
	 * (el PVP es el precio de venta al público, es decir, el precio con IVA).
	 * Luego, cambia el precio y vuelve a imprimir el mensaje.
	 */
	public static void main(String[] args) {
		// variable pvp
		double pvp;
		//variable cantidad
		int cantidad;
		// creamos objeto clase artículo
		Articulo art = new Articulo("Zapatilla",2.0,15);


		
		
		// mostramos por pantalla los valores del objeto
		System.out.println(art);
		//System.out.println(art.getNombre() + " - Precio: " + art.getPrecio() + "€ - IVA:21% - PVP: " + pvp + "€ ");
		
		//declaramos cantidad que vamos a vender
		cantidad=3;
		//llamamamos al método vender
		art.vender(cantidad);
		//mostramos por consola soString
		System.out.println(art);
		//cambiamos la cantidad que vamos a almacenar
		cantidad=2;
		//llamamos al método almacenar
		art.almacenar(cantidad);
		//cambiamos precio
		art.setPrecio ( 10.0);
		
		// mostramos por pantalla los valores del objeto
		//System.out.println(art.getNombre() + " - Precio: " + art.getPrecio() + "€ - IVA:21% - PVP: " + pvp + "€ ");
		System.out.println(art);
	}
}
