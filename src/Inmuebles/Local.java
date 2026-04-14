package Inmuebles;

public class Local extends Inmueble {

    enum Tipo {
        INTERNO,
        CALLE
    };

    protected Tipo tipoLocal;

    public Local(int id, int area, String direccion, Tipo tipoLocal) {
        super(id, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    @Override
    public String toString() {
        return "Local: id del inmueble: " + id + ", area del inmueble: " + area + ", direccion del inmueble: "
                + direccion + ", precioVenta del inmueble: " + precioVenta + ", tipo de local: " + tipoLocal;
    }

}
