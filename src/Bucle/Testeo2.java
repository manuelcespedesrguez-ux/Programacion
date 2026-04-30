package Bucle;

import java.util.List;

public class Testeo2 {

    public static void main(String[] args) {
        
        // 1. Inicialización de Logística y Equipo
        LogicaCarrera logi = new LogicaCarrera();
        Equipo equipoSky = new Equipo("Team Sky", "Gran Bretaña");

        // 2. Creación de ciclistas y adición al equipo
        Velocista v1 = new Velocista(24, "Anxo Contador", 3, 60);
        Velocista v2 = new Velocista(32, "Sergio Pino", 5, 60);
        Escalador e1 = new Escalador(16, "Manuel Indurain", 5.2, 43);
        Escalador e2 = new Escalador(31, "Fermin Vos", 5.6, 47);
        ContraRelojista c1 = new ContraRelojista(45, "Héctor Burton", 120);
        ContraRelojista c2 = new ContraRelojista(55, "Álvaro Merckx", 120);

        equipoSky.añadirCiclista(v1);
        equipoSky.añadirCiclista(v2);
        equipoSky.añadirCiclista(e1);
        equipoSky.añadirCiclista(e2);
        equipoSky.añadirCiclista(c1);
        equipoSky.añadirCiclista(c2);

        // Obtenemos la lista para las operaciones de clasificación
        List<Ciclista> ciclistas = equipoSky.getListaCiclistas();

        // --- PRIMERA ETAPA ---
        System.out.println("--- RESULTADOS ETAPA 1 ---");
        for (Ciclista c : ciclistas) {
            c.correrEtapa(3000, 5000);
        }

        logi.ordenarPorTiempo(ciclistas);
        logi.actualizarClasificacionGeneral(ciclistas);

        // --- ETAPA 2 ---
        System.out.println("\n--- RESULTADOS ETAPA 2 ---\n");
        for (Ciclista c : ciclistas) {
            c.correrEtapa(3000, 5000);
        }

        // --- PROCESAMIENTO FINAL ---
        logi.ordenarPorTiempo(ciclistas);
        logi.actualizarClasificacionGeneral(ciclistas);
        
        // Calculamos los tiempos globales del equipo tras las etapas
        equipoSky.calcularTiempo();

        // --- SALIDA DE DATOS ---
        System.out.println("\n==========================================");
        System.out.println("       CLASIFICACIÓN GENERAL FINAL");
        System.out.println("==========================================\n");

        int puesto = 1;
        for (Ciclista c : ciclistas) { 
            System.out.println(puesto + "º PUESTO:");
            c.imprimir(); // Asegúrate de haber actualizado el imprimir con (hh:mm:ss)
            System.out.println("------------------------------------------");
            puesto++;
        }

        System.out.println("\n--- RESUMEN DEL EQUIPO ---");
        equipoSky.imprimir();
        System.out.println("Integrantes del equipo:");
        equipoSky.listarEquipo();
    }
}