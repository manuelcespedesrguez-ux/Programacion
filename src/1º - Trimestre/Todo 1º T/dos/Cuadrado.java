package dos;

import java.awt.Color;

public class Cuadrado {

	int lado;
	Color color;

	public Cuadrado(int lado, Color color) {
		this.lado = lado;
		this.color = color;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", color=" + color + "]";
	}

	double calcularArea() {
		return lado * lado;
	}

	double calcularPerímetro() {
		return (lado + lado + lado + lado);
	}

}
