package Peaje;

public class Moto extends Vehiculo {

    static int valorPeaje = 50;

    public static int getValorPeaje() {
        return valorPeaje;
    }

    public static void setValorPeaje(int valorPeaje) {
        Moto.valorPeaje = valorPeaje;
    }

    Moto(String placa) {
        super(placa);
    }

    void imprimir() {
        System.out.println("La moto con matrícula " + placa + " ha pagado un peaje de " + valorPeaje + " euros.");
    }
    
}
