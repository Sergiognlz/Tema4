package parte4.ejercicio2;

public class Contador {
//variable atributo contador
	private int cont;

	/**
	 * constructor contador
	 * 
	 * @param cont
	 */
	public Contador(int cont) {
		if (cont >= 0) {
			this.cont = cont;
		}
	}

	/**
	 * get contador
	 * 
	 * @return contador
	 */
	public int getCont() {
		return cont;
	}

	/**
	 * set contador
	 * 
	 * @param cont
	 */
	public void setCont(int cont) {
		if (cont >= 0) {
			this.cont = cont;
		}
	}

	/**
	 * función que incrementa en una unidad el contador
	 */
	public void incrementar() {
		cont++;
	}

	/**
	 * función que decrementa en una unidad el contador
	 */
	public void decrementar() {
		cont--;
		if (cont < 0) {
			cont = 0;
		}
	}

	/**
	 * método to string
	 */
	@Override
	public String toString() {
		String cadena = "Contador: " + cont;

		return cadena;
	}

}
