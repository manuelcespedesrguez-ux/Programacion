package Universidad;

public class TestUniUp {
    
    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante("Juan", "Avenida das Camelias", "Ingeniería de las telecomunicaciones", 2);
        System.out.println(estudiante1);

        Profesor profesor1 = new Profesor("Pepe", "Avenida da Hispanidade", "Informática", "Programación");
        System.out.println(profesor1);

        if (estudiante1 instanceof Estudiante) {
            System.out.println(estudiante1 + "\n");
        }
        if (profesor1 instanceof Profesor) {
            System.out.println(profesor1 + "\n");
        }
    }

}
