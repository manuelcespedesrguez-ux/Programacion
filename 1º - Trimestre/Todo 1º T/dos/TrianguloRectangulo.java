package dos;

import java.awt.Color;

public class TrianguloRectangulo {

	int base;
	int altura;
	Color color;

	public TrianguloRectangulo(int base, int altura, Color color) {
		this.base = base;
		this.altura = altura;
		this.color = color;
	}

	public double calcularHipotenusa() {

		int suma = (int) (Math.pow(base, 2) + Math.pow(altura, 2));
		return Math.sqrt(suma);
	}

	double calcularArea() {
		return (base * altura) * 0.5;
	}

	double calcularPerímetro() {
		return base + altura + calcularHipotenusa();
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
		return "TrianguloRectangulo [base=" + base + ", altura=" + altura + ", color=" + color + "]";
	}

}
