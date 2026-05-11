package Compo;

public class TestCirculo {
    
    public static void main(String[] args) {
        
        Circulo circ = new Circulo(4, 5, 3);
        Triangulo triangulo = new Triangulo(new Punto(6, 9), new Punto(15, 18), new Punto(24, 27));

        Punto punt = circ.getCentro();
        System.out.println("El centro del círculo está en la coordenada (" + punt.toString() + ")");

        System.out.println("Información del círculo:");
        circ.imprimir();

        System.out.println("\nInformación del triángulo: ");
        triangulo.imprimir();

    }

}
