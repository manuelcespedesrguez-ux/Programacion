package src.Herencia;

public class CuentaAhorro extends Cuenta {
    
    public CuentaAhorro(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		// TODO Auto-generated constructor stub
		this.activa= this.isActiva();
	}

    /*	posee un atributo para determinar si la cuenta de ahorros está activa
     *  (tipo boolean). Si el saldo es menor a $10000, la cuenta está inactiva, 
    *  en caso contrario se considera activa. 
    */
	boolean activa;

    // Este método es bastante similar a un método Get
    public boolean isActiva() {
		if(this.getSaldo()>10000)
			return true;
		else 
			return false;
	}

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    @Override
    public String toString() {
        return "CuentaAhorro [activa=" + activa + "]";
    }

}
