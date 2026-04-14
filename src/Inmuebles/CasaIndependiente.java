package Inmuebles;

public class CasaIndependiente extends CasaUrbana {
    
    public static double valorMetroCuadrado = 3000.0;
    
  public CasaIndependiente(int id, int area, String direccion, int numHab, int numBan, int numPisos) {
        super(id, area, direccion, numHab, numBan, numPisos);
    }

    @Override
    protected double calcularPrecioVenta() {
        Inmueble.poblar();
        return precioVenta = area * Inmueble.VALOR_METRO_CUADRADO.get("Casa independiente");
    }

    @Override
    public String toString() {
        return "La casa independiente con id " + id + ", tiene un area de " + area + "m2, el inmueble se encuentra ubicado en "
                + direccion + ", su precio de venta es de " + precioVenta + ", tiene " + numHab + " habitaciones , tiene " + numBan + " baños, y " + numPisos + " pisos";
    }

}
