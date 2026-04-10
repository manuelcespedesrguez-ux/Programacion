package dos;

public class Automoviil {

	String marca = null;		
	int modelo = 0000;		
	double motorVol = 0D;	
	int numPuertas = 0;		
	int numAsientos = 0;	
	double vMax = 0D;		
	double vActual = 0D;		
	
	boolean automatico;
	
	enum combustibleTipo{
		GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
	} combustibleTipo combT;
	
	enum autoTipo{
		CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
	} autoTipo autoT;
	
	enum color{
		BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
	} color col;

	//constructor
	public Automoviil(String marca, int modelo, double motorVol, int numPuertas, int numAsientos, double vMax,
			double vActual, combustibleTipo combT, autoTipo autoT, color color, boolean automatico) {
		this.marca = marca;
		this.modelo = modelo;
		this.motorVol = motorVol;
		this.numPuertas = numPuertas;
		this.numAsientos = numAsientos;
		this.vMax = vMax;
		this.vActual = vActual;
		this.combT = combT;
		this.autoT = autoT;
		this.col = color;
		this.automatico = automatico;
	} 

	//getters + setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public double getMotorVol() {
		return motorVol;
	}

	public void setMotorVol(double motorVol) {
		this.motorVol = motorVol;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	public double getvMax() {
		return vMax;
	}

	public void setvMax(double vMax) {
		this.vMax = vMax;
	}

	public double getvActual() {
		return vActual;
	}

	public void setvActual(double vActual) {
		this.vActual = vActual;
	}

	public combustibleTipo getCombT() {
		return combT;
	}

	public void setCombT(combustibleTipo combT) {
		this.combT = combT;
	}

	public autoTipo getAutoT() {
		return autoT;
	}

	public void setAutoT(autoTipo autoT) {
		this.autoT = autoT;
	}

	public color getCol() {
		return col;
	}

	public void setCol(color col) {
		this.col = col;
	}
	
	//metodos de velocidad
	public void acelerar(double acel) {
		if(acel <0D) System.out.println("No puedes acelerar en negativo");
		if(this.vActual+acel >120) System.out.println("Vas demasiado rápido.Vas a perder 6 puntos");
		else {
			System.out.println("El automóvil acelera "+acel+" km/h y ahora va a "+(this.vActual+acel)+" km/h");
			this.vActual+=acel;
		}
	}
	
	public void desacelerar(double desac) {
		if(desac <0D) System.out.println("No puedes acelerar en negativo");
		if (this.vActual-desac <=0D) {
			System.out.println("Has frenado");
			this.vActual=0D;
		}
		else {
			System.out.println("El automóvil desacelera "+desac+" km/h y ahora va a "+(this.vActual-desac)+" km/h");
			this.vActual-=desac;
		}
	}
	
	public void frenar() {
		this.vActual=0D;
		System.out.println("Has frenado");
	}
	
	public Automoviil duplicaMicoche() {
		Automoviil duplicado = this;
		return duplicado;
	}
	
	//metodo TEL (Tiempo Estimado Llegada)
	public void TEL(double distancia) {
		double llegada = distancia/this.vActual;
		System.out.println("El automóvil va a tardar "+llegada+" horas en llegar al destino");
	}
	
	//metodo enseñar los datos del Automovil
	@Override
	public String toString() {
		return "El automóvil es un " + marca + " " + col + " " + autoT+ " del " + modelo + ", con un motor de "
				+ combT +" de "+ motorVol + "L de cilindrada\n"
				+ "También tiene "+ numPuertas + " puertas, " + numAsientos + " asientos y una velocidad máxima de "
				+ vMax + " km/h\n"
				+ "Ahora mismo, su velocidad actual es de " + vActual + " km/h\n.";
	}	
}