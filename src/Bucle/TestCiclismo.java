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

        // Primera etapa
        System.out.println("--- RESULTADOS ETAPA 1 ---");
        for (Ciclista c : ciclista) {
            c.correrEtapa(3000, 5000);
        }

        logi.ordenarPorTiempo(ciclista);
        System.out.println("\n--- Clasificación etapa 1 ---\n");
        for (Ciclista c : ciclista) { 
            c.imprimir(); 
            System.out.println("-----------------------");
        }

        logi.actualizarClasificacionGeneral(ciclista);
        System.out.println("\n--- Clasificación general etapa 1 ---\n");
        for (Ciclista c : ciclista) { 
            c.imprimir(); 
            System.out.println("-----------------------");
        }

        // Etapa nueva
        System.out.println("\n--- Resultados etapa 2 ---\n");
        for (Ciclista c : ciclista) {
            int acumuladoPrevio = c.getTiempoAcumulado();
            c.correrEtapa(3000, 5000);
            c.setTiempoAcumulado(acumuladoPrevio + c.getTiempo());
        }

        logi.ordenarPorTiempo(ciclista);
        System.out.println("\n--- Clasificación etapa 2 ---\n");
        for (Ciclista c : ciclista) { 
            c.imprimir(); 
            System.out.println("-----------------------");
        }

        // Clasificación General Etapa 2
        logi.actualizarClasificacionGeneral(ciclista);
        System.out.println("\n--- Clasificación general después de la 2º etapa ---\n");
        for (Ciclista c : ciclista) { 
            c.imprimir(); 
            System.out.println("-----------------------");
        }
    }

}


