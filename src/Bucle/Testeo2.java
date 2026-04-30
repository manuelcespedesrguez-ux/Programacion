package Bucle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Testeo2 {

    public static void main(String[] args) {
        LogicaCarrera logi = new LogicaCarrera();
        List<Equipo> listaEquipos = new ArrayList<>();

        // 1. CREACIÓN DE TRES EQUIPOS (Tres ciclistas de diferente tipo por equipo)
        Equipo eq1 = new Equipo("Movistar", "España");
        eq1.añadirCiclista(new Velocista(10, "Anxo Contador", 3, 60));
        eq1.añadirCiclista(new Escalador(11, "Manuel Indurain", 5.2, 43));
        eq1.añadirCiclista(new ContraRelojista(12, "Héctor Burton", 120));

        Equipo eq2 = new Equipo("Ineos", "Reino Unido");
        eq2.añadirCiclista(new Velocista(20, "Sergio Pino", 5, 60));
        eq2.añadirCiclista(new Escalador(21, "Fermin Vos", 5.6, 47));
        eq2.añadirCiclista(new ContraRelojista(22, "Álvaro Merckx", 120));

        Equipo eq3 = new Equipo("Jumbo-Visma", "Países Bajos");
        eq3.añadirCiclista(new Velocista(30, "Jonas Vingegaard", 4, 62));
        eq3.añadirCiclista(new Escalador(31, "Primoz Roglic", 5.8, 45));
        eq3.añadirCiclista(new ContraRelojista(32, "Wout van Aert", 115));

        listaEquipos.add(eq1);
        listaEquipos.add(eq2);
        listaEquipos.add(eq3);

        // --- EJECUCIÓN DE DOS ETAPAS ---
        for (int etapa = 1; etapa <= 2; etapa++) {
            System.out.println("\n==========================================");
            System.out.println("          RESULTADOS ETAPA " + etapa);
            System.out.println("==========================================\n");

            List<Ciclista> todosLosCiclistas = new ArrayList<>();

            // Cada ciclista corre la etapa
            for (Equipo eq : listaEquipos) {
                for (Ciclista c : eq.getListaCiclistas()) {
                    c.correrEtapa(3000, 5000);
                    todosLosCiclistas.add(c);
                }
                // Calculamos el tiempo del equipo tras la carrera de sus integrantes
                eq.calcularTiempo();
            }

            // A. Clasificación de Etapa por Ciclista
            logi.ordenarPorTiempo(todosLosCiclistas);
            System.out.println("\n--- Clasificación por ciclistas de la etapa " + etapa + " ---\n");
            for (Ciclista c : todosLosCiclistas) {
                System.out.println(c.getNombre() + " | Tiempo: " + c.getTiempo() + "s");
            }

            // B. Clasificación de Etapa por Equipo
            // Ordenamos temporalmente por el tiempo parcial de la etapa actual
            Collections.sort(listaEquipos, Comparator.comparingInt(Equipo::getTiempo));
            System.out.println("\n--- Clasificación por equipos de la etapa " + etapa + " ---\n");
            for (Equipo eq : listaEquipos) {
                System.out.println(eq.getNombre() + " | Tiempo Etapa: " + eq.getTiempo() + "s");
            }
            
            // Actualizamos la general individual
            logi.actualizarClasificacionGeneral(todosLosCiclistas);
        }

        // --- RESULTADOS FINALES (CLASIFICACIÓN GENERAL) ---
        mostrarResultadosFinales(listaEquipos);
    }

    private static void mostrarResultadosFinales(List<Equipo> listaEquipos) {
        System.out.println("\n==========================================");
        System.out.println("     CLASIFICACIÓN GENERAL FINAL");
        System.out.println("==========================================\n");

        // Ordenar equipos por tiempo acumulado total
        Collections.sort(listaEquipos, Comparator.comparingInt(Equipo::getTiempoAcumulado));

        int puesto = 1;
        for (Equipo eq : listaEquipos) {
            System.out.println(puesto + "º LUGAR:");
            eq.imprimir();
            System.out.println("------------------------------------------");
            puesto++;
        }
    }
}