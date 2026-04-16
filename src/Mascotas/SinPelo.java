package Mascotas;

public class SinPelo extends Gato {
    
    enum razaSP {
        esfinge, elfo, donskoy
    }

    private razaSP raza;

    public SinPelo(String nombre, int edad, String color, double altura, double longitud, razaSP raza) {
        super(nombre, edad, color, altura, longitud);
        this.raza = raza;
    }

    public razaSP getRaza() {
        return raza;
    }

    public void setRaza(razaSP raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "El gato sin pelo que se llama " + nombre + ", tiene una altura de " + altura + " m, tiene " + edad + " años, y una longitud de " + longitud + 
        " m y es de color " + color + " y de raza " + raza;
    }

}
