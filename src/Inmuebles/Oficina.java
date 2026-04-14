package Inmuebles;

public class Oficina extends Local {
    
    protected static double valorMetroCuadrado = 3500.0;

    protected boolean esPublica;

    public Oficina(int id, int area, String direccion, Tipo tipoLocal, boolean esPublica) {
        super(id, area, direccion, tipoLocal);
        this.esPublica = esPublica;
    }

    @Override
    protected double calcularPrecioVenta() {
        Inmueble.poblar();
        return precioVenta = area * Inmueble.VALOR_METRO_CUADRADO.get("oficina");
    }

    @Override
    public String toString() {
        return "Oficina: id del inmueble: " + id + ", area del inmueble: " + area + ", direccion del inmueble: "
                + direccion + ", precioVenta del inmueble: " + precioVenta + ", tipo de local: " + tipoLocal
                + ", es publica: " + esPublica;
    }

}
