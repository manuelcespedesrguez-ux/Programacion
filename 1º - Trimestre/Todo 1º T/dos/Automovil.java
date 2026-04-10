package dos;

public class Automovil extends Object{
	//Atributos
	private String marca;
	private String color;
	private int velocidad;
	


	//Constructor
	public Automovil(String marca, String color, int velocidad) {
		this.marca = marca;
		this.color = color;
		this.velocidad = velocidad;

	}
	
	public String getMarca() {
		return color;
		
	}
	
	public void setMarca(String marca) {
		
	}
	
	public String getColor() {
		return color;
		
	}
	
	public void setColor(String color) {
		
	}
	
	public int getvelocidad() {
		return velocidad;
		
	}
	
	public void setVelocidad(int aumento) {
		this.velocidad = velocidad;
		
	}
	
	public void acelerarConCariño(int aumento) {
		velocidad += aumento;
		System.out.println("El " + marca + " acelera con cariño a " + velocidad + " km/h");
	}
	
	//Método para acelerar con cariño
	public void acelerarConCariño(int aumento) {
		velocidad += aumento;
		System.out.println("El " + marca + " acelera con cariño a " + velocidad + " km/h");
	}
	
	public void acelera(int cantidad) {
		velocidad=velocidad+cantidad;
		System.out.println("La nueva velocidad es: " + this.getVelocidad());
	}
	
	public void frena (int cantidad) {
		velocidad=velocidad-cantidad;
		System.out.println("La nueva velocidad es: " this.getVelocidad());
	}
	// Método para tocar el claxon con alegría
	public void claxonCariñoso() {
		System.out.println("¡Pip pip! El " + marca + "" + color + " te saluda con cariño.");
	}

	@Override
	public String toString() {
		return "Automóvil [marca=" + marca + ", color=" + color + ", velocidad=" + velocidad + "]";
	}
	
	

}
