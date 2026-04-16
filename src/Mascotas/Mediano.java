package Mascotas;

public class Mediano extends Perro {
    
    enum razaM {
        collie, dalmata, bulldog, galgo, boxer
    }

    private razaM raza;

    public Mediano(String nombre, int edad, String color, double peso, boolean muerde, razaM raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    public razaM getRaza() {
        return raza;
    }

    public void setRaza(razaM raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "El perro mediano que se llama " + nombre + ", tiene un peso de " + peso + " kg, tiene " + edad + " años, y es de color " + color + 
        " y es de raza " + raza;
    }

}
