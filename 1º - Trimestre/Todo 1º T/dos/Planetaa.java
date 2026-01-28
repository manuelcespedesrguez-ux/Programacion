package dos;

public class Planetaa extends Object {

	private String nombre = null;
	private int cantidadSatelites = 0;
	private double masa = 0D;
	private double volumen = 0D;
	private int diametro = 0;
	private int distanciaMediaSol = 0;

	enum TipoPlaneta {
		GASEOSO, TERRESTRE, ENANO
	}

	TipoPlaneta tPlaneta;

	private boolean observable = false;

	public Planetaa(String nombre, int cantidadSatelites, double masa, double volumen, int diametro,
			int distanciaMediaSol, TipoPlaneta tPlaneta, boolean observable) {
		// super();
		this.nombre = nombre;
		this.cantidadSatelites = cantidadSatelites;
		this.masa = masa;
		this.volumen = volumen;
		this.diametro = diametro;
		this.distanciaMediaSol = distanciaMediaSol;
		this.tPlaneta = tPlaneta;
		this.observable = observable;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadSatelites() {
		return cantidadSatelites;
	}

	public void setCantidadSatelites(int cantidadSatelites) {
		this.cantidadSatelites = cantidadSatelites;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public int getDistanciaMediaSol() {
		return distanciaMediaSol;
	}

	public void setDistanciaMediaSol(int distanciaMediaSol) {
		this.distanciaMediaSol = distanciaMediaSol;
	}

	public TipoPlaneta gettPlaneta() {
		return tPlaneta;
	}

	public void settPlaneta(TipoPlaneta tPlaneta) {
		this.tPlaneta = tPlaneta;
	}

	public boolean isObservable() {
		return observable;
	}

	public void setObservable(boolean observable) {
		this.observable = observable;
	}

	@Override
	public String toString() {
		return "Planetaa [nombre=" + nombre + ", cantidadSatelites=" + cantidadSatelites + ", masa=" + masa
				+ ", volumen=" + volumen + ", diametro=" + diametro + ", distanciaMediaSol=" + distanciaMediaSol
				+ ", tPlaneta=" + tPlaneta + ", observable=" + observable + "]";
	}

	public double densidad() {
		return masa / volumen;
	}

	public enum PlansSiSol {
		MERCURIO, VENUS, TIERRA, MARTE, JÚPITER, SATURNO, URANO, NEPTUNO,
	}

}
