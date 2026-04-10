package dos;

public class testauto2 {
	public static void main(String[] args) {
	}
	private String marca;
	private String color;
	private int velocidad; 

	public void Automovil(String marca, String color, int velocidad) {
		this.marca = marca;
		this.color = color;
		this.velocidad = velocidad;
	}

	
	public void acelerarConCariño(int incremento) {
		if (incremento <= 0) {
			System.out.println("No puedes acelerar con un valor negativo o cero.");
		} else if (velocidad + incremento > 120) { 
			velocidad = 120;
			System.out.println(marca + " ya alcanzó su velocidad máxima (120 km/h).");
		} else {
			velocidad += incremento;
			System.out.println(marca + " acelera a " + velocidad + " km/h.");
		}
	}

	
	public void frena(int decremento) {
		if (decremento <= 0) {
			System.out.println("No puedes frenar con un valor negativo o cero.");
		} else if (velocidad - decremento < 0) {
			velocidad = 0;
			System.out.println(marca + " se detuvo por completo.");
		} else {
			velocidad -= decremento;
			System.out.println(marca + " frena a " + velocidad + " km/h.");
		}
	}

	public void claxonCariñoso() {
		System.out.println(marca + " dice: Pi-pi");
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", color=" + color + ", velocidad=" + velocidad + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Automovil))
			return false;
		Automovil otro = (Automovil) obj;
		return marca.equals(otro.getMarca()) && color.equals(otro.getColor()) && velocidad == otro.getVelocidad();
	} 
	}



