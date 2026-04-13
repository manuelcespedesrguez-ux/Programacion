package Inmuebles;

public class CasaUrbana extends Casa {
    
    public CasaUrbana(int id, int area, String direccion, int numHab, int numBan, int numPisos) {
        super(id, area, direccion, numHab, numBan, numPisos);
    }

    void imprimir() {
        System.out.println("La casa urbana con id: " + id + ", tiene un area de  " + area + " m2, se encuentra en la direccion: "
                + direccion + ", su precio de venta es: " + precioVenta + "$, tiene " + numHab
                + " habitaciones, tiene " + numBan + " baños y tiene " + numPisos + " pisos");
    }

}
