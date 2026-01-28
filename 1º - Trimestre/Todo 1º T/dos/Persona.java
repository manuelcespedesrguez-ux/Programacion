package dos;

public class Persona {
	
	
	//atributos
	public String nombre;
	private String apellido;
	private int edad;
	
	
	//constructor por defecto
	public Persona(){
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
	}
	
	//Constructor con todos los parámetros
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
    
	// Getters y setters (no se muestran aquí para brevedad)
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	//Métodos propios de persona
	public void firmaPapelFolga(String nombre) {
		System.out.println(nombre + " no viene el jueves" );
	}
	
	public String tengoSueño(int horas) {
		return "Tengo horas de sueño atrasadas: " +horas;
	}
	
	public void canto() {
		System.out.println("Estoy cantando como Pavarotti la Traviata");
	}

}
