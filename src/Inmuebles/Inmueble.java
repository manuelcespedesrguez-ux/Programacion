package Inmuebles;

import java.util.HashMap;
import java.util.Map;

public class Inmueble {
    
    public static final Map<String, Double> VALOR_METRO_CUADRADO = new HashMap<>();

    //Insertamos datos en el mapa
    public static void poblar() {
        VALOR_METRO_CUADRADO.put("Casa rural", 1500.0);
        VALOR_METRO_CUADRADO.put("Casa urbanizacion", 2500.0);
        VALOR_METRO_CUADRADO.put("Casa independiente", 3000.0);
        VALOR_METRO_CUADRADO.put("Apartaestudio", 1500.0);
        VALOR_METRO_CUADRADO.put("Apartamento familiar", 2000.0);
        VALOR_METRO_CUADRADO.put("Local comercial", 3000.0);
        VALOR_METRO_CUADRADO.put("Oficina", 3500.0);
    }
    // Atributos
    protected int id;
    protected int area;
    protected String direccion;
    protected double precioVenta = 0d;
    
    // Constructor
    public Inmueble(int id, int area, String direccion) {
        this.id = id;
        this.area = area;
        this.direccion = direccion;
    }

    protected double calcularPrecioVenta() {
        // return precioVenta = are * valor del MAP;
        return precioVenta;
    }

    @Override
    public String toString() {
        return "Inmueble: id del inmueble: " + id + ", area del inmueble: " + area + ", direccion del inmueble: "
                + direccion + ", precioVenta del inmueble: " + precioVenta + "]";
    }

}
