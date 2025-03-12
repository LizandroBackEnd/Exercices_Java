package conditionals;
import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es el monto del deposito");
        double monto = sc.nextDouble();
        System.out.println("Ingrese el plazo a meses");
        int plazo = sc.nextInt();

        double tsIntereses = (plazo > 12) ? 0.05 : 0.03;
        double intereses = monto * tsIntereses;

        System.out.println("El intereses es: " + intereses);
    }
}
