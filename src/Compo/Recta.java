package Compo;

public class Recta {
    
    Punto punto1;
    Punto punto2;

    public Recta(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
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

    public void calcularPendiente() {
        double pendiente = ((punto2.getY() - punto1.getY()) / (punto2.getX() - punto1.getX()));
        System.out.println("La pendiente de la recta es = " + pendiente);
    }

    public void calcularLongitud() {
        double abcisa1 = Math.pow((punto2.getX() - punto1.getX()), 2);
        double abcisa2 = Math.pow((punto2.getY() - punto1.getY()), 2);
        System.out.println("La longitud de la recta es = " + Math.sqrt(abcisa1 + abcisa2 ));
    }

    void imprimir() {
        System.out.println("La recta tiene los siguientes puntos: ");
        System.out.println("Punto 1 = " + punto1.toString());
        System.out.println("Punto 2 = " + punto2.toString());
    }    

}
