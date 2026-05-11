package Compo;

public class Triangulo {
    
    Punto punto1;
    Punto punto2;
    Punto punto3;

    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    void imprimir() {
        System.out.println("El triángulo tiene los siguientes vértices: ");
        System.out.println("Vértice 1 = " + punto1.toString());
        System.out.println("Vértice 2 = " + punto2.toString());
        System.out.println("Vértice 3 = " + punto3.toString());
    }

}
