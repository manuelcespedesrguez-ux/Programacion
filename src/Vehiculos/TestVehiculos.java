package Vehiculos;

public class TestVehiculos {

    public static void main(String[] args) {
        
        Vehiculoterrestre Camion = new Vehiculoterrestre(80, 100, 6, "Civil");
        VehiculoAcuatico MotoAgua = new VehiculoAcuatico(80, 120, "mar", 2);
        VehiculoAereo Avion = new VehiculoAereo(1800, 2400, "Caza");

        System.out.println("El camión arranca y acelera...");
        Camion.acelerar(30);
        Camion.calcularRevolucionesMotor(5, 10);
        Camion.imprimir();
        System.out.println("El camión frena porque hay atasco...");
        Camion.frenar(20);
        Camion.imprimir();

        System.out.println("\n------------------------------------------------------------");
        System.out.println("La moto de agua arranca y acelera...");
        MotoAgua.acelerar(30);
        MotoAgua.imprimir();
        System.out.println("La moto de agua frena porque hay una tormenta...");
        MotoAgua.frenar(50);
        MotoAgua.imprimir();
        System.out.println("Los guardacostas le recomiendan a la moto de agua que regrese y no salga");
        MotoAgua.recomendarVelocidad(83);

        System.out.println("\n------------------------------------------------------------");
        Avion.encender();
        Avion.acelerar(1800);
        Avion.imprimir();
        System.out.println("El avión vuelve a la base tras capturar a Maduro, comeinza a frenar y baja el tren de aterrizaje...");
        Avion.frenar(1800);
        Avion.bajarTrenAterrizaje();
        Avion.imprimir();
        System.out.println("El avión apaga el reactor y se estaciona en el hangar...");
        Avion.apagar();



    }

}
