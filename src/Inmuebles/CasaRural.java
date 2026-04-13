package Inmuebles;

public class CasaRural extends Casa{
    
    protected static double valorArea = 150000;

    // Distancia al centro de la ciudad
    protected int distCentro;

    // Altitud casa rural
    protected int altitud;

    public CasaRural(int id, int area, String direccion, int numHab, int numBan, int numPisos, int distCentro, int altitud) {
        super(id, area, direccion, numHab, numBan, numPisos);
        this.distCentro = distCentro;
        this.altitud = altitud;
    }

    protected double calcularPrecioVenta() {
        Inmueble.poblar();
        return precioVenta = area * Inmueble.VALOR_METRO_CUADRADO.get("Casa rural");
    }

    @Override
    public String toString() {
        return "La casa rural con id: " + id + ", tiene un area de  " + area + " m2, se encuentra en la direccion: "
                + direccion + ", su precio de venta es: " + precioVenta + "$, tiene " + numHab
                + " habitaciones, tiene " + numBan + " baños, tiene " + numPisos + " pisos, la distancia al centro de la ciudad es de " + distCentro
                + " km y se encuentra a una altitud de: " + altitud + " metros";
    }
}
