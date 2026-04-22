package Bio;

public class Gato extends Felino {

    public Gato(String sonido, String alimentos, String habitat, String nombreCientifico) {
        super(sonido, alimentos, habitat, nombreCientifico);
    }
    
    public String getSonido(){
        return "Miau";
    }

    public String getAlimentos() {
        return "Carnívoro";
    }
    
    public String getHabitat(){
        return "Doméstico";
    }

    public String getNombreCientifico(){
        return "Felis catus";
    }

    @Override
    public String toString() {
        return "Esto es un gato\n" + super.toString();
    }


}
