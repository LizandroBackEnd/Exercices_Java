package loops;
import java.util.Scanner;

public class Excercice7 {

    public static String Calificacion(int calif) {
        switch (calif) {
            case 1: return "Muy insatisfecho";
            case 2: return "Insatisfecha";
            case 3: return  "Bueno";
            case 4: return "Satisfecho";
            case 5: return "Muy satisfecho";
            default: return "Calificacion incorrecta";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resp;
        String [] preguntas = {
                "Como valoras el servicio de la tienda",
                "Como valoras la limpieza de la tienda",
                "Como valoras el producto de la tienda"
        };
        String ListaSatisfaccion =
                "1: Muy insatisfecho\n" +
                "2: Insatisfecho\n" +
                "3: Bueno\n" +
                "4: Satisfecho\n" +
                "5: Muy satisfecho\n";


        do {
            System.out.println("Responde las preguntas de acuerdo a la escala de satisfaccion\n: " + ListaSatisfaccion);
            int [] respuetas = new int [preguntas.length];

            for (int i = 0; i < preguntas.length; i++){
                System.out.println(preguntas[i]);
                respuetas [i] = Integer.parseInt(sc.nextLine());
            }

            System.out.println("Tus respuestas fueron: ");

            for (int i = 0; i < respuetas.length; i++) {
                System.out.println(preguntas[i] + " : " + Calificacion(respuetas[i]));
            }

            System.out.println("Quieres repetir la encuesta?");
            resp = sc.nextLine().toLowerCase();

        } while (resp.equals("si"));

    }
}
