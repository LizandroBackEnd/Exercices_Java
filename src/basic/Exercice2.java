package basic;
import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double KWh, Tarifa, ahorrado;

        System.out.println("Ingresa los KWh consumidos por mes: ");
        KWh = sc.nextDouble();
        System.out.println("Ingresa la tarifa por KWh: ");
        Tarifa = sc.nextDouble();

        ahorrado = (KWh * Tarifa) * 12;
        System.out.println("Tu ahorro anual es de:" + "$" + ahorrado);


    }
}
