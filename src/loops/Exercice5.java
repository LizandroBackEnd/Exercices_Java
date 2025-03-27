package loops;
import java.util.Scanner;

public class Exercice5 {

    public static String Respuesta(int calif) {
        switch (calif) {
            case 1: return "Muy satisfecho";
            case 2: return "Satisfecho";
            case 3: return "Bueno";
            case 4: return "Insatisfecho";
            case 5: return "Muy insatisfecho";
            default: return "Calificación no válida";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] preguntas = {
                "Califica la calidad del sabor",
                "Califica la variedad del menú",
                "Califica la presentación de los alimentos",
                "Califica la frescura de los ingredientes",
                "Califica el tiempo de espera para recibir el pedido",
                "Califica la calidad del servicio al cliente",
                "Califica la relación calidad-precio",
                "Califica el tamaño de las porciones",
                "Califica el empaque del producto",
                "Califica la facilidad para realizar el pedido"
        };

        String listaSatisfaccion =
                        "1. Muy Satisfecho\n" +
                        "2. Satisfecho\n" +
                        "3. Bueno\n" +
                        "4. Insatisfecho\n" +
                        "5. Muy Insatisfecho";
        String resp="";


        do {
            System.out.println("Responde las preguntas de acuerdo a la lista de satisfaccion: \n" + listaSatisfaccion );

            int [] respuestas = new int [preguntas.length];

            for (int i = 0; i < preguntas.length; i++){
                System.out.println(preguntas[i]);
                respuestas[i] = Integer.parseInt(sc.nextLine());
            }

            System.out.println("Tus respuestas fueron");
            for(int i = 0; i < respuestas.length; i++){
                System.out.println(preguntas[i] + ": " + Respuesta(respuestas[i]));
            }


            System.out.println("¿Quieres repetir la encuesta? (si/no)");
            resp = sc.nextLine().toLowerCase();
        } while (resp.equals("si"));
    }
}
