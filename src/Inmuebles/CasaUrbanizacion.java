package Inmuebles;

public class CasaUrbanizacion extends Casa {
    
    protected static double valorMetroCuadrado = 2500.0;
    protected int valorComunidad;
    protected boolean tienePiscina;
    protected boolean tieneCanchas;

    public CasaUrbanizacion(int id, int area, String direccion, int numHab, int numBan, int numPisos, int valorComunidad, boolean tienePiscina, boolean tieneCanchas) {
        super(id, area, direccion, numHab, numBan, numPisos);
        this.valorComunidad = valorComunidad;
        this.tienePiscina = tienePiscina;
        this.tieneCanchas = tieneCanchas;
    }

    protected double calcularPrecioVenta() {
        Inmueble.poblar();
        return precioVenta = area * Inmueble.VALOR_METRO_CUADRADO.get("Casa urbanizacion");
    }

    void imprimir() {
        System.out.println("La casa en urbanizacion con id: " + id + ", tiene un area de  " + area + " m2, se encuentra en la direccion: "
                + direccion + ", su precio de venta es: " + precioVenta + "$, tiene " + numHab
                + " habitaciones, tiene " + numBan + " baños y tiene " + numPisos + " pisos, el valor de la comunidad es: " 
                + valorComunidad + "$, tiene piscina: " + tienePiscina + ", tiene canchas: " + tieneCanchas);
        
        System.out.println("El precio de la comunidad es: " + valorComunidad + "$");
        System.out.println("¿Tiene piscina? " + tienePiscina);
        System.out.println("¿Tiene canchas? " + tieneCanchas);
    }

}
