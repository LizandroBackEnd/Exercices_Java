package basic;
import java.util.Scanner;

public class Exercice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double litros_gasolina, huella_carbono;

        System.out.println("Cuantos litros de gasolina consumes en la semana? ");
        litros_gasolina = sc.nextDouble();

        huella_carbono = litros_gasolina * 52 * 2.3;
        System.out.println("Tu huella de carbono anual es: " + huella_carbono);

    }

}
