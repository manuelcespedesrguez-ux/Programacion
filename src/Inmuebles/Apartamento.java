package Inmuebles;

public class Apartamento extends Vivienda {

    public Apartamento(int id, int area, String direccion, int numHab, int numBan) {
        super(id, area, direccion, numHab, numBan);
    }

    @Override
    public String toString() {
        return "Apartamento: id del inmueble: " + id + ", area del inmueble: " + area + ", direccion del inmueble: "
                + direccion + ", precioVenta del inmueble: " + precioVenta + ", numero de habitaciones: " + numHab
                + ", numero de baños: " + numBan;
    }

}
