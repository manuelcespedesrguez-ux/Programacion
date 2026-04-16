package Mascotas;

public class Perro extends Mascotas {
    
    protected double peso;
    protected boolean muerde;
    
    public Perro(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }

    @Override
    public void sonido(){
        super.sonido();
        System.out.println("El perro ladra -> GUAU GUAU");
    }


    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", muerde=" + muerde + ", color="
                + color + "]";
    }

}
