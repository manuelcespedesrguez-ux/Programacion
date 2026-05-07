package Competicion1;

public class TestFutbol {

    public static void main(String[] args) {
        
        System.out.println("--- Probando Partido de Fútbol ---");
        
        // Creamos una instancia de un partido de la Liga Española
        PartidoFutbolLigaEsapnhola granDerbi = new PartidoFutbolLigaEsapnhola("Real Madrid", "FC Barcelona",2, 1);

        // Mostramos el resultado usando el método toString() implementado
        System.out.println(granDerbi.toString());

        // Accedemos a la constante definida en la interfaz PartidoFutbol
        System.out.println("La duración estándar de este partido es de: " + PartidoFutbol.duracion_partido_futbol + " minutos.");

        System.out.println("\n--- Verificación de Interfaces ---");
        
        // Ejemplo de cómo se accedería a la constante de Basket
        System.out.println("Un partido de basket dura: " + PartidoBasket.duracion_partido_basket + " minutos.");
        
        /* * Nota técnica: 
         * Los métodos setGolesEquipoLocal y setGolesEquipoVisitante 
         * lanzarán una excepción si se llaman, ya que en la clase 
         * proporcionada están marcados como 'Unimplemented'.
         */
    }
}