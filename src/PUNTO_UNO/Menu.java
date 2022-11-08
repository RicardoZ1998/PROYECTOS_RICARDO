package PUNTO_UNO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    static String nombre;
    static String fechaNacimiento;
    static String estadoCivil;
    static String numeroTelefono;
    static int pagoMensual = 0;

    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Scanner consola = new Scanner(System.in);

    static Chef chef1 = new Chef(nombre, fechaNacimiento, estadoCivil, numeroTelefono, pagoMensual);
    static Informatico informatico1 = new Informatico(nombre, fechaNacimiento, estadoCivil, numeroTelefono, pagoMensual);

//    static Persona chef = new Chef("Mateo", "09/05/2002", "Soltero", "3245987", 1000);
//    static Persona informatico = new Informatico("Ricardo", "03/04/2001", "Casado", "34567890", 2500);
    static Persona chef = new Chef(nombre, fechaNacimiento, estadoCivil, numeroTelefono, pagoMensual);
    static Persona informatico = new Informatico(nombre, fechaNacimiento, estadoCivil, numeroTelefono, 0);

    public static void main(String[] args) {

        Chef chef[];
        Informatico informatico[];
        pantallaPrincipal();

    }

    public static void crearUsuario() {

        String nombre;
        String fechaNacimiento;
        String estadoCivil;
        String numeroTelefono;
        int pagoMensual = 0;

        int N, i;

        int opcion = 0;

        do {
            System.out.println("*****************************");
            System.out.println("\t...::MENU DE CREACION DE OBJETOS::..");
            System.out.println("1. Crear chef");
            System.out.println("2. Crear informatico");
            System.out.println("3. Menu principal");
            System.out.println("4. Salir");
            System.out.print("Digite la opcion: ");
            opcion = consola.nextInt();
            System.out.println("*****************************");

            switch (opcion) {
                case 1:
                    System.out.println("*****************************");
                    System.out.println("\t.:CREANDO CHEF:.");

                    do {
                        System.out.println("*****************************");
                        System.out.print("Digite el numero de chef a crear: ");
                        N = consola.nextInt();
                        System.out.println("*****************************");
                    } while (N < 0);
                    consola.nextLine(); //limpiar el intro

                    //lectura de N chef
                    for (i = 1; i <= N; i++) {
                        //leer datos de cada coche
                        System.out.println("Chef numero: " + i);
                        System.out.print("Nombre: ");
                        nombre = consola.nextLine();
                        System.out.print("Fecha de Nacimiento: ");
                        fechaNacimiento = consola.nextLine();
                        System.out.print("Estado civil: ");
                        estadoCivil = consola.nextLine();
                        System.out.print("Numero telefonico: ");
                        numeroTelefono = consola.nextLine();

                        System.out.println("Bono mensual: " + pagoMensual);

                        //se asignan valores a los atributos del nuevo objeto
                        Persona chef = new Chef(nombre, fechaNacimiento, estadoCivil, numeroTelefono, pagoMensual);

                        persona.add(chef);

                    }
                    break;

                case 2:
                    System.out.println("*****************************");
                    System.out.println("\t.:CREANDO INFORMATICO:.");

                    do {
                        System.out.print("Digite el numero de informatico a crear: ");
                        N = consola.nextInt();
                    } while (N < 0);
                    consola.nextLine(); //limpiar el intro

                    //lectura de N informatico
                    for (i = 1; i <= N; i++) {
                        //leer datos de cada obejto
                        System.out.println("Informatico numero: " + i);
                        System.out.print("Nombre: ");
                        nombre = consola.nextLine();
                        System.out.print("Fecha de Nacimiento: ");
                        fechaNacimiento = consola.nextLine();
                        System.out.print("Estado civil: ");
                        estadoCivil = consola.nextLine();
                        System.out.print("Numero telefonico: ");
                        numeroTelefono = consola.nextLine();

                        System.out.println("Bono mensual: " + pagoMensual);

                        Persona informatico = new Informatico(nombre, fechaNacimiento, estadoCivil, numeroTelefono, pagoMensual);
                        persona.add(informatico);

                    }

                    break;

                case 3:
                    pantallaPrincipal();
                    break;
                case 4:
                    break;

            }
            break;

        } while (opcion != 4);

    }

    public static void eliminarPersonas() {

        int opcion2 = 0;
        int N;

        do {
            System.out.println("*****************************");
            System.out.println("\t...::MENU DE ELIMINACION DE OBJETOS::..");
            System.out.println("1. Eliminar chef");
            System.out.println("2. Eliminar informatico");
            System.out.println("3. Menu principal");
            System.out.println("4. Salir");
            System.out.print("Digite la opcion: ");
            opcion2 = consola.nextInt();

            switch (opcion2) {
                case 1:
                    System.out.println("Eliminando chef....");

                    Map<Integer, Persona> mapaChef = new HashMap<>();

                    int auxChef = 1;
                    for (int j = 0; j < persona.size(); j++) {
                        if (persona.get(j).getClass().equals(chef1.getClass())) {
                            System.out.println((auxChef) + ".Chef: " + persona.get(j).getNombre());
                            auxChef++;
                            //llenar el mapa de datos
                            mapaChef.put(j, persona.get(j));

                        }
                    }

                    if (mapaChef.size() > 0) {

                        System.out.print("Digite el numero de chef a eliminar: ");
                        N = consola.nextInt();

                        int aux = 1;

                        for (Map.Entry<Integer, Persona> entry : mapaChef.entrySet()) {

                            if (N == aux) {
                                System.out.println(entry.getKey());
                                persona.remove((int) entry.getKey());
                                System.out.println("Chef eliminado con exito....");
                                break;
                            }
                            aux++;
                        }

                    } else {
                        System.out.println("No existe un chef creado..");
                    }

                    break;

                case 2:
                    System.out.println("Eliminando informatico.....");

                    Map<Integer, Persona> mapaInformatico = new HashMap<>();

                    int auxInformatico = 1;
                    for (int j = 0; j < persona.size(); j++) {
                        if (persona.get(j).getClass().equals(informatico1.getClass())) {
                            System.out.println((auxInformatico) + ".Informatico: " + persona.get(j).getNombre());
                            auxInformatico++;
                            //llenar el mapa de datos
                            mapaInformatico.put(j, persona.get(j));

                        }
                    }

                    if (mapaInformatico.size() > 0) {

                        System.out.print("Digite el numero de informatico a eliminar: ");
                        N = consola.nextInt();

                        int aux = 1;

                        for (Map.Entry<Integer, Persona> entry : mapaInformatico.entrySet()) {

                            if (N == aux) {
                                System.out.println(entry.getKey());
                                persona.remove((int) entry.getKey());
                                System.out.println("Informatico eliminado con exito....");
                                break;
                            }
                            aux++;
                        }

                    } else {
                        System.out.println("No existe un informatico creado..");
                    }
                    break;

                case 3:

                    pantallaPrincipal();

                    break;

                case 4:
                    break;
            }

        } while (opcion2 != 4);

    }

    public static void generarBono() {

        int opcion = 0;
        int N;

        do {
            System.out.println("*****************************");
            System.out.println("\t...::MENU GENERADOR DE BONO MENSUAL::..");
            System.out.println("1. Generar bono a chef");
            System.out.println("2. Generar bono a informatico");
            System.out.println("3. Menu principal");
            System.out.println("4. Salir");
            System.out.print("Digite la opcion: ");
            opcion = consola.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("*****************************");
                    System.out.println("Generando bono a chef...");

                    Map<Integer, Persona> mapaChef = new HashMap<>();

                    int i = 1;
                    for (Persona persona1 : persona) {
                        if (persona1.getClass().equals(chef1.getClass())) {
                            System.out.println(i + ".Chef: " + persona1.getNombre());

                            //llenar el mapa de datos
                            mapaChef.put(i, persona1);
                            i++;
                        }
                    }
                    if (mapaChef.size() > 0) {
                        System.out.print("Digite el numero de chef a generar bono: ");
                        N = consola.nextInt();

                        mapaChef.get(N).Trabajo();

                        System.out.println("El chef " + mapaChef.get(N).nombre + " tiene un bono acumulado de " + mapaChef.get(N).bonoAcumuladoMensual + " dolares");
                    } else {
                        System.out.println("No existe un chef para generar el bono.");
                    }
                    System.out.println("*****************************");

                    break;

                case 2:
                    System.out.println("****************************");
                    System.out.println("Generando bono a informatico..");

                    Map<Integer, Persona> mapaInfo = new HashMap<>();

                    int k = 1;
                    for (Persona persona2 : persona) {
                        if (persona2.getClass().equals(informatico1.getClass())) {
                            System.out.println(k + ".Informatico: " + persona2.getNombre());

                            //llenar el mapa de datos
                            mapaInfo.put(k, persona2);
                            k++;
                        }
                    }

                    if (mapaInfo.size() > 0) {
                        System.out.print("Digite el numero de informatico a generar bono: ");
                        N = consola.nextInt();

                        mapaInfo.get(N).Trabajo();

                        System.out.println("El informatico " + mapaInfo.get(N).nombre + " tiene un bono acumulado de " + mapaInfo.get(N).bonoAcumuladoMensual + " dolares");
                    } else {
                        System.out.println("No existe un informatico para generar el bono");
                    }
                    System.out.println("*****************************");

                    break;

                case 3:
                    pantallaPrincipal();
                    break;

                case 4:
                    break;
            }
        } while (opcion != 4);

    }

    public static void generarNomina() {

        //Nomina de chef
        System.out.println("*****************************");
        System.out.println("NOMINA DE CHEF'S");
        System.out.println("*****************************");
        for (Persona chef : persona) {
            if (chef.getClass().equals(chef1.getClass())) {
                System.out.println("Nombre: " + chef.nombre);
                System.out.println("Fecha de nacimiento: " + chef.fechaNacimiento);
                System.out.println("Estado civil: " + chef.estadoCivil);
                System.out.println("Numero telefonico: " + chef.numeroTelefono);
                System.out.println("Bono mensual: " + chef.bonoAcumuladoMensual);

                chef.bonoAcumuladoMensual = 0;
            }
        }
        System.out.println("");
        System.out.println("");

        //Nomina de informaticos
        System.out.println("*****************************");
        System.out.println("NOMINA DE INFORMATICOS");
        System.out.println("*****************************");
        for (Persona informatico : persona) {
            if (informatico.getClass().equals(informatico1.getClass())) {
                System.out.println("Nombre: " + informatico.nombre);
                System.out.println("Fecha de nacimiento: " + informatico.fechaNacimiento);
                System.out.println("Estado civil: " + informatico.estadoCivil);
                System.out.println("Numero telefonico: " + informatico.numeroTelefono);
                System.out.println("Bono mensual: " + informatico.bonoAcumuladoMensual);

                informatico.bonoAcumuladoMensual = 0;
            }
        }

    }
    
     public static void generarRegalo() {

        //Nomina de chef
        System.out.println("*****************************");
        System.out.println("NOMINA DE CHEF'S");
        System.out.println("*****************************");
        for (Persona chef : persona) {
            if (chef.getClass().equals(chef1.getClass())) {
                System.out.println("Nombre: " + chef.nombre);
                System.out.println("Fecha de nacimiento: " + chef.fechaNacimiento);
                System.out.println("Estado civil: " + chef.estadoCivil);
                System.out.println("Numero telefonico: " + chef.numeroTelefono);
                System.out.println("Bono mensual: " + chef.bonoAcumuladoMensual);

                
                
                
                int agregamosQuince = 0;
                
                
                agregamosQuince = chef.bonoAcumuladoMensual;
                System.out.println("Bono mensual acumulado: " + agregamosQuince);
                
                int resultado = (int) (agregamosQuince*0.15)+(agregamosQuince);
                
                System.out.println("Bono acumulado actual con el 15% de regalo: " + resultado );
                
                
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("");

        //Nomina de informaticos
        System.out.println("*****************************");
        System.out.println("NOMINA DE INFORMATICOS");
        System.out.println("*****************************");
        for (Persona informatico : persona) {
            if (informatico.getClass().equals(informatico1.getClass())) {
                System.out.println("Nombre: " + informatico.nombre);
                System.out.println("Fecha de nacimiento: " + informatico.fechaNacimiento);
                System.out.println("Estado civil: " + informatico.estadoCivil);
                System.out.println("Numero telefonico: " + informatico.numeroTelefono);
                System.out.println("Bono mensual: " + informatico.bonoAcumuladoMensual);

                int agregamosQuince = 0;
                
                
                agregamosQuince = informatico.bonoAcumuladoMensual;
                System.out.println("Bono mensual acumulado: " + agregamosQuince);
                
                int resultado = (int) (agregamosQuince*0.15)+(agregamosQuince);
                
                System.out.println("Bono acumulado actual con el 15% de regalo: " + resultado );
            }
        }

    }

    public static void pantallaPrincipal() {
        int menuOpcion = 0;
        boolean termino = false;

        while (menuOpcion != 6) {
            System.out.println("*********************");
            System.out.println("\t...::MENU PRINCIPAL::...");
            System.out.println("1. CREAR PERSONAS");
            System.out.println("2. ElIMINAR PERSONAS");
            System.out.println("3. GENERAR BONO AL TRABAJADOR");
            System.out.println("4. GENERAR NOMINA ");
            System.out.println("5. GENERAR REGALO ");
            System.out.println("6. SALIR");
            System.out.println("*****************");

            menuOpcion = 0;
            System.out.print("Digite la opcion: ");
            menuOpcion = consola.nextInt();

            switch (menuOpcion) {
                case 1:
                    System.out.println("*****************************");
                    System.out.println("CREANDO PERSONAS");
                    crearUsuario();
                    System.out.println("*****************************");

                    break;

                case 2:
                    System.out.println("*****************************");
                    System.out.println("ELIMINANDO PERSONA");

                    eliminarPersonas();

                    System.out.println("*****************************");

                    break;

                case 3:
                    System.out.println("*****************************");
                    System.out.println("GENERANDO BONO AL TRABAJADOR");

                    generarBono();

                    System.out.println("*****************************");

                    break;

                case 4:
                    System.out.println("");
                    System.out.println("*****************************");
                    System.out.println("GENERANDO NOMINA COMPLETA");
                    System.out.println("*****************************");
                    System.out.println("");
                    generarNomina();

                    break;

                case 5:
                    System.out.println("GENERANDO REGALO");
                    generarRegalo();
                    break;
                    
                    
                case 6:
                    System.out.println("El sindicado ira por ti, tirano!!!");
                    break;

                default:
                    System.out.println("*****************************");
                    System.out.println("Ingresaste opcion incorrecta");
                    System.out.println("*****************************");

            }

        }

    }

}
