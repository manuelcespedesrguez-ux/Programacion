package Inmuebles;

import java.util.HashMap;
import java.util.Map;

public class Inmueble {
    
    public static final Map<String, Double> VALOR_METRO_CUADRADO = new HashMap<>();

    //Insertamos datos en el mapa
    public static void poblar() {
        VALOR_METRO_CUADRADO.put("Casa rural", 1500000.0);
        VALOR_METRO_CUADRADO.put("Casa en conjunto cerrado", 2500000.0);
        VALOR_METRO_CUADRADO.put("Casa independiente", 3000000.0);
        VALOR_METRO_CUADRADO.put("Apartaestudio", 1500000.0);
        VALOR_METRO_CUADRADO.put("Apartamento familiar", 2000000.0);
        VALOR_METRO_CUADRADO.put("Local comercial", 3000000.0);
        VALOR_METRO_CUADRADO.put("Oficina", 3500000.0);
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

    protected double calcularPrecioVenta(double valorAreaUnitario) {
        return precioVenta = area * valorAreaUnitario;
    }

    @Override
    public String toString() {
        return "Inmueble: id del inmueble: " + id + ", area del inmueble: " + area + ", direccion del inmueble: "
                + direccion + ", precioVenta del inmueble: " + precioVenta + "]";
    }

}
