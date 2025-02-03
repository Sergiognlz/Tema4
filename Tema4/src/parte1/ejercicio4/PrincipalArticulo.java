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
		// creamos objeto clase artículo
		Articulo art = new Articulo();
		// asignamos valor a nombre
		art.nombre = "Zapatilla";
		// asignamos valor a precio
		art.precio = 2.0;
		// asignamos valor a cuantosQuedan
		art.cuantosQuedan = 99;

		// inicializamos pvp
		pvp = art.precio += (art.precio * art.IVA);
		// mostramos por pantalla los valores del objeto
		System.out.println(art.nombre + " - Precio: " + art.precio + "€ - IVA:21% - PVP: " + pvp + "€ ");

		//cambiamos precio
		art.precio = 10.0;
		// inicializamos pvp
		pvp = art.precio += (art.precio * art.IVA);
		// mostramos por pantalla los valores del objeto
		System.out.println(art.nombre + " - Precio: " + art.precio + "€ - IVA:21% - PVP: " + pvp + "€ ");
	}
}
