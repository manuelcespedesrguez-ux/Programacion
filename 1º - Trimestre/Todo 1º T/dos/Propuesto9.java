package dos;

public class Propuesto9 {

	private double kms;
	private double litros;
	private double vmed;
	private double pgas;
	
	
	public Propuesto9(double kms, double litros, double vmed, double pgas) {
		
		this.kms = kms;
		this.litros = litros;
		this.vmed = vmed;
		this.pgas = pgas;
		
	}
	
	public double getTiempo() {
	
		if (vmed == 0) 
			return 0;
		return kms/vmed;
		
	}
	
	public double consumoMedio() {
		if (kms == 0)
			return 0; 
		return (litros/kms)*100;
	}
	
	public double consumoEuros() {
		 return consumoMedio()*pgas;
	}

	
	
}
