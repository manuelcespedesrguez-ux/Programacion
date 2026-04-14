package Inmuebles;

public class Casa extends Vivienda {
    
    protected int numPisos;

    public Casa(int id, int area, String direccion, int numHab, int numBan, int numPisos) {
        super(id, area, direccion, numHab, numBan);
        this.numPisos = numPisos;
    }

    @Override
    public String toString() {
        return "La casa con id " + id + ", tiene un area de " + area + "m2, el inmueble se encuentra ubicado en "
                + direccion + ", su precio de venta es de " + precioVenta + ", tiene " + numHab + " habitaciones , tiene " + numBan + " baños, y " + numPisos + " pisos";
    }
}
