package dos;

public class Pedido {

	public void calcularPrecio(String primerPlato, double costoPrimerPlato, String bebida, double costoBebida) {
		
		double total = costoPrimerPlato + costoBebida;
		System.out.println("El precio de " + primerPlato + " y " + bebida + " es = $ " + total);		
	} 
	
	
	public void calcularPedido(String primerPlato, double costoPrimerPlato, String segundoPlato, double costoSegundoPlato, String bebida, double costoBebida) {
		
		double total = costoPrimerPlato + costoSegundoPlato + costoBebida;
        System.out.println("El precio de " + primerPlato + ", el " + segundoPlato + " y " + bebida + " es = $ " + total);		
}
	
    public void calcularPrecio(String primerPlato, double costoPrimerPlato, String segundoPlato, double costoSegundoPlato, String Postre, double costoPostre, String bebida, double costoBebida) {
		
		double total = costoPrimerPlato + costoSegundoPlato + costoPostre + costoBebida;
		System.out.println("El precio de " + primerPlato + ", el " + segundoPlato + ", la " + Postre + " y " + bebida + " es = $ " + total);		
	} 
	
}