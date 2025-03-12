package conditionals;
import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu calificacion: ");
        int calificacion = sc.nextInt();
        System.out.println(calificacion >= 70 ? "Aprobado" : "Reprobado");
    }
}
