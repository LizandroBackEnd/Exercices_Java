package conditionals;
import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es el peso del paquete en kg");
        double peso = sc.nextDouble();

        System.out.println(peso < 5 ? "El paquete puede enviarse" : "El paquete no puede enviarse");
    }
}
