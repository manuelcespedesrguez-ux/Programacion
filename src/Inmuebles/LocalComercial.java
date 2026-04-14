package Inmuebles;

public class LocalComercial extends Local {
    
    protected static double valorMetroCuadrado = 3000.0;
    protected String centroComercial;

    public LocalComercial(int id, int area, String direccion, Tipo tipoLocal, String centroComercial) {
        super(id, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }

    @Override
    public String toString() {
        return "LocalComercial: id del inmueble: " + id + ", area del inmueble: " + area + ", direccion del inmueble: "
                + direccion + ", precioVenta del inmueble: " + precioVenta + ", tipo de local: " + tipoLocal
                + ", centro comercial: " + centroComercial;
    }



}
