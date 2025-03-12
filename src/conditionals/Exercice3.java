package conditionals;
import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el rendimiento de la maquina: ");
        double rendimiento = sc.nextDouble();
        String nivel = (rendimiento < 50) ? "Deficiente" : (rendimiento <= 75) ? "Aceptable" : "Excelente";
        System.out.println("Nivel de eficiencia: " + nivel);
    }
}
