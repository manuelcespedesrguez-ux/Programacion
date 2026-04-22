package Bio;

public abstract class Animal {
    
    protected String sonido;
    protected String alimentos;
    protected String habitat;
    protected String nombreCientifico;

    // Constructor no lo puedo usar directamente
    public Animal(String sonido, String alimentos, String habitat, String nombreCientifico) {
        this.sonido = sonido;
        this.alimentos = alimentos;
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
    }
    

    // Cuatro métodos abstractos
    public abstract String getNombreCientifico();   

    public abstract String getSonido();
     
    public abstract String getAlimentos();

    public abstract String getHabitat();


    @Override
    public String toString() {
        return "El animal " + nombreCientifico + ", hace este sonido " + sonido + ", come " + alimentos + " y vive en " + habitat+"\n";
    }
    
    
}
