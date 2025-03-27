package loops;
import java.util.Scanner;

public class Exercice3 {

    public static String ResultadoPromedio(double CalifFood, double CalifService, double CalifClean) {
        String msg = "", resp = "", desc = "";
        Double resul = CalifClean + CalifFood + CalifService;

        if (CalifFood < 3) msg = "Revisar el menú";
        if (CalifService < 3) msg = "Mejorar la capacitación personal";
        if (CalifClean < 3) msg = "Mejorar la limpieza";
        if (CalifClean == 5 && CalifFood == 5 && CalifService == 5) msg = "Servicio perfecto!!";
        if (CalifClean < 3 || CalifFood < 3 || CalifService < 3) msg = "Problemas graves en el servicio";

        if (resul >= 4) {
            resp = "Excelente servicio";
        } else if (resul > 3 && resul < 4) {
            resp = "Buen servicio";
        } else {
            resp = "Servicio a mejorar";
        }

        if (resul >= 4.5) desc = "Tendrás un descuento";

        return msg + "\n" + resp + "\n" + desc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resp, comentario, name, detalles;
        double CalifFood, CalifService, CalifClean;

        do {
            System.out.println("Hola, bienvenido. ¿Cuál es tu nombre?");
            name = sc.nextLine().toUpperCase();

            System.out.println("Dale una calificación a la comida: ");
            CalifFood = sc.nextDouble();
            System.out.println("Dale una calificación al servicio: ");
            CalifService = sc.nextDouble();
            System.out.println("Dale una calificación a la limpieza:");
            CalifClean = sc.nextDouble();

            sc.nextLine(); // Limpiar el buffer para evitar errores en la entrada de texto

            System.out.println(ResultadoPromedio(CalifFood, CalifService, CalifClean));

            // Se pregunta primero el comentario
            System.out.println("Deja un comentario: (Escribe 'excelente' si te gustó | 'malo' si no y puedes dar detalles)");
            comentario = sc.nextLine().toLowerCase();

            if (comentario.equals("excelente")) {
                System.out.println("Muchas gracias por tu comentario, " + name);
            } else if (comentario.equals("malo")) {
                System.out.println("Puedes dar detalles:");
                detalles = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

                // Evaluamos los detalles
                switch (detalles) {
                    case "tiempodeespera":
                        System.out.println("Registrar una queja para el gerente");
                        break;
                    case "precio":
                        System.out.println("Revisar los costos");
                        break;
                    case "ambiente":
                        System.out.println("Vamos a decorar y agregar más música");
                        break;
                    case "personal":
                        System.out.println("Vamos a registrar en recursos humanos");
                        break;
                    default:
                        System.out.println("Gracias por tu comentario, lo tendremos en cuenta.");
                        break;
                }
            }

            // Se pregunta si desea repetir la encuesta
            System.out.println("¿Quieres repetir la encuesta? (si/no)");
            resp = sc.nextLine().toLowerCase();

        } while (resp.equals("si"));

        sc.close(); // Cerramos el scanner para evitar fugas de memoria
    }
}
