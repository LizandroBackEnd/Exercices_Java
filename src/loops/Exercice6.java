package loops;
import java.util.Scanner;

public class Exercice6 {

    // Método para devolver la respuesta según la calificación
    public static String Respuestas(int calif) {
        switch (calif) {
            case 1: return "Muy satisfecho";
            case 2: return "Satisfecho";
            case 3: return "Bueno";
            case 4: return "Insatisfecho";
            case 5: return "Muy insatisfecho";
            default: return "Calificación no válida";
        }
    }

    // Método para calcular el porcentaje de satisfacción
    public static double calcularPorcentaje(int[] respuestas) {
        int suma = 0;
        for (int i = 0; i < respuestas.length; i++) {
            suma += respuestas[i];
        }
        return (suma / (double) respuestas.length) * 20;  // Multiplicamos por 20 para obtener el porcentaje
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Preguntas sobre la satisfacción general
        String[] preguntas = {
                "Califica tu experiencia",
                "Califica la limpieza",
                "Califica la calidad del trabajo",
                "Califica la honestidad",
                "Califica los tiempos de entrega",
                "Califica el precio"
        };

        // Lista de satisfacción
        String listaSatisfaccion =
                "1. Muy Satisfecho\n" +
                        "2. Satisfecho\n" +
                        "3. Bueno\n" +
                        "4. Insatisfecho\n" +
                        "5. Muy Insatisfecho";

        // Preguntas sobre el taller
        String[] preguntas2 = {
                "¿Qué tan satisfecho está con la limpieza y organización del taller al momento de entregar su vehículo?",
                "¿Está satisfecho con la calidad del trabajo realizado en su vehículo?",
                "¿Considera que la información sobre las reparaciones o servicios realizados fue clara y honesta?",
                "¿Estuvo conforme con el tiempo que tomó realizar las reparaciones o servicios en su vehículo?",
                "¿Considera que el costo del servicio fue justo en relación con el trabajo realizado?",
                "¿Qué tan satisfecho estuvo con la atención recibida por parte de nuestro personal?",
                "¿Recomendaría nuestro taller a familiares y amigos?"
        };

        String resp = "";
        String vehiculo;
        int visitas;

        do {
            // Preguntar tipo de vehículo y visitas
            System.out.println("Por favor, ingresa el tipo de tu vehículo (Marca y modelo): ");
            vehiculo = sc.nextLine();

            System.out.println("¿Cuántas veces has visitado nuestro taller?: ");
            visitas = Integer.parseInt(sc.nextLine());

            // Respuestas del usuario para las primeras preguntas (Satisfacción general)
            System.out.println("Responde las preguntas de acuerdo a la lista de satisfacción: \n" + listaSatisfaccion);
            int[] respuestas1 = new int[preguntas.length];
            for (int i = 0; i < preguntas.length; i++) {
                System.out.println(preguntas[i]);
                respuestas1[i] = Integer.parseInt(sc.nextLine());
            }

            // Calcular el porcentaje de satisfacción para las primeras preguntas
            double porcentajeSatisfaccion1 = calcularPorcentaje(respuestas1);

            // Mostrar las respuestas y el porcentaje de satisfacción
            System.out.println("Tus respuestas sobre satisfacción general:");
            for (int i = 0; i < respuestas1.length; i++) {
                System.out.println(preguntas[i] + ": " + Respuestas(respuestas1[i]));
            }
            System.out.println("Porcentaje de satisfacción general: " + porcentajeSatisfaccion1 + "%");

            // Respuestas del usuario para las preguntas sobre el taller
            System.out.println("\nAhora, responde las preguntas sobre el taller:");
            int[] respuestas2 = new int[preguntas2.length];
            for (int i = 0; i < preguntas2.length; i++) {
                System.out.println(preguntas2[i]);
                respuestas2[i] = Integer.parseInt(sc.nextLine());
            }

            // Calcular el porcentaje de satisfacción para las preguntas sobre el taller
            double porcentajeSatisfaccion2 = calcularPorcentaje(respuestas2);

            // Mostrar las respuestas y el porcentaje de satisfacción
            System.out.println("Tus respuestas sobre el taller:");
            for (int i = 0; i < respuestas2.length; i++) {
                System.out.println(preguntas2[i] + ": " + Respuestas(respuestas2[i]));
            }
            System.out.println("Porcentaje de satisfacción sobre el taller: " + porcentajeSatisfaccion2 + "%");

            // Mostrar resumen final con el tipo de vehículo y las visitas realizadas
            System.out.println("\nResumen final:");
            System.out.println("Vehículo: " + vehiculo);
            System.out.println("Visitas al taller: " + visitas);
            System.out.println("Porcentaje de satisfacción general: " + porcentajeSatisfaccion1 + "%");
            System.out.println("Porcentaje de satisfacción sobre el taller: " + porcentajeSatisfaccion2 + "%");

            // Preguntar si quiere repetir la encuesta
            System.out.println("\n¿Quieres repetir la encuesta? (si/no)");
            resp = sc.nextLine().toLowerCase();
        } while (resp.equals("si"));

        sc.close(); // Cerrar el scanner
    }
}
