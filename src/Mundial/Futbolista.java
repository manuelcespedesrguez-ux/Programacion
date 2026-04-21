package Mundial;

public class Futbolista extends SeleccionFutbol {
    
    protected int dorsal; 
    protected String demarcacion;
    
    public Futbolista(int id, String Nom, String Ape, int edad, int dorsal, String demarcacion) {
        super(id, Nom, Ape, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println("El futbolista juega un partido");
    }

    public void entrenar() {
        System.out.println("El futbolista entrena");
    }

    @Override
    public String toString() {
        return super.toString() + ", el futbolista con el dorsal " + dorsal + " juega como " + demarcacion;
    }

    
    
}
