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
        return "CasaIndependiente: id del inmueble: " + id + ", area del inmueble: " + area + ", direccion del inmueble: "
                + direccion + ", precioVenta del inmueble: " + precioVenta + ", numero de habitaciones: " + numHab
                + ", numero de baños: " + numBan + ", numero de pisos: " + numPisos;
    }

}
