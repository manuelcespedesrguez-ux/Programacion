package dos;

public class Caja {

	double base;
	double anchura; 
	double altura;
	String tipo;
	
	public Caja(double base, double anchura, double altura) {
		super();
		this.base = base;
		this.anchura = anchura;
		this.altura = altura;
	}
	
	public Caja() {
		base=anchura=altura=0d;
	}
	
	public Caja(double longitud) {
		this.base = this.anchura = this.altura = longitud;
	}
	
	public Caja(double base, double anchura, double altura, String tipo) {
		
		this(base, anchura, altura);
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Caja [base=" + base + ", anchura=" + anchura + ", altura=" + altura + ", tipo=" + tipo + "]";
	}
	
	
	
}

