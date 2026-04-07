package src.Herencia;

public class CuentaCorriente extends Cuenta {
    
    public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		// TODO Auto-generated constructor stub
	}

	float sobregiro=0;


	public float getSobregiro() {
		return sobregiro;
	}

	public void setSobregiro(float sobregiro) {
		this.sobregiro = sobregiro;
	}
	

	@Override
	public String toString() {
		
		String todo = super.toString();
		return todo + "\nCuentaCorriente [sobregiro=" + sobregiro + "]";
	}

}
