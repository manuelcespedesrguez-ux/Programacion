package Inmuebles;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Testeo2 {
    
    public static void main(String[] args) {
        
        System.out.println("Poblamos el mapa de precios unitarios");
        Inmueble.poblar();

        for (Map.Entry<String, Double> entrada : Inmueble.VALOR_METRO_CUADRADO.entrySet()) {
            String clave = entrada.getKey();
            Double valor = entrada.getValue();
            System.out.println("Clave: " + clave + " => Valor: " + valor);
        }

        List<Inmueble> lares = new ArrayList<Inmueble>();

        // Creamos una casa rural 
        CasaRural pitufo = new CasaRural(1121, 55, "Petelos 11", 5, 2, 3, 3, 157);
        lares.add(pitufo);
        // Creamos una casa en urbanizacion
        CasaUrbanizacion caseto = new CasaUrbanizacion(2332, 140, "Valencia 12", 5, 3, 2, 140, true, false);
        lares.add(caseto);
        // Creamos una casa independiente
        CasaIndependiente ponsa = new CasaIndependiente(5543, 100, "López Mora 19", 6, 3, 1);
        lares.add(ponsa);
        // Creamos un Apartamento familiar
        ApartamentoFamiliar apafam = new ApartamentoFamiliar(7788, 80, "Pintor Sorolla 22", 4, 2, 1);
        lares.add(apafam);
        // Creamos un apartaestudio
        ApartaEstudio ipe = new ApartaEstudio(9988, 40, "Pintor Sorolla 22", 1, 1);
        lares.add(ipe);
        // Creamos un local 
        LocalComercial local = new LocalComercial(1122, 200, "Pintor Sorolla 39", Local.Tipo.CALLE, "Centro Comercial Gran Vía");
        lares.add(local);     
        // Creamos una oficina
        Oficina ofi = new Oficina(3344, 150, "Pintor Sorolla 39", Local.Tipo.CALLE, true);
        lares.add(ofi);  

        double valorTotal = 0d;

        // Calcular el PVP de todos
        for (Inmueble inmo : lares) {
            valorTotal += inmo.calcularPrecioVenta();
        }

        // Imprimir todos
        for (Inmueble inmo : lares) {
            System.out.println(inmo);
        }

        System.out.println("El valor total de los inmuebles es: " + valorTotal + "$");
    }

}
