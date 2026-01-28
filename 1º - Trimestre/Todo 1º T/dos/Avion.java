package dos;

public class Avion extends Object{
	
	final static String Loki="Loockheed";
	
	private String fabricante;
	private int motores;
	
	public Avion(String fabricante, int motores) {
		super();
		this.fabricante = fabricante;
		this.motores = motores;
	
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getMotores() {
		return motores;
	}

	public void setMotores(int motores) {
		this.motores = motores;
	}

	@Override
	public String toString() {
		return "Avion [fabricante=" + fabricante + ", motores=" + motores + "]";
	}
	
	public void cambiarFabricante(Avion avion) {
		
		this.setFabricante(Loki);
	}
}
