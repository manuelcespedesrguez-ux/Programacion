package Mundial;

public class SeleccionFutbol {
    
    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected int Edad;

    public SeleccionFutbol(int id, String Nom, String Ape, int edad) {
        this.id = id;
        this.Nombre = Nom;
        this.Apellidos = Ape;
        this.Edad = edad;
    } 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public void Concentrarse(){
        System.out.println("La selección se concentra");
    }

    public void Viajar() {
        System.out.println("La selección viaja");
    }

    @Override
    public String toString() {
        return "El integrante con id "+ id + ", se llama " + Nombre + "  " + Apellidos + " y tiene " + Edad + " años";
    }

    

}
