import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner kb = new Scanner( System.in);
        //comprobamos al usuario
        System.out.println("bienvenido, ya tienes cuenta? [escribe 'Si' o 'No']");
        String cuenta = kb.nextLine();
        String cuentaMinuscula = cuenta.toLowerCase();

        if(cuentaMinuscula.equals("no")){
            //Declaramos las variables.
            String nombre, correo; 
            //Registramos al usuario.
            System.out.println("Hola bienvenido a SAM");
            System.out.println("Cuéntanos cómo te llamas :)");
            nombre = kb.nextLine();
            System.out.println("Qué tal "+ nombre+ ", ¿cuál es tu correo?");
            correo = kb.nextLine();
            System.out.println("Gracias "+ nombre + " por registrarte, te hemos enviado una notificación a "+ correo);

            //Preguntamos por los datos de entrada del sistema.
            System.out.println("De nuevo te damos la bienvenida a SAM, ahora te háremos unas preguntas, para adaptarnos mejor a tí.");
            System.out.println(nombre+", ¿Tienes alguna mascota?[contesta si o no]");
            String mascota = kb.nextLine();
            String mascotaValue = mascota.toLowerCase();
            
            //Inicializamos un codicional con el fin de verificar si el usuario posee o no mascota.
            if(mascotaValue.equals("si")){
                System.out.println("!Súper¡ y ¿cómo se llama?");
                String mascotaNombre;
                mascotaNombre = kb.nextLine();
                System.out.println(mascotaNombre +", me hubiera quedado en silencio.");
            }else{
                System.out.println("A mi támbien me gusta ahorrar dinero $");
            }

            //Preguntamos por los datos de entrada del sistema.
            System.out.println(nombre+", ¿Tienes alguna alergia?[contesta si o no]");
            String alegia = kb.nextLine();
            String alergiaValue = alegia.toLowerCase();
            
            //Inicializamos un codicional con el fin de verificar si el usuario posee o no mascota.
            if(alergiaValue.equals("si")){
                System.out.println("Lamento saberlo, cuentanos a que?");
                String alergiaTipo = kb.nextLine();
                System.out.println( alergiaTipo+", solo espero que no sea contagioso...");
            }else{
                System.out.println("Agradecido co el de arriba.");
            }
            
            System.out.println("Ahora cuéntanos un poco mas sobre tu vivienda, escribe alguno de los siguientes.(casa, apartamento, finca): ");
            String tipoDeVivienda = kb.nextLine();
            String tipoDeViviendaMinuscula = tipoDeVivienda.toLowerCase();
            
            //Inicializamos switch para verificar el tipo de vivienda del usuario.
            switch(tipoDeViviendaMinuscula){
                case "casa":
                    System.out.println("una casa, Wow yo también tenía una.");
                    break;
                case "apartamento":
                    System.out.println("Un apartamento, ¡Que genial!");
                    break;
                case "finca":
                    System.out.println("¡Me encantan las fincas! ");
                    break;
                default:
                    System.out.println("¿Qué tipo de vivienda es esa?");
            }
            
            //Inicializamos switch para verificar la época del año del usuario.
            System.out.println("Y dinos, en que momento del años te encuentras.(primavera, verano, otono, invierno): ");
            String epocaActual = kb.nextLine();
            String epocaActualMinuscula = epocaActual.toLowerCase();
        
            switch(epocaActualMinuscula){
                case "primavera":
                    System.out.println("¡La primavera es muy linda!");
                    break;
                case "verano":
                    System.out.println("¡En verano hace mucho calor!");
                    break;
                case "otono":
                    System.out.println("¡En otoño hace un frío del Diablo!");
                    break;
                case "invierno":
                    System.out.println("Invierno, Dios bendiga el frío.");
                    break;
                default:
                    System.out.println("¿En que planeta se da esa estación?");
            }
        }
        else{
            //procedemos a recibir los datos del usuario
            System.out.println("Recuerdame tu nombre porfa ");
            String nombre = kb.nextLine();
            System.out.println("Me alegra verte de nuevo " + nombre);
            
            //verificamos el estado de nuestra planta a grosomodo
            System.out.println("¿Como se ve tu planta?[bien, mal, regular, indiferente]");
            String estadoPlanta = kb.nextLine();
            String estadoPlantaMinuscula = estadoPlanta.toLowerCase();
            switch(estadoPlantaMinuscula){
                case "bien":
                    System.out.println("bien, y pensar que dudaba de tí, solo queda decir lo buen docente que soy.");
                    break;
                case "mal":
                    System.out.println("mal, la verdad no esperaba mucho, y tu planta tampoco.");
                    break;
                case "regular":
                    System.out.println("regular, podría ser peor");
                    break;
                case "indiferente":
                    System.out.println("indiferente, desde que luego no me culpes a mi, esta todo bien");
                    break;
                default:
                    System.out.println("pobre plantita.");
            }
        }
        
    }
}   