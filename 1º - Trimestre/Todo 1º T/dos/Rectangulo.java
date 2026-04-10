package dos;

import java.awt.Color;

public class Rectangulo {

	int base;
	int altura;
	Color color;

	Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	double calcularArea() {
		return base * altura;
	}

	double calcularPerímetro() {
		return (2 * base) + (2 * altura);
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", color=" + color + "]";
	}

}
