package Peaje;

import java.util.Vector;

public class Peaje {


	String nombre;
	String departamento;

	Vector<Vehiculo> vehiculos;
	int totalPeaje = 0;
	static int totalCamiones = 0;
	static int totalMotos = 0;
	static int totalCarros = 0;

	Peaje(String nombre, String departamento) {
		this.nombre = nombre;
		this.departamento = departamento;
		vehiculos = new Vector<Vehiculo>(); // Crea el vector de vehículos
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
		vehiculos.add(vehiculo);
	}

	public int calcularPeaje(Vehiculo vehiculo) {
		if (vehiculo instanceof Carro) { 

			totalCarros++;
			totalPeaje += Carro.valorPeaje; 
			return Carro.valorPeaje; 

		} else if (vehiculo instanceof Moto) { 
            
			totalMotos++;
			totalPeaje += Moto.valorPeaje;
											 
			return Moto.valorPeaje;
		} else if (vehiculo instanceof Camion) { 

			totalCamiones++; 

			Camion camion = (Camion) vehiculo;

			totalPeaje += camion.numeroEjes * Camion.valorPeajeEje;
			return camion.numeroEjes * Camion.valorPeajeEje;
		} else
			return -1; 
	}

	public void imprimir() {
		System.out.println("El peaje " + nombre + " ubicado en el departamento de " + departamento 
        + " ha recaudado un total de " + totalPeaje + " euros.");
		int totalVehiculos = totalCarros + totalMotos + totalCamiones;
        System.out.println("Por ese mismo peaje han pasado un total de " + totalVehiculos 
        + " vehículos, de los cuales " + totalCarros + " son coches, " + totalMotos + " son motos y " + totalCamiones + " son camiones.\n");
		
	}
}
