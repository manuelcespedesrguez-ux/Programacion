package Bio;

public class Perro extends Canido {

    public Perro(String sonido, String alimentos, String habitat, String nombreCientifico) {
        super(sonido, alimentos, habitat, nombreCientifico);
    }

    public String getSonido(){
        return "Ladrido";
    }

    public String getAlimentos(){
        return "Carnívoro";
    }

    public String getHabitat(){
        return "Doméstico";
    }

    public String getNombreCientifico(){
        return "Canis Lupus Familiaris";
    }

    @Override
    public String toString() {
        return "Esto es un perro \n"+ super.toString();
    }

}
