package Peaje;

import java.util.ArrayList;
import java.util.List;

public class Peaje {


	String nombre;
	String departamento;

	List<Vehiculo> veoculos = new ArrayList<>();

	int totalPeaje = 0;
	static int totalCamiones = 0;
	static int totalMotos = 0;
	static int totalCarros = 0;

	Peaje(String nombre, String departamento) {
		this.nombre = nombre;
		this.departamento = departamento;
		// Cambio el vector por un ArrayList
		veoculos = new ArrayList<Vehiculo>(); 
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDepartamento() {
		return departamento;
	}

	private void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void anadirVehiculo(Vehiculo vehiculo) {
		veoculos.add(vehiculo);
	}

	public int calcularPeaje(Vehiculo vehiculo) {
		int totalPagar = 0;

		if (vehiculo instanceof Carro) { 

			totalCarros++;
			totalPagar += Carro.valorPeaje; 

		} else if (vehiculo instanceof Moto) { 
            
			totalMotos++;
			totalPagar += Moto.valorPeaje;
											 
			return Moto.valorPeaje;
		} else if (vehiculo instanceof Camion) { 

			totalCamiones++; 
			Camion camion = (Camion) vehiculo;
			totalPagar = camion.getNumeroEjes() * Camion.getValorPeajeEje();
			
		} if (totalPagar > 0 ) {
			vehiculo.peajeAcumulado += totalPagar;
			totalPeaje += totalPagar;
			return totalPagar;

		}else
			return -1; 
	}

	public void imprimir() {
		System.out.println("El peaje " + nombre + " ubicado en el departamento de " + departamento 
        + " ha recaudado un total de " + totalPeaje + " euros.");
		int totalVehiculos = totalCarros + totalMotos + totalCamiones;
        System.out.println("Por ese mismo peaje han pasado un total de " + totalVehiculos 
        + " vehículos, de los cuales " + totalCarros + " son coches, " + totalMotos + " son motos y " + totalCamiones + " son camiones.\n");
		
	}

	public void imprimirMTotal(Persona pepe) {
		System.out.println("\nInforme sobre lo pagado en el peaje de " + nombre + " por la persona " + pepe.getNombre() + " " + pepe.getApellido());
		int totalPagado = 0;

		for ( Vehiculo veoculito : pepe.getvehiculosEnPropiedad()) {
			totalPagado += veoculito.peajeAcumulado;
			System.out.println("Vehiculo con placa " + veoculito.placa + " ha pagado un total de " + veoculito.peajeAcumulado);
		}

		System.out.println("En total, " + pepe.getNombre() + " " + pepe.getApellido() + " ha pagado un total de " + totalPagado + " euros en el peaje de " + nombre + ".\n");
	}
}
