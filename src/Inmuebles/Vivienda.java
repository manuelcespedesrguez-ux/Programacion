package Inmuebles;

public class Vivienda extends Inmueble {

    // Numero habitaciones
    protected int numHab;
    // Numero baños 
    protected int numBan;
    
    public Vivienda(int id, int area, String direccion, int numHab, int numBan) {
        super(id, area, direccion);
        this.numHab = numHab;
        this.numBan = numBan;
    }

    @Override
    public String toString() {
        return "La vivienda con id del inmueble: " + id + ", tiene un área de " + area + "m2, la direccion del inmueble es: "
                + direccion + ", el precioVenta del inmueble es de " + precioVenta + "$, tiene " + numHab
                + " habitaciones, tiene " + numBan + " baños";
    }

}
