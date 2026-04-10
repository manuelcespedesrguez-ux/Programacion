package dos;

import java.util.Scanner;

public class Propuesto12 {
	
	double Patatas;
	double chocos;
	
	public Propuesto12(double P, double c) {
		this.Patatas = P;
		this.chocos = c;
	}

	public double getChocos() {
		return chocos;
	}

	public void setChocos(double chocos) {
		this.chocos = chocos;
	}

	public void setPatatas(double patatas) {
		Patatas = patatas;
	}

	public double getPatatas() {
		return Patatas;
	}
	
	public static int numClientes(double patatasKg, double chocosKg) {
		int cuentaClientes =0;
		
		do {
			patatasKg -= 1d;
			chocosKg -= 0.5d;
			cuentaClientes+=3;
		}while  (patatasKg >=1d && chocosKg >= 1/2d);
		return cuentaClientes;
	}
	
	public static int numeroDePatatasYChocos(double kilosPatatas, double kilosChocos) {
		int numDef = 0;
		if (kilosPatatas >= 1 && kilosChocos >= 0.5) {
			double numPP = kilosPatatas / 1;
			double numPC = kilosChocos / 0.5;
			if (numPP > numPC) {
				numDef = (int) numPC * 3;
			} else if (numPC > numPP) {
				numDef = (int) numPP * 3;
			} else if (numPP == numPC) {
				numDef = (int) numPP * 3;
			}
		}
		return numDef;
	}

	public static void main(String[] args) {

		double chocos = 0, patatas = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Número de kilos de patatas");
		patatas = sc.nextDouble();
		System.out.println("Número de kilos de chocos");
		chocos = sc.nextDouble();

		System.out.println("Con esta cantidad pueden comer " + numeroDePatatasYChocos(patatas, chocos) + " personas");

		sc.close();
	}
	
	public void addPatatas(double P) {
		this.Patatas+=P;
	}

	public void addchocos(double c) {
		this.chocos+=c;
	}
	
	public void showPatatas() {
		System.out.println("En el almacén tenemos "+this.Patatas+" Kilos de patatas");
	}
	
	public void showchocos() {
		System.out.println("En el almacén tenemos "+this.chocos+" Kilos de chocos");
	}
	
	public void existenciaAlmacen() {
		this.showPatatas();
		this.showchocos();
	}

}
