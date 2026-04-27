package Bucle;

import java.util.ArrayList;
import java.util.List;

public class Testeo2 {

    public static void main(String[] args) {
    
    List<Ciclista> ciclista = new ArrayList<>();
        LogicaCarrera logi = new LogicaCarrera();

        ciclista.add(new Velocista(24, "Anxo Contador", 3, 60));
        ciclista.add(new Velocista(32, "Sergio Pino", 5, 60));
        ciclista.add(new Escalador(16, "Manuel Indurain", 5.2, 43));
        ciclista.add(new Escalador(31, "Fermin Vos", 5.6, 47));
        ciclista.add(new ContraRelojista(45, "Héctor Burton", 120));
        ciclista.add(new ContraRelojista(55, "Álvaro Merckx", 120));

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