package Herencia;

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
	public void retirar(float cantidad) {

		float sobrete = this.saldo - cantidad;
		/*
		* Si la cantidad a retirar no supera el saldo, queda como sobregiro
		*/
		this.numeroRetiros++;
		if(sobrete >= 0) {
			//normal
			this.saldo -= cantidad;
		} else {
			this.sobregiro = -sobrete;
			this.saldo = 0;
			System.out.println("La cantidad a retirar excede el saldo actual, dicho exceso quedará como un sobregiro: "+this.sobregiro);
		}

	}

	// Retoques a consignar
	@Override
	public void consignar(float cantidad) {
		if (sobregiro > 0) {
			if (cantidad <= sobregiro) {
				// El dinero solo sirve para reducir la deuda
				sobregiro -= cantidad;
				numeroConsignaciones++; // Como no llamamos a super, incrementamos aquí
			} else {
				// El dinero sobra: primero matamos la deuda
				float sobra = cantidad - sobregiro;
				sobregiro = 0;
				// El resto se consigna usando la lógica normal de la cuenta padre
				super.consignar(sobra);
			}
		} else {
			// Si no hay deuda, usamos directamente el método del padre
			super.consignar(cantidad);
		}
	}

	@Override
	public String toString() {
		
		String todo = super.toString();
		return todo + "\nCuentaCorriente [sobregiro=" + sobregiro + "]";
	}

}
