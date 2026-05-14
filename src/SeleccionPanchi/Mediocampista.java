package SeleccionPanchi;

public class Mediocampista extends Jugador {
    
    private int asistencias;

    public Mediocampista(String nombre, String apellido, int edad, boolean esTitular, int asistencias) {
        super(nombre, apellido, edad, esTitular);
        this.asistencias = asistencias;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("El mediocampista realizó " + asistencias + " asistencias\n");
    }

}
