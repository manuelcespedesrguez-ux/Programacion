package Bucle;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
    
    private String nombre;
    private String pais;
    private int tiempo = 0;
    private int tiempoAcumulado = 0;
    ArrayList<Ciclista> listaCiclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        tiempo = 0;
        listaCiclistas = new ArrayList<Ciclista>();
    }
    
    public ArrayList<Ciclista> getListaCiclistas() {
        return listaCiclistas;
    }

    public void setListaCiclistas(ArrayList<Ciclista> listaCiclistas) {
        this.listaCiclistas = listaCiclistas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    void añadirCiclista(Ciclista c){
        listaCiclistas.add(c);
    }

    public void listarEquipo() {
            for (int i = 0; i < listaCiclistas.size(); i++) {
                Ciclista c = (Ciclista) listaCiclistas.get(i);
                System.out.println(c.getNombre() + " - " + c.getdorsal());
            }
    }

    void buscarCiclista() {
        Scanner sc = new Scanner(System.in);
        String nombreCiclista  = sc.nextLine();
        boolean esta = false;
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.get(i);
            if (c.getNombre().equals(nombreCiclista)) {
                System.out.println(c.getNombre() + " - " + c.getdorsal());
                esta = true;
            }
        }
        if (!esta) {
            System.out.println("No está en el equipo");
        }
        sc.close();
    }

    public void calcularTiempo() {
        int sumaParcial = 0;
        int sumaAcumulada = 0;
        for (Ciclista c : listaCiclistas) {
            sumaParcial += c.getTiempo();
            sumaAcumulada += c.getTiempoAcumulado();
        }
        this.tiempo = sumaParcial;
        this.tiempoAcumulado = sumaAcumulada;
    }

    protected void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("País del equipo = " + pais);
        System.out.println("Tiempo Parcial del equipo = " + tiempo + " segundos");
        System.out.println("Tiempo Acumulado del equipo = " + tiempoAcumulado + " segundos");
        
        // Conversión a formato hh:mm:ss para el equipo
        int h = tiempoAcumulado / 3600;
        int m = (tiempoAcumulado % 3600) / 60;
        int s = tiempoAcumulado % 60;
        System.out.printf("Tiempo Total = %02d:%02d:%02d%n", h, m, s);
    }
}

