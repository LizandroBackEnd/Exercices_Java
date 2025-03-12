package conditionals;
import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dolares;
        double tasaCambio = 0.85;
        double tasaEspecial = 0.87;
        double conversion = tasaCambio * tasaEspecial;

        System.out.println("Ingrese la cantidad de dolares: ");
        dolares = sc.nextDouble();


        System.out.println("Laura tendra " + conversion + " euros despues de la conversion");

        if (dolares > 500) {
            double conversionEspecial = conversion * tasaEspecial;
            System.out.println("Con la tasa especial Laura tendra " + conversionEspecial + " euros");
        } else {
            System.out.println("No le combiene convertir mas dinero con la tasa especial");
        }

    }
}
