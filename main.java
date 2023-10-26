import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Bienvenido, ¿ya tienes cuenta? [escribe 'Si' o 'No']");
        String cuenta = kb.nextLine();
        cuenta = cuenta.toLowerCase();

        if (cuenta.equals("no")) {
            registrarUsuario(kb);
        } else {
            recibirDatosUsuarioExistente(kb);
        }
    }

    // Función para registrar un nuevo usuario
    public static void registrarUsuario(Scanner kb) {
        System.out.println("Hola bienvenido a SAM");
        System.out.println("Cuéntanos cómo te llamas :)");
        String nombre = kb.nextLine();
        System.out.println("Qué tal " + nombre + ", ¿cuál es tu correo?");
        String correo = kb.nextLine();
        System.out.println("Gracias " + nombre + " por registrarte, te hemos enviado una notificación a " + correo);

        String mascota = obtenerRespuesta(kb, nombre + ", ¿Tienes alguna mascota? [contesta si o no]");
        if (mascota.equals("si")) {
            String mascotaNombre = kb.nextLine();
            System.out.println(mascotaNombre + ", me hubiera quedado en silencio.");
        } else {
            System.out.println("A mí también me gusta ahorrar dinero $");
        }

        String alergia = obtenerRespuesta(kb, nombre + ", ¿Tienes alguna alergia? [contesta si o no]");
        if (alergia.equals("si")) {
            String alergiaTipo = kb.nextLine();
            System.out.println(alergiaTipo + ", solo espero que no sea contagioso...");
        } else {
            System.out.println("Agradecido con el de arriba.");
        }

        String tipoDeVivienda = obtenerRespuesta(kb,
                "Ahora cuéntanos un poco más sobre tu vivienda (casa, apartamento, finca): ");
        switch (tipoDeVivienda) {
            case "casa":
                System.out.println("Una casa, Wow yo también tenía una.");
                break;
            case "apartamento":
                System.out.println("Un apartamento, ¡Qué genial!");
                break;
            case "finca":
                System.out.println("¡Me encantan las fincas!");
                break;
            default:
                System.out.println("¿Qué tipo de vivienda es esa?");
        }

        String epocaActual = obtenerRespuesta(kb,
                "Dinos en qué momento del año te encuentras (primavera, verano, otoño, invierno): ");
        switch (epocaActual) {
            case "primavera":
                System.out.println("¡La primavera es muy linda!");
                break;
            case "verano":
                System.out.println("¡En verano hace mucho calor!");
                break;
            case "otoño":
                System.out.println("¡En otoño hace un frío del Diablo!");
                break;
            case "invierno":
                System.out.println("Invierno, Dios bendiga el frío.");
                break;
            default:
                System.out.println("¿En qué planeta se da esa estación?");
        }

        String ubicacion = obtenerUbicacion(kb, nombre);
        System.out.println("Tu ubicación es: " + ubicacion);
        obtenerFactoresClimaticos(ubicacion);
        String mejorPlanta = obtenerMejorPlanta(ubicacion, kb);

        if (mejorPlanta.equals("Opción no válida")) {
            System.out.println("Opción no válida. Debes elegir 1 o 2.");
        } else {
            System.out.println("Has elegido plantar: " + mejorPlanta);
            determinarCuidadoPlanta(mejorPlanta);
        }
    }

    // Función para recibir datos de un usuario existente
    public static void recibirDatosUsuarioExistente(Scanner kb) {
        System.out.println("Recuérdame tu nombre por favor ");
        String nombre = kb.nextLine();
        System.out.println("Me alegra verte de nuevo " + nombre);

        String estadoPlanta = obtenerRespuesta(kb, "¿Cómo se ve tu planta? [bien, mal, regular, indiferente]");
        switch (estadoPlanta) {
            case "bien":
                System.out.println("Bien, y pensar que dudaba de ti, solo queda decir lo buen docente que soy.");
                break;
            case "mal":
                System.out.println("Mal, la verdad no esperaba mucho, y tu planta tampoco.");
                break;
            case "regular":
                System.out.println("Regular, podría ser peor");
                break;
            case "indiferente":
                System.out.println("Indiferente, desde luego no me culpes a mí, está todo bien");
                break;
            default:
                System.out.println("Pobre plantita.");
        }
    }

    // Función para obtener la ubicación del usuario
    public static String obtenerUbicacion(Scanner kb, String nombre) {
        System.out.println("¿Cuál es tu ubicación, " + nombre + "?");
        String ubicacion = kb.nextLine();
        return ubicacion;
    }

    // Función para obtener factores climáticos aleatorios basados en el país
    public static void obtenerFactoresClimaticos(String pais) {
        Random rand = new Random();

        System.out.println("Factores climáticos a considerar en " + pais + ":");

        int numFactores = rand.nextInt(4) + 1; // Genera un número aleatorio entre 1 y 4 factores climáticos

        for (int i = 0; i < numFactores; i++) {
            int factorAleatorio = rand.nextInt(5);
            switch (factorAleatorio) {
                case 0:
                    System.out.println(" - Precipitaciones moderadas");
                    break;
                case 1:
                    System.out.println(" - Temperaturas extremas");
                    break;
                case 2:
                    System.out.println(" - Alta humedad");
                    break;
                case 3:
                    System.out.println(" - Cambios climáticos impredecibles");
                    break;
                case 4:
                    System.out.println(" - Estación seca prolongada");
                    break;
                // Puedes agregar más factores climáticos según tus necesidades
            }
        }
    }

    public static String obtenerMejorPlanta(String ubicacion, Scanner kb) {
        // Define una lista de plantas para la región (puedes agregar más)
        ArrayList<String> plantas = new ArrayList<>();
        plantas.add("Rosa");
        plantas.add("Tomate");
        plantas.add("Lavanda");
        plantas.add("Cactus");
        plantas.add("Girasol");
        plantas.add("Orquídea");
        plantas.add("Menta");
        plantas.add("Pino");
        plantas.add("Bambú");
        plantas.add("Plátano");

        // Muestra todas las plantas disponibles
        System.out.println("Plantas recomendadas para " + ubicacion + ":");

        for (String planta : plantas) {
            System.out.println(" - " + planta);
        }

        // Selección aleatoria de las 2 mejores plantas
        Random rand = new Random();
        int numPlantasSeleccionadas = 2;
        System.out.println("Las 2 mejores plantas para " + ubicacion + ":");

        for (int i = 0; i < numPlantasSeleccionadas; i++) {
            int indiceAleatorio = rand.nextInt(plantas.size());
            String plantaSeleccionada = plantas.get(indiceAleatorio);
            System.out.println(" - " + plantaSeleccionada);
            plantas.remove(indiceAleatorio); // Evita que se seleccione la misma planta más de una vez
        }

        // Permite al usuario elegir una de las dos mejores plantas
        System.out.println("Elige una de las dos mejores plantas (1 o 2): ");
        int eleccion = kb.nextInt();
        kb.nextLine(); // Limpia el búfer del teclado

        if (eleccion == 1 || eleccion == 2) {
            return eleccion == 1 ? plantas.get(0) : plantas.get(1);
        } else {
            return "Opción no válida";
        }
    }

    public static void determinarCuidadoPlanta(String plantaElegida) {
        Random rand = new Random();

        // Determina aleatoriamente la complejidad (fácil, medio, difícil)
        String[] complejidad = {"fácil", "medio", "difícil"};
        int indiceComplejidad = rand.nextInt(complejidad.length);
        String nivelComplejidad = complejidad[indiceComplejidad];

        // Determina aleatoriamente el tiempo de cuidado en minutos (entre 10 y 60 minutos)
        int tiempoCuidado = rand.nextInt(51) + 10;

        System.out.println("Para cuidar tu planta de " + plantaElegida + ":");
        System.out.println("Complejidad: " + nivelComplejidad);
        System.out.println("Tiempo de cuidado diario: " + tiempoCuidado + " minutos");
    }

    // Función para obtener una respuesta (si/no) del usuario
    public static String obtenerRespuesta(Scanner kb, String pregunta) {
        System.out.println(pregunta);
        String respuesta = kb.nextLine().toLowerCase();
        return respuesta;
    }
}
