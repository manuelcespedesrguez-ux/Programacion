package Competicion1;

public class TestFutbol {

    public static void main(String[] args) {
        
        System.out.println("\n--- Probando Partido de Fútbol ---\n");

        PartidoFutbolLigaEsapnhola granDerbi = new PartidoFutbolLigaEsapnhola("Real Madrid", "FC Barcelona",2, 1);

        System.out.println(granDerbi.toString());

        System.out.println("La duración estándar de este partido es de: " + PartidoFutbol.duracion_partido_futbol + " minutos.\n");        
    }
}