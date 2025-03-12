package conditionals;
import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMaterias = 0;
        double[] calificaciones = null;

        while (true) {
            System.out.println("¿Cuántas materias cursas?");
            if (sc.hasNextInt()) {
                numMaterias = sc.nextInt();
                if (numMaterias > 0) {
                    calificaciones = new double[numMaterias];
                    break;
                } else {
                    System.out.println("El número de materias no debe ser negativo.");
                }
            } else {
                System.out.println("Ingresa un número válido.");
                sc.next();
            }
        }

        for (int i = 0; i < numMaterias; i++) {
            while (true) {
                System.out.println("¿Cuál es la calificación de la materia " + (i + 1) + "?: ");
                if (sc.hasNextDouble()) {
                    double calificacion = sc.nextDouble();
                    if (calificacion >= 0.0 && calificacion <= 10.0) {
                        calificaciones[i] = calificacion;
                        break;
                    } else {
                        System.out.println("La calificación debe estar entre 0 y 10.");
                    }
                } else {
                    System.out.println("Ingresa un número válido.");
                    sc.next();
                }
            }
        }


        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }

        double promedio = suma / numMaterias;
        System.out.println("El promedio de las calificaciones es: " + promedio);


    }
}
