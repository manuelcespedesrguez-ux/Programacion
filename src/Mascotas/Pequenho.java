package Mascotas;

public class Pequenho extends Perro {
    
    enum razaP {
        caniche, yorkshire, terrier, chihuahua, pomerania, maltese
    }

    private razaP raza;

    public Pequenho(String nombre, int edad, String color, double peso, boolean muerde, razaP raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    public razaP getRaza() {
        return raza;
    }

    public void setRaza(razaP raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "El perro pequeño " + nombre + ", tiene un peso de " + peso + " kg, tiene " + edad + " años, es de color " + color + 
        " y es de raza " + raza;
    }

}
