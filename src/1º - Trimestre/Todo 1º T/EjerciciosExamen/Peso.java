package EjerciciosExamen;

public class Peso {

	public int piedras;
	public double libras;
	
	public Peso (int piedras, double libras) {
		this.piedras = piedras;
		this.libras = libras;
	}

	@Override
	public String toString() {
		return "Peso [piedras=" + piedras + ", libras=" + libras + "]";
	}
	
	public int piedras() {
		return this.piedras;
	}
	
	public int libras() {
		return this.libras();
	}
	
	public void Convertir(int kilos) {
		this.piedras = kilos;
		this.libras = kilos;
	}
	
	//No se como seguir
}
