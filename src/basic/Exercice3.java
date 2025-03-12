package basic;
import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double papel, ahorrado_arbol;

        System.out.print("Ingrese los kilogramos de papel ahorrados en un año: ");
        papel = sc.nextDouble();
        ahorrado_arbol = papel / 60;

        System.out.println("Has salvado: " + ahorrado_arbol + " arboles");

    }
}
