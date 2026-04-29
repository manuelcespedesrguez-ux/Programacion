package Bucle;

import java.util.ArrayList;

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

}
