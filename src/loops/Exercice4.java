package loops;
import java.util.Scanner;

public class Exercice4 {

    public static String ResultadoPromedio(double claridad, double interaccion, double materiales) {
        String msg = "", resp = "", desc = "";
        Double resul = materiales +  claridad + interaccion;

        if (claridad < 3) msg = "Revisión de la estructura de la clase";
        if (interaccion < 3) msg = "Mejorar la participación";
        if (materiales < 3) msg = "Actualización de materiales";
        if (materiales == 5 && claridad == 5 && interaccion == 5) msg = "Clase perfecta!!";
        if (materiales < 3 || claridad < 3 || interaccion < 3) msg = "Reunión con el profesor";

        if (resul >= 4) {
            resp = "Excelente clase";
        } else if (resul > 3 && resul < 4) {
            resp = "Clase aceptable";
        } else {
            resp = "Clase a mejorar";
        }

        if (resul >= 4.5) desc = "Otorgar reconocimiento al profesor";

        return msg + "\n" + resp + "\n" + desc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resp, comentario, name, detalles;
        double claridad, interaccion, materiales;

        do {
            System.out.println("Hola, bienvenido. ¿Cuál es tu nombre?");
            name = sc.nextLine().toUpperCase();

            System.out.println("Dale una calificación a la  claridad de explicacion: ");
            claridad = sc.nextDouble();
            System.out.println("Dale una calificación a la interaccion con el profesor: ");
            interaccion = sc.nextDouble();
            System.out.println("Dale una calificación a los  materiales de apoyo:");
            materiales = sc.nextDouble();

            sc.nextLine(); // Limpiar el buffer para evitar errores en la entrada de texto

            System.out.println(ResultadoPromedio(claridad, interaccion, materiales));

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
                    case "tecnologia":
                        System.out.println("Registrar un caso para soporte técnico");
                        break;
                    case "ritmo":
                        System.out.println("Ajuste de ritmo en clase");
                        break;
                    case "participacion":
                        System.out.println("Incentivos para participación");
                        break;
                    case "material":
                        System.out.println("Registrar una solicitud para actualizar materiales");
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
