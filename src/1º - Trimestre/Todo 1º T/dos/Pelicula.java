package dos;

public class Pelicula {

	private String nombre;
	private String director;

	public enum TipoPelicula {
		ACCIÓN, COMEDIA, DRAMA, SUSPENSO
	}

	TipoPelicula genero;

	private int duracion;
	private int anho;
	private double calificacion;

	public Pelicula(String n, String dir, TipoPelicula g, int dur, int anho, double cali) {

		this.nombre = n;
		this.director = dir;
		this.genero = g;
		this.duracion = dur;
		this.anho = anho;
		this.calificacion = cali;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public TipoPelicula getGenero() {
		return genero;
	}

	public void setGenero(TipoPelicula genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getAnho() {
		return anho;
	}

	public void setAnho(int anho) {
		this.anho = anho;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", director=" + director + ", genero=" + genero + ", duracion=" + duracion
				+ ", anho=" + anho + ", calificacion=" + calificacion + "]";
	}

	public boolean esPeliculaEpica() {
		if (duracion >= 180)
			return true;
		else
			return false;
	}

	public String calcularValoracion() {
		String val;
		if (calificacion <= 2)
			val = "Muy mala";
		else if (calificacion <= 5)
			val = "Mala";
		else if (calificacion <= 7)
			val = "Regulera";
		else if (calificacion <= 8)
			val = "Buena";
		else
			val = "Excelente";
		return val;
	}

	public boolean esSimilar(Pelicula otraPeli) {
		if (this.genero == otraPeli.genero && this.getCalificacion() == otraPeli.getCalificacion())
			return true;
		else
			return false;
	}

}
