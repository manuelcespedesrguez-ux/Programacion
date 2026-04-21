package Universidad;

public class Test3 {
    
    public static void main(String[] args) {
        
        Persona p = new Estudiante("Carlos", "Paseo Alfonso XII", "Ingeniería Agraria", 3);

        if (p instanceof Estudiante) {
            Estudiante e = (Estudiante) p;

            System.out.println("Carrera recuperada "+e.getCarrera());
            System.out.println("Semestre: "+e.getSemestre());
        }

        Persona p2 = new Profesor("Jose Carlos", "Avenida Castelao 24", "Matemáticas", "Título");

        if (p2 instanceof Profesor) {
            Profesor pi = (Profesor) p2;

            System.out.println("Departamento de "+pi.getDepartamento());
            System.out.println("Categoría: "+pi.getCategoria());
        }

        Estudiante bueno = (Estudiante) p2;

        System.out.println("Semestre "+bueno.getSemestre());

    }

}
