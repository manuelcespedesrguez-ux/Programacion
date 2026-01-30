package ExamenRecProgramacion;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double ventas[] = new double[12];
        double costo[] = new double[12];

        for(int i = 0; i < 12; i++) {

            System.out.println("Dime el mes: "+(i+1));
            System.out.println("Ventas: ");
            ventas[i] = sc.nextDouble();
            System.out.println("Costos: ");
            costo[i] = sc.nextDouble();
        }

        double totalVenta = 0;
        double totalCosto = 0;

        double mesMayorVentas = 0;
        double mesMenorCosto = 0;

        double mesesBeneficio = 0;
        double totalMargen = 0;

        // Calcular datos

        for(int i = 0; i < 12; i++) {
            totalVenta += ventas[i];
            totalCosto += costo[i];
            
            if (ventas[i] > ventas[(int) mesMayorVentas]) {
                mesMayorVentas = i;
            }
            if (costo[i] < costo[(int) mesMenorCosto]) {
                mesMenorCosto = i;
            }
            if (ventas[i] > costo[i]) {
                mesesBeneficio = i;
            }
            if (ventas[i] != 0 ) {
                double sumaMargen = (ventas[i] - costo[i]) / ventas[i] * 100;
            }
        }

    }

}
