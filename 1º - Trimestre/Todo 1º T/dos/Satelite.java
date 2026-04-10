package dos;

public class Satelite {
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;

	Satelite(double m, double p, double d) {
		this.meridiano = m;
		this.paralelo = p;
		this.distancia_tierra = d;
	}

	Satelite() {
		meridiano = paralelo = distancia_tierra = 0;
	}

	public void setPosicion(double m, double p, double d) {
		variaPosicion(m, p);
		variaALtura(d);
	}

	public void printPosicion() {

		System.out.println("El satelite se encuentra en el paralelo " + paralelo + " Meridiano " + meridiano
				+ " a una distancia de la tierra de " + distancia_tierra + " Kilómetros");

	}

	public void variaALtura(double desplazamiento) {
		if (distancia_tierra + desplazamiento < 0) {
			System.out.println("CUIDADO CON LA ORA");
		} else {
			this.distancia_tierra += desplazamiento;
		}
	}

	public boolean enOrbita() {
		if (distancia_tierra == 0)
			return false;
		else
			return true;
	}

	public void variaPosicion(double variaM, double variaP) {
		this.meridiano += variaM;
		this.meridiano += variaP;
	}

	@Override
	public String toString() {
		return "Satelite [meridiano=" + meridiano + ", paralelo=" + paralelo + ", distancia_tierra=" + distancia_tierra
				+ "]";
	}

}
