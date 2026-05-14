package SeleccionPanchi;

import java.util.Arrays;

public class EquipoFutbol {
    
    String nombre;
    String pais;
    Tecnico tecnico;
    Porteros portero;
    Defensas[] defensas;
    Mediocampista[] mediocampos;
    Delantero[] delanteros;

    public EquipoFutbol(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public EquipoFutbol(String nombre, String pais, Tecnico tecnico, Porteros portero, Defensas[] defensas, Mediocampista[] mediocampos,
            Delantero[] delanteros) {
        this(nombre, pais);
        this.tecnico = tecnico;
        this.portero = portero;
        this.defensas = defensas;
        this.mediocampos = mediocampos;
        this.delanteros = delanteros;
    }

    @Override
    public String toString() {
        return "EquipoFutbol [nombre=" + nombre + ", pais=" + pais + ", tecnico=" + tecnico + ", portero=" + portero
                + ", defensas=" + Arrays.toString(defensas) + ", mediocampos=" + Arrays.toString(mediocampos)
                + ", delanteros=" + Arrays.toString(delanteros) + "]";
    }

    

}
