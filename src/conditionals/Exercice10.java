package conditionals;
import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el ingreso anual");
        double ingAnual = sc.nextDouble();

        double impuesto;
        if (ingAnual >= 50000) {
            impuesto = ingAnual * 0.80;
        } else if (ingAnual >= 10000) {
            impuesto = ingAnual * 0.90;
        } else {
            impuesto = 0.0;
        }

        System.out.println("El impuesto es " + impuesto);
    }
}
