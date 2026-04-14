package Inmuebles;

public class ApartaEstudio extends Apartamento {

    protected static double valorMetroCuadrado = 1500.0;

    public ApartaEstudio(int id, int area, String direccion, int numHab, int numBan) {
        super(id, area, direccion, numHab, numBan);
    }

    @Override
    protected double calcularPrecioVenta() {
        Inmueble.poblar();
    	return precioVenta = area * Inmueble.VALOR_METRO_CUADRADO.get("apartaestudio");
    }

    @Override
    public String toString() {
        return "ApartaEstudio [numHab=" + numHab + ", numBan=" + numBan + ", id=" + id + ", area=" + area
                + ", direccion=" + direccion + ", precioVenta=" + precioVenta + "]";
    }   



}
