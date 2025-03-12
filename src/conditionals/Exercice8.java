package conditionals;
import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el total de la compra");
        double mntCompra = sc.nextDouble();

        double desc;
        if(mntCompra >= 1000) {
            desc = 0.20;
        } else if (mntCompra > 500) {
            desc = 0.10;
        } else {
            desc = 0.0;
        }

        double mntFinal = mntCompra * (1 - desc);
        System.out.println("El monto final " + mntFinal);
    }
}
