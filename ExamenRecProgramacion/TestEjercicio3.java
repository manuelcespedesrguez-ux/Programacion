package ExamenRecProgramacion;

import ExamenRecProgramacion.Ejercicio3;
import ExamenRecProgramacion.Ejercicio3.tipoCuenta;

public class TestEjercicio3 {
    
    public static void main(String[] args) {
        
        Ejercicio3 cuenta = new Ejercicio3("0.02f", "Pedro", 1542695, tipoCuenta.CUENTA_AHORROS);

		System.out.println(cuenta.toString());
		cuenta.consignar(200000);
		System.out.println(cuenta.toString());
		cuenta.consignar(400000);
		System.out.println(cuenta.toString());
		cuenta.retirar(50000);
		System.out.println(cuenta.toString());
		cuenta.retirar(50000);
		double retiro = 500000;
		cuenta.retirar(retiro);
		System.out.println(cuenta.toString());
		System.out.println("Nuevo saldo es: " + cuenta.consultarSaldo());
		System.out.println("Retiro: "+retiro);
    }

}
