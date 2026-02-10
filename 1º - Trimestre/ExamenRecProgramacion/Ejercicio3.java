package ExamenRecProgramacion;

public class Ejercicio3 {
    
    String numeroCuenta;
    String titular;
    long numero;

    enum tipoCuenta {
        CUENTA_AHORROS, CUENTA_CORRIENTE
    }

    tipoCuenta cuenta;
    double saldo;

    
    public Ejercicio3(String nC, String t, long num, tipoCuenta c){
        this.numeroCuenta = nC;
        this.titular = t;
        this.saldo = 0d;
        this.numero = num;
        this.cuenta = c;
    }

    @Override
    public String toString() {
        return "Ejercicio3 [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo + ", numero="
                + numero + ", cuenta=" + cuenta + "]";
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void getNumero(long numero){
        this.numero = numero;
    }

    public tipoCuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(tipoCuenta cuenta) {
        this.cuenta = cuenta;
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

    public void transferencia(Ejercicio3 otraCuenta, double valor) {
		if(valor-this.consultarSaldo()-valor>=0) {
			this.retirar(valor);
			otraCuenta.consignar(valor);
		}
		else
			System.out.println("No hay suficiente dinero para realizar la transferencia...");
	}
    
}
