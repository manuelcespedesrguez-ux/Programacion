package boletin;

public class Ejercicio17 {

	public static void main(String[] args) {

		Linea[] factura = new Linea[5];

		int[] codigos = { 101, 102, 103, 104, 105 };

		double[] litros = { 15.5, 2, 50, 3.2, 2 };

		double[] precios = { 2.5, 10, 0.75, 5, 1 };

		for (int i = 0; i < factura.length; i++) {

			Linea nuevaLinea = new Linea(

					codigos[i],

					litros[i],

					precios[i]

			);

			factura[i] = nuevaLinea;

			System.out.println("Posicion " + i + " creada: " + factura[i].toString());

		}

	}

	private static class Linea {

		// Atributos (Propiedades)

		int codigo;

		double litros;

		double precioL; // Precio por litro

		double subtotal; // Nuevo: Calculado

		// Constructor para inicializar los atributos

		public Linea(int codigo, double litros, double precioL) {

			this.codigo = codigo;

			this.litros = litros;

			this.precioL = precioL;

			this.subtotal = litros * precioL; // Cálculo automático al crear la línea

		}

		// Método para calcular el subtotal (si es que la cantidad o precio cambian)

		public double calcularSubtotal() {

			this.subtotal = this.litros * this.precioL;

			return this.subtotal;

		}

		// Getter para subtotal

		public double getSubtotal() {

			return subtotal;

		}

		// Método toString() para una representación legible del objeto

		@Override

		public String toString() {

			return "Linea [Código=" + codigo + ", Litros=" + litros + ", Precio/L=" + precioL + ", Subtotal=" + subtotal

					+ "]";

		}

		// Getters y Setters (Opcionales, pero buena práctica si se necesita

		// acceder/modificar)

		public int getCodigo() {

			return codigo;

		}

		public void setCodigo(int codigo) {

			this.codigo = codigo;

		}

		public double getLitros() {

			return litros;

		}

		public void setLitros(double litros) {

			this.litros = litros;

		}

		public double getPrecioL() {

			return precioL;

		}

		public void setPrecioL(double precioL) {

			this.precioL = precioL;

		}

	}
}
