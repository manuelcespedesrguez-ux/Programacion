package dos;

import java.awt.Color;

public class TestFiguras {

	public static void main (String [] args) {
		
		Circulo Pepe = new Circulo (2, Color.CYAN);
		Rectangulo Anxo = new Rectangulo(4, 6);
		Cuadrado Sergio = new Cuadrado(54, Color.GREEN);
		TrianguloRectangulo Fermin = new TrianguloRectangulo(24, 36, Color.YELLOW);
	
	//Circulo
	System.out.println(Pepe);
	System.out.println("El area del Círculo es: "+ Pepe.calcularArea());
	System.out.println("El perímetro del círculo es: "+Pepe.calcularPerímetro());
	
	//Rectangulo
	System.out.println(Anxo);
	System.out.println("El área del rectángulo es: "+Anxo.calcularArea());
	System.out.println("El perímetro del rectángulo es: "+Anxo.calcularPerímetro());
	
	//Cuadrado
	System.out.println(Sergio);
	System.out.println("El área del cuadrado es: "+Sergio.calcularArea());
	System.out.println("El perímetro del cuadrado es: "+Sergio.calcularPerímetro());
	
	//Triángulo Rectángulo
	System.out.println(Fermin);
	System.out.println("La hipotenusa del triángulo rectángulo es: "+Fermin.calcularHipotenusa());
	System.out.println("El área del triángulo rectángulo es: "+Fermin.calcularArea());
	System.out.println("El perímetro del triángulo rectágulo es: "+Fermin.calcularPerímetro());
	
	}
}
