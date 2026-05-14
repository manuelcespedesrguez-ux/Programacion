package SeleccionPanchi;

public class Porteros extends Jugador {
    
    private int golesrecibidos;

    public Porteros(String nombre, String apellido, int edad, boolean titular, int golesrecibidos) {
        super(nombre, apellido, edad, titular);
        this.golesrecibidos = golesrecibidos;
    }

    public int getGolesrecibidos() {
        return golesrecibidos;
    }

    public void setGolesrecibidos(int golesrecibidos) {
        this.golesrecibidos = golesrecibidos;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("El portero consiguió parar " + golesrecibidos + " goles\n");
    }
}
