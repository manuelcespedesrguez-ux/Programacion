package cuatro;

public class Persona {
	
	//ATRIBUTOS
	String nombre;
	String apellidos;
	String numeroDNI;
	int añoNacimiento;
	String pais;
	char genero;
	
	Persona(String nombre, String apellidos, String numeroDNI, int añoNac) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numeroDNI = numeroDNI;
		this.añoNacimiento = añoNac;
	}
	
	Persona(String nombre, String apellidos, String numeroDNI, int añoNac, String pais, char genero) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numeroDNI = numeroDNI;
		this.añoNacimiento = añoNac;
		this.pais = pais;
		this.genero = genero;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNumeroDNI() {
		return numeroDNI;
	}

	public void setNumeroDNI(String numeroDNI) {
		this.numeroDNI = numeroDNI;
	}

	public int getAñoNacimiento() {
		return añoNacimiento;
	}

	public void setAñoNacimiento(int añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", numeroDNI=" + numeroDNI
				+ ", añoNacimiento=" + añoNacimiento + ", pais=" + pais + ", genero=" + genero + "]";
	}
	
}