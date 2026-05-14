package SeleccionPanchi;

public class Delantero extends Jugador {
    
    private int goles;

    public Delantero(String nombre, String apellido, int edad, boolean esTitular, int goles) {
        super(nombre, apellido, edad, esTitular);
        this.goles = goles;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("El delantero metió " + goles + " goles.\n");
    }

}
