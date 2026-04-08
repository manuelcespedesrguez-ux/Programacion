package Herencia;

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

    // Retirar
    @Override
    public void retirar(float cantidad) {
        if (this.isActiva()) 
            super.retirar(cantidad);
         else 
            System.out.println("La cuenta de ahorros no está activa. No se pueden realizar retiros.");
    }

    // Consignar
    @Override
    public void consignar(float cantidad) {
        if (this.isActiva()) 
            super.consignar(cantidad);
        else
            System.out.println("La cuenta de ahorro no está activa en este momento");
    }

    // Extracto mensual
    @Override
    public void extractoMensual() {
        if (numeroRetiros > 4) 
            this.comisionMensual =+ 1000f * (numeroRetiros - 4);
            super.extractoMensual();
    }
    
    @Override
    public String toString() {
        return "CuentaAhorro [activa=" + activa + "]";
    }

}
