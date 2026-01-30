public class CuentaBancaria {

	float interes;
	String nombre;
	String apellidos;
	long numero;

	enum TipoCuenta {
		CUENTA_AHORROS, CUENTA_CORRIENTE
	}

	TipoCuenta cuenta;
	double saldo;

	public CuentaBancaria(float in, String n, String a, long num, TipoCuenta c) {
		this.interes=in;
		this.nombre = n;
		this.apellidos = a;
		this.numero = num;
		this.cuenta = c;
		this.saldo = 0d;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [nombre=" + nombre + ", apellidos=" + apellidos + ", numero=" + numero + ", cuenta="
				+ cuenta + ", saldo=" + saldo + " interes "+interes+"]";
	}

	public double consultarSaldo() {
		return this.saldo;
	}

	public void consignar(double valor) {
		this.saldo += valor;
	}

	public void retirar(double valor) {
		if (saldo - valor < 0)
			System.out.println("No puede retirar dicha cantidad...");
		else
			saldo -= valor;
	}
	
	public void calcularInteresMensual() {
		double cantidad = saldo * (interes / 12);
		saldo += interes;
	}

}
