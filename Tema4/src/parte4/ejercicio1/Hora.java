package parte4.ejercicio1;

public class Hora {

	// variable hora
	private int hora;
	// variable minuto
	private int minuto;
	// variable segundo
	private int segundo;

	/**
	 * constructor hora
	 * 
	 * @param horas
	 * @param minutos
	 * @param segundos
	 */
	public Hora(int hora, int minuto, int segundo) {
		if (hora <= 23 && hora > 0) {
			this.hora = hora;
		}
		if (minuto < 60 && minuto >= 0) {
			this.minuto = minuto;
		}
		if (segundo < 60 && segundo >= 0) {
			this.segundo = segundo;
		}

	}

	/**
	 * get hora
	 * 
	 * @return hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * set hora
	 * 
	 * @param hora
	 */
	public void setHora(int hora) {
		if (hora <= 23 && hora > 0) {
			this.hora = hora;
		}
	}

	/**
	 * get minuto
	 * 
	 * @return minuto
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
	 * set minuto
	 * 
	 * @param minuto
	 */
	public void setMinuto(int minuto) {
		if (minuto < 60 && minuto >= 0) {
			this.minuto = minuto;
		}
	}

	/**
	 * get segundo
	 * 
	 * @return segundo
	 */
	public int getSegundo() {

		return segundo;
	}

	/**
	 * set segundo
	 * 
	 * @param segundo
	 */
	public void setSegundo(int segundo) {
		if (segundo < 60 && segundo >= 0) {
			this.segundo = segundo;
		}
	}

	/**
	 * función que incrementa en 1 segundo
	 */
	public void incrementaSegundo() {
		segundo++;
		if (segundo == 60) {
			segundo = 0;
			minuto++;
			if (minuto == 60) {
				minuto = 0;
				hora++;
				if (hora == 24) {
					hora = 0;
				}
			}
		}
	}

	/**
	 * sobreescritura método toString
	 */
	@Override
	public String toString() {
		String cadena =hora + ":" + minuto + ":" + segundo ;

		return cadena;
	}

}
