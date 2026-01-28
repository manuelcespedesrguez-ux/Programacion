package dos;

public class Testauto {

	//atributos
		private String marca;
		private String color;
		private int velocidad;

		//constructor con todos los parámetros
		public void Automovil(String marca, String color, int velocidad) {
			this.marca = marca;
			this.color = color;
			this.velocidad = velocidad;
		}
		
		
		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getVelocidad() {
			return velocidad;
		}

		public void setVelocidad(int velocidad) {
			this.velocidad = velocidad;
		}
		
		@Override
		public String toString() {
			return "Automovil [marca=" + marca + ", color=" + color + ", velocidad=" + velocidad + "]";
		}

		
		public void acelerar(int aumento) {
			if(aumento <= 0) {
				System.out.println("El coche no puede acelerar en negativo");
			}
			else if(velocidad+aumento > 180) {
				velocidad =180;
				System.out.println("El coche va muy rápido");
			}
			else {
				velocidad +=aumento;
				System.out.println("El "+marca+" acelera a "+velocidad+" km/h y la nueva velocidad es "+this.getVelocidad());
			}
		}
		
		public void frenar(int decremento) {
			if(decremento <= 0) {
				System.out.println("El coche no puede frenar en negativo");
			}
			else if(velocidad-decremento <= 0) {
				velocidad =0;
				System.out.println("El coche ha frenado por completo");
			}
			else {
				velocidad -= decremento;
				System.out.println("El "+marca+" decelera a "+velocidad+" km/h y la nueva velocidad es "+this.getVelocidad());
			}
		}
		
		public void claxon(String marca, String color) {
			System.out.println("El "+marca+" "+color+" es feo");
		}
	}
