package dos;

import dos.CuentaBancariaMejorada.TipoCuenta;

public class TestCuentaBancariaMejorada {

	public static void main(String[] args) {

		CuentaBancariaMejorada cuenta = new CuentaBancariaMejorada(0.02f, "Pedro", "Pérez", 123456789,
				TipoCuenta.CUENTA_AHORROS);

		System.out.println(cuenta.toString());
		cuenta.consignar(200000);
		System.out.println(cuenta.toString());
		cuenta.consignar(400000);
		System.out.println(cuenta.toString());
		cuenta.retirar(500000);
		System.out.println(cuenta.toString());
		cuenta.retirar(500000);
		double retiro = 500000;
		cuenta.retirar(retiro);
		System.out.println(cuenta.toString());
		System.out.println("Cálculo del interés mensual...");
		cuenta.calcularInteresMensual();
		System.out.println("Nuevo saldo es: " + cuenta.consultarSaldo());
		System.out.println(retiro);

		CuentaBancariaMejorada cuenta2 = new CuentaBancariaMejorada(0.02f, "Ramón", "Cajal", 987654321,
				TipoCuenta.CUENTA_AHORROS);

		System.out.println(cuenta2.toString());
		cuenta2.consignar(200000);
		System.out.println(cuenta2.toString());
		cuenta2.consignar(300000);
		System.out.println(cuenta2.toString());
		cuenta2.retirar(400000);
		double retiro2 = 400000;
		cuenta2.retirar(retiro2);
		System.out.println(cuenta2.toString());
		System.out.println("Cálculo del interés mensual...");
		cuenta2.calcularInteresMensual();
		System.out.println("Nuevo saldo es: " + cuenta2.consultarSaldo());
		System.out.println(retiro);

		CuentaBancariaMejorada otra = new CuentaBancariaMejorada(0, "Damián", "Rodríguez", 546987321,
				TipoCuenta.CUENTA_CORRIENTE);
		System.out.println(otra.toString());
		System.out.println("Compara: " + cuenta2.compararSaldos(otra));
		System.out.println("Transfiere 10000 de cuenta2 a otra: ");
		cuenta2.transferencia(otra, 10000);
		System.out.println(cuenta2.toString());
		System.out.println(otra.toString());
	}
}
