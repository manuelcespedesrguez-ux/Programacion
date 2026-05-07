package Vehiculos;

public class VehiculoAereo extends Vehiculo implements Reactor, Alas {
    
    private String tipo_vehiculo;

    public VehiculoAereo(int velocidad_actual, int velocidad_maxima, String tipo_vehiculo) {
        super(velocidad_actual, velocidad_maxima);
        this.tipo_vehiculo = tipo_vehiculo;
    }

    @Override
    public void acelerar(int incrementar) {
        velocidad_actual = Math.min(velocidad_actual + incrementar, velocidad_maxima);
    }

    @Override
    public void frenar(int decrementar) {
        velocidad_actual = Math.max(velocidad_actual - decrementar, 0);
    }

    @Override
    public void encender() {
        System.out.println("El reactor del " + tipo_vehiculo + " se ha encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El reactor del " + tipo_vehiculo + " se ha apagado.");
    }

    @Override
    public void bajarTrenAterrizaje() {
        System.out.println("El " + tipo_vehiculo + " ha desplegado el tren de aterrizaje.");
    }

    @Override
    public void subirTrenAterrizaje() {
        System.out.println("El " + tipo_vehiculo + " ha retraído el tren de aterrizaje.");
    }
}
