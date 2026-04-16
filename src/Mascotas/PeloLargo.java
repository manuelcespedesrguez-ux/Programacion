package Mascotas;

public class PeloLargo extends Gato {
    
    enum razaPL {
        persa, angora, himalayos, mainecoon, siberiano
    }

    private razaPL raza;

    public PeloLargo(String nombre, int edad, String color, double altura, double longitud, razaPL raza) {
        super(nombre, edad, color, altura, longitud);
        this.raza = raza;
    }

    public razaPL getRaza() {
        return raza;
    }

    public void setRaza(razaPL raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "El gato de pelo largo que se llama " + nombre + ", tiene una altura de " + altura + " m, tiene " + edad + " años, y una longitud de " + longitud + 
        " m y es de color " + color + " y de raza " + raza;
    }

}
