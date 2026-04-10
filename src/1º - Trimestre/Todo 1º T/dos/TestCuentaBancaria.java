package dos;

import dos.CuentaBancaria.TipoCuenta;

public class TestCuentaBancaria {

	public static void main(String[] args) {

//		CuentaBancaria cuenta = new CuentaBancaria("Pedro", "Pérez", 123456789, TipoCuenta.CUENTA_AHORROS);
//
//		System.out.println(cuenta.toString());
//		cuenta.consignar(200000);
//		System.out.println(cuenta.toString());
//		cuenta.consignar(300000);
//		System.out.println(cuenta.toString());
//		cuenta.retirar(400000);
//		System.out.println(cuenta.toString());

		CuentaBancaria cuenta2 = new CuentaBancaria( 0.02f, "Ramón", "Cajal", 987654321, TipoCuenta.CUENTA_AHORROS);
		
            	System.out.println(cuenta2.toString());
				cuenta2.consignar(200000);
				System.out.println(cuenta2.toString());
				cuenta2.consignar(300000);
				System.out.println(cuenta2.toString());
				cuenta2.retirar(400000);
				double retiro=400000;
				cuenta2.retirar(retiro);
				System.out.println(cuenta2.toString());
				System.out.println("Cálculo del interés mensual...");
				cuenta2.calcularInteresMensual();
				System.out.println("Nuevo saldo es: "+ cuenta2.consultarSaldo());
				System.out.println(retiro);
	}
}
