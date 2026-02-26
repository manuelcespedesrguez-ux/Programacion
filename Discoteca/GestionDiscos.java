package Discoteca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.Scanner;

public class GestionDiscos {

    public static Scanner s;

    public static Disco[] discos = new Disco[100];

    public static void crearColeccion() {

        for (int i = 0; i < discos.length; i++) {
            discos[i] = new Disco();
        }

    }

    public static void mockDiscos() {

        discos[0] = new Disco("DEIV01", "Dei V", "DIABLA", "trap", 3);
        discos[1] = new Disco("OMAR01", "Omar Courtz", "QVALSE", "reggaeton", 4);
        discos[2] = new Disco("JLOV01", "James Lover", "LOKITA", "reggaeton melodic", 3);
        discos[3] = new Disco("DEIV02", "Dei V-", "CRUSH", "reggaeton", 3);
        discos[4] = new Disco("OMAR02", "Omar Courtz", "LUCES DE COLORES", "urban pop", 3);
        discos[5] = new Disco("JLOV02", "James Lover", "VIBE", "r&b urban", 2);
        discos[6] = new Disco("BUNN25", "Bad Bunny", "PERRO NEGRO 2", "reggaeton", 3);
        discos[7] = new Disco("FERX26", "Feid", "LUNA (Remix)", "reggaeton", 4);
        discos[8] = new Disco("SAIK25", "Saiko", "YO LO SOÑÉ", "urban pop", 3);
        discos[9] = new Disco("KARO25", "Karol G", "CONTIGO", "dance urban", 3);
        discos[10] = new Disco("RAUW25", "Rauw Alejandro", "TOUCHING THE SKY", "synth-pop", 3);
        discos[11] = new Disco("MORA25", "Mora", "DOMINO", "electronic", 3);
        discos[12] = new Disco("ELAD26", "Eladio Carrión", "HELLCAT", "trap rap", 4);
        discos[13] = new Disco("MYKE25", "Myke Towers", "ADIVINANZA", "reggaeton", 3);
        discos[14] = new Disco("CRIS26", "Cris MJ", "GATA ONLY", "reggaeton chileno", 3);
        discos[15] = new Disco("MIKO25", "Young Miko", "CURITA", "trap melodic", 2);
        discos[16] = new Disco("TRUE26", "Trueno", "REAL GANGSTA LOVE", "hip hop", 3);
        discos[17] = new Disco("RYAN25", "Ryan Castro", "QUEMA", "reggaeton", 3);
        discos[18] = new Disco("TANT26", "C. Tangana", "DEMASIADAS MUJERES", "fusion", 3);
        discos[19] = new Disco("BZRP60", "Bizarrap", "Music Session #60", "trap", 3);
        discos[20] = new Disco("QUEV25", "Quevedo", "LA ÚLTIMA", "urban pop", 3);
        discos[21] = new Disco("DEIV03", "Dei V", "CLIMA", "trap", 3);
        discos[22] = new Disco("OMAR03", "Omar Courtz", "BABY FATHER", "reggaeton", 4);
        discos[23] = new Disco("JLOV03", "James Lover", "NADA SERIO", "reggaeton", 3);
        discos[24] = new Disco("YVNG25", "Yovngchimi", "FULL MOON", "drill", 3);
        discos[25] = new Disco("LUAR25", "Luar La L", "TELÉFONO NUEVO", "trap", 4);

    }

    private static void cargarColeccionDesdeAlmacenamiento() {
        
        File fichero = new File("coleccion.obj");

        // Verificamos si el archivo existe antes de intentar leerlo
        if (!fichero.exists()) {
            System.out.println("no hay archivo de guardado previo. Creando colección nueva...");
            crearColeccion(); // Inicializamos el array con objetos vacíos
            mockDiscos();
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            // Leemos el objeto y hacemos el casting a Disco[]
            discos = (Disco[]) ois.readObject();
            System.out.println("Colección cargada con éxito.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error "+e.getMessage()+" al cargar la colección");
            // Si algo falla, al menos inicializamos para que no sea null
            crearColeccion();
        }
    }

    private static void guardarColeccionEnAlmacenamiento() {
        // Usamos try-with-resources para que el archivo se cierre solo
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("coleccion.obj"))){
            // Guardamos el array completo de un solo golpe 
            oos.writeObject(discos);
            System.out.println("Colección guardada correctamente en coleccion.obj");
        } catch (IOException e) {
            System.out.println("Error "+e.getMessage()+" al guardar la colección");
        }
    }

    private static void addDisco() {
        // TODO Auto-generated method stub
        System.out.println("Hay que pedir los datos del disco");
        System.out.println("Hay que crear un disco nuevo");
        System.out.println("Se añadirá a la colección antes que el primer disco libre");

        boolean no_trovato = true;
        int pos = -1; // Evito problemas
        do {
            pos++;
            if (discos[pos].getCodigo().equals("LIBRE")) no_trovato = false;
        } while(no_trovato);

        System.out.print("Código: ");
        String codigoIn = s.nextLine();
        System.out.print("Autor: ");
        String autorIn = s.nextLine();
        System.out.print("Título: ");
        String tituloIn = s.nextLine();
        System.out.print("Género: ");
        String generoIn = s.nextLine();
        System.out.print("Duración: ");
        Integer duracionIn = Integer.parseInt(s.nextLine());

        discos[pos] = new Disco(codigoIn, autorIn, tituloIn, generoIn, duracionIn);
    }

    public static void main(String[] args) {

        s = new Scanner(System.in);
        int opcion = 0;
        boolean seguir = true;

        // Empezar
        if (discos.length == 0) {
            crearColeccion();
            mockDiscos();
        } else {
            // Carga automaticamente desde disco durao el empezar
            cargarColeccionDesdeAlmacenamiento();
        }

        crearColeccion();
        mockDiscos();

        // menú
        do {
            System.out.println("\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Guardar colección");
            System.out.println("6. Cargar colección");
            System.out.println("7. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(s.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("\nLISTADO");
                    System.out.println("=======");
                    // Método para listar
                    for (Disco d : discos) {
                        if (!d.getCodigo().equals("LIBRE")) {
                            System.out.println(d);
                        }
                    }

                    break;

                case 2:
                    System.out.println("\nNUEVO DISCO");
                    System.out.println("===========");
                    // Método para añadir
                    addDisco();
                    break;

                case 3:
                    System.out.println("\nMODIFICAR");
                    System.out.println("===========");
                    // Método para modificar un disco existente (que tenga código númerico)
                    
                    break;

                case 4:
                    System.out.println("\nBORRAR");
                    System.out.println("======");
                    // Método para borrar un disco (que tenga código)
                    
                    break;

                case 5:
                    System.out.println("\nGuardar en almacenamiento ");
                    System.out.println("===========================");
                    // Método para guardar toda la colección
                    guardarColeccionEnAlmacenamiento();
                    break;

                case 6:
                    System.out.println("\nCargar desde almacenamiento");
                    System.out.println("=============================");
                    // Método para cargar toda la colección
                    cargarColeccionDesdeAlmacenamiento();
                    break;

                case 7:
                    System.out.println("...Abandonando gestión de discos...");
                    seguir = false;
                    // Guardo automáticamente la colección
                    guardarColeccionEnAlmacenamiento();

                default:
                    System.out.println("Opción no valida");

            } // switch
        } while (seguir == true);

    }

}
