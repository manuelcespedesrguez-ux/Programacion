package EjerciciosExamen;

public class Ejercicio2 {

	//Intente hacerlo pero no me sale 
	
	public double impor;
	public double cliente;
	public double dia;
	public double temporada;
	public double cupon;
	
	public Ejercicio2 (double impor, double cliente, double dia, double temporada, double cupon){
	
		this.impor = impor;
		this.cliente = cliente;
		this.dia = dia;
		this.temporada = temporada;
		this.cupon = cupon;
	}
	
	public double getDescuento(double descuento) {
		
		if(impor <= 100) {
			descuento = impor;
		}else if(impor >= 100.01 && impor <= 500) {
			descuento = impor * 0.05;
		}else if (impor >= 500.01) {
			descuento = impor * 0.1;
		}
		return descuento;
	}
	
	public double getCliente(double descuento) {
		
		double regular = 0;
		if(cliente == regular) {
			descuento = impor;
			return regular;
		}else if(cliente = vip) {
			descuento = impor * 0.05;
		}else if (cliente = nuevo) {
			descuento = impor *0.02;
		}
		return descuento;	
	}
	
	public double getDia(double descuento) {
		
		double lunes, martes, miercoles, jueves = 0;
		double viernes,sabado,domingo = 0;
		if(dia == lunes,martes,miercoles,jueves) {
			descuento = impor;
			return lunes;
		}else if(dia == viernes,sabado,domingo) {
			descuento = impor * 0.02;
		}
		return descuento;	
	}
	
	public double getTemporada(double descuento) {
		
		double normal = 0, rebaja = 0;
		if(temporada == normal) {
			descuento = impor;
			return normal;
		}else if(temporada == rebaja) {
			descuento = impor * 0.05;
		}
		return descuento;	
	}
	
	public double getCupon(double descuento) {
		
		double cuponazo = 0;
		if(cupon != cuponazo) {
			descuento = impor;
			return cupon;
		}else if(cupon == cuponazo) {
			descuento = impor * 0.05;
		}
		return descuento;	
	}
	
	public static void main(String[] args) {
		
		System.out.println("Introduce el precio");		
	}
}
