package Inmuebles;

public class Testeo1 {
    
    public static void main(String[] args) {
        
        System.out.println("Poblamos el mapa de precios unitarios");

        // Creamos una casa rural
        CasaRural pitufo = new CasaRural(1121, 55, "Petelos 11", 5, 2, 3, 3, 157);
        pitufo.calcularPrecioVenta();
        System.out.println(pitufo);

    }

}
