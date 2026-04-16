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
        System.out.println("El gato maulla -> MIAU MIAU");
    }

    @Override
    public String toString() {
        return "Gato [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", longitud=" + longitud
                + ", color=" + color + "]";
    }

}
