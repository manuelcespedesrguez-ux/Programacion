package Mascotas;

public class Gato extends Mascotas {
    
    protected double altura;
    protected double longitud;  

    public Gato(String nombre, int edad, String color, double altura, double longitud) {
        super(nombre, edad, color);
        this.altura = altura;
        this.longitud = longitud;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public void sonido(){
        super.sonido();
        System.out.println("El gato " + nombre + " se acerca, te mira y te maulla MIAU MIAU");
    }

    @Override
    public String toString() {
        return "El gato " + nombre + " mide " + altura + " m, y tiene una longitud de " + longitud + " m, tiene " + edad + " años, y es de color " + color;
    }

}
