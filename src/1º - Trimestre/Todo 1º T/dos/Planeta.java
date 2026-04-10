package dos;

public class Planeta extends Object {

	public static final long UA = 149597870;

	private String nombre = null;
	private int cantidadSatelites = 0;
	private double masa = 0D;
	private double volumen = 0D;
	private int diametro = 0;
	private int distanciaMediaSol = 0;
	private double periodoOrbitalAnios = 0D;
	private double periodoRotacionDias = 0D;

	enum TipoPlaneta {
		GASEOSO, TERRESTRE, ENANO
	}

	TipoPlaneta tPlaneta;

	private boolean observable = false;

	public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro,
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
		this.periodoOrbitalAnios = periodoOrbitalAnios;
		this.periodoRotacionDias = periodoRotacionDias;

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

	public double getPeriodoOrbitalAnios() {
		return periodoOrbitalAnios;
	}

	public void setPeriodoOrbitalAnios(double periodoOrbitalAnios) {
		this.periodoOrbitalAnios = periodoOrbitalAnios;
	}

	public double getPeriodoRotacionDias() {
		return periodoRotacionDias;
	}

	public void setPeriodoRotacionDias(double periodoRotacionDias) {
		this.periodoRotacionDias = periodoRotacionDias;

	}

	@Override
	public String toString() {
		return "Planeta [nombre=" + nombre + ", cantidadSatelites=" + cantidadSatelites + ", masa=" + masa
				+ ", volumen=" + volumen + ", diametro=" + diametro + ", distanciaMediaSol=" + distanciaMediaSol
				+ ", periodoOrbitalAnios=" + periodoOrbitalAnios + ", periodoRotacionDias=" + periodoRotacionDias
				+ ", tPlaneta=" + tPlaneta + ", observable=" + observable + "]";
	}

	public double densidad() {
		return masa / volumen;
	}

	public boolean esExterior() {

		if (distanciaMediaSol >= 3.4 * UA)
			return true;
		else
			return false;
	}

	public enum PlansSiSol {
		MERCURIO, VENUS, TIERRA, MARTE, JÚPITER, SATURNO, URANO, NEPTUNO,

	}
}