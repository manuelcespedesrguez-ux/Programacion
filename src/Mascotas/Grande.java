package Mascotas;

public class Grande extends Perro {
    
    enum razaG{
        gran_danes, san_bernardo, mastin, pastor_aleman, rottweiler
    }

    private razaG raza;

    public Grande(String nombre, int edad, String color, double peso, boolean muerde, razaG raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    public razaG getRaza() {
        return raza;
    }

    public void setRaza(razaG raza) {
        this.raza = raza;
    } 

    @Override
    public String toString() {
        return "El perro grande " + nombre + ", tiene un peso de " + peso + " kg, tiene " + edad + " años, es de color " + color + 
        " y es de raza " + raza;
    }    

}
