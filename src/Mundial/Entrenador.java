package Mundial;

public class Entrenador extends SeleccionFutbol {
    
    protected String idFederacion;

    public Entrenador(int id, String Nom, String Ape, int edad, String idFederacion) {
        super(id, Nom, Ape, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println("El entrenador dirige un partido");
    }

    public void dirigirEntreno() {
        System.out.println("El entrenador dirige un entrenamiento");
    }

    @Override
    public String toString() {
        return super.toString() + ", el id en la federación del entrenador es " +idFederacion;
    }

    
}
