package Peaje;

public class Camion extends Vehiculo {

    static int valorPeajeEje = 150;
    int numeroEjes;

    public static int getValorPeajeEje() {
        return valorPeajeEje;
    }

    public static void setValorPeajeEje(int valorPeajeEje) {
        Camion.valorPeajeEje = valorPeajeEje;
    }

    Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    void imprimir() {
        System.out.println("El camión con matrícula " + placa + " ha pagado un peaje de " + (numeroEjes * valorPeajeEje) + " euros.");
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }


}
