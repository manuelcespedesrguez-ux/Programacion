package Bio;

public class Leon extends Felino{

    public Leon(String sonido, String alimentos, String habitat, String nombreCientifico) {
        super(sonido, alimentos, habitat, nombreCientifico);
    }
    
    public String getSonido(){
        return "Ruge";
    }

    public String getAlimentos() {
        return "Carnívoro";
    }
    
    public String getHabitat(){
        return "Sabana";
    }

    public String getNombreCientifico(){
        return "Panthera Leo";
    }

    @Override
    public String toString() {
        return "Esto es un leon\n" + super.toString();
    }

}
