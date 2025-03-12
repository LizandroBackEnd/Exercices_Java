package conditionals;
import java.util.Scanner;

public class Exercice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio de la comida: ");
        double precio = sc.nextDouble();

        System.out.println("Tiene un recipiente reutilizable: (SI/NO): ");
        sc.nextLine();
        if (sc.nextLine().trim().equalsIgnoreCase("si")) {
            precio *= 0.90;
        }
        System.out.println("El precio a pagar es: " + precio);


    }
}
