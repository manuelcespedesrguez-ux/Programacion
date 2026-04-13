package Inmuebles;

public class Casa extends Vivienda {
    
    protected int numPisos;

    public Casa(int id, int area, String direccion, int numHab, int numBan, int numPisos) {
        super(id, area, direccion, numHab, numBan);
        this.numPisos = numPisos;
    }

    @Override
    public String toString() {
        return "Casa: id del inmueble: " + id + ", area del inmueble: " + area + ", direccion del inmueble: "
                + direccion + ", precioVenta del inmueble: " + precioVenta + ", numero de habitaciones: " + numHab
                + ", numero de baños: " + numBan + ", numero de pisos: " + numPisos;
    }
}
