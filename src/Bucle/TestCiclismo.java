package Bucle;

import java.util.ArrayList;
import java.util.List;

public class TestCiclismo {
    
    public static void main(String[] args) {
        
        List<Ciclista> ciclista = new ArrayList<>();
        LogicaCarrera logi = new LogicaCarrera();

        ciclista.add(new Ciclista(24, "Anxo Contador"));
        ciclista.add(new Ciclista(32, "Sergio Pino"));
        ciclista.add(new Ciclista(16, "Manuel Indurain"));
        ciclista.add(new Ciclista(31, "Fermin Vos"));
        ciclista.add(new Ciclista(45, "Héctor Burton"));
        ciclista.add(new Ciclista(55, "Álvaro Merckx"));

        // === ETAPA 1 ===
        System.out.println("--- RESULTADOS ETAPA 1 ---");
        for (Ciclista c : ciclista) {
            c.correrEtapa(3000, 5000);
        }

        // Clasificación de la Etapa 1
        logi.ordenarPorTiempo(ciclista);
        System.out.println("\n--- CLASIFICACIÓN DE LA ETAPA 1 (TIEMPO PARCIAL) ---");
        for (Ciclista c : ciclista) { 
            c.imprimir(); // <--- AQUÍ LLAMAMOS A TU MÉTODO
            System.out.println("-----------------------");
        }

        // Clasificación General Etapa 1
        logi.actualizarClasificacionGeneral(ciclista);
        System.out.println("\n--- CLASIFICACIÓN GENERAL TRAS ETAPA 1 ---");
        for (Ciclista c : ciclista) { 
            c.imprimir(); 
            System.out.println("-----------------------");
        }

        // === ETAPA 2 ===
        System.out.println("\n--- RESULTADOS ETAPA 2 ---");
        for (Ciclista c : ciclista) {
            int acumuladoPrevio = c.getTiempoAcumulado();
            c.correrEtapa(3000, 5000);
            c.setTiempoAcumulado(acumuladoPrevio + c.getTiempo());
        }

        // Clasificación de la Etapa 2
        logi.ordenarPorTiempo(ciclista);
        System.out.println("\n--- CLASIFICACIÓN DE LA ETAPA 2 (TIEMPO PARCIAL) ---");
        for (Ciclista c : ciclista) { 
            c.imprimir(); 
            System.out.println("-----------------------");
        }

        // Clasificación General Etapa 2
        logi.actualizarClasificacionGeneral(ciclista);
        System.out.println("\n--- CLASIFICACIÓN GENERAL FINAL ---");
        for (Ciclista c : ciclista) { 
            c.imprimir(); 
            System.out.println("-----------------------");
        }
    }

}


