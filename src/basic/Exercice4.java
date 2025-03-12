package basic;
import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double litros, mensual, cubico;

        System.out.println("Cuantos litros de aguas utilizas diariamente: ");
        litros = sc.nextDouble();

        mensual = litros * 30;
        cubico = mensual / 1000;

        System.out.println("Tu consumo mensual es de: " + mensual + " litros (" + cubico + " m3)");


    }
}
