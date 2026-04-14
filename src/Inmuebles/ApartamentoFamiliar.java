package Inmuebles;

public class ApartamentoFamiliar extends Apartamento {

	protected int valorComunidad;

	public ApartamentoFamiliar(int id, int area, String direccion, int numHab, int numBan, int valorComunidad) {
		super(id, area, direccion, numHab, numBan);
		this.valorComunidad = valorComunidad;
		// TODO Auto-generated constructor stub
	}

    @Override
	protected double calcularPrecioVenta() {
        Inmueble.poblar();
    	return precioVenta = area * Inmueble.VALOR_METRO_CUADRADO.get("apartamento familiar");
    }

	@Override
	public String toString() {
		return "ApartamentoFamiliar [valorComunidad=" + valorComunidad + ", numHab=" + numHab + ", numBan=" + numBan
				+ ", id=" + id + ", area=" + area + ", direccion=" + direccion + ", precioVenta=" + precioVenta + "]";
	}

}
