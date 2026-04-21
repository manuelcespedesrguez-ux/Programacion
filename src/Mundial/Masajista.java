package Mundial;

public class Masajista extends SeleccionFutbol{

    protected String Titulacion;
    protected int AniosExpe;

    public Masajista(int id, String Nom, String Ape, int edad, String titulacion, int aniosExpe) {
        super(id, Nom, Ape, edad);
        Titulacion = titulacion;
        AniosExpe = aniosExpe;
    }

    public String getTitulacion() {
        return Titulacion;
    }
    
    public void setTitulacion(String titulacion) {
        Titulacion = titulacion;
    }
    
    public int getAniosExpe() {
        return AniosExpe;
    }
    
    public void setAniosExpe(int aniosExpe) {
        AniosExpe = aniosExpe;
    }

    public void darMasaje() {
        System.out.println("El masajista está dando un masaje");
    }

    @Override
    public String toString() {
        return super.toString() + ", está " + Titulacion + " y además tiene " + AniosExpe + " años de experiencia";
    }

    @Override
    public void Viajar() {
        super.Viajar();
        System.out.println("El masajista viaja en la bodega");
    }

    
    

}